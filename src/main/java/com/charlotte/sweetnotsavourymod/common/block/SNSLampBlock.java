package com.charlotte.sweetnotsavourymod.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
public class SNSLampBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	protected static final VoxelShape AABB = Shapes.or(Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), Block.box(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
	protected static final VoxelShape HANGING_AABB = Shapes.or(Block.box(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));
public SNSLampBlock(BlockBehaviour.Properties p_153465_) {
	   super(p_153465_);
      this.registerDefaultState(this.stateDefinition.any().setValue(HANGING, false).setValue(WATERLOGGED, false));
	this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
}

	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction facing = context.getHorizontalDirection().getOpposite();
		
		FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
		boolean waterlogged = fluidstate.getType() == Fluids.WATER;
		
		boolean hanging = context.getClickedFace() == Direction.UP;
		
		return this.defaultBlockState()
				.setValue(FACING, facing)
				.setValue(WATERLOGGED, waterlogged)
				.setValue(HANGING, hanging);
	}

	public VoxelShape getShape(BlockState p_153474_, BlockGetter p_153475_, BlockPos p_153476_, CollisionContext p_153477_) {
		return p_153474_.getValue(HANGING) ? HANGING_AABB : AABB;
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, HANGING, WATERLOGGED);
	}

	@Override
	public BlockState rotate(BlockState pState, Rotation pRotation) {
		return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
	}

	@Override
	public BlockState mirror(BlockState pState, Mirror pMirror) {
		return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
	}

	public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
		Direction direction = getConnectedDirection(state).getOpposite();
		return Block.canSupportCenter(level, pos.relative(direction), direction.getOpposite());
	}

	protected static Direction getConnectedDirection(BlockState p_153496_) {
		return p_153496_.getValue(HANGING) ? Direction.UP : Direction.DOWN;
	}

	public PushReaction getPistonPushReaction(BlockState p_153494_) {
		return PushReaction.DESTROY;
	}

	public BlockState updateShape(BlockState p_153483_, Direction p_153484_, BlockState p_153485_, LevelAccessor p_153486_, BlockPos p_153487_, BlockPos p_153488_) {
		if (p_153483_.getValue(WATERLOGGED)) {
			p_153486_.scheduleTick(p_153487_, Fluids.WATER, Fluids.WATER.getTickDelay(p_153486_));
		}

		return getConnectedDirection(p_153483_).getOpposite() == p_153484_ && !p_153483_.canSurvive(p_153486_, p_153487_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_153483_, p_153484_, p_153485_, p_153486_, p_153487_, p_153488_);
	}

	public FluidState getFluidState(BlockState p_153492_) {
		return p_153492_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_153492_);
	}

	public boolean isPathfindable(BlockState p_153469_, BlockGetter p_153470_, BlockPos p_153471_, PathComputationType p_153472_) {
		return false;
	}
}
