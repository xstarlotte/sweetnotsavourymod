package com.charlotte.sweetnotsavourymod.common.blockentities.machines;

import com.charlotte.sweetnotsavourymod.common.screen.BananaBakerMenu;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

public class BananaBakerBlockEntity extends TileEntity implements INamedContainerProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public BananaBakerBlockEntity() {
        super(BlockEntityTypesInit.BANANA_BAKER.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("Banana Baker");
    }
    
    @Nullable
    @Override
    public Container createMenu(int pContainerId, PlayerInventory pInventory, PlayerEntity pPlayer) {
        return new BananaBakerMenu(pContainerId, pInventory, this);
    }

    
    @Override
    public <T> LazyOptional<T> getCapability( Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    public CompoundNBT save(CompoundNBT tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        return super.save(tag);
    }
    
    @Override
    public void load(BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public void drops() {
        Inventory inventory = new Inventory(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        InventoryHelper.dropContents(this.level, this.worldPosition, inventory);

    }

    public static void tick(World pLevel, BlockPos pPos, BlockState pState, BananaBakerBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
            craftItem(pBlockEntity);
        }
    }



    private static void craftItem(BananaBakerBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);
        entity.itemHandler.extractItem(1, 1, false);

        entity.itemHandler.setStackInSlot(2, new ItemStack(BlockInit.HARDENEDBANANASTONE.get(), entity.itemHandler
                .getStackInSlot(2).getCount() + 1));
    }

    public static boolean hasRecipe(BananaBakerBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(0).getItem() == ItemInit.CANDYCANESUGAR.get();
        boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(1).getItem() == ItemInit.SWEETBANANA.get();

        return hasItemInFirstSlot && hasItemInSecondSlot;
    }
//below method means as long as we haven't reached maximum stack size (64) in output slot (3) we can continue to put in items.
    private static boolean hasNotReachedStackLimit(BananaBakerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(2).getCount() < entity.itemHandler.getStackInSlot(2).getMaxStackSize();
    }

}
