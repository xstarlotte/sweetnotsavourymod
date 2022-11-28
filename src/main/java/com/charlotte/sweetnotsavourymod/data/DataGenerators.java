package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeatures;
import com.charlotte.sweetnotsavourymod.common.world.features.ModPlacedFeatures;
import com.charlotte.sweetnotsavourymod.data.worldgen.ModVegetationFeatures;
import com.charlotte.sweetnotsavourymod.data.worldgen.biomemodifiers.AddFeaturesBiomeModifiers;
import com.charlotte.sweetnotsavourymod.data.worldgen.biomemodifiers.AddSpawnsBiomeModifiers;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        var fileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));

        var registryOps = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        generator.addProvider(event.includeServer(), configuredFeatures(generator, fileHelper, registryOps));
        generator.addProvider(event.includeServer(), placedFeatures(generator, fileHelper, registryOps));
        generator.addProvider(event.includeServer(), biomeModifiers(generator, fileHelper, registryOps));
        if (event.includeServer()) {
            vegetationFeatures(generator, fileHelper, registryOps);
        }
    }

    private static DataProvider configuredFeatures(DataGenerator generator, ExistingFileHelper fileHelper, RegistryOps<JsonElement> registryOps) {
        Map<ResourceLocation, ConfiguredFeature<?, ?>> map = Maps.newHashMap();
        new ModConfiguredFeatures(map, registryOps);
        return JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, Registry.CONFIGURED_FEATURE_REGISTRY, map);
    }

    private static DataProvider placedFeatures(DataGenerator generator, ExistingFileHelper fileHelper, RegistryOps<JsonElement> registryOps) {
        Map<ResourceLocation, PlacedFeature> map = Maps.newHashMap();
        new ModPlacedFeatures(map, registryOps);
        return JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, Registry.PLACED_FEATURE_REGISTRY, map);
    }

    private static void vegetationFeatures(DataGenerator generator, ExistingFileHelper fileHelper, RegistryOps<JsonElement> registryOps) {
        Map<ResourceLocation, ConfiguredFeature<?, ?>> configuredMap = Maps.newHashMap();
        Map<ResourceLocation, PlacedFeature> placedMap = Maps.newHashMap();
        new ModVegetationFeatures(configuredMap, placedMap, registryOps);
        generator.addProvider(true, JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, Registry.CONFIGURED_FEATURE_REGISTRY, configuredMap));
        generator.addProvider(true, JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, Registry.CONFIGURED_FEATURE_REGISTRY, configuredMap));
    }

    private static DataProvider biomeModifiers(DataGenerator generator, ExistingFileHelper fileHelper, RegistryOps<JsonElement> registryOps) {
        Map<ResourceLocation, BiomeModifier> map = Maps.newHashMap();
        new AddSpawnsBiomeModifiers(map, registryOps);
        new AddFeaturesBiomeModifiers(map, registryOps);
        return JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, ForgeRegistries.Keys.BIOME_MODIFIERS, map);
    }
}
