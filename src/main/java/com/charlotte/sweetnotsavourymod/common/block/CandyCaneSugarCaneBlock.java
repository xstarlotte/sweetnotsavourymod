package com.charlotte.sweetnotsavourymod.common.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class CandyCaneSugarCaneBlock extends SugarCaneBlock {
	   public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
	   protected static final VoxelShape SHAPE = box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

	   public CandyCaneSugarCaneBlock(Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
	   }

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return SHAPE;
	   }

	   public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
	      if (!state.canSurvive(worldIn, pos)) {
	         worldIn.destroyBlock(pos, true);
	      }

	   }

	   /**
	    * Performs a random tick on a block.
	    */
	   public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
	      if (worldIn.isEmptyBlock(pos.above())) {
	         int i;
	         for(i = 1; worldIn.getBlockState(pos.below(i)).is(this); ++i) {
	         }

	         if (i < 3) {
	            int j = state.getValue(AGE);
	            if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, true)) {
	            if (j == 15) {
	               worldIn.setBlockAndUpdate(pos.above(), this.defaultBlockState());
	               worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(0)), 4);
	            } else {
	               worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(j + 1)), 4);
	            }
	            }
	         }
	      }

	   }


	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
	      if (!stateIn.canSurvive(worldIn, currentPos)) {
	         worldIn.getBlockTicks().scheduleTick(currentPos, this, 1);
	      }

	      return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }

	   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(AGE);
	   }


	   public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
	       return net.minecraftforge.common.PlantType.BEACH;
	   }


	   public BlockState getPlant(IBlockReader world, BlockPos pos) {
	      return defaultBlockState();
	   }
}
