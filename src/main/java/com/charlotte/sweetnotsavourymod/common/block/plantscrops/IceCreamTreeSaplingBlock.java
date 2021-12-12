package com.charlotte.sweetnotsavourymod.common.block.plantscrops;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class IceCreamTreeSaplingBlock extends SaplingBlock {
	private final AbstractTreeGrower tree;

	public IceCreamTreeSaplingBlock(Properties properties, AbstractTreeGrower spawner) {
		super(spawner, properties);
		this.tree = spawner;
	}
	
	@Override
	public void advanceTree(ServerLevel world, BlockPos pos, BlockState state, Random rand) {
		if (state.getValue(STAGE) == 0) {
			world.setBlock(pos, state.cycle(STAGE), 4);
		}
		else {
			tree.growTree(world, world.getChunkSource().getGenerator(), pos, state, rand);
		}
	}
}