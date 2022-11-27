package com.charlotte.sweetnotsavourymod.data.worldgen;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeatures;
import com.charlotte.sweetnotsavourymod.common.world.features.ModPlacedFeatures;
import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ModVegetationFeatures {

    private final Map<ResourceLocation, ConfiguredFeature<?, ?>> configMap;
    private final Map<ResourceLocation, PlacedFeature> placedMap;
    private final RegistryOps<JsonElement> registryOps;

    public ModVegetationFeatures(Map<ResourceLocation, ConfiguredFeature<?, ?>> configMap, Map<ResourceLocation, PlacedFeature> placedMap, RegistryOps<JsonElement> registryOps) {
        this.configMap = configMap;
        this.placedMap = placedMap;
        this.registryOps = registryOps;
        generate();
    }

    public static void bootstrap() {}

    private void generate() {
        add(ICE_CREAM_TREE_SPAWN, ICE_CREAM_PLACED);
        add(CHOCOLATE_ICE_CREAM_TREE_SPAWN, CHOCOLATE_ICE_CREAM_PLACED);
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

    public static final RegistryObject<PlacedFeature> ICE_CREAM_PLACED = ModConfiguredFeatures.register("ice_cream_tree_placed",
            ICE_CREAM_TREE_SPAWN, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));

    public static final RegistryObject<PlacedFeature> CHOCOLATE_ICE_CREAM_PLACED = ModConfiguredFeatures.register("chocolate_ice_cream_spawn_placed",
            CHOCOLATE_ICE_CREAM_TREE_SPAWN, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));
}
