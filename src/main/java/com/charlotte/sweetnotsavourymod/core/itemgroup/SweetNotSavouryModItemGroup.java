package com.charlotte.sweetnotsavourymod.core.itemgroup;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SweetNotSavouryModItemGroup {
	public static final ItemGroup SNSMODFOOD = new ItemGroup("snsmodfood") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SPRINKLES.get());
		}
	};

	public static final ItemGroup SNSMODBLOCKS = new ItemGroup("snsmodblocks") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.WAFERWOODBLOCK.get());
		}
	};

	public static final ItemGroup SNSMODDECORATION = new ItemGroup("snsmoddecoration") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.LEMONLOLLIPOPLAMP.get());
		}
	};

	public static final ItemGroup SNSMODMACHINES = new ItemGroup("snsmodmachines") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.ICE_CREAM_MACHINE.get());
		}
	};

	public static final ItemGroup SNSMODSPAWNEGGS = new ItemGroup("snsmodspawneggs") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SNSELFSPAWNEGG.get());
		}
	};

	public static final ItemGroup SNSMODARMOUR = new ItemGroup("snsmodarmour") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.RASPBERRY_CANDY_CHESTPLATE.get());
		}
	};

	public static final ItemGroup SNSMODTOOLS = new ItemGroup("snsmodtools") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.CANDY_CANE_SWORD.get());
		}
	};

	public static final ItemGroup SNSMODMUSIC = new ItemGroup("snsmodmusic") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.CHIPTRONICAL_RECORD.get());
		}
	};

}
