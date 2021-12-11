package com.charlotte.sweetnotsavourymod.common.entity.poisonberries;

import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryMeleeAttackGoal;
import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryOpensMiniDoorGoal;


import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.shadowed.eliotlash.mclib.utils.MathHelper;

public class PoisonBerryArcherEntity extends Monster {

	public PoisonBerryArcherEntity(EntityType<? extends Monster> type, Level worldIn) {
		super(type, worldIn);
	}

	public static AttributeSupplier setAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 10.0f)
				.add(Attributes.ATTACK_DAMAGE, 8.0f)
				.add(Attributes.ATTACK_SPEED, 2.0f)
				.add(Attributes.MOVEMENT_SPEED, 2.0f).build();

	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 0.12D));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new PoisonBerryMeleeAttackGoal(this, 0.12D, false));
		this.goalSelector.addGoal(5, new PoisonBerryOpensMiniDoorGoal(this));
		this.targetSelector.addGoal(1,  new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));


	}

	@Override
	protected int getExperienceReward(Player p_21511_) {
		return 6;
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

	public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
		ItemStack itemstack = this.getProjectile(Items.BOW.getDefaultInstance());
		AbstractArrow abstractarrowentity = this.fireArrow(itemstack, distanceFactor);


		double d0 = target.getPosX() - this.getPosX();
		double d1 = target.getPosYHeight(0.3333333333333333D) - abstractarrowentity.getPosY();
		double d2 = target.getPosZ() - this.getPosZ();
		double d3 = (double) MathHelper.sqrt(d0 * d0 + d2 * d2);
		abstractarrowentity.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
		this.playSound(SoundEvents.SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.addEntity(abstractarrowentity);
	}

	protected AbstractArrowEntity fireArrow(ItemStack arrowStack, float distanceFactor) {
		return ProjectileHelper.fireArrow(this, arrowStack, distanceFactor);
	}
}









