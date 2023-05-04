package com.charlotte.sweetnotsavourymod.common.entity.bugs;

import com.charlotte.sweetnotsavourymod.common.entity.IVariable;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.PretzelflyVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.WormVariant;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomFlyingGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import javax.annotation.Nonnull;

public class SNSWormEntity extends PathfinderMob implements IAnimatable, IVariable<WormVariant> {
    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(SNSWormEntity.class, EntityDataSerializers.INT);

    public SNSWormEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
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
        WormVariant variant = Util.getRandom(WormVariant.values(), this.random);
        setVariant(variant);
        return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }

    @Override
    public void setVariant(WormVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public WormVariant getVariant() {
        return WormVariant.byId(this.getTypeVariant() & 255);
    }

    @Override
    public int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    @Override
    protected Component getTypeName() {
        return getVariantName(super.getTypeName());
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.snake.slithering", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.snake.idle", ILoopType.EDefaultLoopTypes.LOOP));
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

    public static AttributeSupplier setAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));

    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.RABBIT_AMBIENT, 0.15F, 70.0F);
    }
    protected SoundEvent getAmbientSound() {
        return SoundEvents.RABBIT_AMBIENT;
    }
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.RABBIT_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.RABBIT_DEATH;
    }
    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

    }

}
