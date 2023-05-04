package com.charlotte.sweetnotsavourymod.common.entity.bugs;

import com.charlotte.sweetnotsavourymod.common.entity.IVariable;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.PretzelflyVariant;
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

public class SNSPretzelflyEntity extends PathfinderMob implements IAnimatable, IVariable<PretzelflyVariant> {
    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(SNSPretzelflyEntity.class, EntityDataSerializers.INT);

    public SNSPretzelflyEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
        this.moveControl = new FlyingMoveControl(this, 4, true);
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
        PretzelflyVariant variant = Util.getRandom(PretzelflyVariant.values(), this.random);
        setVariant(variant);
        return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }

    @Override
    public void setVariant(PretzelflyVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public PretzelflyVariant getVariant() {
        return PretzelflyVariant.byId(this.getTypeVariant() & 255);
    }

    @Override
    public int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    @Override
    protected Component getTypeName() {
        return getVariantName(super.getTypeName());
    }

    private <E extends IAnimatable> PlayState flyingPredicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.pretzelfly.flying", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        AnimationController<SNSPretzelflyEntity> flyingController = new AnimationController<>(this, "flyingController", 0, this::flyingPredicate);
        animationData.addAnimationController(flyingController);
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }

    public static AttributeSupplier setAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.FLYING_SPEED, Attributes.FLYING_SPEED.getDefaultValue())
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new WaterAvoidingRandomFlyingGoal(this, 1));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));

    }

    @Override
    protected int calculateFallDamage(float distance, float damageMultiplier) {
        return 0;
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, @Nonnull DamageSource source) {
        return false;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.PARROT_FLY, 0.15F, 1.0F);
    }
    protected SoundEvent getAmbientSound() {
        return SoundEvents.PARROT_FLY;
    }
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.PARROT_FLY;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.PARROT_FLY;
    }
    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

    }

    @Nonnull
    @Override
    protected PathNavigation createNavigation(@Nonnull Level level) {
        FlyingPathNavigation flyingPathNavigator = new FlyingPathNavigation(this, level);
        flyingPathNavigator.setCanOpenDoors(false);
        flyingPathNavigator.setCanFloat(true);
        flyingPathNavigator.setCanPassDoors(true);
        return flyingPathNavigator;
    }

}
