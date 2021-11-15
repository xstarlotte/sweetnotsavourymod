package com.charlotte.sweetnotsavourymod.common.world.surface;

import java.util.Random;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class IceCreamForestSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig>{

	public static final BlockState MELTINGCHOCOLATEBLOCK = BlockInit.MELTINGCHOCOLATEBLOCK.get().getDefaultState();
	public static final BlockState RASPBERRYICINGBLOCK = BlockInit.RASPBERRYICINGBLOCK.get().getDefaultState();
	
	public static final SurfaceBuilderConfig MELTINGCHOCOLATEBLOCK_CONFIG = new SurfaceBuilderConfig(MELTINGCHOCOLATEBLOCK, 
			MELTINGCHOCOLATEBLOCK, MELTINGCHOCOLATEBLOCK);
	
	public IceCreamForestSurfaceBuilder(Codec<SurfaceBuilderConfig> codec) {
		super(codec);
		
	}

	@Override
	public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
			BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
		if( random.nextInt(2) == 0) {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed, MELTINGCHOCOLATEBLOCK_CONFIG);
			
		} else {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed, MELTINGCHOCOLATEBLOCK_CONFIG);
		}
	}

}
