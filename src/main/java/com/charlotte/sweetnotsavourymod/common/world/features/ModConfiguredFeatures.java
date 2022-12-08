package com.charlotte.sweetnotsavourymod.common.world.features;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamFoliagePlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static void loadClass() {}
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_REGISTER = SNSReg.createReg(Registry.CONFIGURED_FEATURE_REGISTRY);
    private static final DeferredRegister<PlacedFeature> PLACED_REGISTER = SNSReg.createReg(Registry.PLACED_FEATURE_REGISTRY);

    private final Map<ResourceLocation, ConfiguredFeature<?, ?>> map;
    private final RegistryOps<JsonElement> registryOps;

    public ModConfiguredFeatures(Map<ResourceLocation, ConfiguredFeature<?, ?>> map, RegistryOps<JsonElement> registryOps) {
        this.map = map;
        this.registryOps = registryOps;
        generate();
    }

    public void generate() {
        add(ICE_CREAM_TREE);
        add(CHOCOLATE_ICE_CREAM_TREE);
        add(CANDY_CANE_BUSH);
        add(CHOCOLATE_CINERARIA);
        add(TOFFEE_TULIP);
    }

    private <T extends FeatureConfiguration> void add(RegistryObject<ConfiguredFeature<T, ?>> holder) {
        var registry = registryOps.registry(Registry.CONFIGURED_FEATURE_REGISTRY);
        var key = holder.getKey();
        if (registry.isPresent() && key != null) {
            var regHolder = registry.get().getOrCreateHolderOrThrow(hackyCast(key));
            map.put(key.location(), regHolder.value());
        }
    }

    public static final RegistryObject<ConfiguredFeature<TreeConfiguration, ?>> ICE_CREAM_TREE =
            register("ice_cream_tree", Feature.TREE,
                    () -> new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.WAFERWOODBLOCK.get()),
                            new IceCreamTrunkPlacer(0, 0, 0),
                            BlockStateProvider.simple(BlockInit.RAINBOWFROSTINGLEAVES.get()),
                            new IceCreamFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                            new TwoLayersFeatureSize(1, 0, 2, OptionalInt.empty())
                    ).ignoreVines().build()
            );

    public static final RegistryObject<ConfiguredFeature<TreeConfiguration, ?>> CHOCOLATE_ICE_CREAM_TREE =
            register("chocolate_ice_cream_tree", Feature.TREE,
                    () -> new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.CHOCOLATEWAFERWOODBLOCK.get()),
                            new ChocolateIceCreamTrunkPlacer(0, 0, 0),
                            BlockStateProvider.simple(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get()),
                            new ChocolateIceCreamFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                            new TwoLayersFeatureSize(1, 0, 2, OptionalInt.empty())
                    ).ignoreVines().build()
            );

    //flowers

    public static final RegistryObject<ConfiguredFeature<SimpleBlockConfiguration, ?>> CANDY_CANE_BUSH =
            register("candy_cane_bush", Feature.SIMPLE_BLOCK,
                    () -> new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CANDYCANEBUSH.get()))
            );

    public static final RegistryObject<ConfiguredFeature<SimpleBlockConfiguration, ?>> CHOCOLATE_CINERARIA =
            register("chocolate_cineraria", Feature.SIMPLE_BLOCK,
                    () -> new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.CHOCOLATECINERARIA.get()))
            );

    public static final RegistryObject<ConfiguredFeature<SimpleBlockConfiguration, ?>> TOFFEE_TULIP =
            register("toffee_tulip", Feature.SIMPLE_BLOCK,
                    () -> new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.TOFFEETULIP.get()))
            );


    public static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
        return FeatureUtils.simpleRandomPatchConfiguration(p_195204_,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
    }

    @SuppressWarnings("unchecked")
    public static <T> ResourceKey<T> hackyCast(ResourceKey<?> key) {
        return (ResourceKey<T>)key;
    }

    public static <T extends FeatureConfiguration> RegistryObject<PlacedFeature> register(String name, RegistryObject<ConfiguredFeature<T, ?>> feature, Supplier<List<PlacementModifier>> placements) {
        var holder = feature.getHolder();
        return holder.map(configuredFeatureHolder -> PLACED_REGISTER.register(name, () -> new PlacedFeature(Holder.hackyErase(configuredFeatureHolder), placements.get()))).orElse(null);
        //        return PlacementUtils.register(SweetNotSavouryMod.MOD_ID + ":" + pName, pFeature, pPlacements);
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> RegistryObject<ConfiguredFeature<FC, ?>> register(String name, F feature, Supplier<FC> config) {
        return CONFIGURED_REGISTER.register(name, () -> new ConfiguredFeature<>(feature, config.get()));
//        return FeatureUtils.register(SweetNotSavouryMod.MOD_ID + ":" + name, feature, config);
    }
}
