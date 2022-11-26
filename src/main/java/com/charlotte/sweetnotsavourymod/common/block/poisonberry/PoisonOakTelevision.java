package com.charlotte.sweetnotsavourymod.common.block.poisonberry;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PoisonOakTelevision extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PoisonOakTelevision(Properties p_49795_) {

        super(p_49795_);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(8.558093876836208, -0.75, 8.252224153482251, 9.558093876836208, 0.25, 11.252224153482253),
            Block.box(5.700922860128385, 8, 3.42598552253588, 10.700922860128385, 12, 3.42598552253588),
            Block.box(7.450922860128385, 7, 2.92598552253588, 8.450922860128385, 8, 3.92598552253588),
            Block.box(3.9509228601283866, 1, 2.42598552253588, 11.950922860128385, 6, 5.42598552253588),
            Block.box(2.9509228601283866, 0, 1.9259855225358802, 12.950922860128385, 7, 4.92598552253588),
            Block.box(4.950922860128387, 0, 0.9259855225358802, 10.950922860128385, 5, 1.9259855225358802),
            Block.box(5.950922860128385, 0, -0.07401447746411982, 9.950922860128385, 2, 0.9259855225358802)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(8.139692822278505, -0.75, 7.255360314495924, 11.139692822278505, 0.25, 8.255360314495924),
            Block.box(3.3134541913321343, 8, 6.112531331203748, 3.3134541913321343, 12, 11.112531331203748),
            Block.box(2.8134541913321343, 7, 8.362531331203748, 3.8134541913321343, 8, 9.362531331203748),
            Block.box(2.3134541913321343, 1, 4.862531331203748, 5.313454191332134, 6, 12.862531331203746),
            Block.box(1.8134541913321343, 0, 3.8625313312037477, 4.813454191332134, 7, 13.862531331203746),
            Block.box(0.8134541913321343, 0, 5.862531331203748, 1.8134541913321343, 5, 11.862531331203746),
            Block.box(-0.18654580866786574, 0, 6.862531331203748, 0.8134541913321343, 2, 10.862531331203748)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.box(8.558093876836208, -0.75, 8.252224153482251, 9.558093876836208, 0.25, 11.252224153482253),
            Block.box(5.700922860128385, 8, 3.42598552253588, 10.700922860128385, 12, 3.42598552253588),
            Block.box(7.450922860128385, 7, 2.92598552253588, 8.450922860128385, 8, 3.92598552253588),
            Block.box(3.9509228601283866, 1, 2.42598552253588, 11.950922860128385, 6, 5.42598552253588),
            Block.box(2.9509228601283866, 0, 1.9259855225358802, 12.950922860128385, 7, 4.92598552253588),
            Block.box(4.950922860128387, 0, 0.9259855225358802, 10.950922860128385, 5, 1.9259855225358802),
            Block.box(5.950922860128385, 0, -0.07401447746411982, 9.950922860128385, 2, 0.9259855225358802)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.box(4.8112300378498825, -0.75, 8.420625208039954, 7.811230037849882, 0.25, 9.420625208039954),
            Block.box(12.637468668796252, 8, 5.563454191332131, 12.637468668796252, 12, 10.56345419133213),
            Block.box(12.137468668796252, 7, 7.313454191332131, 13.137468668796252, 8, 8.31345419133213),
            Block.box(10.637468668796252, 1, 3.8134541913321307, 13.637468668796252, 6, 11.81345419133213),
            Block.box(11.137468668796252, 0, 2.8134541913321307, 14.137468668796252, 7, 12.81345419133213),
            Block.box(14.137468668796252, 0, 4.813454191332131, 15.137468668796252, 5, 10.81345419133213),
            Block.box(15.137468668796252, 0, 5.813454191332131, 16.137468668796252, 2, 9.81345419133213)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

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


}
