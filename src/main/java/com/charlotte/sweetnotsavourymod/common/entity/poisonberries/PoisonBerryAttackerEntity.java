package com.charlotte.sweetnotsavourymod.common.entity.poisonberries;

import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryMeleeAttackGoal;
import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryOpensMiniDoorGoal;


import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class PoisonBerryAttackerEntity extends Monster {
	
	public PoisonBerryAttackerEntity(EntityType<? extends Monster> type, Level worldIn) {
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
		//this.goalSelector.addGoal(1, new PoisonBerryMeleeAttackGoal(this, 0.12D, false));
		//this.goalSelector.addGoal(5, new PoisonBerryOpensMiniDoorGoal(this));
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
	
} 




