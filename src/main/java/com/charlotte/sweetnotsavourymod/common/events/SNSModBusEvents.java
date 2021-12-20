package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.gummybears.SNSGummyBearEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pretzelflies.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.waferschunds.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSMiniWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.SNSCandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SNSModBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypesInit.SNSELF.get(), SNSElfEntity.setAttributes());
        event.put(EntityTypesInit.SNSPARROT.get(), SNSParrotEntity.setAttributes());
        event.put(EntityTypesInit.SNSICECREAMPARROT.get(), SNSIceCreamParrotEntity.setAttributes());
        event.put(EntityTypesInit.SNSPUG.get(), SNSPugEntity.setAttributes());
        event.put(EntityTypesInit.SNSICECREAMPUG.get(), SNSIceCreamPugEntity.setAttributes());
        event.put(EntityTypesInit.SNSRABBIT.get(), SNSRabbitEntity.setAttributes());
        event.put(EntityTypesInit.SNSPARFAITPIXIE.get(), SNSParfaitPixieEntity.setAttributes());
        event.put(EntityTypesInit.SNSCCWOLF.get(), SNSCandyCaneWolfEntity.setAttributes());
        event.put(EntityTypesInit.SNSMOUSE.get(), SNSMouseEntity.setAttributes());
        event.put(EntityTypesInit.SNSSQUIRROLL.get(), SNSSquirrollEntity.setAttributes());
        event.put(EntityTypesInit.SNSZEBRA.get(), SNSZebraEntity.setAttributes());
        event.put(EntityTypesInit.SNSTOAD.get(), SNSToadEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyEntity.setAttributes());
        event.put(EntityTypesInit.SNSGUMMYBEAR.get(), SNSGummyBearEntity.setAttributes());
    }
}
