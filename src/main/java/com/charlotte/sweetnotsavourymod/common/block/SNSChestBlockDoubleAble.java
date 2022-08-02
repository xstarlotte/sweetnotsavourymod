package com.charlotte.sweetnotsavourymod.common.block;

import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestBlockEntity;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestBlockDoubleAble extends SNSChestBlock {
	public SNSChestBlockDoubleAble(Properties properties, Supplier<BlockEntityType<SNSChestBlockEntity>> blockEntity, Supplier<SNSChestMenuType> menuSingle, Supplier<SNSChestMenuType> menuDouble, int containerSize) {
		super(properties, blockEntity, menuSingle, menuDouble, containerSize, true);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		super.createBlockStateDefinition(pBuilder);
		pBuilder.add(TYPE);
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		if (pState.getValue(TYPE) == ChestType.SINGLE)
			return AABB;
		return switch (getConnectedDirection(pState)) {
			default -> NORTH_AABB;
			case SOUTH -> SOUTH_AABB;
			case WEST -> WEST_AABB;
			case EAST -> EAST_AABB;
		};
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState pState, Mirror pMirror) {
		BlockState rotated = pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
		return pMirror == Mirror.NONE ? rotated : rotated.setValue(TYPE, rotated.getValue(TYPE).getOpposite());
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		ChestType chesttype = ChestType.SINGLE;
		Direction direction = pContext.getHorizontalDirection().getOpposite();
		FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
		boolean flag = pContext.isSecondaryUseActive();
		Direction direction1 = pContext.getClickedFace();
		if (direction1.getAxis().isHorizontal() && flag) {
			Direction direction2 = this.candidatePartnerFacing(pContext, direction1.getOpposite());
			if (direction2 != null && direction2.getAxis() != direction1.getAxis()) {
				direction = direction2;
				chesttype = direction2.getCounterClockWise() == direction1.getOpposite() ? ChestType.RIGHT : ChestType.LEFT;
			}
		}

		if (chesttype == ChestType.SINGLE && !flag) {
			if (direction == this.candidatePartnerFacing(pContext, direction.getClockWise())) {
				chesttype = ChestType.LEFT;
			} else if (direction == this.candidatePartnerFacing(pContext, direction.getCounterClockWise())) {
				chesttype = ChestType.RIGHT;
			}
		}
		BlockState result = this.defaultBlockState().setValue(FACING, direction).setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
		return result.setValue(TYPE, chesttype);
	}

	@Nullable
	private Direction candidatePartnerFacing(BlockPlaceContext pContext, Direction pDirection) {
		BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos().relative(pDirection));
		return blockstate.is(this) && blockstate.getValue(TYPE) == ChestType.SINGLE ? blockstate.getValue(FACING) : null;
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		pState = super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);

		if (pFacingState.is(this) && pFacing.getAxis().isHorizontal()) {
			ChestType chesttype = pFacingState.getValue(TYPE);
			if (pState.getValue(TYPE) == ChestType.SINGLE && chesttype != ChestType.SINGLE && pState.getValue(FACING) == pFacingState.getValue(FACING) && getConnectedDirection(pFacingState) == pFacing.getOpposite()) {
				return pState.setValue(TYPE, chesttype.getOpposite());
			}
		} else if (getConnectedDirection(pState) == pFacing) {
			return pState.setValue(TYPE, ChestType.SINGLE);
		}

		return pState;
	}
}
