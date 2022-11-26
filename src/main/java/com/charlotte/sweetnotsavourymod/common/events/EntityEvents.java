package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityEvents {
    @SubscribeEvent
    public static void onBerryJump(final LivingEvent.LivingJumpEvent event ){

        //if (event.getEntity().getType() == EntityTypesInit.POISONBERRYATTACKER.get())
            //if (event.getEntityLiving().getBlockState().getBlock() == BlockInit.POISONOAKMINIDOOR.get())
            //    event.getEntityLiving().setDeltaMovement( event.getEntityLiving().getDeltaMovement().x, 0, event.getEntityLiving().getDeltaMovement().z );

    }

//	@SubscribeEvent
//	public static void onBiomeLoad(final BiomeLoadingEvent event) {
//		if (event.getName() == null)
//			return;
//		MobSpawnInfoBuilder spawns = event.getSpawns();
//
//		if(event.getCategory() == Biome.BiomeCategory.FOREST) {
//			// spawns.addSpawn(MobCategory.MONSTER, MobSpawnSettings.SpawnerData(EntityTypesInit.POISONBERRYATTACKER.get(), 40, 2, 4));
//		}
//	}
}
