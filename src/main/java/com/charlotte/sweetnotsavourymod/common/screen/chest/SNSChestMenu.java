package com.charlotte.sweetnotsavourymod.common.screen.chest;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestMenu extends AbstractContainerMenu {
	public final Container container;
	public final SNSChestMenuTemplate template;

	public SNSChestMenu(@Nullable MenuType<?> pMenuType, int pContainerId, SNSChestMenuTemplate template, Inventory playerInventory, @Nullable Container container) {
		super(pMenuType, pContainerId);

		if (container == null)
			container = new SimpleContainer(template.size);
		else
			checkContainerSize(container, template.size);

		this.container = container;
		this.template = template;
		container.startOpen(playerInventory.player);



		for (int i = 0; i < template.size; i++) {
			SNSChestMenuTemplate.SlotPos pos = template.slots[i];
			addSlot(new Slot(container, i, pos.x(), pos.y()));
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
	public void removed(Player pPlayer) {
		super.removed(pPlayer);
		container.stopOpen(pPlayer);
	}

	@Override
	public boolean stillValid(Player player) {
		return container.stillValid(player);
	}

	@Override
	public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
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
