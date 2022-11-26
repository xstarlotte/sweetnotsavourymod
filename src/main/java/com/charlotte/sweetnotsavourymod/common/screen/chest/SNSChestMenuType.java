package com.charlotte.sweetnotsavourymod.common.screen.chest;

import net.minecraft.inventory.container.ContainerType;

public class SNSChestMenuType extends ContainerType<SNSChestMenu> {
	public final SNSChestMenuTemplate template;

	public SNSChestMenuType(IFactory<SNSChestMenu> menuSupplier, SNSChestMenuTemplate template) {
		super(menuSupplier);
		this.template = template;
	}
}
