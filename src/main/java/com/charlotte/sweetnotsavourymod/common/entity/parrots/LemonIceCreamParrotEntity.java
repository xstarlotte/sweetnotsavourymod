package com.charlotte.sweetnotsavourymod.common.entity.parrots;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class LemonIceCreamParrotEntity extends TamableAnimal implements IAnimatable {
	private AnimationFactory factory = new AnimationFactory(this);

	private static final EntityDataAccessor<Boolean> SITTING =
			SynchedEntityData.defineId(LemonIceCreamParrotEntity.class, EntityDataSerializers.BOOLEAN);

	public LemonIceCreamParrotEntity(EntityType<? extends TamableAnimal> type, Level worldIn) {
		super(type, worldIn);
		setTame(false);
		this.noCulling = true;
	}

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.parrot.flying", true));
			return PlayState.CONTINUE;
		}

		if (this.isSitting()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.parrot.sitting", true));
			return PlayState.CONTINUE;
		}

		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.parrot.idle", true));
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

	protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
		return sizeIn.height * 0.65F;
	}

	public static AttributeSupplier setAttributes() {
		return TamableAnimal.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 20.0D)
				.add(Attributes.ATTACK_DAMAGE, 8.0f)
				.add(Attributes.ATTACK_SPEED, 2.0f)
				.add(Attributes.MOVEMENT_SPEED, 0.3f).build();
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
		this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());

	}

	@Override
	public void setTame(boolean tamed)
	{
		super.setTame(tamed);
		if (tamed) {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8F);
			getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((double)0.6f);
			this.setHealth(20.0F);
		} else {
			getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0D);
			getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8F);
		}
	}

	public void makeTamed(Player player) {
		if (!level.isClientSide) {
			super.tame(player);
			this.navigation.recomputePath();
			this.setTarget(null);
			this.level.broadcastEntityEvent(this, (byte)7);
		}
	}

	@Override
	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		Item item = itemstack.getItem();

		if (item == Items.SUGAR && !isTame()) {
			if (level.isClientSide) {
				return InteractionResult.CONSUME;
			} else {
				if (!player.getAbilities().instabuild) {
					itemstack.shrink(1);
				}

				if (!ForgeEventFactory.onAnimalTame(this, player)) {
					makeTamed(player);
					setSitting(true);
				}

				return InteractionResult.SUCCESS;
			}
		}

		if(isTame() && !level.isClientSide && hand == InteractionHand.MAIN_HAND) {
			setSitting(!isSitting());
			return InteractionResult.SUCCESS;
		}

		if (itemstack.getItem() == Items.SUGAR) {
			return InteractionResult.PASS;
		}

		return super.mobInteract(player, hand);
	}

	public void setSitting(boolean sitting) {
		this.entityData.set(SITTING, sitting);
	}

	public boolean isSitting() {
		return this.entityData.get(SITTING);
	}

	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(SoundEvents.PARROT_STEP, 0.15F, 1.0F);
	}
	protected SoundEvent getAmbientSound() {
		return SoundEvents.PARROT_AMBIENT;
	}
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.PARROT_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.PARROT_DEATH;
	}
	protected float getSoundVolume() {
		return 0.2F;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
		return null;
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SITTING, false);
	}
}