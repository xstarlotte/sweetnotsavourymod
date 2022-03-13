package com.charlotte.sweetnotsavourymod.common.world.features;
import java.util.Random;
import java.util.function.BiConsumer;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.mojang.serialization.Codec;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;

import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

import static net.minecraft.world.level.levelgen.feature.TreeFeature.isAirOrLeaves;

public class IceCreamTreeFeature extends Feature<TreeConfiguration> {


	
	private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
			Direction.WEST };
	
	private static final BlockState LOG = BlockInit.WAFERWOODBLOCK.get().defaultBlockState();
	private static final BlockState LEAVES = BlockInit.RAINBOWFROSTINGLEAVES.get().defaultBlockState().setValue(LeavesBlock.DISTANCE, 1);

	public IceCreamTreeFeature(Codec<TreeConfiguration> codec) {
		super(codec);		
	}

	@Override
    public final boolean place(FeaturePlaceContext<TreeConfiguration> pContext) {

        WorldGenLevel reader = pContext.level();
        BlockPos pos = pContext.origin();
        TreeConfiguration treeconfiguration = pContext.config();
		
		while (pos.getY() > 1 && isAirOrLeaves(reader, pos)) {
			pos = pos.below();
		}
		
		//Trunk
		int height = 5;
		if (pos.getY() >= 1 && pos.getY() + 7 + 6 < reader.getHeight()) {

			for (int i = pos.getY() + 1; i < pos.getY() + height + 1; i++) {
				reader.setBlock(new BlockPos(pos.getX(), i, pos.getZ()), LOG, 3);
				
				for (Direction d : DIRECTIONS) {					
					reader.setBlock(new BlockPos(pos.getX(), i, pos.getZ()).relative(d, 1), LOG, 3);
					
					for (Direction di : DIRECTIONS) {											
						reader.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + height, pos.getZ())
                                .relative(Direction.NORTH, 1), LOG, 3);
						reader.setBlock(new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                                .relative(Direction.WEST, 1), LOG, 3);
						reader.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + height, pos.getZ() - 2)
                                .relative(Direction.SOUTH, 1), LOG, 3);
						reader.setBlock(new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                                .relative(Direction.EAST, 1), LOG, 3);
					}
				}
			}
		}
				
		else {
			return false;
		}
		//Leaves		
		for(BlockPos blockpos : BlockPos.betweenClosed(pos.getX() - 2, pos.getY() + height + 1, pos.getZ() - 2,
															pos.getX() + 2, pos.getY() + height + 1, pos.getZ() + 2)
				) {
            reader.setBlock(blockpos, LEAVES, 3);
            reader.setBlock(blockpos.offset(0, 1, 0), LEAVES, 3);
                  }
			
			reader.setBlock(new BlockPos(pos.getX() - 2,
                            pos.getY() + height + 2, pos.getZ() - 2),
					Blocks.AIR.defaultBlockState(), 3);
			reader.setBlock(new BlockPos(pos.getX() + 2,
                            pos.getY() + height + 2, pos.getZ() - 2),
					Blocks.AIR.defaultBlockState(), 3);
			reader.setBlock(new BlockPos(pos.getX() - 2,
                            pos.getY() + height + 2, pos.getZ() + 2),
					Blocks.AIR.defaultBlockState(), 3);
			reader.setBlock(new BlockPos(pos.getX() + 2,
                            pos.getY() + height + 2, pos.getZ() + 2),
					Blocks.AIR.defaultBlockState(), 3);
            
         
			for(BlockPos blockpos : BlockPos.betweenClosed
					(pos.getX() - 1, pos.getY() + height + 3, pos.getZ() - 1,
					pos.getX() + 1, pos.getY() + height + 3, pos.getZ() + 1)
					) {
				reader.setBlock(blockpos, LEAVES, 3);
				}
	
			for (Direction d : DIRECTIONS) {					
				reader.setBlock(new BlockPos(pos.getX(), pos.getY() + height + 4, pos.getZ())
                        .relative(d, 1), LEAVES, 3);
			
			}
			
			for (int i = pos.getY() + height + 6; i > pos.getY() + height + 3; i--) {
				reader.setBlock(new BlockPos(pos.getX(), i, pos.getZ()), LEAVES, 3);
			}	
		return true;
	}
	
	
}

