package com.charlotte.sweetnotsavourymod.data.worldgen.biomemodifiers;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.features.ModPlacedFeatures;
import com.charlotte.sweetnotsavourymod.data.worldgen.ModVegetationFeatures;
import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class AddFeaturesBiomeModifiers {

    private final Map<ResourceLocation, BiomeModifier> map;
    private final RegistryOps<JsonElement> registryOps;

    public AddFeaturesBiomeModifiers(Map<ResourceLocation, BiomeModifier> map, RegistryOps<JsonElement> registryOps) {
        this.map = map;
        this.registryOps = registryOps;
        generate();
    }

    public void generate() {
        var biomeRegistry = registryOps.registry(ForgeRegistries.Keys.BIOMES).get();
        HolderSet<Biome> SNOWY_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES, Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        HolderSet<Biome> PLAINS_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS, Biomes.MEADOW);

        addAll("snowy_flowers", SNOWY_BIOMES,
                HolderSet.direct(registryOps.registry(BuiltinRegistries.PLACED_FEATURE.key()).get()::getOrCreateHolderOrThrow,
                        ModPlacedFeatures.CHOCOLATE_CINERARIA_PLACED.getKey(),
                        ModPlacedFeatures.TOFFEE_TULIP_PLACED.getKey(),
                        ModPlacedFeatures.CANDY_CANE_BUSH_PLACED.getKey(),
                        ModPlacedFeatures.CANDY_CANE_SPREAD_PLACED.getKey()
                ),
                GenerationStep.Decoration.VEGETAL_DECORATION
        );
        addAll("plains_flowers", PLAINS_BIOMES,
                HolderSet.direct(registryOps.registry(BuiltinRegistries.PLACED_FEATURE.key()).get()::getOrCreateHolderOrThrow,
                        ModPlacedFeatures.CANDY_BUSH_SPREAD_PLACED.getKey()
                ),
                GenerationStep.Decoration.VEGETAL_DECORATION);
        addAll("snowy_trees", SNOWY_BIOMES,
                HolderSet.direct(registryOps.registry(BuiltinRegistries.PLACED_FEATURE.key()).get()::getOrCreateHolderOrThrow,
                        ModVegetationFeatures.ICE_CREAM_PLACED.getKey(),
                        ModVegetationFeatures.CHOCOLATE_ICE_CREAM_PLACED.getKey()
                ),
                GenerationStep.Decoration.VEGETAL_DECORATION
        );
    }

    private void addAll(String id, HolderSet<Biome> biomeHolderSet, HolderSet<PlacedFeature> featureHolderSet, GenerationStep.Decoration step) {
        add(id, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeHolderSet, featureHolderSet, step));
    }

    private void add(String id, HolderSet<Biome> biomeHolderSet, Holder<PlacedFeature> feature, GenerationStep.Decoration step) {
        add(id, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeHolderSet, HolderSet.direct(feature), step));
    }

    private void add(String id, BiomeModifier modifier) {
        map.put(new ResourceLocation(SweetNotSavouryMod.MOD_ID, id), modifier);
    }
}
