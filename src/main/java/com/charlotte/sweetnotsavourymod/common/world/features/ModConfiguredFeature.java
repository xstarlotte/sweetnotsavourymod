package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;

import java.util.OptionalInt;

public class ModConfiguredFeature {
  private static <FG extends IFeatureConfig> ConfiguredFeature<FG, ?> register(String key, ConfiguredFeature<FG, ?> configuredFeature) {
    return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
  }
  
  private static <FG extends IFeatureConfig> ConfiguredFeature<FG, ?> register(String key, Feature<FG> feature, FG config) {
    return register(key, feature.configured(config));
  }
  
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ICE_CREAM_TREE =
            register("ice_cream_tree",
                    Feature.TREE, (new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(BlockInit.WAFERWOODBLOCK.get().defaultBlockState()),
                            new SimpleBlockStateProvider(BlockInit.RAINBOWFROSTINGLEAVES.get().defaultBlockState()),
                            new IceCreamFoliagePlacer(FeatureSpread.fixed(0), FeatureSpread.fixed(0)),
                            new IceCreamTrunkPlacer(0, 0, 0),
                            new TwoLayerFeature(1, 0, 2, OptionalInt.empty())
                    )).ignoreVines().build());

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHOCOLATE_ICE_CREAM_TREE =
            register("chocolate_ice_cream_tree",
                    Feature.TREE, (new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(BlockInit.CHOCOLATEWAFERWOODBLOCK.get().defaultBlockState()),
                            new SimpleBlockStateProvider(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get().defaultBlockState()),
                            new ChocolateIceCreamFoliagePlacer(FeatureSpread.fixed(0), FeatureSpread.fixed(0)),
                            new ChocolateIceCreamTrunkPlacer(0, 0, 0),
                            new TwoLayerFeature(1, 0, 2, OptionalInt.empty())
                    )).ignoreVines().build());

    // configured feature -> placed feature -> configured feature -> placed feature

//    public static final Holder<PlacedFeature> ICE_CREAM_TREE_CHECKED = PlacementUtils.register("ice_cream_tree_checked",
//            ICE_CREAM_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.ICECREAMTREESAPLING.get()));
//
//    public static final Holder<PlacedFeature> CHOCOLATE_ICE_CREAM_TREE_CHECKED = PlacementUtils.register("chocolate_ice_cream_tree_checked",
//            CHOCOLATE_ICE_CREAM_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.CHOCOLATEICECREAMTREESAPLING.get()));

//    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ICE_CREAM_TREE_SPAWN =
//            register("ice_cream_tree_spawn",
//                    Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
//                            ICE_CREAM_TREE_CHECKED, 0.5F)), ICE_CREAM_TREE_CHECKED));
//
//    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHOCOLATE_ICE_CREAM_TREE_SPAWN =
//            register("chocolate_ice_cream_tree_spawn",
//                    Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
//                            CHOCOLATE_ICE_CREAM_TREE_CHECKED, 0.5F)), CHOCOLATE_ICE_CREAM_TREE_CHECKED));

    //flowers

    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> CANDYCANEBUSH =
            register("candycanebush", Feature.FLOWER, new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.CANDYCANEBUSH.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)
                .tries(5).xspread(5).zspread(5).yspread(2).build()
            );

    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> CANDY_CANE_SPREAD =
            register("candy_cane_spread", Feature.FLOWER,
                (new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider()
                    .add(BlockInit.CANDY_CANE_FLOWER.get().defaultBlockState(), 1)
                    .add(BlockInit.CANDY_CANE_FLOWER_2.get().defaultBlockState(), 1)
                    .add(BlockInit.CANDY_CANE_FLOWER_3.get().defaultBlockState(), 1)
                    .add(BlockInit.CANDY_CANE_FLOWER_4.get().defaultBlockState(), 1)
                    .add(BlockInit.CANDY_CANE_GRASS.get().defaultBlockState(), 1)
                    .add(BlockInit.CANDY_CANE_GRASS_LONG.get().defaultBlockState(), 1),
                    SimpleBlockPlacer.INSTANCE)).tries(64).build());

    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> CHOCOLATECINERARIA =
        register("chocolatecineraria", Feature.FLOWER, new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.CHOCOLATECINERARIA.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)
            .tries(5).xspread(5).zspread(5).yspread(2).build()
        );

    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> TOFFEETULIP =
        register("toffeetulip", Feature.FLOWER, new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.TOFFEETULIP.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)
            .tries(5).xspread(5).zspread(5).yspread(2).build()
        );

    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> CANDY_BUSH_SPREAD =
            register("candy_bush_spread", Feature.FLOWER,
                (new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider()
                    .add(BlockInit.STRAWBERRYCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.RASPBERRYCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.BLACKBERRYCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.BLUEBERRYCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.ORANGECANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.LEMONCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.LIMECANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.MANGOCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.PEACHCANDYBUSH.get().defaultBlockState(), 1)
                    .add(BlockInit.RAINBOWCANDYBUSH.get().defaultBlockState(), 1),
                    SimpleBlockPlacer.INSTANCE)).tries(16).build());


//    private static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
//        return simpleRandomPatchConfiguration(p_195204_,
//                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
//    }


}
