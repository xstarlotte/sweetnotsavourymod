package com.charlotte.sweetnotsavourymod.common.world.gen;

import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.ibm.icu.text.AlphabeticIndex;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;
import java.util.List;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {

//snowy-plains

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSELF.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSBOARRY.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.ICECREAMCOW.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCCCAT.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSGP.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCCWOLF.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSGUMMYBEAR.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSICECREAMPARROT.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSICECREAMPUG.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSMOUSE.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPARFAITPIXIE.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPARROT.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPUG.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPRETZELFLY.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSPIDER.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSRABBIT.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSQUIRROLL.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSTOAD.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSWAFERSCHUND.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSWAFFLEFISH.get(),
                60, 4, 6, Biomes.FROZEN_RIVER);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSMINIWAFFLEFISH.get(),
                60, 4, 6, Biomes.FROZEN_RIVER);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSZEBRA.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);


        addEntityToSpecificBiomes(event, EntityTypesInit.CANDYCANECROOK.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.RSWMUMMY.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.POISONBERRYATTACKER.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);
        addEntityToSpecificBiomes(event, EntityTypesInit.POISONBERRYARCHER.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS);


    }

    private static void addEntityToAllBiomesExceptThese(BiomeLoadingEvent event, EntityType<?> type,
                                                        int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        // Goes through each entry in the biomes and sees if it matches the current biome we are loading
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(!isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    @SafeVarargs
    private static void addEntityToSpecificBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        // Goes through each entry in the biomes and sees if it matches the current biome we are loading
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    private static void addEntityToAllOverworldBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                      int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND) && !event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    private static void addEntityToAllBiomesNoNether(BiomeLoadingEvent event, EntityType<?> type,
                                                     int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }

    private static void addEntityToAllBiomesNoEnd(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }

    private static void addEntityToAllBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                             int weight, int minCount, int maxCount) {
        List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
        base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
    }

}
