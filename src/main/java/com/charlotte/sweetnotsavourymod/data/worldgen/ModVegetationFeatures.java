package com.charlotte.sweetnotsavourymod.data.worldgen;

import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeatures;
import com.charlotte.sweetnotsavourymod.common.world.features.ModPlacedFeatures;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.google.gson.JsonElement;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

public class ModVegetationFeatures {
    public static void loadClass() {}
    private final Map<ResourceLocation, ConfiguredFeature<?, ?>> configMap;
    private final Map<ResourceLocation, PlacedFeature> placedMap;
    private final RegistryOps<JsonElement> registryOps;

    public ModVegetationFeatures(Map<ResourceLocation, ConfiguredFeature<?, ?>> configMap, Map<ResourceLocation, PlacedFeature> placedMap, RegistryOps<JsonElement> registryOps) {
        this.configMap = configMap;
        this.placedMap = placedMap;
        this.registryOps = registryOps;
        generate();
    }

    private void generate() {
        add(ICE_CREAM_TREE_SPAWN, ICE_CREAM_PLACED);
        add(CHOCOLATE_ICE_CREAM_TREE_SPAWN, CHOCOLATE_ICE_CREAM_PLACED);
        add(CANDY_CANE_BUSH_PATCH, CANDY_CANE_BUSH_PATCH_PLACED);
        add(CANDY_CANE_SPREAD, CANDY_CANE_SPREAD_PLACED);
        add(CHOCOLATE_CINERARIA_PATCH, CHOCOLATE_CINERARIA_PATCH_PLACED);
        add(TOFFEE_TULIP_PATCH, TOFFEE_TULIP_PATCH_PLACED);
        add(CANDY_BUSH_SPREAD, CANDY_BUSH_SPREAD_PLACED);
    }

    private <T extends FeatureConfiguration> void add(RegistryObject<ConfiguredFeature<T, ?>> configHolder, RegistryObject<PlacedFeature> placedHolder) {
        addConfigured(configHolder);
        addPlaced(placedHolder);
    }

    private <T extends FeatureConfiguration> void addConfigured(RegistryObject<ConfiguredFeature<T, ?>> holder) {
        var registryOptional = registryOps.registry(Registry.CONFIGURED_FEATURE_REGISTRY);
        var key = holder.getKey();
        if (registryOptional.isPresent() && key != null) {
            var regHolder = registryOptional.get().getOrCreateHolderOrThrow(ModConfiguredFeatures.hackyCast(key));
            configMap.put(key.location(), regHolder.value());
        }
    }

    private void addPlaced(RegistryObject<PlacedFeature> holder) {
        var registryOptional = registryOps.registry(Registry.PLACED_FEATURE_REGISTRY);
        var key = holder.getKey();
        if (registryOptional.isPresent() && key != null) {
            var regHolder = registryOptional.get().getOrCreateHolderOrThrow(key);
            placedMap.put(key.location(), regHolder.value());
        }
    }

    public static final RegistryObject<ConfiguredFeature<RandomFeatureConfiguration, ?>> ICE_CREAM_TREE_SPAWN =
            ModConfiguredFeatures.register("ice_cream_spawn", Feature.RANDOM_SELECTOR,
                    () -> new RandomFeatureConfiguration(List.of(), ModPlacedFeatures.ICE_CREAM_TREE_CHECKED.getHolder().get()));

    public static final RegistryObject<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHOCOLATE_ICE_CREAM_TREE_SPAWN =
            ModConfiguredFeatures.register("chocolate_ice_cream_spawn", Feature.RANDOM_SELECTOR,
                    () -> new RandomFeatureConfiguration(List.of(), ModPlacedFeatures.CHOCOLATE_ICE_CREAM_TREE_CHECKED.getHolder().get()));

    public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDY_CANE_BUSH_PATCH =
            ModConfiguredFeatures.register("candy_cane_bush_patch", Feature.FLOWER,
                    () -> new RandomPatchConfiguration(20, 80, 2, ModPlacedFeatures.CANDY_CANE_BUSH_PLACED.getHolder().get())
            );

    public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDY_CANE_SPREAD =
            ModConfiguredFeatures.register("candy_cane_spread", Feature.FLOWER,
                    () -> ModConfiguredFeatures.grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(BlockInit.CANDY_CANE_FLOWER.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_2.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_3.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_FLOWER_4.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_GRASS.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_GRASS_LONG.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_CARNATION.get().defaultBlockState(), 1)
                            .add(BlockInit.CANDY_CANE_CARNATIONS.get().defaultBlockState(), 1)
                    ), 64)
            );

    public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> CHOCOLATE_CINERARIA_PATCH =
            ModConfiguredFeatures.register("chocolate_cineraria_patch", Feature.FLOWER,
                    () -> new RandomPatchConfiguration(20, 80, 2, ModPlacedFeatures.CHOCOLATE_CINERARIA_PLACED.getHolder().get())
            );

    public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> TOFFEE_TULIP_PATCH =
            ModConfiguredFeatures.register("toffee_tulip_patch", Feature.FLOWER,
                    () -> new RandomPatchConfiguration(20, 80, 2, ModPlacedFeatures.TOFFEE_TULIP_PLACED.getHolder().get())
            );

    public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> CANDY_BUSH_SPREAD =
            ModConfiguredFeatures.register("candy_bush_spread", Feature.FLOWER,
                    () -> ModConfiguredFeatures.grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
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
                    ), 16)
            );

    public static final RegistryObject<PlacedFeature> ICE_CREAM_PLACED = ModConfiguredFeatures.register("ice_cream_tree_placed",
            ICE_CREAM_TREE_SPAWN, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1))
    );

    public static final RegistryObject<PlacedFeature> CHOCOLATE_ICE_CREAM_PLACED = ModConfiguredFeatures.register("chocolate_ice_cream_spawn_placed",
            CHOCOLATE_ICE_CREAM_TREE_SPAWN, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1))
    );

    public static final RegistryObject<PlacedFeature> CANDY_CANE_BUSH_PATCH_PLACED = ModConfiguredFeatures.register("candy_cane_bush_patch_placed",
            CANDY_CANE_BUSH_PATCH,
            () -> List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome())
    );

    public static final RegistryObject<PlacedFeature> CHOCOLATE_CINERARIA_PATCH_PLACED = ModConfiguredFeatures.register("chocolate_cineraria_patch_placed",
            ModConfiguredFeatures.CHOCOLATE_CINERARIA,
            () -> List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome())
    );

    public static final RegistryObject<PlacedFeature> TOFFEE_TULIP_PATCH_PLACED = ModConfiguredFeatures.register("toffee_tulip_patch_placed",
            ModConfiguredFeatures.TOFFEE_TULIP,
            () -> List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome())
    );

    public static final RegistryObject<PlacedFeature> CANDY_CANE_SPREAD_PLACED = ModConfiguredFeatures.register("candy_cane_spread_placed",
            CANDY_CANE_SPREAD,
            () -> List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome())
    );

    public static final RegistryObject<PlacedFeature> CANDY_BUSH_SPREAD_PLACED = ModConfiguredFeatures.register("candy_bush_spread_placed",
            CANDY_BUSH_SPREAD,
            () -> List.of(RarityFilter.onAverageOnceEvery(42),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome())
    );
}
