package com.charlotte.sweetnotsavourymod.common.world;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.world.gen.ModEntityGeneration;
import com.charlotte.sweetnotsavourymod.common.world.gen.ModFlowerGeneration;
import com.charlotte.sweetnotsavourymod.common.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
        ModEntityGeneration.onEntitySpawn(event);
    }
}
