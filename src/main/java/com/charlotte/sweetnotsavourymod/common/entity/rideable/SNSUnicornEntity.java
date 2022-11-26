package com.charlotte.sweetnotsavourymod.common.entity.rideable;

import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.util.variants.RideableVariants.UnicornFlavourVariant;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.Effects;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;
import java.util.UUID;

public class SNSUnicornEntity extends TameableEntity implements IJumpingMount, IAnimatable {

	protected boolean isJumping;
	protected float playerJumpPendingScale;
	private boolean allowStandSliding;

	private AnimationFactory factory = new AnimationFactory(this);
	private static final DataParameter<Integer> DATA_ID_TYPE_VARIANT =
			EntityDataManager.defineId(SNSUnicornEntity.class, DataSerializers.INT);

	private static final DataParameter<Boolean> SITTING =
			EntityDataManager.defineId(SNSUnicornEntity.class, DataSerializers.BOOLEAN);

	public SNSUnicornEntity(EntityType<? extends TameableEntity> type, World worldIn) {
		super(type, worldIn);
		this.maxUpStep = 1.0F;
		setTame(false);
		this.noCulling = true;



	}

	@Override
	public void addAdditionalSaveData(CompoundNBT tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", this.getTypeVariant());
		tag.putBoolean("Sitting", this.isSitting());
	}

	@Override
	public void readAdditionalSaveData(CompoundNBT p_21815_) {
		super.readAdditionalSaveData(p_21815_);
		this.entityData.set(DATA_ID_TYPE_VARIANT, p_21815_.getInt("Variant"));
		setSitting(p_21815_.getBoolean("Sitting"));
	}

	@Override
	public ILivingEntityData finalizeSpawn(IServerWorld p_146746_, DifficultyInstance p_146747_,
										SpawnReason p_146748_, @Nullable ILivingEntityData p_146749_,
										@Nullable CompoundNBT p_146750_) {
		UnicornFlavourVariant variant = Util.getRandom(UnicornFlavourVariant.values(), this.random);
		setVariant(variant);
		return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
	}

	private void setVariant(UnicornFlavourVariant variant) {
		this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
	}

	@Override
	protected ITextComponent getTypeName() {
		return new TranslationTextComponent(((TranslationTextComponent)super.getTypeName()).getKey()
				+ "." + this.getVariant().getId());
	}

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.unicorn.running", true));
			return PlayState.CONTINUE;
		}

		if (this.isSitting()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.unicorn.sitting", true));
			return PlayState.CONTINUE;
		}

		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.unicorn.idle", true));
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return sizeIn.height * 0.65F;
	}

	public static AttributeModifierMap setAttributes() {
		return TameableEntity.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 80.0D)
				.add(Attributes.ATTACK_DAMAGE, 4D)
				.add(Attributes.ATTACK_SPEED, 2.0f)
				.add(Attributes.JUMP_STRENGTH, 1f)
				.add(Attributes.MOVEMENT_SPEED, (double)0.25f).build();
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(2, new SitGoal(this));
		this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, true));
		this.goalSelector.addGoal(6, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1));
		this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(9, new LookRandomlyGoal(this));
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
	}

	@Override
	public void setTame(boolean tamed) {
		super.setTame(tamed);
		if (tamed) {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(80.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(4D);
			getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.35f);
		} else {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(2D);
			getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((double)0.25f);
		}
	}

	public void makeTamed(PlayerEntity player) {
		if (!this.level.isClientSide) {
			super.tame(player);
			this.navigation.recomputePath();
			this.setTarget(null);
			this.level.broadcastEntityEvent(this, (byte)7);
		}
	}

	@Override
	public ActionResultType mobInteract(PlayerEntity player, Hand pHand) {
		ItemStack itemstack = player.getItemInHand(pHand);
		Item item = itemstack.getItem();
		Item tameableItem = ItemInit.CANDYCANESUGAR.get();

		if(isFood(itemstack)) {
			return super.mobInteract(player, pHand);
		}

		if (this.level.isClientSide) {
			boolean flag = this.isOwnedBy(player) || this.isTame() || item == tameableItem
					&& !this.isTame();
			return flag ? ActionResultType.CONSUME : ActionResultType.PASS;
		} else {
			if (this.isTame()) {
				if(player.isCrouching() && pHand == Hand.MAIN_HAND) {
					setSitting(!isSitting());
				}

				if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
					if (!player.abilities.instabuild) {
						itemstack.shrink(1);
					}

					this.heal((float)item.getFoodProperties().getNutrition());
					return ActionResultType.SUCCESS;
				}
				player.startRiding(this);
			} else if (item == tameableItem && !this.isOnFire()) {
				if (!player.abilities.instabuild) {
					itemstack.shrink(1);
				}

				if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
					this.tame(player);
					this.navigation.stop();

					this.setTarget((LivingEntity)null);
					this.setOrderedToSit(true);
					this.level.broadcastEntityEvent(this, (byte)7);
				} else {
					this.level.broadcastEntityEvent(this, (byte)6);
				}
				return ActionResultType.SUCCESS;
			}

			return super.mobInteract(player, pHand);
		}
	}

	@Override
	public Team getTeam() {
		return super.getTeam();
	}

	public boolean doHurtTarget(Entity pEntity) {
		boolean flag = pEntity.hurt(DamageSource.mobAttack(this), (float)((int)
				this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
		if (flag) {
			this.doEnchantDamageEffects(this, pEntity);
		}

		return flag;
	}

	public boolean wantsToAttack(LivingEntity pTarget, LivingEntity pOwner) {
		if (!(pTarget instanceof CreeperEntity) && !(pTarget instanceof GhastEntity)) {

			if (pTarget instanceof PlayerEntity && pOwner instanceof PlayerEntity && !((PlayerEntity)pOwner).canHarmPlayer((PlayerEntity)pTarget)) {
				return false;
			} else if (pTarget instanceof AbstractHorseEntity && ((AbstractHorseEntity)pTarget).isTamed()) {
				return false;
			} else {
				return !(pTarget instanceof TameableEntity) || !((TameableEntity)pTarget).isTame();
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean isFood(ItemStack pStack) {
		return pStack.getItem() == ItemInit.SPRINKLES.get();
	}

	@Nullable
	@Override
	public AgeableEntity getBreedOffspring(ServerWorld serverLevel, AgeableEntity ageablemob) {
		com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity mob = EntityTypesInit.SNSUNICORN.get().create(serverLevel);
		UUID uuid = this.getOwnerUUID();
		if (uuid != null) {
			mob.setOwnerUUID(uuid);
			mob.setTame(true);
		}
		return mob;
	}

	public boolean canMate(AnimalEntity mate) {
		if (mate == this) {
			return false;
		} else if (!this.isTame()) {
			return true;
		} else if (!(mate instanceof com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity)) {
			return false;
		} else {
			com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity mob = (com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity)mate;
			if (!mob.isTame()) {
				return true;
			} else if (mob.isInSittingPose()) {
				return true;
			} else {
				return this.isInLove() && mob.isInLove();
			}
		}
	}


	public UnicornFlavourVariant getVariant() {
		return UnicornFlavourVariant.byId(this.getTypeVariant() & 255);
	}

	private int getTypeVariant() {
		return this.entityData.get(DATA_ID_TYPE_VARIANT);
	}

	public void setSitting(boolean sitting) {
		this.entityData.set(SITTING, sitting);
		this.setOrderedToSit(sitting);
	}

	public boolean isSitting() {
		return this.entityData.get(SITTING);
	}

	public boolean isJumping() {
		return this.isJumping;
	}

	public void setIsJumping(boolean p_30656_) {
		this.isJumping = p_30656_;
	}

	public double getCustomJump() {
		return this.getAttributeValue(Attributes.JUMP_STRENGTH);
	}

	public boolean causeFallDamage(float p_149499_, float p_149500_, DamageSource p_149501_) {
		if (p_149499_ > 1.0F) {
			this.playSound(SoundEvents.HORSE_LAND, 0.4F, 1.0F);
		}

		int i = this.calculateFallDamage(p_149499_, p_149500_);
		if (i <= 0) {
			return false;
		} else {
			this.hurt(p_149501_, (float)i);
			if (this.isVehicle()) {
				for(Entity entity : this.getIndirectPassengers()) {
					entity.hurt(p_149501_, (float)i);
				}
			}

			this.playBlockFallSound();
			return true;
		}
	}

	protected int calculateFallDamage(float p_30606_, float p_30607_) {
		return MathHelper.ceil((p_30606_ * 0.5F - 3.0F) * p_30607_);
	}

	public boolean canBeLeashed(PlayerEntity player) {
		return super.canBeLeashed(player);
	}

	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(SoundEvents.HORSE_STEP, 0.15F, 1.0F);
	}
	protected SoundEvent getAmbientSound() {
		return SoundEvents.HORSE_AMBIENT;
	}
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.HORSE_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.HORSE_DEATH;
	}
	protected float getSoundVolume() {
		return 0.2F;
	}


	public boolean canBeControlledByRider() {
		return this.getControllingPassenger() instanceof LivingEntity;
	}

	@Nullable
	public Entity getControllingPassenger() {
		return this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
	}

	public void travel(Vector3d pTravelVector) {
		if (this.isAlive()) {
			if (this.isVehicle() && this.canBeControlledByRider()) {
				LivingEntity livingentity = (LivingEntity)this.getControllingPassenger();
				this.yRot = livingentity.yRot;
				this.yRotO = this.getYHeadRot();
				this.xRot = livingentity.xRot * 0.5F;
				this.setRot(this.yRot, this.xRot);
				this.yBodyRot = this.yRot;
				this.yHeadRot = this.yBodyRot;
				float f = livingentity.xxa * 0.5F;
				float f1 = livingentity.zza;
				if (f1 <= 0.0F) {
					f1 *= 0.25F;
				}

				// idk wtf this does, but not having it seems fine
				// THANKS MOJANK!
				//if (this.onGround && this.playerJumpPendingScale == 0.0F && this.isTame() && !this.allowStandSliding) {
				//	f = 0.0F;
				//	f1 = 0.0F;
				//}

				if (this.playerJumpPendingScale > 0.0F && !this.isJumping() && this.onGround) {
					double d0 = this.getCustomJump() * (double)this.playerJumpPendingScale * (double)this.getBlockJumpFactor();
					double d1;
					if (this.hasEffect(Effects.JUMP)) {
						d1 = d0 + (double)((float)(this.getEffect(Effects.JUMP).getAmplifier() + 1) * 0.1F);
					} else {
						d1 = d0;
					}
					Vector3d vec3 = this.getDeltaMovement();
					this.setDeltaMovement(vec3.x, d1, vec3.z);
					this.setIsJumping(true);
					this.hasImpulse = true;
					net.minecraftforge.common.ForgeHooks.onLivingJump(this);
					if (f1 > 0.0F) {
						float f2 = MathHelper.sin(yRot * ((float)Math.PI / 180F));
						float f3 = MathHelper.cos(yRot * ((float)Math.PI / 180F));
						this.setDeltaMovement(this.getDeltaMovement().add((double)(-0.4F * f2 * this.playerJumpPendingScale),
								0.0D, (double)(0.4F * f3 * this.playerJumpPendingScale)));
					}

					this.playerJumpPendingScale = 0.0F;
				}

				this.flyingSpeed = this.getSpeed() * 0.1F;
				if (this.isControlledByLocalInstance()) {
					this.setSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
					super.travel(new Vector3d((double)f, pTravelVector.y, (double)f1));
				} else if (livingentity instanceof PlayerEntity) {
					this.setDeltaMovement(Vector3d.ZERO);
				}

				if (this.onGround) {
					this.playerJumpPendingScale = 0.0F;
					this.setIsJumping(false);
				}

				this.calculateEntityAnimation(this, false);
//				this.tryCheckInsideBlocks();
			} else {
				this.flyingSpeed = 0.02F;
				super.travel(pTravelVector);
			}

		}
	}

	public void onPlayerJump(int p_30591_) {
		if (this.isTame()) {
			if (p_30591_ < 0) {
				p_30591_ = 0;
			} else {
				this.allowStandSliding = true;
			}

			if (p_30591_ >= 90) {
				this.playerJumpPendingScale = 1.0F;
			} else {
				this.playerJumpPendingScale = 0.4F + 0.4F * (float)p_30591_ / 90.0F;
			}

		}
	}

	public boolean canJump() {
		return this.isTame();
	}

	@Override
	public void handleStartJump(int p_21695_) {
		this.allowStandSliding = true;
	}

	@Override
	public void handleStopJump() {

	}

	protected double generateRandomJumpStrength() {
		return (double)0.4F + this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.2D;
	}

	@Override
	public Vector3d getDismountLocationForPassenger(LivingEntity pLivingEntity) {
//		Direction direction = this.getMotionDirection();
//		if (direction.getAxis() == Direction.Axis.Y) {
//			return super.getDismountLocationForPassenger(pLivingEntity);
//		} else {
//			int[][] aint = DismountHelper.offsetsForDirection(direction);
//			BlockPos blockpos = this.blockPosition();
//			BlockPos.MutableBlockPos blockpos$mutable = new BlockPos.MutableBlockPos();
//
//			for(Pose pose : pLivingEntity.getDismountPoses()) {
//				AxisAlignedBB axisalignedbb = pLivingEntity.getLocalBoundsForPose(pose);
//
//				for(int[] aint1 : aint) {
//					blockpos$mutable.set(blockpos.getX() + aint1[0], blockpos.getY(), blockpos.getZ() + aint1[1]);
//					double d0 = this.level.getBlockFloorHeight(blockpos$mutable);
//					if (DismountHelper.isBlockFloorValid(d0)) {
//						Vec3 vec3 = Vec3.upFromBottomCenterOf(blockpos$mutable, d0);
//						if (DismountHelper.canDismountTo(this.level, pLivingEntity, axisalignedbb.move(vec3))) {
//							pLivingEntity.setPose(pose);
//							return vec3;
//						}
//					}
//				}
//			}
//
//			return super.getDismountLocationForPassenger(pLivingEntity);
			Vector3d vector3d = getCollisionHorizontalEscapeVector((double)this.getBbWidth(), (double)pLivingEntity.getBbWidth(), this.yRot + (pLivingEntity.getMainArm() == HandSide.RIGHT ? 90.0F : -90.0F));
			Vector3d vector3d1 = this.getDismountLocationInDirection(vector3d, pLivingEntity);
			if (vector3d1 != null) {
				return vector3d1;
			} else {
				Vector3d vector3d2 = getCollisionHorizontalEscapeVector((double)this.getBbWidth(), (double)pLivingEntity.getBbWidth(), this.yRot + (pLivingEntity.getMainArm() == HandSide.LEFT ? 90.0F : -90.0F));
				Vector3d vector3d3 = this.getDismountLocationInDirection(vector3d2, pLivingEntity);
				return vector3d3 != null ? vector3d3 : this.position();
			}
		}
		@Nullable
		private Vector3d getDismountLocationInDirection(Vector3d p_234236_1_, LivingEntity p_234236_2_) {
			double d0 = this.getX() + p_234236_1_.x;
			double d1 = this.getBoundingBox().minY;
			double d2 = this.getZ() + p_234236_1_.z;
			BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();
			
			for(Pose pose : p_234236_2_.getDismountPoses()) {
				blockpos$mutable.set(d0, d1, d2);
				double d3 = this.getBoundingBox().maxY + 0.75D;
				
				while(true) {
					double d4 = this.level.getBlockFloorHeight(blockpos$mutable);
					if ((double)blockpos$mutable.getY() + d4 > d3) {
						break;
					}
					
					if (TransportationHelper.isBlockFloorValid(d4)) {
						AxisAlignedBB axisalignedbb = p_234236_2_.getLocalBoundsForPose(pose);
						Vector3d vector3d = new Vector3d(d0, (double)blockpos$mutable.getY() + d4, d2);
						if (TransportationHelper.canDismountTo(this.level, p_234236_2_, axisalignedbb.move(vector3d))) {
							p_234236_2_.setPose(pose);
							return vector3d;
						}
					}
					
					blockpos$mutable.move(Direction.UP);
					if (!((double)blockpos$mutable.getY() < d3)) {
						break;
					}
				}
			}
			
			return null;
		}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SITTING, false);
		this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

	}
}
