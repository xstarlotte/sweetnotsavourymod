package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.common.entity.boats.ModBoatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.world.ActionResultTypeHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.World;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.function.Predicate;

public class ModBoatItem extends Item {
    private static final Predicate<Entity> ENTITY_PREDICATE = EntitySelector.NO_SPECTATORS.and(Entity::canBeCollidedWith);
    private final ModBoatEntity.Type type;

    public ModBoatItem(Item.Properties properties, ModBoatEntity.Type typeIn) {
        super(properties);
        this.type = typeIn;
    }

    public ActionResultTypeHolder<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        HitResult raytraceresult = getPlayerPOVHitResult(worldIn, playerIn, ClipContext.Fluid.ANY);
        if (raytraceresult.getType() == HitResult.Type.MISS) {
            return ActionResultTypeHolder.pass(itemstack);
        } else {
            Vec3 vec3d = playerIn.getEyePosition(1.0F);
            double d0 = 5.0D;
            List<Entity> list = worldIn.getEntities(playerIn, playerIn.getBoundingBox().expandTowards(vec3d.scale(d0)).inflate(1.0D), ENTITY_PREDICATE);
            if (!list.isEmpty()) {
                Vec3 vec3d1 = playerIn.getEyePosition(1.0F);
                for(Entity entity : list) {
                    AABB axisalignedbb = entity.getBoundingBox().inflate((double)entity.getPickRadius());
                    if (axisalignedbb.contains(vec3d1)) {
                        return ActionResultTypeHolder.pass(itemstack);
                    }
                }
            }
            if (raytraceresult.getType() == HitResult.Type.BLOCK) {
                ModBoatEntity boatentity = new ModBoatEntity(worldIn, raytraceresult.getLocation().x, raytraceresult.getLocation().y, raytraceresult.getLocation().z);
                boatentity.setBoatType(this.type);
                boatentity.setYRot(playerIn.getYRot());
                if (!worldIn.noCollision(boatentity, boatentity.getBoundingBox().inflate(-0.1D))) {
                    return ActionResultTypeHolder.fail(itemstack);
                } else {
                    if (!worldIn.isClientSide) {
                        worldIn.addFreshEntity(boatentity);
                    }
                    if (!playerIn.getAbilities().instabuild) {
                        itemstack.shrink(1);
                    }
                    playerIn.awardStat(Stats.ITEM_USED.get(this));
                    return ActionResultTypeHolder.success(itemstack);
                }
            } else {
                return ActionResultTypeHolder.pass(itemstack);
            }
        }
    }
}
