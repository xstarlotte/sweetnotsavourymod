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

public class PoisonBerryWoodBed extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PoisonBerryWoodBed(Properties p_49795_) {

        super(p_49795_);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(2.75, 3, 11.25, 7.75, 6, 13.25),
            Block.box(8.25, 3, 11.25, 13.25, 6, 13.25),
            Block.box(12, 0, 14, 14, 1, 16),
            Block.box(2, 0, 14, 4, 1, 16),
            Block.box(2, 0, 0, 4, 1, 2),
            Block.box(12, 7, 14, 14, 8, 16),
            Block.box(2, 7, 14, 4, 8, 16),
            Block.box(2, 5, 0, 4, 6, 2),
            Block.box(12, 5, 0, 14, 6, 2),
            Block.box(12, 0, 0, 14, 1, 2),
            Block.box(2, 1, 0, 14, 5, 2),
            Block.box(2, 1, 14, 14, 7, 16),
            Block.box(2, 3, 2, 14, 4, 11),
            Block.box(2, 1, 2, 14, 3, 14)
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
