package com.charlotte.sweetnotsavourymod.common.screen.chest;

import net.minecraft.world.inventory.MenuType;

public class SNSChestMenuType extends MenuType<SNSChestMenu> {
	public final SNSChestMenuTemplate template;

	public SNSChestMenuType(MenuSupplier<SNSChestMenu> menuSupplier, SNSChestMenuTemplate template) {
		super(menuSupplier);
		this.template = template;
	}
}
