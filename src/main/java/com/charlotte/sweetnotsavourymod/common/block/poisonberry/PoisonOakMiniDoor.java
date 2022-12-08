package com.charlotte.sweetnotsavourymod.common.block.poisonberry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.block.state.StateDefinition;
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
    public InteractionResult use(BlockState state , Level worldIn , BlockPos pos , Player player ,
                                              InteractionHand handIn , BlockHitResult hit ){
        Boolean flag = state.getValue(OPEN);
        openDoor( worldIn , state , pos , !flag);
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder <Block, BlockState> builder){
        builder.add(FACING, OPEN, POWERED, HINGE );
    }

    @Override
    public BlockState getStateForPlacement( BlockPlaceContext context ) {
        BlockPos blockpos = context.getClickedPos();
        Level world = context.getLevel();
        boolean flag = world.hasNeighborSignal(blockpos);
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection() )
                .setValue(HINGE, this.getHingeSide(context))
                .setValue( POWERED , flag).setValue( OPEN , false );
    }

    @Override
    public void neighborChanged(BlockState state, Level worldIn, BlockPos pos, Block blockIn, BlockPos fromPos,
                                 boolean isMoving) {
        super.neighborChanged( state , worldIn , pos , blockIn , fromPos , isMoving );

        boolean flag = worldIn.hasNeighborSignal( pos );
        if(blockIn != this && flag != state.getValue( POWERED )){
            if(flag != state.getValue( OPEN )){
            }

            worldIn.setBlock( pos , state.setValue( POWERED , flag).setValue( OPEN , flag) , 2 );
        }
    }

    public void openDoor( Level worldIn , BlockState state , BlockPos pos , boolean open ){
        if(state.is( this ) && state.getValue( OPEN ) != open){
            worldIn.setBlock( pos , state.setValue( OPEN , open) , 10 );
            worldIn.playSound( null , pos , open ? SoundEvents.WOODEN_DOOR_OPEN : SoundEvents.WOODEN_DOOR_CLOSE , SoundSource.BLOCKS , 1.0f , 1.0f );

        }
    }

    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

    private DoorHingeSide getHingeSide( BlockPlaceContext context ){
        return DoorHingeSide.LEFT;
    }


    @Override
    public VoxelShape getShape(BlockState state , BlockGetter worldIn , BlockPos pos , CollisionContext context ){
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
