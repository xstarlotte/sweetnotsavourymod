package com.charlotte.sweetnotsavourymod.common.block;

/*
public class CandyCaneSugarCaneBlock extends SugarCaneBlock {
	   public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
	   protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

	   public CandyCaneSugarCaneBlock(BlockBehaviour.Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().with(AGE, Integer.valueOf(0)));
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

	   public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
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

*/
