package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.OptionalInt;

public class ModConfiguredFeature {
    public static final ConfiguredFeature<TreeConfiguration, ?> ICE_CREAM_TREE =
            FeatureUtils.register("ice_cream_tree",
                    new IceCreamTreeFeature(TreeConfiguration.CODEC)
                    .configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider
                            .simple(Blocks.DARK_OAK_LOG),
                            new DarkOakTrunkPlacer(6, 2, 1),
                            BlockStateProvider.simple(Blocks.DARK_OAK_LEAVES),
                            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                    )).ignoreVines().build()));
}
