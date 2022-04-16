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

//SNOWY

        addEntityToSpecificBiomes(event, EntityTypesInit.ICECREAMCOW.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCCCAT.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCCWOLF.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSICECREAMPARROT.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSICECREAMPUG.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPARFAITPIXIE.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSWAFERSCHUND.get(),
                5, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);

        //JUNGLE
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPARROT.get(),
                5, 1, 2, Biomes.JUNGLE, Biomes.BAMBOO_JUNGLE, Biomes.SPARSE_JUNGLE);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCOOKIECAT.get(),
                5, 1, 2, Biomes.JUNGLE, Biomes.BAMBOO_JUNGLE, Biomes.SPARSE_JUNGLE);


        //DESERT
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSPIDER.get(),
                30, 1, 2, Biomes.DESERT);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSJAMSTER.get(),
                30, 1, 2, Biomes.DESERT);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSNAKE.get(),
                30, 1, 2, Biomes.DESERT);




        //SWAMP

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSTOAD.get(),
                5, 1, 2, Biomes.SWAMP);




        //SAVANNAHS

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSZEBRA.get(),
                5, 1, 2, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA);


        //FORESTS

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSUNICORN.get(),
                1, 1, 1, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCHIPMUNK.get(),
                5, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSBOARRY.get(),
                5, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSQUIRROLL.get(),
                5, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSMOUSE.get(),
                5, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSELF.get(),
                5, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);


        //PLAINS

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSLION.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSSHEEP.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPRETZELFLY.get(),
                10, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSRABBIT.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSPUG.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.CHOCOLATECHICKEN.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSGUMMYBEAR.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSGP.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);

        addEntityToSpecificBiomes(event, EntityTypesInit.BONBONBINI.get(),
                5, 1, 2, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.MEADOW);


        //OCEAN/RIVER


        addEntityToSpecificBiomes(event, EntityTypesInit.SNSCANDYCANEFISH.get(),
                80, 4, 6, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSWAFFLEFISH.get(),
                80, 4, 6, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSMINIWAFFLEFISH.get(),
                80, 4, 6, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSICFISH.get(),
                80, 4, 6, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);
        addEntityToSpecificBiomes(event, EntityTypesInit.SNSWHALE.get(),
                80, 1, 2, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);

        addEntityToSpecificBiomes(event, EntityTypesInit.SNSDOLPHIN.get(),
                80, 1, 2, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN,
                Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);


        addEntityToSpecificBiomes(event, EntityTypesInit.SNSANGELFISH.get(),
                80, 4, 6, Biomes.OCEAN, Biomes.DEEP_OCEAN,
                Biomes.RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.WARM_OCEAN);


//HOSTILE

        addEntityToSpecificBiomes(event, EntityTypesInit.CANDYCANECROOK.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);

        addEntityToSpecificBiomes(event, EntityTypesInit.MINTIMPERIAL.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA);

        addEntityToSpecificBiomes(event, EntityTypesInit.RSWMUMMY.get(),
                10, 1, 2, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES,
                Biomes.SNOWY_TAIGA, Biomes.TAIGA, Biomes.DESERT);

        addEntityToSpecificBiomes(event, EntityTypesInit.POISONBERRYATTACKER.get(),
                10, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.POISONBERRYARCHER.get(),
                10, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        addEntityToSpecificBiomes(event, EntityTypesInit.POISONBERRYDEFENDER.get(),
                10, 1, 2, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST,
                Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);


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
