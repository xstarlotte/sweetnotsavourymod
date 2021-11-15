package com.charlotte.sweetnotsavourymod.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.OwnerHurtByTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;

public class LemonElfEntity extends TameableEntity {

	public LemonElfEntity(EntityType<? extends TameableEntity> type, World worldIn) {
		super(type, worldIn);	
		setTamed(false);
	}
	
	public static AttributeModifierMap.MutableAttribute setAttributes() {
		return TameableEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 20.0f)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0f)
				.createMutableAttribute(Attributes.ATTACK_SPEED, 2.0f)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.64f);

	}
		
protected void registerGoals() {
    this.goalSelector.addGoal(1, new SwimGoal(this));
    this.goalSelector.addGoal(2, new LeapAtTargetGoal(this, 0.4F));
    this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
    this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
    this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
    this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
    this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
    this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
    this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp());

 }
	
@Override
public void setTamed(boolean tamed)
{
	super.setTamed(tamed);
	if (tamed) {
		getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0D);
		getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8F);
		this.setHealth(20.0F);
	} else {
		getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0D);
		getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8F);
	}
}

public void makeTamed(PlayerEntity player) {
	if (!world.isRemote) {
		super.setTamedBy(player);
		this.navigator.clearPath();
		this.setAttackTarget(null);
		this.world.setEntityState(this, (byte)7);
	}
}
@Override
public ActionResultType func_230254_b_(PlayerEntity player, Hand hand)
{
	ItemStack itemstack = player.getHeldItem(hand);
	Item item = itemstack.getItem();
	
	if (item == Items.SUGAR && !isTamed()) {
		if (world.isRemote) {
			return ActionResultType.CONSUME;
		} else {
			if (!player.abilities.isCreativeMode) {
				itemstack.shrink(1);
			}

			if (!ForgeEventFactory.onAnimalTame(this, player)) {
				makeTamed(player);
			}
			
			return ActionResultType.SUCCESS;
		}
	}
	
	if (itemstack.getItem() == Items.SUGAR) {
		return ActionResultType.PASS;
	}
	
	return super.func_230254_b_(player, hand);
}


protected void playStepSound(BlockPos pos, BlockState blockIn) {
    this.playSound(SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, 0.15F, 1.0F);
 }
protected SoundEvent getAmbientSound() {
	return SoundEvents.ENTITY_DOLPHIN_AMBIENT;
}
protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
    return SoundEvents.ENTITY_DOLPHIN_HURT;
 }

 protected SoundEvent getDeathSound() {
    return SoundEvents.ENTITY_DOLPHIN_DEATH;
 }
 protected float getSoundVolume() {
     return 0.2F;
  }

@Override
public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
	// TODO Auto-generated method stub
	return null;
}
}

