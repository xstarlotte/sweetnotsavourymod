package com.charlotte.sweetnotsavourymod.common.block.poisonberry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class PoisonOakMiniDoor extends Block{

    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    protected static final VoxelShape SOUTH_AABB = Block.box( 0.0D , 0.0D , 0.0D , 16.0D , 16.0D , 1.0D );
    protected static final VoxelShape NORTH_AABB = Block.box( 0.0D , 0.0D , 15.0D , 16.0D , 16.0D , 16.0D );
    protected static final VoxelShape WEST_AABB = Block.box( 15.0D , 0.0D , 0.0D , 16.0D , 16.0D , 16.0D );
    protected static final VoxelShape EAST_AABB = Block.box( 0.0D , 0.0D , 0.0D , 1.0D , 16.0D , 16.0D );

    @Override
    public ActionResultType use(BlockState state , World worldIn , BlockPos pos , PlayerEntity player ,
                                              Hand handIn , BlockRayTraceResult hit ){
        Boolean flag = state.getValue(OPEN);
        openDoor( worldIn , state , pos , flag ? false : true );
        return ActionResultType.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder <Block, BlockState> builder){
        builder.add(FACING, OPEN, POWERED, HINGE );
    }

    @Override
    public BlockState getStateForPlacement( BlockItemUseContext context ) {
        BlockPos blockpos = context.getClickedPos();
        World world = context.getLevel();
        boolean flag = world.hasNeighborSignal(blockpos);
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection() )
                .setValue(HINGE, this.getHingeSide(context))
                .setValue( POWERED , Boolean.valueOf( flag ) ).setValue( OPEN , false );
    }

    @Override
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos,
                                 boolean isMoving) {
        super.neighborChanged( state , worldIn , pos , blockIn , fromPos , isMoving );

        boolean flag = worldIn.hasNeighborSignal( pos );
        if(blockIn != this && flag != state.getValue( POWERED )){
            if(flag != state.getValue( OPEN )){
            }

            worldIn.setBlock( pos , state.setValue( POWERED , Boolean.valueOf( flag ) ).setValue( OPEN , Boolean.valueOf( flag ) ) , 2 );
        }
    }

    public void openDoor( World worldIn , BlockState state , BlockPos pos , boolean open ){
        if(state.is( this ) && state.getValue( OPEN ) != open){
            worldIn.setBlock( pos , state.setValue( OPEN , Boolean.valueOf( open ) ) , 10 );
            worldIn.playSound( null , pos , open ? SoundEvents.WOODEN_DOOR_OPEN : SoundEvents.WOODEN_DOOR_CLOSE , SoundCategory.BLOCKS , 1.0f , 1.0f );

        }
    }

    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

    private DoorHingeSide getHingeSide( BlockItemUseContext context ){
        return DoorHingeSide.LEFT;
    }


    @Override
    public VoxelShape getShape(BlockState state , IBlockReader worldIn , BlockPos pos , ISelectionContext context ){
        Direction direction = state.getValue( FACING );
        boolean flag = !state.getValue( OPEN );
        boolean flag1 = state.getValue( HINGE ) == DoorHingeSide.RIGHT;
        switch(direction){
            case EAST:
            default:
                return flag ? EAST_AABB : (flag1 ? NORTH_AABB : SOUTH_AABB);
            case SOUTH:
                return flag ? SOUTH_AABB : (flag1 ? EAST_AABB : WEST_AABB);
            case WEST:
                return flag ? WEST_AABB : (flag1 ? SOUTH_AABB : NORTH_AABB);
            case NORTH:
                return flag ? NORTH_AABB : (flag1 ? WEST_AABB : EAST_AABB);
        }
    }


    public PoisonOakMiniDoor( Properties properties ){
        super( properties );
    }
}
