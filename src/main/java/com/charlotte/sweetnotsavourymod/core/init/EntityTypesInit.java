package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;

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
	
	public static final RegistryObject<EntityType<StrawberryPugEntity>> STRAWBERRYPUG = ENTITY_TYPES
			.register("strawberrypug", () -> EntityType.Builder.create(StrawberryPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrypug").toString()));
	
	public static final RegistryObject<EntityType<ToffeeIceCreamPugEntity>> TOFFEEICECREAMPUG = ENTITY_TYPES
			.register("toffeeicecreampug", () -> EntityType.Builder.create(ToffeeIceCreamPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeeicecreampug").toString()));
	
	public static final RegistryObject<EntityType<BlueberryIceCreamPugEntity>>BLUEBERRYICECREAMPUG = ENTITY_TYPES
			.register("blueberryicecreampug", () -> EntityType.Builder.create(BlueberryIceCreamPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<ChocolateIceCreamPugEntity>>CHOCOLATEICECREAMPUG = ENTITY_TYPES
			.register("chocolateicecreampug", () -> EntityType.Builder.create(ChocolateIceCreamPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreampug").toString()));
	
	public static final RegistryObject<EntityType<RaspberryIceCreamPugEntity>>RASPBERRYICECREAMPUG = ENTITY_TYPES
			.register("raspberryicecreampug", () -> EntityType.Builder.create(RaspberryIceCreamPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<StrawberryIceCreamPugEntity>>STRAWBERRYICECREAMPUG = ENTITY_TYPES
			.register("strawberryicecreampug", () -> EntityType.Builder.create(StrawberryIceCreamPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<StrawberryElfEntity>>STRAWBERRYELF = ENTITY_TYPES
			.register("strawberryelf", () -> EntityType.Builder.create(StrawberryElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryelf").toString()));
	
	public static final RegistryObject<EntityType<StrawberryPigEntity>>STRAWBERRYPIG = ENTITY_TYPES
			.register("strawberrypig", () -> EntityType.Builder.create(StrawberryPigEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrypig").toString()));
	
	public static final RegistryObject<EntityType<CarrotCakeRabbitEntity>>CARROTCAKERABBIT = ENTITY_TYPES
			.register("carrotcakerabbit", () -> EntityType.Builder.create(CarrotCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "carrotcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ChocolateCherryCakeRabbitEntity>>CHOCOLATECHERRYCAKERABBIT = ENTITY_TYPES
			.register("chocolatecherrycakerabbit", () -> EntityType.Builder.create(ChocolateCherryCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatecherrycakerabbit").toString()));
	
	public static final RegistryObject<EntityType<BananaBreadRabbitEntity>>BANANABREADRABBIT = ENTITY_TYPES
			.register("bananabreadrabbit", () -> EntityType.Builder.create(BananaBreadRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananabreadrabbit").toString()));
	
	public static final RegistryObject<EntityType<AngelCakeRabbitEntity>>ANGELCAKERABBIT = ENTITY_TYPES
			.register("angelcakerabbit", () -> EntityType.Builder.create(AngelCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "angelcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ZebraCakeZebraEntity>>ZEBRACAKEZEBRA = ENTITY_TYPES
			.register("zebracakezebra", () -> EntityType.Builder.create(ZebraCakeZebraEntity::new, EntityClassification.CREATURE)
					.size(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "zebracakezebra").toString()));
	
	
	
}
