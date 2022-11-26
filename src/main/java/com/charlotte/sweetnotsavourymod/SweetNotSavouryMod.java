package com.charlotte.sweetnotsavourymod;

import com.charlotte.sweetnotsavourymod.common.effects.ModEffects;
import com.charlotte.sweetnotsavourymod.common.painting.ModPaintings;
import com.charlotte.sweetnotsavourymod.common.recipe.ModRecipes;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ModFoliagePlacerTypes;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ModTrunkPlacerTypes;
import com.charlotte.sweetnotsavourymod.core.init.*;
import com.charlotte.sweetnotsavourymod.core.sound.SoundsInit;
import com.charlotte.sweetnotsavourymod.core.util.StrippingMap;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SweetNotSavouryMod.MOD_ID)
public class SweetNotSavouryMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sweetnotsavourymod";

    public SweetNotSavouryMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::commonSetup);
		bus.addListener(this::onLoadComplete);
        bus.addListener(this::setup);

        ModEffects.MOB_EFFECTS.register(bus);
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
        ModPaintings.PAINTING_MOTIVES.register(bus);
        SoundsInit.SOUND_EVENTS.register(bus);
        FluidInit.FLUIDS.register(bus);
    	BlockEntityTypesInit.BLOCK_ENTITY_TYPE.register(bus);
        MenuTypesInit.MENUS.register(bus);
        ModRecipes.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);
        ModFoliagePlacerTypes.FOLIAGE_PLACER_TYPES.register(bus);
    }

	public void commonSetup(final FMLCommonSetupEvent event) {

    }

    public void onLoadComplete(final FMLLoadCompleteEvent event) {
    	StrippingMap.registerStrippables();
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModTrunkPlacerTypes.register();
  
          FlowerPotBlock flowerPot = (FlowerPotBlock) Blocks.FLOWER_POT;

           flowerPot.addPlant(BlockInit.CANDYCANEBUSH.getId(), BlockInit.POTTED_CANDYCANEBUSH);
           flowerPot.addPlant(BlockInit.CANDY_CANE_FLOWER.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER);
           flowerPot.addPlant(BlockInit.CANDY_CANE_FLOWER_2.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_2);
           flowerPot.addPlant(BlockInit.CANDY_CANE_FLOWER_3.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_3);
           flowerPot.addPlant(BlockInit.CANDY_CANE_FLOWER_4.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_4);
           flowerPot.addPlant(BlockInit.CANDY_CANE_GRASS.getId(), BlockInit.POTTED_CANDY_CANE_GRASS);
           flowerPot.addPlant(BlockInit.CANDY_CANE_GRASS_LONG.getId(), BlockInit.POTTED_CANDY_CANE_GRASS_LONG);
           flowerPot.addPlant(BlockInit.POISONBERRYPLANT.getId(), BlockInit.POTTED_POISONBERRYPLANT);
           flowerPot.addPlant(BlockInit.FROSTINGFLOWER.getId(), BlockInit.POTTED_FROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.STRAWBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.RASPBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_RASPBERRYFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.BLUEBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.BLACKBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.ORANGEFROSTINGFLOWER.getId(), BlockInit.POTTED_ORANGEFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.LEMONFROSTINGFLOWER.getId(), BlockInit.POTTED_LEMONFROSTINGFLOWER);
           flowerPot.addPlant(BlockInit.CHOCOLATECINERARIA.getId(), BlockInit.POTTED_CHOCOLATECINERARIA);
           flowerPot.addPlant(BlockInit.TOFFEETULIP.getId(), BlockInit.POTTED_TOFFEETULIP);
           flowerPot.addPlant(BlockInit.STRAWBERRYCANDYBUSH.getId(), BlockInit.POTTED_STRAWBERRYCANDYBUSH);
           flowerPot.addPlant(BlockInit.RASPBERRYCANDYBUSH.getId(), BlockInit.POTTED_RASPBERRYCANDYBUSH);
           flowerPot.addPlant(BlockInit.BLACKBERRYCANDYBUSH.getId(), BlockInit.POTTED_BLACKBERRYCANDYBUSH);
           flowerPot.addPlant(BlockInit.BLUEBERRYCANDYBUSH.getId(), BlockInit.POTTED_BLUEBERRYCANDYBUSH);
           flowerPot.addPlant(BlockInit.LEMONCANDYBUSH.getId(), BlockInit.POTTED_LEMONCANDYBUSH);
           flowerPot.addPlant(BlockInit.LIMECANDYBUSH.getId(), BlockInit.POTTED_LIMECANDYBUSH);
           flowerPot.addPlant(BlockInit.MANGOCANDYBUSH.getId(), BlockInit.POTTED_MANGOCANDYBUSH);
           flowerPot.addPlant(BlockInit.PEACHCANDYBUSH.getId(), BlockInit.POTTED_PEACHCANDYBUSH);
           flowerPot.addPlant(BlockInit.ORANGECANDYBUSH.getId(), BlockInit.POTTED_ORANGECANDYBUSH);
           flowerPot.addPlant(BlockInit.RAINBOWCANDYBUSH.getId(), BlockInit.POTTED_RAINBOWCANDYBUSH);
           flowerPot.addPlant(BlockInit.BLACKBERRYCONEFLOWER.getId(), BlockInit.POTTED_BLACKBERRYCONEFLOWER);
           flowerPot.addPlant(BlockInit.STRAWBERRYCONEFLOWER.getId(), BlockInit.POTTED_STRAWBERRYCONEFLOWER);
           flowerPot.addPlant(BlockInit.BLUEBERRYCONEFLOWER.getId(), BlockInit.POTTED_BLUEBERRYCONEFLOWER);
           flowerPot.addPlant(BlockInit.RASPBERRYCONEFLOWER.getId(), BlockInit.POTTED_RASPBERRYCONEFLOWER);
           flowerPot.addPlant(BlockInit.LEMONCONEFLOWER.getId(), BlockInit.POTTED_LEMONCONEFLOWER);
           flowerPot.addPlant(BlockInit.ORANGECONEFLOWER.getId(), BlockInit.POTTED_ORANGECONEFLOWER);
           flowerPot.addPlant(BlockInit.VANILLACONEFLOWER.getId(), BlockInit.POTTED_VANILLACONEFLOWER);
           flowerPot.addPlant(BlockInit.TOFFEECONEFLOWER.getId(), BlockInit.POTTED_TOFFEECONEFLOWER);
           flowerPot.addPlant(BlockInit.CHOCOLATECONEFLOWER.getId(), BlockInit.POTTED_CHOCOLATECONEFLOWER);

            //spawn placements

//water
//            SpawnPlacements.register(EntityTypesInit.SNSWAFFLEFISH.get(),
//                    SpawnPlacements.Type.IN_WATER,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    WaterAnimal::checkMobSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSMINIWAFFLEFISH.get(),
//                    SpawnPlacements.Type.IN_WATER,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    WaterAnimal::checkMobSpawnRules);
//
//            //ground
//
//            SpawnPlacements.register(EntityTypesInit.SNSPUG.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSICECREAMPUG.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSPARROT.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSICECREAMPARROT.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSRABBIT.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSGP.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSMOUSE.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSSQUIRROLL.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSZEBRA.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSCCWOLF.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSCCCAT.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSSPIDER.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSTOAD.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSWAFERSCHUND.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSGUMMYBEAR.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSBOARRY.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSPARFAITPIXIE.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.SNSELF.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);
//
//            SpawnPlacements.register(EntityTypesInit.ICECREAMCOW.get(),
//                    SpawnPlacements.Type.ON_GROUND,
//                    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);

        });
    }

}
