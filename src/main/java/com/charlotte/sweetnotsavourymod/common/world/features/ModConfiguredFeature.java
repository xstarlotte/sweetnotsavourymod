package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeature {
    public static final Holder< ? extends ConfiguredFeature<TreeConfiguration, ?>> ICE_CREAM_TREE =
            FeatureUtils.register("ice_cream_tree",
                    Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.WAFERWOODBLOCK.get()),
                            new IceCreamTrunkPlacer(0, 0, 0),
                            BlockStateProvider.simple(BlockInit.RAINBOWFROSTINGLEAVES.get()),
                            new IceCreamFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                            new TwoLayersFeatureSize(1, 0, 2, OptionalInt.empty())
                    )).ignoreVines().build());

    // configured feature -> placed feature -> configured feature -> placed feature

    public static final Holder<PlacedFeature> ICE_CREAM_TREE_CHECKED = PlacementUtils.register("ice_cream_tree_checked",
            ICE_CREAM_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.ICECREAMTREESAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ICE_CREAM_TREE_SPAWN =
            FeatureUtils.register("ice_cream_tree_spawn",
                    Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ICE_CREAM_TREE_CHECKED, 0.5F)), ICE_CREAM_TREE_CHECKED));

    //flowers

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDYCANEBUSH =
            FeatureUtils.register("candycanebush", Feature.FLOWER,
                    new RandomPatchConfiguration(20, 20, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CANDYCANEBUSH.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDY_CANE_SPREAD =
            FeatureUtils.register("candy_cane_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(BlockInit.CANDY_CANE_FLOWER.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_2.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_3.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_4.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_GRASS.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_GRASS_LONG.get().defaultBlockState(), 1)
                    ), 64)));


    private static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
        return FeatureUtils.simpleRandomPatchConfiguration(p_195204_,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
    }


}
