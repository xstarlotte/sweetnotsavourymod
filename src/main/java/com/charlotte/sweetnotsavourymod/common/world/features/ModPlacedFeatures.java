package com.charlotte.sweetnotsavourymod.common.world.features;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

 //trees

    public static final PlacedFeature ICE_CREAM_PLACED = PlacementUtils.register("ice_cream_placed",
            ModConfiguredFeature.ICE_CREAM_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.2f, 1))));

//0.3, 0.4 don't work due to them not being in the list of weighted integers

   //flowers

    public static final PlacedFeature CANDYCANEBUSH_PLACED = PlacementUtils.register("candycanebush_placed",
            ModConfiguredFeature.CANDYCANEBUSH.placed(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature CANDY_CANE_SPREAD_PLACED = PlacementUtils.register("candy_cane_spread_placed",
            ModConfiguredFeature.CANDY_CANE_SPREAD.placed(RarityFilter.onAverageOnceEvery(14),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

}
