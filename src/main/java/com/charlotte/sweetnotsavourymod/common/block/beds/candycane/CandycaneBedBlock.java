package com.charlotte.sweetnotsavourymod.common.block.beds.candycane;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.candycane.CandycaneBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.WaffleBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CandycaneBedBlock extends SNSBedBlock {
    public CandycaneBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CandycaneBedBlockEntity(pos, state);
    }
}