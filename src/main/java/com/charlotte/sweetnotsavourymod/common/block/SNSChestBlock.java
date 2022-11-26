package com.charlotte.sweetnotsavourymod.common.block;

import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestBlockEntity;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuProvider;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.*;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.DoubleSidedInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.ChestType;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestBlock extends Block implements ITileEntityProvider {
	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	public static final EnumProperty<ChestType> TYPE = BlockStateProperties.CHEST_TYPE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final int EVENT_SET_OPEN_COUNT = 1;
	protected static final int AABB_OFFSET = 1;
	protected static final int AABB_HEIGHT = 14;
	protected static final VoxelShape NORTH_AABB = VoxelShapes.box(1.0D, 0.0D, 0.0D, 15.0D, 14.0D, 15.0D);
	protected static final VoxelShape SOUTH_AABB = VoxelShapes.box(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 16.0D);
	protected static final VoxelShape WEST_AABB = VoxelShapes.box(0.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
	protected static final VoxelShape EAST_AABB = VoxelShapes.box(1.0D, 0.0D, 1.0D, 16.0D, 14.0D, 15.0D);
	protected static final VoxelShape AABB = VoxelShapes.box(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);


	public final Supplier<TileEntityType<SNSChestBlockEntity>> blockEntity;
	public final Supplier<SNSChestMenuType> menuSingle, menuDouble;
	public final int containerSize;
	public final boolean doubleAble;


	public SNSChestBlock(Properties properties, Supplier<TileEntityType<SNSChestBlockEntity>> blockEntity, Supplier<SNSChestMenuType> menuSingle, Supplier<SNSChestMenuType> menuDouble, int containerSize, boolean doubleAble) {
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

	public SNSChestBlock(Properties properties, Supplier<TileEntityType<SNSChestBlockEntity>> blockEntity, Supplier<SNSChestMenuType> menuSingle, int containerSize) {
		this(properties, blockEntity, menuSingle, ()->null, containerSize, false);
	}
	
	
	
//	@Override
//	public BlockRenderType getVoxelShape(BlockState p_149645_1_) {
//		return BlockRenderType.ENTITYBLOCK_ANIMATED;
//	}
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, IWorld pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pState.getValue(WATERLOGGED)) {
			pLevel.getLiquidTicks().scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
		}
		
		if (pFacingState.is(this) && pFacing.getAxis().isHorizontal()) {
			ChestType chesttype = pFacingState.getValue(TYPE);
			if (pState.getValue(TYPE) == ChestType.SINGLE && chesttype != ChestType.SINGLE && pState.getValue(FACING) == pFacingState.getValue(FACING) && getConnectedDirection(pFacingState) == pFacing.getOpposite()) {
				return pState.setValue(TYPE, chesttype.getOpposite());
			}
		} else if (getConnectedDirection(pState) == pFacing) {
			return pState.setValue(TYPE, ChestType.SINGLE);
		}
		
		return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public VoxelShape getShape(BlockState pState, IBlockReader pLevel, BlockPos pPos, ISelectionContext pContext) {
		return AABB;
	}

	public static Direction getConnectedDirection(BlockState p_51585_) {
		Direction direction = p_51585_.getValue(FACING);
		return p_51585_.getValue(TYPE) == ChestType.LEFT ? direction.getClockWise() : direction.getCounterClockWise();
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext pContext) {
		return this.defaultBlockState()
				.setValue(FACING, pContext.getHorizontalDirection().getOpposite())
				.setValue(WATERLOGGED, pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER);
	}

	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
	}

	public void onRemove(BlockState pState, World pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
		if (!pState.is(pNewState.getBlock())) {
			TileEntity blockentity = pLevel.getBlockEntity(pPos);
			if (blockentity instanceof SNSChestBlockEntity) {
				InventoryHelper.dropContents(pLevel, pPos, ((SNSChestBlockEntity)blockentity).items);
				pLevel.updateNeighbourForOutputSignal(pPos, this);
			}

			super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
		}
	}

	public ActionResultType use(BlockState pState, World pLevel, BlockPos pPos, PlayerEntity pPlayer, Hand pHand, BlockRayTraceResult pHit) {
		if (pLevel.isClientSide) {
			return ActionResultType.SUCCESS;
		} else {
			INamedContainerProvider menuprovider = this.getMenuProvider(pState, pLevel, pPos, pPlayer);
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
	public static IInventory getContainer(SNSChestBlock pChest, BlockState pState, World pLevel, BlockPos pPos, boolean pOverride) {
		return getContainer(pChest, pState, pLevel, pPos, pOverride, null);
	}

	@Nullable
	public static IInventory getContainer(SNSChestBlock pChest, BlockState pState, World pLevel, BlockPos pPos, boolean pOverride, @Nullable PlayerEntity lootGenerator) {
		IInventory container0 = pLevel.getBlockEntity(pPos) instanceof IInventory ? (IInventory)pLevel.getBlockEntity(pPos) : null;
		IInventory container1;
		if (pChest.doubleAble && pState.getValue(TYPE) != ChestType.SINGLE) {
			TileEntity entity = pLevel.getBlockEntity(pPos.relative(getConnectedDirection(pState)));
			if (entity instanceof IInventory)
				container1 = (IInventory) entity;
			else
				container1 = null;
		} else {
			container1 = null;
		}

		if (lootGenerator != null) {
			if (container0 instanceof SNSChestBlockEntity) ((SNSChestBlockEntity)container0).unpackLootTable(lootGenerator);
			if (container1 instanceof SNSChestBlockEntity) ((SNSChestBlockEntity)container1).unpackLootTable(lootGenerator);
		}

		if (container0 == null)
			return container1;
		if (container1 == null)
			return container0;
		return pState.getValue(TYPE) != ChestType.LEFT ? new DoubleSidedInventory(container0, container1) : new DoubleSidedInventory(container1, container0);
	}

	@Nullable
	public INamedContainerProvider getMenuProvider(BlockState state, World level, BlockPos pos) {
		return getMenuProvider(state, level, pos, null);
	}

	@Nullable
	public INamedContainerProvider getMenuProvider(BlockState state, World level, BlockPos pos, @Nullable PlayerEntity lootGenerator) {
		IInventory container = getContainer(this, state, level, pos, false, lootGenerator);
		if (container == null)
			return null;
		return new SNSChestMenuProvider((container instanceof DoubleSidedInventory ? menuDouble : menuSingle).get(), container);
	}

	public static boolean isChestBlockedAt(IWorld p_51509_, BlockPos p_51510_) {
		return isBlockedChestByBlock(p_51509_, p_51510_) || isCatSittingOnChest(p_51509_, p_51510_);
	}

	private static boolean isBlockedChestByBlock(IBlockReader pLevel, BlockPos pPos) {
		BlockPos blockpos = pPos.above();
		return pLevel.getBlockState(blockpos).isRedstoneConductor(pLevel, blockpos);
	}

	private static boolean isCatSittingOnChest(IWorld pLevel, BlockPos pPos) {
		List<CatEntity> list = pLevel.getEntitiesOfClass(CatEntity.class, new AxisAlignedBB(pPos.getX(), pPos.getY() + 1, pPos.getZ(), pPos.getX() + 1, pPos.getY() + 2, pPos.getZ() + 1));
		if (!list.isEmpty()) {
			for(CatEntity cat : list) {
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

	public int getAnalogOutputSignal(BlockState pBlockState, World pLevel, BlockPos pPos) {
		return Container.getRedstoneSignalFromContainer(getContainer(this, pBlockState, pLevel, pPos, false));
	}

	public BlockState rotate(BlockState pState, Rotation pRotation) {
		return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
	}

	public BlockState mirror(BlockState pState, Mirror pMirror) {
		return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
	}
	
	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FACING, WATERLOGGED);
	}
	
	
	@Override
	public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
		return false;
	}

//	public void tick(BlockState pState, ServerWorld pLevel, BlockPos pPos, Random pRandom) {
//		TileEntity blockentity = pLevel.getBlockEntity(pPos);
//		if (blockentity instanceof SNSChestBlockEntity)
//			((SNSChestBlockEntity)blockentity).recheckOpen();
//	}
	
	@Nullable
	@Override
	public SNSChestBlockEntity newBlockEntity(IBlockReader p_196283_1_) {
		return new SNSChestBlockEntity(blockEntity.get(), containerSize, menuSingle, menuDouble);
	}
	
	public SNSChestBlockEntity newBlockEntity() {
		return new SNSChestBlockEntity(blockEntity.get(), containerSize, menuSingle, menuDouble);
	}
}
