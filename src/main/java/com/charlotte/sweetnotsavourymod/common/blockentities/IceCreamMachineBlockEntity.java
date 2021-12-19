package com.charlotte.sweetnotsavourymod.common.blockentities;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.core.BlockPos;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IceCreamMachineBlockEntity extends BlockEntity {

    private final ItemStackHandler itemhandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemhandler);



    public IceCreamMachineBlockEntity(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }




    private ItemStackHandler createHandler() {
        return new ItemStackHandler(2) {




            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }

            @Override
            public boolean isItemValid(int slot, @NotNull ItemStack stack) {

                switch (slot) {
//each case is a slot in the block entity
                    case 0: return stack.getItem() == Items.MILK_BUCKET;

                    case 1: return stack.getItem() == ItemInit.CANDYCANESUGAR.get();

                    case 2: return stack.getItem() == ItemInit.STRAWBERRYCANDY.get();

                    case 3: return stack.getItem() == ItemInit.WAFFLECONE.get() ||
                            stack.getItem() == ItemInit.STRAWBERRYLOLLIPOP.get();



                    default:
                        return false;


                }
            }

            @Override
            public int getSlotLimit(int slot) {
                return 1;
            }

            @NotNull
            @Override
            public ItemStack insertItem(int slot, @NotNull ItemStack stack, boolean simulate) {
                if(!isItemValid(slot, stack)) {
                  return stack;
                }

                return super.insertItem(slot, stack, simulate);

            }
        };
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {

        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return handler.cast();
        }

        return super.getCapability(cap, side);
    }
}
