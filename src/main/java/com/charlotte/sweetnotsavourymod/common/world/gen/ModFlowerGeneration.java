package com.charlotte.sweetnotsavourymod.common.world.gen;

import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeature;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModFlowerGeneration {
    public static void generateFlowers(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.SNOWY)) {
            List<Supplier<ConfiguredFeature<?,?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(()->ModConfiguredFeature.CHOCOLATECINERARIA
//                    .decorated(Features.Placements.ADD_32)
                    .decorated(Features.Placements.HEIGHTMAP_SQUARE)
                    .count(2).chance(30)
//                .decorated(Features.Placements.HEIGHTMAP_SQUARE)
//                .decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.1F, 5)))
            );
            base.add(()->ModConfiguredFeature.TOFFEETULIP
//                    .decorated(Features.Placements.ADD_32)
                    .decorated(Features.Placements.HEIGHTMAP_SQUARE)
                    .count(2).chance(30)
//                .decorated(Features.Placements.HEIGHTMAP_SQUARE)
//                .decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.1F, 5)))
            );
            base.add(()->ModConfiguredFeature.CANDYCANEBUSH
//                .decorated(Features.Placements.ADD_32)
                .decorated(Features.Placements.HEIGHTMAP_SQUARE)
                .count(2).chance(30)
            );
            base.add(()->ModConfiguredFeature.CANDY_CANE_SPREAD
//                .decorated(Features.Placements.ADD_32)
                .decorated(Features.Placements.HEIGHTMAP_SQUARE)
                .count(2).chance(30)
            );
        }

        if(types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Supplier<ConfiguredFeature<?,?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(()->ModConfiguredFeature.CANDY_BUSH_SPREAD);
        }

    }
}
