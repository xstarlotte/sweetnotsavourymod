package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, SweetNotSavouryMod.MOD_ID);


    public static final RegistryObject<FlowingFluid> CREAMY_MILK_FLUID
            = FLUIDS.register("creamy_milk_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.CREAMY_MILK_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CREAMY_MILK_FLOWING
            = FLUIDS.register("creamy_milk_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.CREAMY_MILK_PROPERTIES));


    public static final ForgeFlowingFluid.Properties CREAMY_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CREAMY_MILK_FLUID.get(), () -> CREAMY_MILK_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(10).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xbff4f2e2)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> FluidInit.CREAMY_MILK_BLOCK.get()).bucket(() -> ItemInit.CREAMY_MILK_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> CREAMY_MILK_BLOCK = BlockInit.BLOCKS.register("creamy_milk",
            () -> new FlowingFluidBlock(() -> FluidInit.CREAMY_MILK_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));
    //FlowingFluidBlock
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
