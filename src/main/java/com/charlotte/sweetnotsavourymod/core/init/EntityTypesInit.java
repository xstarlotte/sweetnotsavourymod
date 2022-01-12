package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.gummybears.SNSGummyBearEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pretzelflies.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.waferschunds.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSMiniWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBArcherEntity;

import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.SNSCandyCaneWolfEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			SweetNotSavouryMod.MOD_ID);

	public static final RegistryObject<EntityType<SNSPugEntity>>SNSPUG = ENTITY_TYPES
			.register("snspug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snspug").toString()));

	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>SNSICECREAMPUG = ENTITY_TYPES
			.register("snsicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsicecreampug").toString()));

	public static final RegistryObject<EntityType<SNSElfEntity>>SNSELF = ENTITY_TYPES
			.register("snself", () -> EntityType.Builder.of(SNSElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snself").toString()));

	public static final RegistryObject<EntityType<SNSParrotEntity>>SNSPARROT = ENTITY_TYPES
			.register("snsparrot", () -> EntityType.Builder.of(SNSParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsparrot").toString()));

	public static final RegistryObject<EntityType<SNSIceCreamParrotEntity>>SNSICECREAMPARROT = ENTITY_TYPES
			.register("snsicecreamparrot", () -> EntityType.Builder.of(SNSIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsicecreamparrot").toString()));

	public static final RegistryObject<EntityType<SNSRabbitEntity>>SNSRABBIT = ENTITY_TYPES
			.register("snsrabbit", () -> EntityType.Builder.of(SNSRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsrabbit").toString()));

	public static final RegistryObject<EntityType<SNSParfaitPixieEntity>> SNSPARFAITPIXIE = ENTITY_TYPES
			.register("snsparfaitpixie", () -> EntityType.Builder.of(SNSParfaitPixieEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsparfaitpixie").toString()));

	public static final RegistryObject<EntityType<SNSCandyCaneWolfEntity>> SNSCCWOLF = ENTITY_TYPES
			.register("snsccwolf", () -> EntityType.Builder.of(SNSCandyCaneWolfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsccwolf").toString()));

	public static final RegistryObject<EntityType<SNSMouseEntity>> SNSMOUSE = ENTITY_TYPES
			.register("snsmouse", () -> EntityType.Builder.of(SNSMouseEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsmouse").toString()));

	public static final RegistryObject<EntityType<SNSSquirrollEntity>> SNSSQUIRROLL = ENTITY_TYPES
			.register("snssquirroll", () -> EntityType.Builder.of(SNSSquirrollEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snssquirroll").toString()));

	public static final RegistryObject<EntityType<SNSZebraEntity>> SNSZEBRA = ENTITY_TYPES
			.register("snszebra", () -> EntityType.Builder.of(SNSZebraEntity::new, MobCategory.CREATURE)
					.sized(1.2f, 1.2f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snszebra").toString()));

	public static final RegistryObject<EntityType<SNSToadEntity>> SNSTOAD = ENTITY_TYPES
			.register("snstoad", () -> EntityType.Builder.of(SNSToadEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snstoad").toString()));

	public static final RegistryObject<EntityType<SNSWaferschundEntity>> SNSWAFERSCHUND = ENTITY_TYPES
			.register("snswaferschund", () -> EntityType.Builder.of(SNSWaferschundEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snswaferschund").toString()));

	public static final RegistryObject<EntityType<SNSWafflefishEntity>> SNSWAFFLEFISH = ENTITY_TYPES
			.register("snswafflefish", () -> EntityType.Builder.of(SNSWafflefishEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snswafflefish").toString()));

	public static final RegistryObject<EntityType<SNSMiniWafflefishEntity>> SNSMINIWAFFLEFISH = ENTITY_TYPES
			.register("snsminiwafflefish", () -> EntityType.Builder.of(SNSMiniWafflefishEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsminiwafflefish").toString()));

	public static final RegistryObject<EntityType<SNSPretzelflyEntity>> SNSPRETZELFLY = ENTITY_TYPES
			.register("snspretzelfly", () -> EntityType.Builder.of(SNSPretzelflyEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snspretzelfly").toString()));

	public static final RegistryObject<EntityType<SNSGummyBearEntity>> SNSGUMMYBEAR = ENTITY_TYPES
			.register("snsgummybear", () -> EntityType.Builder.of(SNSGummyBearEntity::new, MobCategory.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsgummybear").toString()));



	//public static final RegistryObject<EntityType<BananaMonkeyEntity>>BANANAMONKEY = ENTITY_TYPES
	//		.register("bananamonkey", () -> EntityType.Builder.of(BananaMonkeyEntity::new, MobCategory.CREATURE)
	//				.sized(0.6f, 0.6f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkey").toString()));
	//
	//public static final RegistryObject<EntityType<BananaMonkeyKingEntity>>BANANAMONKEYKING = ENTITY_TYPES
	//		.register("bananamonkeyking", () -> EntityType.Builder.of(BananaMonkeyKingEntity::new, MobCategory.CREATURE)
	//				.sized(0.6f, 0.6f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkeyking").toString()));

	/*public static final RegistryObject<EntityType<PBAttackerEntity>> POISONBERRYATTACKER = ENTITY_TYPES
			.register("poisonberryattacker", () -> EntityType.Builder.of(PBAttackerEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryattacker").toString()));

	public static final RegistryObject<EntityType<PBArcherEntity>> POISONBERRYARCHER = ENTITY_TYPES
			.register("poisonberryarcher", () -> EntityType.Builder.of( PBArcherEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryarcher").toString()));

	//public static final RegistryObject<EntityType<PoisonBerrySpriteEntity>> POISONBERRYSPRITE = ENTITY_TYPES
	//		.register("poisonberrysprite", () -> EntityType.Builder.of(PoisonBerrySpriteEntity::new, MobCategory.MONSTER)
	//				.sized(0.5f, 0.5f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrysprite").toString()));


*/


	
	
	
}
