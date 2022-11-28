package com.charlotte.sweetnotsavourymod.common.blockentities.machines;

import com.charlotte.sweetnotsavourymod.common.screen.WaffleConeMachineMenu;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WaffleConeMachineBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public WaffleConeMachineBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(BlockEntityTypesInit.WAFFLE_CONE_MACHINE.get(), p_155229_, p_155230_);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.sweetnotsavourymod.waffle_cone_machine");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {

        return new WaffleConeMachineMenu(pContainerId, pInventory, this);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
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
    protected void saveAdditional(CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);

    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, WaffleConeMachineBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
            craftItem(pBlockEntity);
        }
    }



    private static void craftItem(WaffleConeMachineBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);

        entity.itemHandler.setStackInSlot(1, new ItemStack(ItemInit.WAFFLECONE.get(), entity.itemHandler
                .getStackInSlot(1).getCount() + 1));
    }

    public static boolean hasRecipe(WaffleConeMachineBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(0).getItem() == BlockInit.WAFERWOODBLOCK.get().asItem();


        return hasItemInFirstSlot;
    }
//below method means as long as we haven't reached maximum stack size (64) in output slot (3) we can continue to put in items.
    private static boolean hasNotReachedStackLimit(WaffleConeMachineBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(1).getCount() < entity.itemHandler.getStackInSlot(1).getMaxStackSize();
    }

}
