package com.charlotte.sweetnotsavourymod.common.block.poisonberry;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.stream.Stream;

public class PoisonOakDrawers extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PoisonOakDrawers(Properties p_49795_) {

        super(p_49795_);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(0, 1, 8, 16, 6, 16),
            Block.box(0, 0, 8, 1, 1, 9),
            Block.box(0, 0, 15, 1, 1, 16),
            Block.box(15, 0, 15, 16, 1, 16),
            Block.box(15, 0, 8, 16, 1, 9),
            Block.box(7.5, 4, 7, 8.5, 5, 8),
            Block.box(12.5, 6, 11, 14.5, 8, 13),
            Block.box(12.25, 8, 12, 14.25, 10, 12),
            Block.box(13.5, 8, 10.75, 13.5, 10, 12.75),
            Block.box(1.5, 6, 11, 4.5, 9, 12),
            Block.box(7.5, 2, 7, 8.5, 3, 8),
            Block.box(2, 5.25, 13, 4, 8.25, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState pState, IBlockReader pLevel, BlockPos pPos, ISelectionContext pContext) {
        return SHAPE_N;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext pContext) {
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
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


}
