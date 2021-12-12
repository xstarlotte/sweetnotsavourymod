package com.charlotte.sweetnotsavourymod.common.entity.poisonberries;

import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryMeleeAttackGoal;
import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryOpensMiniDoorGoal;

/*
public class PoisonBerrySpriteEntity extends MonsterEntity{

	public PoisonBerrySpriteEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public static AttributeModifierMap.MutableAttribute setAttributes() {
		return MonsterEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 10.0f)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0f)
				.createMutableAttribute(Attributes.ATTACK_SPEED, 2.0f)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 2.0f);
			
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		
		this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.12D));
		this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8.0f));
		this.goalSelector.addGoal(1, new PoisonBerryMeleeAttackGoal(this, 0.12D, false)); 
		this.goalSelector.addGoal(5, new PoisonBerryOpensMiniDoorGoal(this));
		this.targetSelector.addGoal(1,  new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
	  
		
	}
	
	@Override
	protected int getExperiencePoints(PlayerEntity player) {
		return 6;
		
		
	}
	
	 protected SoundEvent getAmbientSound() {
	      return SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH;
	}
	      
	 protected SoundEvent getStepSound() {
	      return SoundEvents.BLOCK_BEEHIVE_ENTER;
	}     
	 
	protected void playAmbientSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(this.getStepSound(), 0.15F, 1.0F);
	} 
	 
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return SoundEvents.ENTITY_BEE_HURT;
    } 
	
	@Override
	protected SoundEvent getDeathSound() {
		
		return SoundEvents.ENTITY_BEE_DEATH;
		
	}
	
} 
*/