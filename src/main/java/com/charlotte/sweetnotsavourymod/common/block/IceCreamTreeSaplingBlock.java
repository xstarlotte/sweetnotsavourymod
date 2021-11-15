package com.charlotte.sweetnotsavourymod.common.block;

import java.util.Random;

import com.charlotte.sweetnotsavourymod.common.world.TreeSpawner;

import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class IceCreamTreeSaplingBlock extends SaplingBlock {
	
	private final TreeSpawner tree;

	public IceCreamTreeSaplingBlock(Properties properties, TreeSpawner spawner) {
		super(null, properties);
		this.tree = spawner;
	}
	
	@Override
	public void placeTree(ServerWorld world, BlockPos pos, BlockState state, Random rand) {
		if (state.get(STAGE) == 0) {
			world.setBlockState(pos, state.func_235896_a_(STAGE), 4);
		}
		else {
			tree.spawn(world, world.getChunkProvider().getChunkGenerator(), pos, state, rand);
			
		}
	}
	
	
	
}
