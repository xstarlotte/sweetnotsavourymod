package com.charlotte.sweetnotsavourymod.common.entity;

import com.charlotte.sweetnotsavourymod.client.entity.PoisonBerryArcherRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryMeleeAttackGoal;
import com.charlotte.sweetnotsavourymod.common.entity.ai.PoisonBerryOpensMiniDoorGoal;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class PoisonBerryArcherEntity extends MonsterEntity implements IRangedAttackMob{

	public PoisonBerryArcherEntity( EntityType<? extends MonsterEntity> type, World worldIn) {
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
		
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 0.22D, 40 ,15));
		this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.12D));
		this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8.0f));
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


	public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
		ItemStack itemstack = this.findAmmo(Items.BOW.getDefaultInstance());
		AbstractArrowEntity abstractarrowentity = this.fireArrow(itemstack, distanceFactor);


		double d0 = target.getPosX() - this.getPosX();
		double d1 = target.getPosYHeight(0.3333333333333333D) - abstractarrowentity.getPosY();
		double d2 = target.getPosZ() - this.getPosZ();
		double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
		abstractarrowentity.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
		this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.addEntity(abstractarrowentity);
	}

	protected AbstractArrowEntity fireArrow(ItemStack arrowStack, float distanceFactor) {
		return ProjectileHelper.fireArrow(this, arrowStack, distanceFactor);
	}
}




