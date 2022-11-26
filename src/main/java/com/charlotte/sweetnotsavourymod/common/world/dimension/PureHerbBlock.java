package com.charlotte.sweetnotsavourymod.common.world.dimension;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class PureHerbBlock extends Block {
    public PureHerbBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public ActionResultType use(BlockState pState, World pLevel, BlockPos pPos,
                                 PlayerEntity pPlayer, Hand pHand, BlockRayTraceResult pHit) {
        if (!pLevel.isClientSide()) {
            if (!pPlayer.isCrouching()) {
                MinecraftServer server = pLevel.getServer();

                if (server != null) {
                    if (pLevel.dimension() == SNSDimensions.HerbMayfairDim) {
                        ServerWorld overWorld = server.getLevel(World.OVERWORLD);
                        if (overWorld != null) {
                            pPlayer.changeDimension(overWorld, new HerbMayfairTeleporter(pPos, false));
                        }
                    } else {
                        ServerWorld hmDim = server.getLevel(SNSDimensions.HerbMayfairDim);
                        if (hmDim != null) {
                            pPlayer.changeDimension(hmDim, new HerbMayfairTeleporter(pPos, true));
                        }
                    }
                    return ActionResultType.SUCCESS;
                }
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public void stepOn(World pLevel, BlockPos pPos, Entity pEntity) {
        if(!pLevel.isClientSide()) {
            if(pEntity instanceof LivingEntity) {
                LivingEntity entity = ((LivingEntity) pEntity);
                entity.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 200));
            }
        }

        super.stepOn(pLevel, pPos, pEntity);
    }
}
