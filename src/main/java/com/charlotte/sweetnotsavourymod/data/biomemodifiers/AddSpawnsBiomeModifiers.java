package com.charlotte.sweetnotsavourymod.data.biomemodifiers;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import net.minecraft.core.HolderSet;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Map;

public class AddSpawnsBiomeModifiers {


    private final Map<ResourceLocation, BiomeModifier> map;
    private final RegistryOps<JsonElement> registryOps;

    public AddSpawnsBiomeModifiers(Map<ResourceLocation, BiomeModifier> map, RegistryOps<JsonElement> registryOps) {
        this.map = map;
        this.registryOps = registryOps;
        generate();
    }

    private void generate() {
        var biomeRegistry = registryOps.registry(ForgeRegistries.Keys.BIOMES).get();
        HolderSet<Biome> SNOWY_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.SNOWY_PLAINS, Biomes.SNOWY_BEACH, Biomes.SNOWY_SLOPES, Biomes.SNOWY_TAIGA, Biomes.TAIGA);
        HolderSet<Biome> JUNGLE_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.JUNGLE, Biomes.BAMBOO_JUNGLE, Biomes.SPARSE_JUNGLE);
        HolderSet<Biome> DESERT_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.DESERT);
        HolderSet<Biome> SWAMP_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.SWAMP);
        HolderSet<Biome> SAVANNA_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA);
        HolderSet<Biome> FOREST_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST, Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST);
        HolderSet<Biome> PLAINS_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.PLAINS, Biomes.SNOWY_PLAINS, Biomes.SUNFLOWER_PLAINS, Biomes.MEADOW);
        HolderSet<Biome> COLD_OCEAN_RIVER_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.FROZEN_RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.OCEAN, Biomes.FROZEN_OCEAN);
        HolderSet<Biome> WARM_OCEAN_RIVER_BIOMES = HolderSet.direct(biomeRegistry::getOrCreateHolderOrThrow, Biomes.OCEAN, Biomes.DEEP_OCEAN, Biomes.RIVER, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.WARM_OCEAN);

        addAll("snowy_spawns", 5, 1, 2, SNOWY_BIOMES,
                List.of(
                        EntityTypesInit.ICECREAMCOW.get(),
                        EntityTypesInit.SNSCCCAT.get(),
                        EntityTypesInit.SNSCCWOLF.get(),
                        EntityTypesInit.SNSICECREAMPARROT.get(),
                        EntityTypesInit.SNSICECREAMPUG.get(),
                        EntityTypesInit.SNSPARFAITPIXIE.get(),
                        EntityTypesInit.SNSWAFERSCHUND.get(),

                        EntityTypesInit.CANDYCANECROOK.get(),
                        EntityTypesInit.MINTIMPERIAL.get(),
                        EntityTypesInit.RSWMUMMY.get()
                )
        );
        addAll("jungle_spawns", 5 ,1 ,2, JUNGLE_BIOMES,
                List.of(
                        EntityTypesInit.SNSPARROT.get(),
                        EntityTypesInit.SNSCOOKIECAT.get()
                )
        );
        addAll("desert_spawns", 30, 1, 2, DESERT_BIOMES,
                List.of(
                        EntityTypesInit.SNSSPIDER.get(),
                        EntityTypesInit.SNSJAMSTER.get(),
                        EntityTypesInit.SNSSNAKE.get(),
                        EntityTypesInit.GINGERBREAD_MAN.get(),

                        EntityTypesInit.RSWMUMMY.get()
                )
        );
        addAll("swamp_spawns", 5, 1, 2, SWAMP_BIOMES, List.of(EntityTypesInit.SNSTOAD.get()));
        addAll("savanna_spawns", 5 ,1 ,2, SAVANNA_BIOMES, List.of(EntityTypesInit.SNSZEBRA.get()));
        addAll("forest_spawns", 5, 1, 2, FOREST_BIOMES,
                List.of(
                        EntityTypesInit.SNSCHIPMUNK.get(),
                        EntityTypesInit.SNSBOARRY.get(),
                        EntityTypesInit.SNSSQUIRROLL.get(),
                        EntityTypesInit.SNSMOUSE.get(),
                        EntityTypesInit.SNSELF.get()
                )
        );
        add("unicorn_forest_spawn", 1, 1, 1, FOREST_BIOMES, EntityTypesInit.SNSUNICORN.get());
        addAll("plains_spawns", 5, 1, 2, PLAINS_BIOMES,
                List.of(
                        EntityTypesInit.SNSLION.get(),
                        EntityTypesInit.SNSSHEEP.get(),
                        EntityTypesInit.SNSRABBIT.get(),
                        EntityTypesInit.SNSPUG.get(),
                        EntityTypesInit.CHOCOLATECHICKEN.get(),
                        EntityTypesInit.SNSGUMMYBEAR.get(),
                        EntityTypesInit.SNSGP.get(),
                        EntityTypesInit.BONBONBINI.get()
                )
        );
        add("pretzelfly_plains_spawn", 10, 1, 2, PLAINS_BIOMES, EntityTypesInit.SNSPRETZELFLY.get());
        addAll("cold_ocean_river_spawns", 80, 4, 6, COLD_OCEAN_RIVER_BIOMES,
                List.of(
                        EntityTypesInit.SNSCANDYCANEFISH.get(),
                        EntityTypesInit.SNSWAFFLEFISH.get(),
                        EntityTypesInit.SNSMINIWAFFLEFISH.get(),
                        EntityTypesInit.SNSICFISH.get()
                )
        );
        addAll("cold_ocean_river_whale_and_dolphin_spawns", 80, 1, 2, COLD_OCEAN_RIVER_BIOMES,
                List.of(
                        EntityTypesInit.SNSWHALE.get(),
                        EntityTypesInit.SNSDOLPHIN.get()
                )
        );
        add("angel_fish_spawn", 80, 4, 6, WARM_OCEAN_RIVER_BIOMES, EntityTypesInit.SNSANGELFISH.get());
        addAll("poison_berry_forest_spawns", 5, 1, 1, FOREST_BIOMES,
                List.of(
                        EntityTypesInit.POISONBERRYATTACKER.get(),
                        EntityTypesInit.POISONBERRYARCHER.get(),
                        EntityTypesInit.POISONBERRYDEFENDER.get()
                )
        );
    }

    private void addAll(String id, int weight, int min, int max, HolderSet<Biome> biomeHolderSet, List<EntityType<?>> entityTypes) {
        ImmutableList.Builder<MobSpawnSettings.SpawnerData> dataList = new ImmutableList.Builder<>();
        for (EntityType<?> type : entityTypes) {
            var data = new MobSpawnSettings.SpawnerData(type, weight, min, max);
            dataList.add(data);
        }
        add(id, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(biomeHolderSet, dataList.build()));
    }

    private void add(String id, int weight, int min, int max, HolderSet<Biome> biomeHolderSet, EntityType<?> entityType) {
        add(id, ForgeBiomeModifiers.AddSpawnsBiomeModifier.singleSpawn(biomeHolderSet, new MobSpawnSettings.SpawnerData(entityType, weight, min, max)));
    }

    private void add(String id, BiomeModifier modifier) {
        map.put(new ResourceLocation(SweetNotSavouryMod.MOD_ID, id), modifier);
    }
}
