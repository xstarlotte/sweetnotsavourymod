package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class FluidInit {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.Keys.FLUIDS, SweetNotSavouryMod.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<FluidType> CREAMY_MILK_TYPE = FLUID_TYPES.register("creamy_milk",
            () -> new FluidType(FluidType.Properties.create().density(15).lightLevel(2).viscosity(10)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.HONEY_DRINK)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public int getTintColor() {
                            return 0xbff4f2e2;
                        }

                        @Override
                        public ResourceLocation getStillTexture() {
                            return WATER_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return WATER_FLOWING_RL;
                        }

                        @Nullable
                        @Override
                        public ResourceLocation getOverlayTexture() {
                            return WATER_OVERLAY_RL;
                        }
                    });
                }
            });

    public static final RegistryObject<FlowingFluid> CREAMY_MILK_FLUID
            = FLUIDS.register("creamy_milk_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.CREAMY_MILK_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CREAMY_MILK_FLOWING
            = FLUIDS.register("creamy_milk_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.CREAMY_MILK_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CREAMY_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(CREAMY_MILK_TYPE, CREAMY_MILK_FLUID, CREAMY_MILK_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockInit.CREAMY_MILK_BLOCK).bucket(ItemInit.CREAMY_MILK_BUCKET);
}
