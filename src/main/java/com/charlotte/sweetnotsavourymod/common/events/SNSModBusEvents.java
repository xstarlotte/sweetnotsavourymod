package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.amphibians.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolatePenguinEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.MintHumbugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSWormEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCCCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCookieCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSLionEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.MintHumbullEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.*;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.WaferWitchEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fish.*;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mintimperials.MintImperialEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies.RSWMummyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBDefenderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.*;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.MarshmallowSheepEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSBoarryEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.BonbonbiniEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.GingerbreadManEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.JellybabyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
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
        event.put(EntityTypesInit.SUGARGLIDER.get(), SugargliderEntity.setAttributes());
        event.put(EntityTypesInit.SNSCHIPMUNK.get(), SNSChipmunkEntity.setAttributes());
        event.put(EntityTypesInit.SNSZEBRA.get(), SNSZebraEntity.setAttributes());
        event.put(EntityTypesInit.SNSTOAD.get(), SNSToadEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundEntity.setAttributes());
        event.put(EntityTypesInit.SNSGUMMYBEAR.get(), SNSGummyBearEntity.setAttributes());
        event.put(EntityTypesInit.SNSBOARRY.get(), SNSBoarryEntity.setAttributes());
        event.put(EntityTypesInit.SNSSPIDER.get(), SNSSpiderEntity.setAttributes());
        event.put(EntityTypesInit.SNSCCCAT.get(), SNSCCCatEntity.setAttributes());
        event.put(EntityTypesInit.SNSCOOKIECAT.get(), SNSCookieCatEntity.setAttributes());
        event.put(EntityTypesInit.ICECREAMCOW.get(), IceCreamCowEntity.setAttributes());
        event.put(EntityTypesInit.SNSGP.get(), SNSGPEntity.setAttributes());
        event.put(EntityTypesInit.SNSUNICORN.get(), SNSUnicornEntity.setAttributes());
        event.put(EntityTypesInit.SNSJAMSTER.get(), SNSJamsterEntity.setAttributes());
        event.put(EntityTypesInit.SNSSHEEP.get(), SNSSheepEntity.setAttributes());
        event.put(EntityTypesInit.MARSHMALLOWSHEEP.get(), MarshmallowSheepEntity.setAttributes());
        event.put(EntityTypesInit.SNSLION.get(), SNSLionEntity.setAttributes());
        event.put(EntityTypesInit.CHOCOLATECHICKEN.get(), ChocolateChickenEntity.setAttributes());
        event.put(EntityTypesInit.BONBONBINI.get(), BonbonbiniEntity.setAttributes());
        event.put(EntityTypesInit.SNSSNAKE.get(), SNSSnakeEntity.setAttributes());
        event.put(EntityTypesInit.SNSWORM.get(), SNSWormEntity.setAttributes());
        event.put(EntityTypesInit.GINGERBREAD_MAN.get(), GingerbreadManEntity.setAttributes());
        event.put(EntityTypesInit.WAFER_WITCH.get(), WaferWitchEntity.setAttributes());
        event.put(EntityTypesInit.MINT_HUMBUG.get(), MintHumbugEntity.setAttributes());
        event.put(EntityTypesInit.MINT_HUMBULL.get(), MintHumbullEntity.setAttributes());
        event.put(EntityTypesInit.MINT_HUMPUG.get(), MintHumpugEntity.setAttributes());
        event.put(EntityTypesInit.CHOCOLATEPENGUIN.get(), ChocolatePenguinEntity.setAttributes());
        event.put(EntityTypesInit.JELLYBABY.get(), JellybabyEntity.setAttributes());

        event.put(EntityTypesInit.SNSCANDYCANEFISH.get(), SNSCandyCanefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSICFISH.get(), SNSICFishEntity.setAttributes());
        event.put(EntityTypesInit.SNSWHALE.get(), SNSWhaleEntity.setAttributes());
        event.put(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSDOLPHIN.get(), SNSDolphinEntity.setAttributes());
        event.put(EntityTypesInit.GUMMYFISH.get(), GummyfishEntity.setAttributes());

        event.put(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyEntity.setAttributes());

        event.put(EntityTypesInit.RSWMUMMY.get(), RSWMummyEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherEntity.createAttributes());
        event.put(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookEntity.createAttributes());
        event.put(EntityTypesInit.MINTIMPERIAL.get(), MintImperialEntity.createAttributes());

    }
}
