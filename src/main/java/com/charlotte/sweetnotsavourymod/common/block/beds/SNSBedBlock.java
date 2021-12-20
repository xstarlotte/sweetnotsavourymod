package com.charlotte.sweetnotsavourymod.common.block.beds;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;

public abstract class SNSBedBlock extends BedBlock {
    public SNSBedBlock(DyeColor colorIn, Properties properties){
        super(colorIn, properties);
    }

    @Override
    public boolean isBed(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
    	return true;
    }
}