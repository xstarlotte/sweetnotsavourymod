package com.charlotte.sweetnotsavourymod;

import com.charlotte.sweetnotsavourymod.client.events.ClientEvents;
import com.charlotte.sweetnotsavourymod.common.effects.ModEffects;
import com.charlotte.sweetnotsavourymod.common.events.EntityEvents;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.common.painting.ModPaintings;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTrunkPlacer;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ModFoliagePlacerTypes;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ModTrunkPlacerTypes;
import com.charlotte.sweetnotsavourymod.core.init.*;

import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.charlotte.sweetnotsavourymod.core.sound.SoundsInit;
import com.charlotte.sweetnotsavourymod.core.util.StrippingMap;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.print.Book;

@Mod("sweetnotsavourymod")
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SweetNotSavouryMod {
	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sweetnotsavourymod";
    
    public SweetNotSavouryMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		MinecraftForge.EVENT_BUS.register(new ClientEvents());
		MinecraftForge.EVENT_BUS.register(new EntityEvents());
		bus.addListener(this::commonSetup);
		bus.addListener(this::onLoadComplete);
        bus.addListener(this::setup);

        ModEffects.register(bus);
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
        ModPaintings.PAINTING_MOTIVES.register(bus);
        SoundsInit.SOUND_EVENTS.register(bus);
        FluidInit.FLUIDS.register(bus);
    	BlockEntityTypesInit.BLOCK_ENTITY_TYPE.register( bus );
        MenuTypesInit.MENUS.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);
        ModFoliagePlacerTypes.FOLIAGE_PLACER_TYPES.register(bus);
    	
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
    	//CustomSpawnEggItem.initSpawnEggs();
    }

    @SuppressWarnings("deprecation")
	public void commonSetup(final FMLCommonSetupEvent event) {
   	
    } 

    public void onLoadComplete(final FMLLoadCompleteEvent event) {
    	StrippingMap.registerStrippables();
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModTrunkPlacerTypes.register();

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDYCANEBUSH.getId(), BlockInit.POTTED_CANDYCANEBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_FLOWER.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_FLOWER_2.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_2);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_FLOWER_3.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_3);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_FLOWER_4.getId(), BlockInit.POTTED_CANDY_CANE_FLOWER_4);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_GRASS.getId(), BlockInit.POTTED_CANDY_CANE_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CANDY_CANE_GRASS_LONG.getId(), BlockInit.POTTED_CANDY_CANE_GRASS_LONG);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.POISONBERRYPLANT.getId(), BlockInit.POTTED_POISONBERRYPLANT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.FROSTINGFLOWER.getId(), BlockInit.POTTED_FROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.STRAWBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.RASPBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_RASPBERRYFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLUEBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLACKBERRYFROSTINGFLOWER.getId(), BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.ORANGEFROSTINGFLOWER.getId(), BlockInit.POTTED_ORANGEFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.LEMONFROSTINGFLOWER.getId(), BlockInit.POTTED_LEMONFROSTINGFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CHOCOLATECINERARIA.getId(), BlockInit.POTTED_CHOCOLATECINERARIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.STRAWBERRYCANDYBUSH.getId(), BlockInit.POTTED_STRAWBERRYCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.RASPBERRYCANDYBUSH.getId(), BlockInit.POTTED_RASPBERRYCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLACKBERRYCANDYBUSH.getId(), BlockInit.POTTED_BLACKBERRYCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLUEBERRYCANDYBUSH.getId(), BlockInit.POTTED_BLUEBERRYCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.LEMONCANDYBUSH.getId(), BlockInit.POTTED_LEMONCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.ORANGECANDYBUSH.getId(), BlockInit.POTTED_ORANGECANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.RAINBOWCANDYBUSH.getId(), BlockInit.POTTED_RAINBOWCANDYBUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLACKBERRYCONEFLOWER.getId(), BlockInit.POTTED_BLACKBERRYCONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.STRAWBERRYCONEFLOWER.getId(), BlockInit.POTTED_STRAWBERRYCONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.BLUEBERRYCONEFLOWER.getId(), BlockInit.POTTED_BLUEBERRYCONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.RASPBERRYCONEFLOWER.getId(), BlockInit.POTTED_RASPBERRYCONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.LEMONCONEFLOWER.getId(), BlockInit.POTTED_LEMONCONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.ORANGECONEFLOWER.getId(), BlockInit.POTTED_ORANGECONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.VANILLACONEFLOWER.getId(), BlockInit.POTTED_VANILLACONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.TOFFEECONEFLOWER.getId(), BlockInit.POTTED_TOFFEECONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CHOCOLATECONEFLOWER.getId(), BlockInit.POTTED_CHOCOLATECONEFLOWER);

            //spawn placements

//water
            SpawnPlacements.register(EntityTypesInit.SNSWAFFLEFISH.get(),
                    SpawnPlacements.Type.IN_WATER,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    WaterAnimal::checkSurfaceWaterAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSMINIWAFFLEFISH.get(),
                    SpawnPlacements.Type.IN_WATER,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    WaterAnimal::checkSurfaceWaterAnimalSpawnRules);

            //ground

            SpawnPlacements.register(EntityTypesInit.SNSPUG.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSICECREAMPUG.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSPARROT.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSICECREAMPARROT.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSRABBIT.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSGP.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSMOUSE.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSSQUIRROLL.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSZEBRA.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSCCWOLF.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSCCCAT.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSSPIDER.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSTOAD.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSWAFERSCHUND.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSGUMMYBEAR.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSBOARRY.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSPARFAITPIXIE.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.SNSELF.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            SpawnPlacements.register(EntityTypesInit.ICECREAMCOW.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

        });
    }

}
