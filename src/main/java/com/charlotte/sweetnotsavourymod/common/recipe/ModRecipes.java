package com.charlotte.sweetnotsavourymod.common.recipe;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {
    public static final DeferredRegister<IRecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<IRecipeSerializer<IceCreamMachineRecipe>> ICE_CREAM_MACHINE_SERIALIZER =
            SERIALIZERS.register("ice_creaming", () -> IceCreamMachineRecipe.Serializer.INSTANCE);

    public static final RegistryObject<IRecipeSerializer<JamPresserRecipe>> JAM_PRESSER_SERIALIZER =
            SERIALIZERS.register("jam_pressing", () -> JamPresserRecipe.Serializer.INSTANCE);

    public static final RegistryObject<IRecipeSerializer<CandycaneFurnaceRecipe>> CANDYCANE_FURNACE_SERIALIZER =
            SERIALIZERS.register("candycane_smelting", () -> CandycaneFurnaceRecipe.Serializer.INSTANCE);

    public static final RegistryObject<IRecipeSerializer<TeddyBearPrinterRecipe>> TEDDY_BEAR_PRINTER_SERIALIZER =
            SERIALIZERS.register("teddy_bear_printing", () -> TeddyBearPrinterRecipe.Serializer.INSTANCE);

    public static final RegistryObject<IRecipeSerializer<CakeBakerRecipe>> CAKE_BAKER_SERIALIZER =
            SERIALIZERS.register("cake_baking", () -> CakeBakerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
