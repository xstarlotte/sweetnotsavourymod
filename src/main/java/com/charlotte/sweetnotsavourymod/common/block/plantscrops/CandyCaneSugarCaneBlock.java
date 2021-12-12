package com.charlotte.sweetnotsavourymod.common.block.plantscrops;

import java.util.Random;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

import net.minecraft.server.level.ServerLevel;

import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/*
public class CandyCaneSugarCaneBlock extends SugarCaneBlock {
	   public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
	   protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

	   public CandyCaneSugarCaneBlock(BlockBehaviour.Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().with(AGE, Integer.valueOf(0)));
	   }

	   public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
	      return SHAPE;
	   }

	   public void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random rand) {
	      if (!state.canSurvive(worldIn, pos)) {
	         worldIn.destroyBlock(pos, true);
	      }

	   }

	   /**
	    * Performs a random tick on a block.
	    
	   public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
	      if (worldIn.isEmptyBlock(pos.up())) {
	         int i;
	         for(i = 1; worldIn.getBlockState(pos.down(i)).isIn(this); ++i) {
	         }

	         if (i < 3) {
	            int j = state.get(AGE);
	            if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, true)) {
	            if (j == 15) {
	               worldIn.setBlockState(pos.up(), this.defaultBlockState());
	               worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(0)), 4);
	            } else {
	               worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(j + 1)), 4);
	            }
	            }
	         }
	      }

	   }

	  
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
	      if (!stateIn.canSurvive(worldIn, currentPos)) {
	         worldIn.getBlockTicks().scheduleTick(currentPos, this, 1);
	      }

	      return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }

	   protected void fillStateContainer(StateDefinition.Builder<Block, BlockState> builder) {
	      builder.add(AGE);
	   }


	   public net.minecraftforge.common.PlantType getPlantType(BlockGetter world, BlockPos pos) {
	       return net.minecraftforge.common.PlantType.BEACH;
	   }


	   public BlockState getPlant(BlockGetter world, BlockPos pos) {
	      return defaultBlockState();
	   }
}

*/