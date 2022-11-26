package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.BlockStateProvider;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.block.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeature {
    public static final Holder< ? extends ConfiguredFeature<BaseTreeFeatureConfig, ?>> ICE_CREAM_TREE =
            FeatureUtils.register("ice_cream_tree",
                    Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.WAFERWOODBLOCK.get()),
                            new IceCreamTrunkPlacer(0, 0, 0),
                            BlockStateProvider.simple(BlockInit.RAINBOWFROSTINGLEAVES.get()),
                            new IceCreamFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                            new TwoLayersFeatureSize(1, 0, 2, OptionalInt.empty())
                    )).ignoreVines().build());

    public static final Holder< ? extends ConfiguredFeature<TreeConfiguration, ?>> CHOCOLATE_ICE_CREAM_TREE =
            FeatureUtils.register("chocolate_ice_cream_tree",
                    Feature.TREE, (new BaseTreeFeatureConfig.Builder(
                            BlockStateProvider.simple(BlockInit.CHOCOLATEWAFERWOODBLOCK.get()),
                            new ChocolateIceCreamTrunkPlacer(0, 0, 0),
                            BlockStateProvider.simple(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get()),
                            new ChocolateIceCreamFoliagePlacer(FeatureSpread.fixed(0), FeatureSpread.fixed(0)),
                            new TwoLayersFeatureSize(1, 0, 2, OptionalInt.empty())
                    )).ignoreVines().build());

    // configured feature -> placed feature -> configured feature -> placed feature

    public static final Holder<PlacedFeature> ICE_CREAM_TREE_CHECKED = PlacementUtils.register("ice_cream_tree_checked",
            ICE_CREAM_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.ICECREAMTREESAPLING.get()));

    public static final Holder<PlacedFeature> CHOCOLATE_ICE_CREAM_TREE_CHECKED = PlacementUtils.register("chocolate_ice_cream_tree_checked",
            CHOCOLATE_ICE_CREAM_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.CHOCOLATEICECREAMTREESAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ICE_CREAM_TREE_SPAWN =
            FeatureUtils.register("ice_cream_tree_spawn",
                    Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ICE_CREAM_TREE_CHECKED, 0.5F)), ICE_CREAM_TREE_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHOCOLATE_ICE_CREAM_TREE_SPAWN =
            FeatureUtils.register("chocolate_ice_cream_tree_spawn",
                    Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            CHOCOLATE_ICE_CREAM_TREE_CHECKED, 0.5F)), CHOCOLATE_ICE_CREAM_TREE_CHECKED));

    //flowers

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDYCANEBUSH =
            FeatureUtils.register("candycanebush", Feature.FLOWER,
                    new RandomPatchConfiguration(20, 80, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
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

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CHOCOLATECINERARIA =
            FeatureUtils.register("chocolatecineraria", Feature.FLOWER,
                    new RandomPatchConfiguration(20, 80, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CHOCOLATECINERARIA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> TOFFEETULIP =
            FeatureUtils.register("toffeetulip", Feature.FLOWER,
                    new RandomPatchConfiguration(20, 80, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.TOFFEETULIP.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDY_BUSH_SPREAD =
            FeatureUtils.register("candy_bush_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(BlockInit.STRAWBERRYCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.RASPBERRYCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.BLACKBERRYCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.BLUEBERRYCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.ORANGECANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.LEMONCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.LIMECANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.MANGOCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.PEACHCANDYBUSH.get().defaultBlockState(), 1)
                            .add(BlockInit.RAINBOWCANDYBUSH.get().defaultBlockState(), 1)
                    ), 16)));


    private static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
        return FeatureUtils.simpleRandomPatchConfiguration(p_195204_,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
    }


}
