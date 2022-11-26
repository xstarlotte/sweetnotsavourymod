package com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries;


import com.charlotte.sweetnotsavourymod.common.entityai.PoisonBerryOpensMiniDoorGoal;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShootableItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class PBArcherEntity extends MonsterEntity implements IAnimatable, IRangedAttackMob {
	private AnimationFactory factory = new AnimationFactory(this);
	public PBArcherEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
	}


	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.poisonberry.walking", true));
			return PlayState.CONTINUE;
		}

		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.poisonberry.idle", true));
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



	protected void registerGoals() {
		this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(3, new RangedAttackGoal(this, 1.25D, 40, 20F ));
		this.goalSelector.addGoal(3, new SwimGoal(this));
		this.addBehaviourGoals();
	}

	protected void addBehaviourGoals() {
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(PBAttackerEntity.class,
				PBDefenderEntity.class, PBArcherEntity.class));
		this.goalSelector.addGoal(6, new PoisonBerryOpensMiniDoorGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, true));


	}

	public static AttributeModifierMap createAttributes() {
		return MonsterEntity
				.createMonsterAttributes()
				.add(Attributes.FOLLOW_RANGE, 70.0D)
				.add(Attributes.MOVEMENT_SPEED, (double)0.34F)
				.add(Attributes.ATTACK_DAMAGE, 1.0D)
				.add(Attributes.ARMOR, 4.0D)
				.build();
	}

	@Override
	protected int getExperienceReward(PlayerEntity p_21511_) {
		return 64;
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES;
	}

	protected SoundEvent getStepSound() {
		return SoundEvents.BEEHIVE_ENTER;
	}

	protected void playAmbientSound(BlockPos pos, BlockState blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.BEE_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {

		return SoundEvents.BEE_DEATH;

	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();

	}

	@Override
	public void performRangedAttack(LivingEntity p_32141_, float p_32142_) {
		ItemStack itemstack = this.getProjectile(this.getItemInHand(ProjectileHelper.getWeaponHoldingHand(this, item -> item instanceof BowItem)));
		AbstractArrowEntity abstractarrow = this.getArrow(itemstack, p_32142_);
		if (this.getMainHandItem().getItem() instanceof BowItem)
			abstractarrow = ((BowItem)this.getMainHandItem().getItem()).customArrow(abstractarrow);
		double d0 = p_32141_.getX() - this.getX();
		double d1 = p_32141_.getY(0.3333333333333333D) - abstractarrow.getY();
		double d2 = p_32141_.getZ() - this.getZ();
		double d3 = Math.sqrt(d0 * d0 + d2 * d2);
		abstractarrow.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.level.getDifficulty().getId() * 4));
		this.playSound(SoundEvents.SKELETON_SHOOT, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
		this.level.addFreshEntity(abstractarrow);
	}

	protected AbstractArrowEntity getArrow(ItemStack p_32156_, float p_32157_) {
		return ProjectileHelper.getMobArrow(this, Items.TIPPED_ARROW.getDefaultInstance(), p_32157_);
	}
	
	@Override
	public boolean canFireProjectileWeapon(ShootableItem p_230280_1_) {
		return p_230280_1_ == Items.BOW;
	}
}
