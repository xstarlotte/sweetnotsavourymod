package com.charlotte.sweetnotsavourymod.common.block.beds;

import javax.annotation.Nullable;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.entity.Entity;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class RaspberryIceCreamBed extends BedBlock{


    public RaspberryIceCreamBed( DyeColor colorIn , Properties properties ){
        super( colorIn , properties );
    }

    @Nullable
    @Override
    public TileEntity createTileEntity( BlockState state , IBlockReader world ){
        return TileEntityTypesInit.RASPBERRYICECREAMBED_TILE_ENTITY_TYPE.get().create();
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
