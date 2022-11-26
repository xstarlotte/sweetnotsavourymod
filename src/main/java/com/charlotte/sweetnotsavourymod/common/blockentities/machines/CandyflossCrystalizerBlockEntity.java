package com.charlotte.sweetnotsavourymod.common.blockentities.machines;
import com.charlotte.sweetnotsavourymod.common.screen.CandyflossCrystalizerMenu;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CandyflossCrystalizerBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public CandyflossCrystalizerBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(BlockEntityTypesInit.CANDYFLOSS_CRYSTALIZER.get(), p_155229_, p_155230_);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Candyfloss Crystalizer");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, PlayerEntity pPlayer) {

        return new CandyflossCrystalizerMenu(pContainerId, pInventory, this);
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
    protected void saveAdditional(CompoundNBT tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundNBT nbt) {
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

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, CandyflossCrystalizerBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
            craftItem(pBlockEntity);
        }
    }



    private static void craftItem(CandyflossCrystalizerBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);

        entity.itemHandler.setStackInSlot(1, new ItemStack(BlockInit.CANDYFLOSSBLOCK.get().asItem(), entity.itemHandler
                .getStackInSlot(1).getCount() + 1));
    }

    public static boolean hasRecipe(CandyflossCrystalizerBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(0).getItem() == ItemInit.CANDYFLOSS.get();


        return hasItemInFirstSlot;
    }
//below method means as long as we haven't reached maximum stack size (64) in output slot (3) we can continue to put in items.
    private static boolean hasNotReachedStackLimit(CandyflossCrystalizerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(1).getCount() < entity.itemHandler.getStackInSlot(1).getMaxStackSize();
    }

}
