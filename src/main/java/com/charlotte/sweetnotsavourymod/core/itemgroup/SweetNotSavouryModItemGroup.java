package com.charlotte.sweetnotsavourymod.core.itemgroup;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SweetNotSavouryModItemGroup extends CreativeModeTab {
	
	public static final SweetNotSavouryModItemGroup SWEETNOTSAVOURYMOD = new SweetNotSavouryModItemGroup(CreativeModeTab.GROUPS.length,
			"sweetnotsavourymod");

	public SweetNotSavouryModItemGroup(int index, String label) {
		super(index, label);
		
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ItemInit.SPRINKLES.get());
	}

}
