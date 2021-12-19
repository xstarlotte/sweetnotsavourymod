package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityTypesInit{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister
            .create ( ForgeRegistries.BLOCK_ENTITIES , SweetNotSavouryMod.MOD_ID );

    public static final RegistryObject<BlockEntityType<SNSBedBlockEntity>> SNS_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_bed_entity", () -> BlockEntityType.Builder.of(SNSBedBlockEntity::new,
                    BlockInit.BLACKBERRYICECREAMBED.get()).build(null));
}
