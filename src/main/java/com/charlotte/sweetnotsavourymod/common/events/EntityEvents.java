package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityEvents{
    @SubscribeEvent
    public void onBerryJump( LivingEvent.LivingJumpEvent event ){

        if (event.getEntity().getType() == EntityTypesInit.POISONBERRYATTACKER.get())
            if (event.getEntityLiving().getBlockState().getBlock() == BlockInit.POISONOAKMINIDOOR.get())
                event.getEntityLiving().setMotion( event.getEntityLiving().getMotion().x, 0, event.getEntityLiving().getMotion().z );

    }
}
