package com.charlotte.sweetnotsavourymod.common.entity.crooks;


import com.charlotte.sweetnotsavourymod.common.entity.ai.RSWMummyAttackGoal;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.core.util.CCCrookVariant;
import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CandyCaneCrookEntity extends Monster implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
	private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
			SynchedEntityData.defineId(CandyCaneCrookEntity.class, EntityDataSerializers.INT);
    public CandyCaneCrookEntity(EntityType<? extends Monster> type, Level worldIn) {
        super(type, worldIn);
		this.noCulling = true;
    }

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", this.getTypeVariant());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag p_21815_) {
		super.readAdditionalSaveData(p_21815_);
		this.entityData.set(DATA_ID_TYPE_VARIANT, p_21815_.getInt("Variant"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
										MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
										@Nullable CompoundTag p_146750_) {
		CCCrookVariant variant = Util.getRandom(CCCrookVariant.values(), this.random);
		setVariant(variant);
		return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
	}

	private void setVariant(CCCrookVariant variant) {
		this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
	}

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.crook.running", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.crook.idle", true));
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
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
        this.addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.targetSelector.addGoal(1, new RSWMummyAttackGoal(this, 1, false));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(CandyCaneCrookEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));

    }

    public static AttributeSupplier createAttributes() {
        return Monster
                .createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.46F)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.ARMOR, 2.0D)
				.build();
    }

	public CCCrookVariant getVariant() {
		return CCCrookVariant.byId(this.getTypeVariant() & 255);
	}

	private int getTypeVariant() {
		return this.entityData.get(DATA_ID_TYPE_VARIANT);
	}

	@Override
	protected int getExperienceReward(Player p_21511_) {
		return 6;
	}
	
	 protected SoundEvent getAmbientSound() {
	      return SoundEvents.BLAZE_AMBIENT;
	}
	      
	 protected SoundEvent getStepSound() {
	      return SoundEvents.STRAY_STEP;
	}     
	 
	protected void playAmbientSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(this.getStepSound(), 0.15F, 1.0F);
	} 
	 
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return SoundEvents.BLAZE_HURT;
    } 
	
	@Override
	protected SoundEvent getDeathSound() {
		
		return SoundEvents.BLAZE_DEATH;
		
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

	}
	
} 




