package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.world.item.AxeItem;

public class StrippingMap {
	public static void createStrippable(Block input, Block output) {
		AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
		AxeItem.BLOCK_STRIPPING_MAP.put(input, output);
	}
	
	public static void registerStrippables() {
		createStrippable(BlockInit.WAFERWOODBLOCK.get(), BlockInit.STRIPPEDWAFERWOODBLOCK.get());
	}

}
