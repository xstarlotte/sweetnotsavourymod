package com.charlotte.sweetnotsavourymod.core.itemgroup;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SweetNotSavouryModItemGroup {
	public static final CreativeModeTab SNSMODFOOD = new CreativeModeTab("snsmodfood") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SPRINKLES.get());
		}
	};

	public static final CreativeModeTab SNSMODBLOCKS = new CreativeModeTab("snsmodblocks") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.WAFERWOODBLOCK.get());
		}
	};

	public static final CreativeModeTab SNSMODDECORATION = new CreativeModeTab("snsmoddecoration") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.LEMONLOLLIPOPLAMP.get());
		}
	};

	public static final CreativeModeTab SNSMODMACHINES = new CreativeModeTab("snsmodmachines") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.ICE_CREAM_MACHINE.get());
		}
	};

	public static final CreativeModeTab SNSMODSPAWNEGGS = new CreativeModeTab("snsmodspawneggs") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SNSELFSPAWNEGG.get());
		}
	};

	public static final CreativeModeTab SNSMODARMOUR = new CreativeModeTab("snsmodarmour") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.RASPBERRY_CANDY_CHESTPLATE.get());
		}
	};

	public static final CreativeModeTab SNSMODTOOLS = new CreativeModeTab("snsmodtools") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.CANDY_CANE_SWORD.get());
		}
	};

	public static final CreativeModeTab SNSMODMUSIC = new CreativeModeTab("snsmodmusic") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.CARTOON_WHY_WE_LOSE_RECORD.get());
		}
	};

}
