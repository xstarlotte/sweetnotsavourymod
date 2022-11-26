package com.charlotte.sweetnotsavourymod.common.entity.rodents;

import com.charlotte.sweetnotsavourymod.common.entity.IVariable;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.RabbitFlavourVariant;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.scores.Team;
import net.minecraftforge.event.ForgeEventFactory;
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

import java.util.UUID;

public class SNSRabbitEntity extends TamableAnimal implements IAnimatable, IVariable<RabbitFlavourVariant> {

    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> SITTING =
            SynchedEntityData.defineId(com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity.class, EntityDataSerializers.BOOLEAN);

    public SNSRabbitEntity(EntityType<? extends TamableAnimal> type, Level worldIn) {
        super(type, worldIn);
        setTame(false);
        this.noCulling = true;
    }

    //animations
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.running", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }
        if (this.isSitting()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.sitting", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rabbit.idle", ILoopType.EDefaultLoopTypes.LOOP));
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

    //attributes + goals
    public static AttributeSupplier setAttributes() {
        return TamableAnimal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 80.0D)
                .add(Attributes.ATTACK_DAMAGE, 4D)
                .add(Attributes.ATTACK_SPEED, 2.0f)
                .add(Attributes.MOVEMENT_SPEED, (double)0.25f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, true));
        this.goalSelector.addGoal(6, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
    }

    //taming
    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        Item itemForTaming = ItemInit.CANDYCANESUGAR.get();
        if(isFood(itemstack)) {
            return super.mobInteract(player, hand);
        }
        if (item == itemForTaming && !isTame()) {
            if (this.level.isClientSide) {
                return InteractionResult.CONSUME;
            } else {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                if (!ForgeEventFactory.onAnimalTame(this, player)) {
                    if (!this.level.isClientSide) {
                        super.tame(player);
                        this.navigation.recomputePath();
                        this.setTarget(null);
                        this.level.broadcastEntityEvent(this, (byte)7);
                        setSitting(true);
                    }
                }
                return InteractionResult.SUCCESS;
            }
        }
        if(isTame() && !this.level.isClientSide && hand == InteractionHand.MAIN_HAND) {
            setSitting(!isSitting());
            return InteractionResult.SUCCESS;
        }
        if (itemstack.getItem() == itemForTaming) {
            return InteractionResult.PASS;
        }
        return super.mobInteract(player, hand);
    }

    @Override
    public void setTame(boolean tamed) {
        super.setTame(tamed);
        if (tamed) {
            getAttribute(Attributes.MAX_HEALTH).setBaseValue(80.0D);
            getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(4D);
            getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.5f);
        } else {
            getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
            getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(2D);
            getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((double)0.25f);
        }
    }

    public void makeTamed(Player player) {
        if (!level.isClientSide) {
            super.tame(player);
            this.navigation.recomputePath();
            this.setTarget(null);
            this.level.broadcastEntityEvent(this, (byte)7);
        }
    }
    //fighting
    @Override
    public Team getTeam() {
        return super.getTeam();
    }

    public boolean doHurtTarget(Entity pEntity) {
        boolean flag = pEntity.hurt(DamageSource.mobAttack(this), (float)((int)
                this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
        if (flag) {
            this.doEnchantDamageEffects(this, pEntity);
        }

        return flag;
    }

    public boolean wantsToAttack(LivingEntity pTarget, LivingEntity pOwner) {
        if (!(pTarget instanceof Creeper) && !(pTarget instanceof Ghast)) {

            if (pTarget instanceof Player && pOwner instanceof Player && !((Player)pOwner).canHarmPlayer((Player)pTarget)) {
                return false;
            } else if (pTarget instanceof AbstractHorse && ((AbstractHorse)pTarget).isTamed()) {
                return false;
            } else {
                return !(pTarget instanceof TamableAnimal) || !((TamableAnimal)pTarget).isTame();
            }
        } else {
            return false;
        }
    }
//breeding

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.getItem() == ItemInit.SPRINKLES.get();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageablemob) {
        com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity mob = EntityTypesInit.SNSRABBIT.get().create(serverLevel);
        UUID uuid = this.getOwnerUUID();
        if (uuid != null) {
            mob.setOwnerUUID(uuid);
            mob.setTame(true);
        }
        return mob;
    }

    public boolean canMate(Animal mate) {
        if (mate == this) {
            return false;
        } else if (!this.isTame()) {
            return true;
        } else if (!(mate instanceof com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity)) {
            return false;
        } else {
            com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity mob = (com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity)mate;
            if (!mob.isTame()) {
                return true;
            } else if (mob.isInSittingPose()) {
                return true;
            } else {
                return this.isInLove() && mob.isInLove();
            }
        }
    }
    //data
    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getTypeVariant());
        tag.putBoolean("Sitting", this.isSitting());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SITTING, false);
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);

    }

    public boolean isSitting() {
        return this.entityData.get(SITTING);
    }

    public void setSitting(boolean sitting) {
        this.entityData.set(SITTING, sitting);
        this.setOrderedToSit(sitting);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag p_21815_) {
        super.readAdditionalSaveData(p_21815_);
        this.entityData.set(DATA_ID_TYPE_VARIANT, p_21815_.getInt("Variant"));
        setSitting(p_21815_.getBoolean("Sitting"));
    }
    //variants
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
                                        MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
                                        @Nullable CompoundTag p_146750_) {
        RabbitFlavourVariant variant = Util.getRandom(RabbitFlavourVariant.values(), this.random);
        setVariant(variant);
        return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }

    @Override
    public void setVariant(RabbitFlavourVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public RabbitFlavourVariant getVariant() {
        return RabbitFlavourVariant.byId(this.getTypeVariant() & 255);
    }

    @Override
    public int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    @Override
    protected Component getTypeName() {
        return getVariantName(super.getTypeName());
    }
    //sound
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.RABBIT_JUMP, 0.15F, 1.0F);
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

    //etc
    public boolean canBeLeashed(Player player) {
        return super.canBeLeashed(player);
    }
    protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
        return sizeIn.height * 0.65F;
    }
}
