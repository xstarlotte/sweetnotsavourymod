package com.charlotte.sweetnotsavourymod.common.recipe;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<IceCreamMachineRecipe>> ICE_CREAM_MACHINE_SERIALIZER =
            SERIALIZERS.register("ice_creaming", () -> IceCreamMachineRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<JamPresserRecipe>> JAM_PRESSER_SERIALIZER =
            SERIALIZERS.register("jam_pressing", () -> JamPresserRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<CandycaneFurnaceRecipe>> CANDYCANE_FURNACE_SERIALIZER =
            SERIALIZERS.register("candycane_smelting", () -> CandycaneFurnaceRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<TeddyBearPrinterRecipe>> TEDDY_BEAR_PRINTER_SERIALIZER =
            SERIALIZERS.register("teddy_bear_printing", () -> TeddyBearPrinterRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<CakeBakerRecipe>> CAKE_BAKER_SERIALIZER =
            SERIALIZERS.register("cake_baking", () -> CakeBakerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
