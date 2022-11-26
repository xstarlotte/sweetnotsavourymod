package com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures;

import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.GummyBearFlavourVariant;
import net.minecraft.util.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.scores.Team;
import net.minecraftforge.event.ForgeEventFactory;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.UUID;

public class SNSGummyBearEntity extends TameableEntity implements IAnimatable {

	private AnimationFactory factory = new AnimationFactory(this);

	private static final DataParameter<Integer> DATA_ID_TYPE_VARIANT =
			EntityDataManager.defineId(com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity.class, DataSerializers.INT);
	private static final DataParameter<Boolean> SITTING =
			EntityDataManager.defineId(com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity.class, DataSerializers.BOOLEAN);

	public SNSGummyBearEntity(EntityType<? extends TameableEntity> type, Level worldIn) {
		super(type, worldIn);
		setTame(false);
		this.noCulling = true;
	}

	//animations
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gummybear.running", true));
			return PlayState.CONTINUE;
		}
		if (this.isSitting()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gummybear.sitting", true));
			return PlayState.CONTINUE;
		}
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gummybear.idle", true));
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data)
	{
		data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory()
	{
		return this.factory;
	}

	//attributes + goals
	public static AttributeModifierMap setAttributes() {
		return TameableEntity.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 80.0D)
				.add(Attributes.ATTACK_DAMAGE, 4D)
				.add(Attributes.ATTACK_SPEED, 2.0f)
				.add(Attributes.MOVEMENT_SPEED, (double)0.25f).build();
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, true));
		this.goalSelector.addGoal(6, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1));
		this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
	}

	//taming
	@Override
	public ActionResultType mobInteract(PlayerEntity player, Hand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		Item item = itemstack.getItem();
		Item itemForTaming = ItemInit.CANDYCANESUGAR.get();
		if(isFood(itemstack)) {
			return super.mobInteract(player, hand);
		}
		if (item == itemForTaming && !isTame()) {
			if (this.level.isClientSide) {
				return ActionResultType.CONSUME;
			} else {
				if (!player.getAbilities().instabuild) {
					itemstack.shrink(1);
				}
				if (!ForgeEventFactory.onAnimalTame(this, player)) {
					if (!this.level.isClientSide) {
						super.tame(player);
						this.navigation.recomputePath();
						this.setTarget(null);
						this.level.broadcastEntityEvent(this, (byte)7);
						setSitting(true);
					}
				}
				return ActionResultType.SUCCESS;
			}
		}
		if(isTame() && !this.level.isClientSide && hand == Hand.MAIN_HAND) {
			setSitting(!isSitting());
			return ActionResultType.SUCCESS;
		}
		if (itemstack.getItem() == itemForTaming) {
			return ActionResultType.PASS;
		}
		return super.mobInteract(player, hand);
	}

	@Override
	public void setTame(boolean tamed) {
		super.setTame(tamed);
		if (tamed) {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(80.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(4D);
			getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.5f);
		} else {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(2D);
			getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((double)0.25f);
		}
	}

	public void makeTamed(PlayerEntity player) {
		if (!level.isClientSide) {
			super.tame(player);
			this.navigation.recomputePath();
			this.setTarget(null);
			this.level.broadcastEntityEvent(this, (byte)7);
		}
	}
	//fighting
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
		if (!(pTarget instanceof Creeper) && !(pTarget instanceof Ghast)) {

			if (pTarget instanceof PlayerEntity && pOwner instanceof PlayerEntity && !((Player)pOwner).canHarmPlayer((Player)pTarget)) {
				return false;
			} else if (pTarget instanceof AbstractHorse && ((AbstractHorse)pTarget).isTamed()) {
				return false;
			} else {
				return !(pTarget instanceof TameableEntity) || !((TameableEntity)pTarget).isTame();
			}
		} else {
			return false;
		}
	}
//breeding

	@Override
	public boolean isFood(ItemStack pStack) {
		return pStack.getItem() == ItemInit.SPRINKLES.get();
	}

	@Nullable
	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageablemob) {
		com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity mob = EntityTypesInit.SNSGUMMYBEAR.get().create(serverLevel);
		UUID uuid = this.getOwnerUUID();
		if (uuid != null) {
			mob.setOwnerUUID(uuid);
			mob.setTame(true);
		}
		return mob;
	}

	public boolean canMate(Animal mate) {
		if (mate == this) {
			return false;
		} else if (!this.isTame()) {
			return true;
		} else if (!(mate instanceof com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity)) {
			return false;
		} else {
			com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity mob = (com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity)mate;
			if (!mob.isTame()) {
				return true;
			} else if (mob.isInSittingPose()) {
				return true;
			} else {
				return this.isInLove() && mob.isInLove();
			}
		}
	}
	//data
	@Override
	public void addAdditionalSaveData(CompoundNBT tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", this.getTypeVariant());
		tag.putBoolean("Sitting", this.isSitting());
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SITTING, false);
		this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

	}

	public boolean isSitting() {
		return this.entityData.get(SITTING);
	}

	public void setSitting(boolean sitting) {
		this.entityData.set(SITTING, sitting);
		this.setOrderedToSit(sitting);
	}

	@Override
	public void readAdditionalSaveData(CompoundNBT p_21815_) {
		super.readAdditionalSaveData(p_21815_);
		this.entityData.set(DATA_ID_TYPE_VARIANT, p_21815_.getInt("Variant"));
		setSitting(p_21815_.getBoolean("Sitting"));
	}
	//variants
	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
										MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
										@Nullable CompoundNBT p_146750_) {
		GummyBearFlavourVariant variant = Util.getRandom(GummyBearFlavourVariant.values(), this.random);
		setVariant(variant);
		return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
	}

	private void setVariant(GummyBearFlavourVariant variant) {
		this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
	}

	public GummyBearFlavourVariant getVariant() {
		return GummyBearFlavourVariant.byId(this.getTypeVariant() & 255);
	}

	private int getTypeVariant() {
		return this.entityData.get(DATA_ID_TYPE_VARIANT);
	}

	@Override
	protected Component getTypeName() {
		return new TranslatableComponent(((TranslatableComponent)super.getTypeName()).getKey()
				+ "." + this.getVariant().getId());
	}
	//sound
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(SoundEvents.RABBIT_JUMP, 0.15F, 1.0F);
	}
	protected SoundEvent getAmbientSound() {
		return SoundEvents.RABBIT_AMBIENT;
	}
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.RABBIT_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.RABBIT_DEATH;
	}
	protected float getSoundVolume() {
		return 0.2F;
	}

	//etc
	public boolean canBeLeashed(PlayerEntity player) {
		return super.canBeLeashed(player);
	}
	protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
		return sizeIn.height * 0.65F;
	}
}
