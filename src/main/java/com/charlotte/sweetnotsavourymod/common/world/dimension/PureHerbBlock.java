package com.charlotte.sweetnotsavourymod.common.world.dimension;

import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class PureHerbBlock extends Block {
    public PureHerbBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public ActionResultType use(BlockState pState, Level pLevel, BlockPos pPos,
                                 PlayerEntity pPlayer, Hand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            if (!pPlayer.isCrouching()) {
                MinecraftServer server = pLevel.getServer();

                if (server != null) {
                    if (pLevel.dimension() == SNSDimensions.HerbMayfairDim) {
                        ServerLevel overWorld = server.getLevel(Level.OVERWORLD);
                        if (overWorld != null) {
                            pPlayer.changeDimension(overWorld, new HerbMayfairTeleporter(pPos, false));
                        }
                    } else {
                        ServerLevel hmDim = server.getLevel(SNSDimensions.HerbMayfairDim);
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
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()) {
            if(pEntity instanceof LivingEntity) {
                LivingEntity entity = ((LivingEntity) pEntity);
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
