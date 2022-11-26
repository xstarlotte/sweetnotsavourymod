package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeature;
import com.charlotte.sweetnotsavourymod.common.world.features.ModPlacedFeatures;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.data.biomemodifiers.AddFeaturesBiomeModifiers;
import com.charlotte.sweetnotsavourymod.data.biomemodifiers.AddSpawnsBiomeModifiers;
import com.google.common.collect.Maps;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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
        ModConfiguredFeature.bootstrap();
        ModPlacedFeatures.bootstrap();
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
        generator.addProvider(event.includeServer(), biomeModifiers(generator, event.getExistingFileHelper()));
    }

    private static DataProvider features(DataGenerator generator, ExistingFileHelper fileHelper) {
        var registryOps = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());
        Map<ResourceLocation, ConfiguredFeature<?, ?>> map = Maps.newHashMap();
        ItemInit
        return JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, Registry.CONFIGURED_FEATURE_REGISTRY, map);
    }

    private static DataProvider biomeModifiers(DataGenerator generator, ExistingFileHelper fileHelper) {
        var registryOps = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());
        Map<ResourceLocation, BiomeModifier> map = Maps.newHashMap();
        new AddSpawnsBiomeModifiers(map, registryOps);
        new AddFeaturesBiomeModifiers(map, registryOps);
        return JsonCodecProvider.forDatapackRegistry(generator, fileHelper, SweetNotSavouryMod.MOD_ID, registryOps, ForgeRegistries.Keys.BIOME_MODIFIERS, map);
    }
}
