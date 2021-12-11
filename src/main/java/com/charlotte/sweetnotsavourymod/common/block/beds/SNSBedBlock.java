package com.charlotte.sweetnotsavourymod.common.block.beds;


import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class SNSBedBlock extends BedBlock {


    public SNSBedBlock(DyeColor colorIn , Properties properties ){
        super( colorIn , properties );
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos , BlockState state ){
        return BlockEntityTypesInit.SNS_BLOCK_ENTITY_TYPE.get().create();
    }

    @Override
    public boolean hasBlockEntity( BlockState state ){
        return true;
    }

    @Override
    public boolean isBed(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
    	return true;
    }
}