package com.charlotte.sweetnotsavourymod.common.block.poisonberry;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.block.Block;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.stream.Stream;

public class PoisonOakStove extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PoisonOakStove(Properties p_49795_) {

        super(p_49795_);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
        Block.box(3.5, 1, 3.5, 12.5, 3, 12.5),
        Block.box(3.5, 0, 3.5, 4.5, 1, 4.5),
        Block.box(11.5, 0, 3.5, 12.5, 1, 4.5),
        Block.box(11.5, 0, 11.5, 12.5, 1, 12.5),
        Block.box(3.5, 0, 11.5, 4.5, 1, 12.5),
        Block.box(3.5, 3, 11.5, 12.5, 7, 12.5),
        Block.box(3.5, 6, 9.5, 12.5, 7, 11.5),
        Block.box(5, 2.25, 5, 7, 3.25, 7),
        Block.box(9, 2.25, 5, 11, 3.25, 7),
        Block.box(9, 2.25, 9, 11, 3.25, 11),
        Block.box(5, 2.25, 9, 7, 3.25, 11),
        Block.box(5, 3.25, 9, 7, 4.25, 9),
        Block.box(3.1, 3.75, 9, 5.1, 3.75, 10),
        Block.box(5, 3.25, 11, 7, 4.25, 11),
        Block.box(4.7695575026123365, 3.25, 8.158512667781107, 4.7695575026123365, 4.25, 10.158512667781107),
        Block.box(6.7695575026123365, 3.25, 8.158512667781107, 6.7695575026123365, 4.25, 10.158512667781107),
        Block.box(5, 3.25, 9, 7, 3.25, 11)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

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
