package com.charlotte.sweetnotsavourymod.common.block;


import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class StrawberryIceCreamBed extends Block {

	public StrawberryIceCreamBed(Properties properties) {
		super(properties);
	}
	
	@Override
    protected void fillStateContainer( StateContainer.Builder <Block, BlockState> builder ){
        builder.add(BlockStateProperties.HORIZONTAL_FACING );
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement( BlockItemUseContext context ){
        return this.getDefaultState().with(BlockStateProperties.HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    
    @Override
    public boolean isBed(BlockState state, IBlockReader world, BlockPos pos, Entity player) {
    	return true;
    }
}