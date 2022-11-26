package com.charlotte.sweetnotsavourymod.common.block.beds;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public abstract class SNSBedBlock extends BedBlock {
    public SNSBedBlock(DyeColor colorIn, Properties properties){
        super(colorIn, properties);
    }

    @Override
    public boolean isBed(BlockState state, IBlockReader world, BlockPos pos, Entity player) {
    	return true;
    }
}