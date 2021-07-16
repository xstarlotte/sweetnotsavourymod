package com.charlotte.sweetnotsavourymod.core.itemgroup;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SweetNotSavouryModItemGroup extends ItemGroup {
	
	public static final SweetNotSavouryModItemGroup SWEETNOTSAVOURYMOD = new SweetNotSavouryModItemGroup(ItemGroup.GROUPS.length,
			"sweetnotsavourymod");

	public SweetNotSavouryModItemGroup(int index, String label) {
		super(index, label);
		
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ItemInit.SPRINKLES.get());
	}

}
