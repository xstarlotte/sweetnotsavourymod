package com.charlotte.sweetnotsavourymod.common.block.machineblocks;

import com.charlotte.sweetnotsavourymod.common.blockentities.machines.SNSMachineBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class SNSMachine<BE extends SNSMachineBlockEntity> extends BaseEntityBlock {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	private final Supplier<BlockEntityType<BE>> blockEntity;
	
	public SNSMachine(Properties properties, Supplier<BlockEntityType<BE>> blockEntity) {
		super(properties);
		this.blockEntity = blockEntity;
		this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
	}
	
	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
	}
	
	@Override
	public BlockState rotate(BlockState pState, Rotation pRotation) {
		return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
	}
	
	@Override
	public BlockState mirror(BlockState pState, Mirror pMirror) {
		return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FACING);
	}
	
	public BlockEntityType<BE> getBlockEntity() {
		return blockEntity.get();
	}
	
	@Nullable
	@Override
	public BE newBlockEntity(BlockPos pos, BlockState state) {
		return getBlockEntity().create(pos, state);
	}
}
