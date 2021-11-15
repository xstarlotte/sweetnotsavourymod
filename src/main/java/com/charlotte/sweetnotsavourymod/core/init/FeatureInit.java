package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;



import com.charlotte.sweetnotsavourymod.common.world.features.IceCreamTreeFeature;
import com.charlotte.sweetnotsavourymod.common.world.features.RainbowCookieFeature;
import com.charlotte.sweetnotsavourymod.common.world.features.WhiteChocolateChipCookieFeature;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {
	
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, 
			SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<RainbowCookieFeature> RAINBOWCOOKIEFEATURE = FEATURES.register("rainbowcookiefeature",
			() -> new RainbowCookieFeature(NoFeatureConfig.field_236558_a_));
	

	
	public static final RegistryObject<WhiteChocolateChipCookieFeature> WHITECHOCOLATECHIPCOOKIEFEATURE = FEATURES.register("chocolatechipcookiefeature",
			() -> new WhiteChocolateChipCookieFeature(NoFeatureConfig.field_236558_a_));
	
	public static final RegistryObject<IceCreamTreeFeature> ICECREAMTREE = FEATURES.register("icecreamtree",
			() -> new IceCreamTreeFeature( BaseTreeFeatureConfig.CODEC));
	
	
	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.STRAWBERRYCANDYOREBLOCK.get().getDefaultState(), 4, 0, 60, 20);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.RASPBERRYCANDYOREBLOCK.get().getDefaultState(), 4, 0, 60, 20);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.BLUEBERRYCANDYOREBLOCK.get().getDefaultState(), 4, 0, 60, 20);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.LEMONCANDYOREBLOCK.get().getDefaultState(), 4, 0, 60, 20);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.ORANGECANDYOREBLOCK.get().getDefaultState(), 4, 0, 60, 20);
		
	
		
	}
	
	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount) {
		event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(rule, state, veinSize))
				.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.square().func_242731_b(amount));
	}

}
