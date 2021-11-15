package com.charlotte.sweetnotsavourymod.common.block;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.ChestBlock;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class StrawberryChest extends ChestBlock {
	public StrawberryChest(Properties builder, Supplier<TileEntityType<? extends ChestTileEntity>> tileEntityTypeIn) {
		super(builder, tileEntityTypeIn);		
	}
}
