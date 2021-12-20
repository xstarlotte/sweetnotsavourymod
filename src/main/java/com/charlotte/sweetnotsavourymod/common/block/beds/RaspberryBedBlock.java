package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.RaspberryIceCreamBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RaspberryBedBlock extends SNSBedBlock {
    public RaspberryBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RaspberryIceCreamBedBlockEntity(pos, state);
    }
}
