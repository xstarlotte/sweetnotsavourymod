package com.charlotte.sweetnotsavourymod.common.block.beds;

import javax.annotation.Nullable;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.core.BlockPos;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LemonIceCreamBed extends BedBlock {


    public LemonIceCreamBed(DyeColor colorIn , Properties properties ){
        super( colorIn , properties );
    }

    @Nullable
    @Override
    public BlockEntity createTileEntity(BlockState state , BlockGetter world ){
        return TileEntityTypesInit.LEMONICECREAMBED_TILE_ENTITY_TYPE.get().create();
    }

    @Override
    public boolean hasTileEntity( BlockState state ){
        return true;
    }

    @Override
    public boolean isBed(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
    	return true;
    }
}