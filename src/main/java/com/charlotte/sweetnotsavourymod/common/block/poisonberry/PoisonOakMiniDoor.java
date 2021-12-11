package com.charlotte.sweetnotsavourymod.common.block.poisonberry;


import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundEvents;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PoisonOakMiniDoor extends Block{

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    protected static final VoxelShape SOUTH_AABB = Block.box( 0.0D , 0.0D , 0.0D , 16.0D , 16.0D , 1.0D );
    protected static final VoxelShape NORTH_AABB = Block.box( 0.0D , 0.0D , 15.0D , 16.0D , 16.0D , 16.0D );
    protected static final VoxelShape WEST_AABB = Block.box( 15.0D , 0.0D , 0.0D , 16.0D , 16.0D , 16.0D );
    protected static final VoxelShape EAST_AABB = Block.box( 0.0D , 0.0D , 0.0D , 1.0D , 16.0D , 16.0D );


    @Override
    public InteractionResult onBlockActivated(BlockState state , Level worldIn , BlockPos pos , Player player ,
                                              InteractionHand handIn , BlockHitResult hit ){
        Boolean flag = state.get( OPEN );
        openDoor( worldIn , state , pos , flag ? false : true );
        return InteractionResult.SUCCESS;
    }


    @Override
    protected void fillStateContainer( Builder <Block, BlockState> builder ){

        super.fillStateContainer( builder );

        builder.add( FACING , OPEN , POWERED , HINGE );
    }

    @Override
    public BlockState getStateForPlacement( BlockPlaceContext context ){

        BlockPos blockpos = context.getPos();
        World world = context.getWorld();
        boolean flag = world.hasNeighborSignal( blockpos );
        return this.getDefaultState().with( FACING , context.getHorizontalDirection() )
                .with( HINGE , this.getHingeSide( context ) ).with( POWERED , Boolean.valueOf( flag ) ).with( OPEN , false );

    }


    @Override
    public void neighborChanged( BlockState state , Level worldIn , BlockPos pos , Block blockIn , BlockPos fromPos ,
                                 boolean isMoving ){

        super.neighborChanged( state , worldIn , pos , blockIn , fromPos , isMoving );

        boolean flag = worldIn.hasNeighborSignal( pos );
        if(blockIn != this && flag != state.get( POWERED )){
            if(flag != state.get( OPEN )){
            }

            worldIn.setBlockState( pos , state.with( POWERED , Boolean.valueOf( flag ) ).with( OPEN , Boolean.valueOf( flag ) ) , 2 );
        }

    }

    public void openDoor( Level worldIn , BlockState state , BlockPos pos , boolean open ){
        if(state.isIn( this ) && state.get( OPEN ) != open){
            worldIn.setBlockState( pos , state.with( OPEN , Boolean.valueOf( open ) ) , 10 );
            worldIn.playSound( null , pos , open ? SoundEvents.WOODEN_DOOR_OPEN : SoundEvents.WOODEN_DOOR_CLOSE , SoundSource.BLOCKS , 1.0f , 1.0f );

        }
    }

    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

    private DoorHingeSide getHingeSide( BlockPlaceContext context ){
        return DoorHingeSide.LEFT;
    }


    @Override
    public VoxelShape getShape(BlockState state , BlockGetter worldIn , BlockPos pos , CollisionContext context ){
        net.minecraft.util.Direction direction = state.get( FACING );
        boolean flag = !state.get( OPEN );
        boolean flag1 = state.get( HINGE ) == DoorHingeSide.RIGHT;
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
