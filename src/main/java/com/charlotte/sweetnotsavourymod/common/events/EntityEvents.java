package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.MobSpawnSettingsBuilder;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID)
public class EntityEvents{
    @SubscribeEvent
    public void onBerryJump(final LivingEvent.LivingJumpEvent event ){

        //if (event.getEntity().getType() == EntityTypesInit.POISONBERRYATTACKER.get())
            //if (event.getEntityLiving().getBlockState().getBlock() == BlockInit.POISONOAKMINIDOOR.get())
            //    event.getEntityLiving().setDeltaMovement( event.getEntityLiving().getDeltaMovement().x, 0, event.getEntityLiving().getDeltaMovement().z );

    }
    
	@SubscribeEvent
	public static void onBiomeLoad(final BiomeLoadingEvent event) {
		if (event.getName() == null)
			return;
		MobSpawnSettingsBuilder spawns = event.getSpawns();
		
		if(event.getCategory().equals(Biome.BiomeCategory.FOREST)) {
			// spawns.addSpawn(MobCategory.MONSTER, MobSpawnSettings.SpawnerData(EntityTypesInit.POISONBERRYATTACKER.get(), 40, 2, 4));
		}
	}
}
