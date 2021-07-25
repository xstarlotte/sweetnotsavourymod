package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<EntityType<PoisonBerryAttackerEntity>> POISONBERRYATTACKER = ENTITY_TYPES
			.register("poisonberryattacker", () -> EntityType.Builder.create(PoisonBerryAttackerEntity::new, EntityClassification.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryattacker").toString()));
	
}
