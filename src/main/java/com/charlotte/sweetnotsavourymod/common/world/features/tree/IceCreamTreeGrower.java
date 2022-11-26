package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class IceCreamTreeGrower extends Tree {
    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return ModConfiguredFeature.ICE_CREAM_TREE.get();
    }
}
