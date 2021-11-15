package com.charlotte.sweetnotsavourymod.core.init;

import java.util.Random;

import com.charlotte.sweetnotsavourymod.common.world.TreeSpawner;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class TreeInit {
	public static final TreeSpawner ICECREAMTREE = new TreeSpawner() {
		
		@Override
		protected Feature<? extends IFeatureConfig> getFeature(Random random) {
			return FeatureInit.ICECREAMTREE.get();
		}
	};
}
