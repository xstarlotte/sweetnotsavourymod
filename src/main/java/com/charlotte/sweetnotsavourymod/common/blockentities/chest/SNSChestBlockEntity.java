package com.charlotte.sweetnotsavourymod.common.blockentities.chest;

import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenu;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestBlockEntity extends RandomizableContainerBlockEntity implements LidBlockEntity {
	private final Supplier<SNSChestMenuType> menuType;
	private final int containerSize;
	private NonNullList<ItemStack> items;
	private final ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
		protected void onOpen(Level p_155357_, BlockPos p_155358_, BlockState p_155359_) {
			playSound(p_155357_, p_155358_, p_155359_, SoundEvents.CHEST_OPEN);
		}

		protected void onClose(Level p_155367_, BlockPos p_155368_, BlockState p_155369_) {
			playSound(p_155367_, p_155368_, p_155369_, SoundEvents.CHEST_CLOSE);
		}

		protected void openerCountChanged(Level p_155361_, BlockPos p_155362_, BlockState p_155363_, int p_155364_, int p_155365_) {
			SNSChestBlockEntity.this.signalOpenCount(p_155361_, p_155362_, p_155363_, p_155364_, p_155365_);
		}

		protected boolean isOwnContainer(Player p_155355_) {
			if (!(p_155355_.containerMenu instanceof SNSChestMenu)) {
				return false;
			} else {
				Container container = ((SNSChestMenu)p_155355_.containerMenu).container;
				return container == SNSChestBlockEntity.this || container instanceof CompoundContainer && ((CompoundContainer)container).contains(SNSChestBlockEntity.this);
			}
		}
	};
	private final ChestLidController chestLidController = new ChestLidController();

	public SNSChestBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int containerSize, Supplier<SNSChestMenuType> menuType) {
		super(type, pos, state);
		this.menuType = menuType;
		this.containerSize = containerSize;
		this.items = NonNullList.withSize(containerSize, ItemStack.EMPTY);
	}

	public int getContainerSize() {
		return containerSize;
	}

	protected Component getDefaultName() {
		return new TranslatableComponent("container.chest");
	}

	public void load(CompoundTag pTag) {
		super.load(pTag);
		this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		if (!this.tryLoadLootTable(pTag)) {
			ContainerHelper.loadAllItems(pTag, this.items);
		}

	}

	protected void saveAdditional(CompoundTag pTag) {
		super.saveAdditional(pTag);
		if (!this.trySaveLootTable(pTag)) {
			ContainerHelper.saveAllItems(pTag, this.items);
		}

	}

	public static void lidAnimateTick(Level pLevel, BlockPos pPos, BlockState pState, SNSChestBlockEntity pBlockEntity) {
		pBlockEntity.chestLidController.tickLid();
	}

	private static void playSound(Level pLevel, BlockPos pPos, BlockState pState, SoundEvent pSound) {
		ChestType chesttype = pState.getBlock() instanceof SNSChestBlock block && block.doubleAble ?
				pState.getValue(ChestBlock.TYPE) :
				ChestType.SINGLE;
		if (chesttype != ChestType.LEFT) {
			double d0 = (double)pPos.getX() + 0.5D;
			double d1 = (double)pPos.getY() + 0.5D;
			double d2 = (double)pPos.getZ() + 0.5D;
			if (chesttype == ChestType.RIGHT) {
				Direction direction = ChestBlock.getConnectedDirection(pState);
				d0 += (double)direction.getStepX() * 0.5D;
				d2 += (double)direction.getStepZ() * 0.5D;
			}

			pLevel.playSound(null, d0, d1, d2, pSound, SoundSource.BLOCKS, 0.5F, pLevel.random.nextFloat() * 0.1F + 0.9F);
		}
	}

	public boolean triggerEvent(int pId, int pType) {
		if (pId == 1) {
			this.chestLidController.shouldBeOpen(pType > 0);
			return true;
		} else {
			return super.triggerEvent(pId, pType);
		}
	}

	public void startOpen(Player pPlayer) {
		Level level = this.getLevel();
		if (!this.remove && !pPlayer.isSpectator() && level != null) {
			this.openersCounter.incrementOpeners(pPlayer, level, this.getBlockPos(), this.getBlockState());
		}

	}

	public void stopOpen(Player pPlayer) {
		Level level = this.getLevel();
		if (!this.remove && !pPlayer.isSpectator() && level != null) {
			this.openersCounter.decrementOpeners(pPlayer, level, this.getBlockPos(), this.getBlockState());
		}

	}

	protected NonNullList<ItemStack> getItems() {
		return this.items;
	}

	protected void setItems(NonNullList<ItemStack> pItems) {
		this.items = pItems;
	}

	public float getOpenNess(float pPartialTicks) {
		return this.chestLidController.getOpenness(pPartialTicks);
	}

	public static int getOpenCount(BlockGetter pLevel, BlockPos pPos) {
		BlockState blockstate = pLevel.getBlockState(pPos);
		if (blockstate.hasBlockEntity()) {
			BlockEntity blockentity = pLevel.getBlockEntity(pPos);
			if (blockentity instanceof SNSChestBlockEntity snsChestEntity) {
				return snsChestEntity.openersCounter.getOpenerCount();
			}
		}

		return 0;
	}

	public static void swapContents(SNSChestBlockEntity pChest, SNSChestBlockEntity pOtherChest) {
		NonNullList<ItemStack> nonnulllist = pChest.getItems();
		pChest.setItems(pOtherChest.getItems());
		pOtherChest.setItems(nonnulllist);
	}

	protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
		return menuType.get().create(pId, pPlayer);
	}

	private net.minecraftforge.common.util.LazyOptional<net.minecraftforge.items.IItemHandlerModifiable> chestHandler;
	@Override
	public void setBlockState(BlockState pBlockState) {
		super.setBlockState(pBlockState);
		if (this.chestHandler != null) {
			net.minecraftforge.common.util.LazyOptional<?> oldHandler = this.chestHandler;
			this.chestHandler = null;
			oldHandler.invalidate();
		}
	}

	@Nonnull
	@Override
	public <T> LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> cap, @Nullable Direction side) {
		if (!this.remove && cap == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			if (this.chestHandler == null)
				this.chestHandler = net.minecraftforge.common.util.LazyOptional.of(this::createHandler);
			return this.chestHandler.cast();
		}
		return super.getCapability(cap, side);
	}

	private net.minecraftforge.items.IItemHandlerModifiable createHandler() {
		BlockState state = this.getBlockState();
		Level level = getLevel();
		if (!(state.getBlock() instanceof SNSChestBlock block) || level == null)
			return new InvWrapper(this);
		Container inv = SNSChestBlock.getContainer(block, state, level, getBlockPos(), true);
		return new net.minecraftforge.items.wrapper.InvWrapper(inv == null ? this : inv);
	}

	@Override
	public void invalidateCaps() {
		super.invalidateCaps();
		if (chestHandler != null) {
			chestHandler.invalidate();
			chestHandler = null;
		}
	}

	public void recheckOpen() {
		Level level = getLevel();
		if (!this.remove && level != null) {
			this.openersCounter.recheckOpeners(level, this.getBlockPos(), this.getBlockState());
		}
	}

	protected void signalOpenCount(Level pLevel, BlockPos pPos, BlockState pState, int p_155336_, int p_155337_) {
		Block block = pState.getBlock();
		pLevel.blockEvent(pPos, block, 1, p_155337_);
	}
}
