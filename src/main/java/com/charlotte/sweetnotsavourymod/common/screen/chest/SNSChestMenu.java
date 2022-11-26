package com.charlotte.sweetnotsavourymod.common.screen.chest;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault

public class SNSChestMenu extends Container {
	public final IInventory container;
	public final SNSChestMenuTemplate template;

	public SNSChestMenu(@Nullable ContainerType<?> pMenuType, int pContainerId, SNSChestMenuTemplate template, PlayerInventory playerInventory, @Nullable IInventory container) {
		super(pMenuType, pContainerId);

		if (container == null)
			container = new Inventory(template.size);
		else
			checkContainerSize(container, template.size);

		this.container = container;
		this.template = template;
		container.startOpen(playerInventory.player);



		for (int i = 0; i < template.size; i++) {
			SNSChestMenuTemplate.SlotPos pos = template.slots[i];
			addSlot(new Slot(container, i, pos.x, pos.y));
		}

		int offX = (template.width - 176) >> 1;
		int offY = template.height - (113 + 4 * 18);
		for(int col = 0; col < 9; ++col) {
			this.addSlot(new Slot(playerInventory, col, 8 + col * 18 + offX, 161 + offY));
			for(int row = 0; row < 3; ++row) {
				this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18 + offX, 103 + row * 18 + offY));
			}
		}
	}

	@Override
	public boolean stillValid(PlayerEntity player) {
		return container.stillValid(player);
	}

	@Override
	public ItemStack quickMoveStack(PlayerEntity pPlayer, int pIndex) {
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = this.slots.get(pIndex);
		if (!slot.hasItem())
			return stack;

		ItemStack slotStack = slot.getItem();
		stack = slotStack.copy();
		if (pIndex < this.template.size) {
			if (!this.moveItemStackTo(slotStack, this.template.size, this.slots.size(), true)) {
				return ItemStack.EMPTY;
			}
		} else if (!this.moveItemStackTo(slotStack, 0, this.template.size, false)) {
			return ItemStack.EMPTY;
		}

		if (slotStack.isEmpty()) {
			slot.set(ItemStack.EMPTY);
		} else {
			slot.setChanged();
		}

		return stack;
	}
}
