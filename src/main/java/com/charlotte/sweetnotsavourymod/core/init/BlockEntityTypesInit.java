package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityTypesInit{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister
            .create ( ForgeRegistries.BLOCK_ENTITIES , SweetNotSavouryMod.MOD_ID );

    public static final RegistryObject<BlockEntityType<BlackberryIceCreamBedBlockEntity>> SNS_BLACKBERRY_BED_ENTITY_TYPE
            = BLOCK_ENTITY_TYPE.register("sns_bed_entity", () -> BlockEntityType.Builder.of(BlackberryIceCreamBedBlockEntity::new,
                    BlockInit.BLACKBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<StrawberryIceCreamBedBlockEntity>> SNS_STRAWBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_strawberrybed_entity", () -> BlockEntityType.Builder.of(StrawberryIceCreamBedBlockEntity::new,
                    BlockInit.STRAWBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<RaspberryIceCreamBedBlockEntity>> SNS_RASPBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_raspberrybed_entity", () -> BlockEntityType.Builder.of(RaspberryIceCreamBedBlockEntity::new,
                    BlockInit.RASPBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueberryIceCreamBedBlockEntity>> SNS_BLUEBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blueberrybed_entity", () -> BlockEntityType.Builder.of(BlueberryIceCreamBedBlockEntity::new,
                    BlockInit.BLUEBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<LemonIceCreamBedBlockEntity>> SNS_LEMON_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_lemonbed_entity", () -> BlockEntityType.Builder.of(LemonIceCreamBedBlockEntity::new,
                    BlockInit.LEMONICECREAMBED.get()).build(null));
}