package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.google.gson.JsonElement;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

public class ModPlacedFeatures {
    public static void loadClass() {}

    private final Map<ResourceLocation, PlacedFeature> map;
    private final RegistryOps<JsonElement> registryOps;

    public ModPlacedFeatures(Map<ResourceLocation, PlacedFeature> map, RegistryOps<JsonElement> registryOps) {
        this.map = map;
        this.registryOps = registryOps;
        generate();
    }

    public void generate() {
        add(ICE_CREAM_TREE_CHECKED);
        add(CHOCOLATE_ICE_CREAM_TREE_CHECKED);
        add(CANDY_CANE_BUSH_PLACED);
        add(CHOCOLATE_CINERARIA_PLACED);
        add(TOFFEE_TULIP_PLACED);
    }

    private void add(RegistryObject<PlacedFeature> holder) {
        var registryOptional = registryOps.registry(Registry.PLACED_FEATURE_REGISTRY);
        var key = holder.getKey();
        if (registryOptional.isPresent() && key != null) {
            var regHolder = registryOptional.get().getOrCreateHolderOrThrow(key);
            map.put(key.location(), regHolder.value());
        }
    }

 //trees

    public static final RegistryObject<PlacedFeature> ICE_CREAM_TREE_CHECKED = ModConfiguredFeatures.register("ice_cream_tree_checked",
            ModConfiguredFeatures.ICE_CREAM_TREE, () -> List.of(PlacementUtils.filteredByBlockSurvival(BlockInit.ICECREAMTREESAPLING.get())));

    public static final RegistryObject<PlacedFeature> CHOCOLATE_ICE_CREAM_TREE_CHECKED = ModConfiguredFeatures.register("chocolate_ice_cream_tree_checked",
            ModConfiguredFeatures.CHOCOLATE_ICE_CREAM_TREE, () -> List.of(PlacementUtils.filteredByBlockSurvival(BlockInit.CHOCOLATEICECREAMTREESAPLING.get())));

//0.3, 0.4 don't work due to them not being in the list of weighted integers

   //flowers

    public static final RegistryObject<PlacedFeature> CANDY_CANE_BUSH_PLACED = ModConfiguredFeatures.register("candy_cane_bush_placed",
            ModConfiguredFeatures.CANDY_CANE_BUSH,
            () -> List.of(BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE))
    );

    public static final RegistryObject<PlacedFeature> CHOCOLATE_CINERARIA_PLACED = ModConfiguredFeatures.register("chocolate_cineraria_spread_placed",
            ModConfiguredFeatures.CHOCOLATE_CINERARIA,
            () -> List.of(BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE))
    );

    public static final RegistryObject<PlacedFeature> TOFFEE_TULIP_PLACED = ModConfiguredFeatures.register("toffee_tulip_spread_placed",
            ModConfiguredFeatures.TOFFEE_TULIP,
            () -> List.of(BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE))
    );
}
