package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID)
public class EntityEvents{
    @SubscribeEvent
    public void onBerryJump(final LivingEvent.LivingJumpEvent event ){

        if (event.getEntity().getType() == EntityTypesInit.POISONBERRYATTACKER.get())
            if (event.getEntityLiving().getBlockState().getBlock() == BlockInit.POISONOAKMINIDOOR.get())
                event.getEntityLiving().setMotion( event.getEntityLiving().getMotion().x, 0, event.getEntityLiving().getMotion().z );

    }
    
	@SubscribeEvent
	public static void onBiomeLoad(final BiomeLoadingEvent event) {
		if (event.getName() == null)
			return;
		MobSpawnInfoBuilder spawns = event.getSpawns();
		
		if(event.getCategory().equals(Biome.Category.FOREST)) {
			spawns.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityTypesInit.POISONBERRYATTACKER.get(), 40, 2, 4));
		}
	}
}
