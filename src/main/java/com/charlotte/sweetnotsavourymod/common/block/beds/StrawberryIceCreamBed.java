package com.charlotte.sweetnotsavourymod.common.block.beds;


import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class StrawberryIceCreamBed extends BedBlock{


    public StrawberryIceCreamBed( DyeColor colorIn , Properties properties ){
        super( colorIn , properties );
    }

    @Nullable
    @Override
    public TileEntity createTileEntity( BlockState state , IBlockReader world ){
        return TileEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get().create();
    }

    @Override
    public boolean hasTileEntity( BlockState state ){
        return true;
    }

    @Override
    public boolean isBed(BlockState state, IBlockReader world, BlockPos pos, Entity player) {
    	return true;
    }
}