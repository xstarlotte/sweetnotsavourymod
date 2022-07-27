package com.charlotte.sweetnotsavourymod.common.screen.chest;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault

public class SNSChestMenu extends AbstractContainerMenu {
	private final Container container;
	public final SNSChestMenuTemplate template;

	public SNSChestMenu(@Nullable MenuType<?> pMenuType, int pContainerId, SNSChestMenuTemplate template, Inventory playerInventory, @Nullable Container container) {
		super(pMenuType, pContainerId);

		if (container == null)
			container = new SimpleContainer(template.slots.length);
		else
			checkContainerSize(container, template.slots.length);

		this.container = container;
		this.template = template;
		container.startOpen(playerInventory.player);



		for (int i = 0; i < template.slots.length; i++) {
			SNSChestMenuTemplate.SlotPos pos = template.slots[i];
			addSlot(new Slot(container, i, pos.x(), pos.y()));
		}

		//int i = (this.containerRows - 4) * 18;
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
	public boolean stillValid(Player player) {
		return container.stillValid(player);
	}
}
