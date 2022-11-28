package com.charlotte.sweetnotsavourymod.common.blockentities.chest;

import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlockDoubleAble;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenu;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.DoubleSidedInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestBlockEntity extends LockableLootTileEntity implements IChestLid, ITickableTileEntity {
	private final Supplier<SNSChestMenuType> menuTypeS, menuTypeD;
	private final int containerSize;
	public NonNullList<ItemStack> items;
	
	protected float openness;
	protected float oOpenness;
	protected int openCount;
	private int tickInterval;

	public SNSChestBlockEntity(TileEntityType<?> type, int containerSize, Supplier<SNSChestMenuType> menuTypeS, Supplier<SNSChestMenuType> menuTypeD) {
		super(type);
		this.menuTypeS = menuTypeS;
		this.menuTypeD = menuTypeD;
		this.containerSize = containerSize;
		this.items = NonNullList.withSize(containerSize, ItemStack.EMPTY);
	}

	public int getContainerSize() {
		return containerSize;
	}

	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.chest");
	}

	public void load(BlockState state, CompoundNBT pTag) {
		super.load(state, pTag);
		this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		if (!this.tryLoadLootTable(pTag)) {
			ItemStackHelper.loadAllItems(pTag, this.items);
		}

	}

	public CompoundNBT save(CompoundNBT pTag) {
		if (!this.trySaveLootTable(pTag)) {
			ItemStackHelper.saveAllItems(pTag, this.items);
		}
		return super.save(pTag);

	}
	
	@Override
	public void tick() {
		int i = this.worldPosition.getX();
		int j = this.worldPosition.getY();
		int k = this.worldPosition.getZ();
		++this.tickInterval;
		this.openCount = getOpenCount(this.level, this, this.tickInterval, i, j, k, this.openCount);
		this.oOpenness = this.openness;
		float f = 0.1F;
		if (this.openCount > 0 && this.openness == 0.0F) {
			this.playSound(SoundEvents.CHEST_OPEN);
		}
		
		if (this.openCount == 0 && this.openness > 0.0F || this.openCount > 0 && this.openness < 1.0F) {
			float f1 = this.openness;
			if (this.openCount > 0) {
				this.openness += 0.1F;
			} else {
				this.openness -= 0.1F;
			}
			
			if (this.openness > 1.0F) {
				this.openness = 1.0F;
			}
			
			float f2 = 0.5F;
			if (this.openness < 0.5F && f1 >= 0.5F) {
				this.playSound(SoundEvents.CHEST_CLOSE);
			}
			
			if (this.openness < 0.0F) {
				this.openness = 0.0F;
			}
		}
		
	}
	private void playSound(SoundEvent p_195483_1_) {
		ChestType chesttype = getBlockState().getBlock() instanceof SNSChestBlockDoubleAble ? this.getBlockState().getValue(ChestBlock.TYPE) : ChestType.SINGLE;
		if (chesttype != ChestType.LEFT) {
			double d0 = (double)this.worldPosition.getX() + 0.5D;
			double d1 = (double)this.worldPosition.getY() + 0.5D;
			double d2 = (double)this.worldPosition.getZ() + 0.5D;
			if (chesttype == ChestType.RIGHT) {
				Direction direction = ChestBlock.getConnectedDirection(this.getBlockState());
				d0 += (double)direction.getStepX() * 0.5D;
				d2 += (double)direction.getStepZ() * 0.5D;
			}
			
			this.level.playSound((PlayerEntity)null, d0, d1, d2, p_195483_1_, SoundCategory.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
		}
	}
	
	public boolean triggerEvent(int pId, int pType) {
		if (pId == 1) {
			this.openCount = pType;
			return true;
		} else {
			return super.triggerEvent(pId, pType);
		}
	}
	
	public void startOpen(PlayerEntity pPlayer) {
		if (!pPlayer.isSpectator()) {
			if (this.openCount < 0) {
				this.openCount = 0;
			}
			
			++this.openCount;
			this.signalOpenCount();
		}
		
	}
	
	public void stopOpen(PlayerEntity pPlayer) {
		if (!pPlayer.isSpectator()) {
			--this.openCount;
			this.signalOpenCount();
		}
		
	}
	
	protected void signalOpenCount() {
		Block block = this.getBlockState().getBlock();
		if (block instanceof SNSChestBlock) {
			this.level.blockEvent(this.worldPosition, block, 1, this.openCount);
			this.level.updateNeighborsAt(this.worldPosition, block);
		}
		
	}

	protected NonNullList<ItemStack> getItems() {
		return this.items;
	}

	protected void setItems(NonNullList<ItemStack> pItems) {
		this.items = pItems;
	}

	public float getOpenNess(float pPartialTicks) {
		return MathHelper.lerp(pPartialTicks, this.oOpenness, this.openness);
	}
	
	public static int getOpenCount(World p_213977_0_, LockableTileEntity p_213977_1_, int p_213977_2_, int p_213977_3_, int p_213977_4_, int p_213977_5_, int p_213977_6_) {
		if (!p_213977_0_.isClientSide && p_213977_6_ != 0 && (p_213977_2_ + p_213977_3_ + p_213977_4_ + p_213977_5_) % 200 == 0) {
			p_213977_6_ = getOpenCount(p_213977_0_, p_213977_1_, p_213977_3_, p_213977_4_, p_213977_5_);
		}
		
		return p_213977_6_;
	}
	
	public static int getOpenCount(World p_213976_0_, LockableTileEntity p_213976_1_, int p_213976_2_, int p_213976_3_, int p_213976_4_) {
		int i = 0;
		float f = 5.0F;
		
		for(PlayerEntity playerentity : p_213976_0_.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB((double)((float)p_213976_2_ - 5.0F), (double)((float)p_213976_3_ - 5.0F), (double)((float)p_213976_4_ - 5.0F), (double)((float)(p_213976_2_ + 1) + 5.0F), (double)((float)(p_213976_3_ + 1) + 5.0F), (double)((float)(p_213976_4_ + 1) + 5.0F)))) {
			if (playerentity.containerMenu instanceof SNSChestMenu) {
				IInventory iinventory = ((SNSChestMenu)playerentity.containerMenu).container;
				if (iinventory == p_213976_1_ || iinventory instanceof DoubleSidedInventory && ((DoubleSidedInventory)iinventory).contains(p_213976_1_)) {
					++i;
				}
			}
		}
		
		return i;
	}
	
	public static void swapContents(SNSChestBlockEntity pChest, SNSChestBlockEntity pOtherChest) {
		NonNullList<ItemStack> nonnulllist = pChest.getItems();
		pChest.setItems(pOtherChest.getItems());
		pOtherChest.setItems(nonnulllist);
	}

	protected Container createMenu(int pId, PlayerInventory pPlayer) {
		boolean doubleChest = getBlockState().getBlock() instanceof SNSChestBlock &&
				((SNSChestBlock)getBlockState().getBlock()).doubleAble &&
				getBlockState().getValue(SNSChestBlock.TYPE) != ChestType.SINGLE;
		return (doubleChest ? menuTypeD : menuTypeS).get().create(pId, pPlayer);
	}

	private net.minecraftforge.common.util.LazyOptional<net.minecraftforge.items.IItemHandlerModifiable> chestHandler;
	
	@Override
	public void clearCache() {
		super.clearCache();
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
		World level = getLevel();
		if (!(state.getBlock() instanceof SNSChestBlock) || level == null)
			return new InvWrapper(this);
		IInventory inv = SNSChestBlock.getContainer((SNSChestBlock) state.getBlock(), state, level, getBlockPos(), true);
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
}
