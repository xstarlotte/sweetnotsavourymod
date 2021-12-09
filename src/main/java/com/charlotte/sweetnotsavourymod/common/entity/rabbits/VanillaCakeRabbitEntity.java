package com.charlotte.sweetnotsavourymod.common.entity.rabbits;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
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
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
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

public class VanillaCakeRabbitEntity extends TameableEntity implements IAnimatable
{
	private AnimationFactory factory = new AnimationFactory(this);
	
	private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(VanillaCakeRabbitEntity.class, DataSerializers.BOOLEAN);
	
	public VanillaCakeRabbitEntity(EntityType<? extends TameableEntity> type, World worldIn) {
		super(type, worldIn);
		setTamed(false);
		this.ignoreFrustumCheck = true;
	}
	
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {    
			
		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.running", true));
			return PlayState.CONTINUE;
		}
		
		if (this.isSitting()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.sitting", true));
            return PlayState.CONTINUE;
        }
		
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.idle", true));
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
    
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return sizeIn.height * 0.65F;
     }
	
	public static AttributeModifierMap.MutableAttribute setAttributes() {
		return TameableEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0f)
				.createMutableAttribute(Attributes.ATTACK_SPEED, 2.0f)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)0.3f);

	}
		
	protected void registerGoals() {
	    this.goalSelector.addGoal(1, new SwimGoal(this));
	    this.goalSelector.addGoal(2, new SitGoal(this));
	    this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
	    this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
	    this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
	    this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	    this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	    this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
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
		getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((double)0.6f);
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
                setSitting(true);
            }
            
            return ActionResultType.SUCCESS;
        }
    }

    if(isTamed() && !world.isRemote() && hand == Hand.MAIN_HAND) {
        setSitting(!isSitting());
        return ActionResultType.SUCCESS;
    }
    
    if (itemstack.getItem() == Items.SUGAR) {
        return ActionResultType.PASS;
    }
    
    return super.func_230254_b_(player, hand);
}

public void setSitting(boolean sitting) {
    this.dataManager.set(SITTING, sitting);
}

public boolean isSitting() {
    return this.dataManager.get(SITTING);
 }

@Override
protected void registerData() {
	super.registerData();
	this.dataManager.register(SITTING, false);
}

@Override
public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
	// TODO Auto-generated method stub
	return null;
}
protected void playStepSound(BlockPos pos, BlockState blockIn) {
    this.playSound(SoundEvents.ENTITY_RABBIT_JUMP, 0.15F, 1.0F);
 }
protected SoundEvent getAmbientSound() {
	return SoundEvents.ENTITY_RABBIT_AMBIENT;
}
protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
    return SoundEvents.ENTITY_RABBIT_HURT;
 }

 protected SoundEvent getDeathSound() {
    return SoundEvents.ENTITY_RABBIT_DEATH;
 }
 protected float getSoundVolume() {
     return 0.2F;
  }

}
