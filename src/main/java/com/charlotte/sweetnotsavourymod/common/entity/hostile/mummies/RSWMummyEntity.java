package com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies;


import com.charlotte.sweetnotsavourymod.common.entityai.RSWMummyAttackGoal;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class RSWMummyEntity extends Monster implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    public RSWMummyEntity(EntityType<? extends Monster> type, World worldIn) {
        super(type, worldIn);
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mummy.running", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mummy.idle", true));
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
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
        this.addBehaviourGoals();
    }
    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.targetSelector.addGoal(1, new RSWMummyAttackGoal(this, 1, false));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(RSWMummyEntity.class));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, true));


    }

    public static AttributeModifierMap createAttributes() {
        return Monster
                .createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 70.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3F)
                .add(Attributes.ATTACK_DAMAGE, 1.0D)
                .add(Attributes.ARMOR, 8.0D)
				.build();

    }

	@Override
	protected int getExperienceReward(PlayerEntity p_21511_) {
		return 64;
	}

	 protected SoundEvent getAmbientSound() {
	      return SoundEvents.ZOMBIE_AMBIENT;
	}

	 protected SoundEvent getStepSound() {
	      return SoundEvents.ZOMBIE_STEP;
	}

	protected void playAmbientSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return SoundEvents.ZOMBIE_HURT;
    }

	@Override
	protected SoundEvent getDeathSound() {

		return SoundEvents.ZOMBIE_DEATH;

	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();

	}

}
