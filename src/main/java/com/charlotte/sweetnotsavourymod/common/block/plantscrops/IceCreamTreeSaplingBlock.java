package com.charlotte.sweetnotsavourymod.common.block.plantscrops;

import java.util.Random;

import com.charlotte.sweetnotsavourymod.common.world.TreeSpawner;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;


public class IceCreamTreeSaplingBlock extends SaplingBlock {
	
	private final TreeSpawner tree;

	public IceCreamTreeSaplingBlock(Properties properties, TreeSpawner spawner) {
		super(null, properties);
		this.tree = spawner;
	}
	
	@Override
	public void placeTree(ServerLevel world, BlockPos pos, BlockState state, Random rand) {
		if (state.get(STAGE) == 0) {
			world.setBlockState(pos, state.cycle(STAGE), 4);
		}
		else {
			tree.spawn(world, world.getChunkSource().getChunkGenerator(), pos, state, rand);
			
		}
	}
	
	
	
}
