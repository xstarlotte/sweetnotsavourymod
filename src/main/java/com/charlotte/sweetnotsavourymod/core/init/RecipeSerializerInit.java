package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.recipe.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeSerializerInit {

    private static final DeferredRegister<RecipeSerializer<?>> REGISTER = DeferredRegister.create(ForgeRegistries.Keys.RECIPE_SERIALIZERS, SweetNotSavouryMod.MOD_ID);

    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }

    public static final RegistryObject<RecipeSerializer<?>> ICE_CREAM_SERIALIZER = REGISTER.register("ice_creaming", IceCreamMachineRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<?>> JAM_PRESSER_SERIALIZER = REGISTER.register("jam_pressing", JamPresserRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<?>> CAKE_BAKER_SERIALIZER = REGISTER.register("cake_baking", CakeBakerRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<?>> TEDDY_BEAR_PRINTING_SERIALIZER = REGISTER.register("teddy_bear_printing", TeddyBearPrinterRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<?>> CANDYCANE_SMELTING_SERIALIZER = REGISTER.register("candycane_smelting", CandycaneFurnaceRecipe.Serializer::new);
}
