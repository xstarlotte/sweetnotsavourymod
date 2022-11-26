package com.charlotte.sweetnotsavourymod.common.block;

import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestBlockEntity;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuProvider;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.world.*;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.World;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestBlock extends BaseEntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<ChestType> TYPE = BlockStateProperties.CHEST_TYPE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final int EVENT_SET_OPEN_COUNT = 1;
	protected static final int AABB_OFFSET = 1;
	protected static final int AABB_HEIGHT = 14;
	protected static final VoxelShape NORTH_AABB = Block.box(1.0D, 0.0D, 0.0D, 15.0D, 14.0D, 15.0D);
	protected static final VoxelShape SOUTH_AABB = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 16.0D);
	protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
	protected static final VoxelShape EAST_AABB = Block.box(1.0D, 0.0D, 1.0D, 16.0D, 14.0D, 15.0D);
	protected static final VoxelShape AABB = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);


	public final Supplier<BlockEntityType<SNSChestBlockEntity>> blockEntity;
	public final Supplier<SNSChestMenuType> menuSingle, menuDouble;
	public final int containerSize;
	public final boolean doubleAble;


	public SNSChestBlock(Properties properties, Supplier<BlockEntityType<SNSChestBlockEntity>> blockEntity, Supplier<SNSChestMenuType> menuSingle, Supplier<SNSChestMenuType> menuDouble, int containerSize, boolean doubleAble) {
		super(properties);
		this.blockEntity = blockEntity;
		this.menuSingle = menuSingle;
		this.menuDouble = menuDouble;
		this.containerSize = containerSize;
		this.doubleAble = doubleAble;

		BlockState defaultState = this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.FALSE);
		if (doubleAble)
			defaultState = defaultState.setValue(TYPE, ChestType.SINGLE);
		this.registerDefaultState(defaultState);
	}

	public SNSChestBlock(Properties properties, Supplier<BlockEntityType<SNSChestBlockEntity>> blockEntity, Supplier<SNSChestMenuType> menuSingle, int containerSize) {
		this(properties, blockEntity, menuSingle, ()->null, containerSize, false);
	}

	@Override
	public RenderShape getRenderShape(BlockState pState) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pState.getValue(WATERLOGGED)) {
			pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
		}

		return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return AABB;
	}

	public static Direction getConnectedDirection(BlockState p_51585_) {
		Direction direction = p_51585_.getValue(FACING);
		return p_51585_.getValue(TYPE) == ChestType.LEFT ? direction.getClockWise() : direction.getCounterClockWise();
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		return this.defaultBlockState()
				.setValue(FACING, pContext.getHorizontalDirection().getOpposite())
				.setValue(WATERLOGGED, pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER);
	}

	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
	}

	public void onRemove(BlockState pState, World pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
		if (!pState.is(pNewState.getBlock())) {
			BlockEntity blockentity = pLevel.getBlockEntity(pPos);
			if (blockentity instanceof Container) {
				Containers.dropContents(pLevel, pPos, (Container)blockentity);
				pLevel.updateNeighbourForOutputSignal(pPos, this);
			}

			super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
		}
	}

	public ActionResultType use(BlockState pState, World pLevel, BlockPos pPos, PlayerEntity pPlayer, Hand pHand, BlockHitResult pHit) {
		if (pLevel.isClientSide) {
			return ActionResultType.SUCCESS;
		} else {
			MenuProvider menuprovider = this.getMenuProvider(pState, pLevel, pPos, pPlayer);
			if (!isChestBlockedAt(pLevel, pPos) && menuprovider != null) {
				pPlayer.openMenu(menuprovider);
				pPlayer.awardStat(this.getOpenChestStat());
			}

			return ActionResultType.CONSUME;
		}
	}

	protected Stat<ResourceLocation> getOpenChestStat() {
		return Stats.CUSTOM.get(Stats.OPEN_CHEST);
	}

	@Nullable
	public static Container getContainer(SNSChestBlock pChest, BlockState pState, World pLevel, BlockPos pPos, boolean pOverride) {
		return getContainer(pChest, pState, pLevel, pPos, pOverride, null);
	}

	@Nullable
	public static Container getContainer(SNSChestBlock pChest, BlockState pState, Level pLevel, BlockPos pPos, boolean pOverride, @Nullable PlayerEntity lootGenerator) {
		Container container0 = pLevel.getBlockEntity(pPos) instanceof Container container ? container : null;
		Container container1 = pChest.doubleAble && pState.getValue(TYPE) != ChestType.SINGLE && pLevel.getBlockEntity(pPos.relative(getConnectedDirection(pState))) instanceof Container container ? container : null;

		if (lootGenerator != null) {
			if (container0 instanceof RandomizableContainerBlockEntity entity) entity.unpackLootTable(lootGenerator);
			if (container1 instanceof RandomizableContainerBlockEntity entity) entity.unpackLootTable(lootGenerator);
		}

		if (container0 == null)
			return container1;
		if (container1 == null)
			return container0;
		return pState.getValue(TYPE) != ChestType.LEFT ? new CompoundContainer(container0, container1) : new CompoundContainer(container1, container0);
	}

	@Nullable
	public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
		return getMenuProvider(state, level, pos, null);
	}

	@Nullable
	public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos, @Nullable PlayerEntity lootGenerator) {
		Container container = getContainer(this, state, level, pos, false, lootGenerator);
		if (container == null)
			return null;
		return new SNSChestMenuProvider((container instanceof CompoundContainer ? menuDouble : menuSingle).get(), container);
	}

	public @NotNull SNSChestBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SNSChestBlockEntity(blockEntity.get(), pos, state, containerSize, menuSingle);
	}

	@Nullable
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
		return pLevel.isClientSide && pBlockEntityType == blockEntity.get() ? (a,b,c,entity)->{
			if (entity instanceof SNSChestBlockEntity chest)
				SNSChestBlockEntity.lidAnimateTick(a,b,c, chest);
		} : null;
	}

	public static boolean isChestBlockedAt(LevelAccessor p_51509_, BlockPos p_51510_) {
		return isBlockedChestByBlock(p_51509_, p_51510_) || isCatSittingOnChest(p_51509_, p_51510_);
	}

	private static boolean isBlockedChestByBlock(BlockGetter pLevel, BlockPos pPos) {
		BlockPos blockpos = pPos.above();
		return pLevel.getBlockState(blockpos).isRedstoneConductor(pLevel, blockpos);
	}

	private static boolean isCatSittingOnChest(LevelAccessor pLevel, BlockPos pPos) {
		List<Cat> list = pLevel.getEntitiesOfClass(Cat.class, new AABB(pPos.getX(), pPos.getY() + 1, pPos.getZ(), pPos.getX() + 1, pPos.getY() + 2, pPos.getZ() + 1));
		if (!list.isEmpty()) {
			for(Cat cat : list) {
				if (cat.isInSittingPose()) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean hasAnalogOutputSignal(BlockState pState) {
		return true;
	}

	public int getAnalogOutputSignal(BlockState pBlockState, Level pLevel, BlockPos pPos) {
		return AbstractContainerMenu.getRedstoneSignalFromContainer(getContainer(this, pBlockState, pLevel, pPos, false));
	}

	public BlockState rotate(BlockState pState, Rotation pRotation) {
		return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
	}

	public BlockState mirror(BlockState pState, Mirror pMirror) {
		return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FACING, WATERLOGGED);
	}

	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
		return false;
	}

	public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
		BlockEntity blockentity = pLevel.getBlockEntity(pPos);
		if (blockentity instanceof SNSChestBlockEntity snsChestEntity)
			snsChestEntity.recheckOpen();
	}
}
