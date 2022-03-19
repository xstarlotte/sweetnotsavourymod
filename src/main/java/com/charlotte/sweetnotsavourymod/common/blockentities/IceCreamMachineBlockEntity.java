package com.charlotte.sweetnotsavourymod.common.blockentities;
import com.charlotte.sweetnotsavourymod.common.screen.IceCreamMachineMenu;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
import org.lwjgl.system.CallbackI;

public class IceCreamMachineBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public IceCreamMachineBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(BlockEntityTypesInit.ICE_CREAM_MACHINE.get(), p_155229_, p_155230_);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Ice Cream Machine");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {

        return new IceCreamMachineMenu(pContainerId, pInventory, this);
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

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, IceCreamMachineBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
            craftItem(pBlockEntity);
        }
    }



    private static void craftItem(IceCreamMachineBlockEntity entity) {
        entity.itemHandler.extractItem(0, 5, false);
        entity.itemHandler.extractItem(1, 1, false);
        entity.itemHandler.setStackInSlot(1, new ItemStack(Items.BUCKET));
        entity.itemHandler.extractItem(2, 5, false);

        entity.itemHandler.setStackInSlot(3, new ItemStack(ItemInit.STRAWBERRYICECREAMSCOOP.get(), entity.itemHandler
                .getStackInSlot(3).getCount() + 5));
    }

    public static boolean hasRecipe(IceCreamMachineBlockEntity entity) {
        boolean hasAmountInFirstSlot = entity.itemHandler.getStackInSlot(0).getCount() >= 5;
        boolean hasAmountInThirdSlot = entity.itemHandler.getStackInSlot(2).getCount() >= 5;
        boolean hasItemInThirdSlot = entity.itemHandler.getStackInSlot(0).getItem() == ItemInit.CANDYCANESUGAR.get();
        boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(1).getItem() == ItemInit.CREAMY_MILK_BUCKET.get();
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(2).getItem() == ItemInit.STRAWBERRYCANDY.get();

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot && hasAmountInFirstSlot && hasAmountInThirdSlot;
    }
//below method means as long as we haven't reached maximum stack size (64) in output slot (3) we can continue to put in items.
    private static boolean hasNotReachedStackLimit(IceCreamMachineBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(3).getCount() < entity.itemHandler.getStackInSlot(3).getMaxStackSize();
    }

}
