package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.armor.StrawberryCandyArmorRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.angelfish.SNSAngelFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.boarries.SNSBoarryEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCCCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCookieCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.chipmunks.SNSChipmunkEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.common.entity.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.guineapigs.SNSGPEntity;
import com.charlotte.sweetnotsavourymod.common.entity.gummybears.SNSGummyBearEntity;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.jamsters.SNSJamsterEntity;
import com.charlotte.sweetnotsavourymod.common.entity.lions.SNSLionEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mummies.RSWMummyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBDefenderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pretzelflies.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import com.charlotte.sweetnotsavourymod.common.entity.spiders.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.unicorns.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.common.entity.waferschunds.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSMiniWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.whales.SNSWhaleEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.SNSCandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.common.item.StrawberryCandyArmorItem;
import com.charlotte.sweetnotsavourymod.common.recipe.IceCreamMachineRecipe;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

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
        event.put(EntityTypesInit.SNSCHIPMUNK.get(), SNSChipmunkEntity.setAttributes());
        event.put(EntityTypesInit.SNSZEBRA.get(), SNSZebraEntity.setAttributes());
        event.put(EntityTypesInit.SNSTOAD.get(), SNSToadEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundEntity.setAttributes());
        event.put(EntityTypesInit.SNSICFISH.get(), SNSICFishEntity.setAttributes());
        event.put(EntityTypesInit.SNSWHALE.get(), SNSWhaleEntity.setAttributes());
        event.put(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishEntity.setAttributes());
        event.put(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishEntity.setAttributes());
        event.put(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyEntity.setAttributes());
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
        event.put(EntityTypesInit.SNSLION.get(), SNSLionEntity.setAttributes());

        event.put(EntityTypesInit.RSWMUMMY.get(), RSWMummyEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderEntity.createAttributes());
        event.put(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherEntity.createAttributes());
        event.put(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookEntity.createAttributes());

    }

    @SubscribeEvent
    public static void registerRecipeTypes(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(StrawberryCandyArmorItem.class, new StrawberryCandyArmorRenderer());
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, IceCreamMachineRecipe.Type.ID, IceCreamMachineRecipe.Type.INSTANCE);
    }
}
