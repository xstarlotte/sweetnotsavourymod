package com.charlotte.sweetnotsavourymod.core.itemgroup;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SweetNotSavouryModItemGroup {
	public static final CreativeModeTab SWEETNOTSAVOURYMOD = new CreativeModeTab("sweetnotsavourymod") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SPRINKLES.get());
		}
	};
}
