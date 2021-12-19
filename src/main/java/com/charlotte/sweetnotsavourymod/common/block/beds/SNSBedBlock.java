package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SNSBedBlock extends BedBlock {
    public SNSBedBlock(DyeColor colorIn, Properties properties){
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SNSBedBlockEntity(pos, state);
    }

    @Override
    public boolean isBed(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
    	return true;
    }
}