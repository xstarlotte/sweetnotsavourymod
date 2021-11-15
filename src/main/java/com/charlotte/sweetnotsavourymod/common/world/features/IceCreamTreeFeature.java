package com.charlotte.sweetnotsavourymod.common.world.features;
import java.util.Random;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.command.arguments.BlockStateInput;
import net.minecraft.inventory.IClearable;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class IceCreamTreeFeature extends Feature<NoFeatureConfig>{
	
	private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
			Direction.WEST };
	
	private static final BlockState LOG = BlockInit.WAFERWOODBLOCK.get().getDefaultState();
	private static final BlockState LEAVES = BlockInit.RAINBOWFROSTINGLEAVES.get().getDefaultState().with(LeavesBlock.DISTANCE, 1);

	public IceCreamTreeFeature(Codec<NoFeatureConfig> codec) {
		super(codec);		
	}

	@SuppressWarnings("deprecation")
	public boolean isAirOrLeaves(IWorldGenerationBaseReader reader, BlockPos pos) {
		if (!(reader instanceof IWorldReader)) {
			return reader.hasBlockState(pos,  (state) -> state.isAir() || state.isIn(BlockTags.LEAVES));
		}else {
			return reader.hasBlockState(pos, state -> state.canBeReplacedByLeaves((IWorldReader)reader, pos));
		}
	}
	
	@Override
	public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos,
			NoFeatureConfig config) {
		
		while (pos.getY() > 1 && isAirOrLeaves(reader, pos)) {
			pos = pos.down();
		}
		
		//Trunk
		int height = 5;
		if (pos.getY() >= 1 && pos.getY() + 7 + 6 < reader.getHeight()) {

			for (int i = pos.getY() + 1; i < pos.getY() + height + 1; i++) {
				reader.setBlockState(new BlockPos(pos.getX(), i, pos.getZ()), LOG, 3);
				
				for (Direction d : DIRECTIONS) {					
					reader.setBlockState(new BlockPos(pos.getX(), i, pos.getZ()).offset(d, 1), LOG, 3);
					
					for (Direction di : DIRECTIONS) {											
						reader.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + height, pos.getZ()).offset(Direction.NORTH, 1), LOG, 3);
						reader.setBlockState(new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1).offset(Direction.WEST, 1), LOG, 3);
						reader.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + height, pos.getZ() - 2).offset(Direction.SOUTH, 1), LOG, 3);
						reader.setBlockState(new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1).offset(Direction.EAST, 1), LOG, 3);
					}
				}
			}
		}
				
		else {
			return false;
		}
		//Leaves		
		for(BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.getX() - 2, pos.getY() + height + 1, pos.getZ() - 2,
															pos.getX() + 2, pos.getY() + height + 1, pos.getZ() + 2)
				) {
            reader.setBlockState(blockpos, LEAVES, 3);
            reader.setBlockState(blockpos.add(0, 1, 0), LEAVES, 3);
                  }
			
			reader.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + height + 2, pos.getZ() - 2),
					Blocks.AIR.getDefaultState(), 3);
			reader.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + height + 2, pos.getZ() - 2),
					Blocks.AIR.getDefaultState(), 3);
			reader.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + height + 2, pos.getZ() + 2),
					Blocks.AIR.getDefaultState(), 3);
			reader.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + height + 2, pos.getZ() + 2),
					Blocks.AIR.getDefaultState(), 3);
            
         
			for(BlockPos blockpos : BlockPos.getAllInBoxMutable
					(pos.getX() - 1, pos.getY() + height + 3, pos.getZ() - 1,
					pos.getX() + 1, pos.getY() + height + 3, pos.getZ() + 1)
					) {
				reader.setBlockState(blockpos, LEAVES, 3);
				}
	
			for (Direction d : DIRECTIONS) {					
				reader.setBlockState(new BlockPos(pos.getX(), pos.getY() + height + 4, pos.getZ()).offset(d, 1), LEAVES, 3);
			
			}
			
			for (int i = pos.getY() + height + 6; i > pos.getY() + height + 3; i--) {
				reader.setBlockState(new BlockPos(pos.getX(), i, pos.getZ()), LEAVES, 3);
			}	
		return true;
	}
	
	
}

