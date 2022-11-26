package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.amphibians.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.boats.ModBoatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCCCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCookieCatEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSLionEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSCandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fish.*;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mintimperials.MintImperialEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies.RSWMummyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBDefenderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.*;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSBoarryEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.BonbonbiniEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			SweetNotSavouryMod.MOD_ID);

	public static final RegistryObject<EntityType<SNSPugEntity>>SNSPUG = ENTITY_TYPES
			.register("snspug", () -> EntityType.Builder.of(SNSPugEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snspug").toString()));

	public static final RegistryObject<EntityType<ChocolateChickenEntity>>CHOCOLATECHICKEN = ENTITY_TYPES
			.register("chocolatechicken", () -> EntityType.Builder.of(ChocolateChickenEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatechicken").toString()));

	public static final RegistryObject<EntityType<SNSGPEntity>>SNSGP = ENTITY_TYPES
			.register("snsgp", () -> EntityType.Builder.of(SNSGPEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsgp").toString()));

	public static final RegistryObject<EntityType<IceCreamCowEntity>> ICECREAMCOW = ENTITY_TYPES
			.register("icecreamcow", () -> EntityType.Builder.of(IceCreamCowEntity::new, EntityClassification.CREATURE)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "icecreamcow").toString()));

	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>SNSICECREAMPUG = ENTITY_TYPES
			.register("snsicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsicecreampug").toString()));

	public static final RegistryObject<EntityType<SNSElfEntity>>SNSELF = ENTITY_TYPES
			.register("snself", () -> EntityType.Builder.of(SNSElfEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snself").toString()));

	public static final RegistryObject<EntityType<SNSParrotEntity>>SNSPARROT = ENTITY_TYPES
			.register("snsparrot", () -> EntityType.Builder.of(SNSParrotEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsparrot").toString()));

	public static final RegistryObject<EntityType<SNSIceCreamParrotEntity>>SNSICECREAMPARROT = ENTITY_TYPES
			.register("snsicecreamparrot", () -> EntityType.Builder.of(SNSIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsicecreamparrot").toString()));

	public static final RegistryObject<EntityType<SNSRabbitEntity>>SNSRABBIT = ENTITY_TYPES
			.register("snsrabbit", () -> EntityType.Builder.of(SNSRabbitEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsrabbit").toString()));

	public static final RegistryObject<EntityType<SNSParfaitPixieEntity>> SNSPARFAITPIXIE = ENTITY_TYPES
			.register("snsparfaitpixie", () -> EntityType.Builder.of(SNSParfaitPixieEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsparfaitpixie").toString()));

	public static final RegistryObject<EntityType<SNSCandyCaneWolfEntity>> SNSCCWOLF = ENTITY_TYPES
			.register("snsccwolf", () -> EntityType.Builder.of(SNSCandyCaneWolfEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsccwolf").toString()));

	public static final RegistryObject<EntityType<SNSMouseEntity>> SNSMOUSE = ENTITY_TYPES
			.register("snsmouse", () -> EntityType.Builder.of(SNSMouseEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsmouse").toString()));

	public static final RegistryObject<EntityType<SNSSquirrollEntity>> SNSSQUIRROLL = ENTITY_TYPES
			.register("snssquirroll", () -> EntityType.Builder.of(SNSSquirrollEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snssquirroll").toString()));

	public static final RegistryObject<EntityType<SNSChipmunkEntity>> SNSCHIPMUNK = ENTITY_TYPES
			.register("snschipmunk", () -> EntityType.Builder.of(SNSChipmunkEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snschipmunk").toString()));

	public static final RegistryObject<EntityType<SNSJamsterEntity>> SNSJAMSTER = ENTITY_TYPES
			.register("snsjamster", () -> EntityType.Builder.of(SNSJamsterEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsjamster").toString()));

	public static final RegistryObject<EntityType<SNSZebraEntity>> SNSZEBRA = ENTITY_TYPES
			.register("snszebra", () -> EntityType.Builder.of(SNSZebraEntity::new, EntityClassification.CREATURE)
					.sized(1.4f, 1.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snszebra").toString()));

	public static final RegistryObject<EntityType<SNSToadEntity>> SNSTOAD = ENTITY_TYPES
			.register("snstoad", () -> EntityType.Builder.of(SNSToadEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snstoad").toString()));

	public static final RegistryObject<EntityType<SNSWaferschundEntity>> SNSWAFERSCHUND = ENTITY_TYPES
			.register("snswaferschund", () -> EntityType.Builder.of(SNSWaferschundEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snswaferschund").toString()));


	public static final RegistryObject<EntityType<SNSGummyBearEntity>> SNSGUMMYBEAR = ENTITY_TYPES
			.register("snsgummybear", () -> EntityType.Builder.of(SNSGummyBearEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsgummybear").toString()));

	public static final RegistryObject<EntityType<SNSBoarryEntity>>SNSBOARRY = ENTITY_TYPES
			.register("snsboarry", () -> EntityType.Builder.of(SNSBoarryEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsboarry").toString()));

	public static final RegistryObject<EntityType<SNSSpiderEntity>>SNSSPIDER = ENTITY_TYPES
			.register("snsspider", () -> EntityType.Builder.of(SNSSpiderEntity::new, EntityClassification.CREATURE)
					.sized(0.3f, 0.3f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsspider").toString()));

	public static final RegistryObject<EntityType<SNSCCCatEntity>>SNSCCCAT = ENTITY_TYPES
			.register("snscccat", () -> EntityType.Builder.of(SNSCCCatEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snscccat").toString()));

	public static final RegistryObject<EntityType<SNSCookieCatEntity>>SNSCOOKIECAT = ENTITY_TYPES
			.register("snscookiecat", () -> EntityType.Builder.of(SNSCookieCatEntity::new, EntityClassification.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snscookiecat").toString()));

	public static final RegistryObject<EntityType<SNSUnicornEntity>>SNSUNICORN = ENTITY_TYPES
			.register("snsunicorn", () -> EntityType.Builder.of(SNSUnicornEntity::new, EntityClassification.CREATURE)
					.sized(1.4f, 1.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsunicorn").toString()));

	public static final RegistryObject<EntityType<SNSSheepEntity>>SNSSHEEP = ENTITY_TYPES
			.register("snssheep", () -> EntityType.Builder.of(SNSSheepEntity::new, EntityClassification.CREATURE)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snssheep").toString()));

	public static final RegistryObject<EntityType<SNSLionEntity>>SNSLION = ENTITY_TYPES
			.register("snslion", () -> EntityType.Builder.of(SNSLionEntity::new, EntityClassification.CREATURE)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snslion").toString()));

	public static final RegistryObject<EntityType<SNSSnakeEntity>>SNSSNAKE = ENTITY_TYPES
			.register("snssnake", () -> EntityType.Builder.of(SNSSnakeEntity::new, EntityClassification.CREATURE)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snssnake").toString()));

	public static final RegistryObject<EntityType<BonbonbiniEntity>>BONBONBINI = ENTITY_TYPES
			.register("bonbonbini", () -> EntityType.Builder.of(BonbonbiniEntity::new, EntityClassification.CREATURE)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bonbonbini").toString()));

//AMBIENT

	public static final RegistryObject<EntityType<SNSCandyCanefishEntity>> SNSCANDYCANEFISH = ENTITY_TYPES
			.register("snscandycanefish", () -> EntityType.Builder.of(SNSCandyCanefishEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snscandycanefish").toString()));

	public static final RegistryObject<EntityType<SNSWafflefishEntity>> SNSWAFFLEFISH = ENTITY_TYPES
			.register("snswafflefish", () -> EntityType.Builder.of(SNSWafflefishEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snswafflefish").toString()));

	public static final RegistryObject<EntityType<SNSWhaleEntity>> SNSWHALE = ENTITY_TYPES
			.register("snswhale", () -> EntityType.Builder.of(SNSWhaleEntity::new, EntityClassification.CREATURE)
					.sized(2f, 2f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snswhale").toString()));

	public static final RegistryObject<EntityType<SNSAngelFishEntity>> SNSANGELFISH = ENTITY_TYPES
			.register("snsangelfish", () -> EntityType.Builder.of(SNSAngelFishEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsangelfish").toString()));

	public static final RegistryObject<EntityType<SNSICFishEntity>> SNSICFISH = ENTITY_TYPES
			.register("snsicfish", () -> EntityType.Builder.of(SNSICFishEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsicfish").toString()));

	public static final RegistryObject<EntityType<SNSMiniWafflefishEntity>> SNSMINIWAFFLEFISH = ENTITY_TYPES
			.register("snsminiwafflefish", () -> EntityType.Builder.of(SNSMiniWafflefishEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsminiwafflefish").toString()));

	public static final RegistryObject<EntityType<SNSDolphinEntity>> SNSDOLPHIN = ENTITY_TYPES
			.register("snsdolphin", () -> EntityType.Builder.of(SNSDolphinEntity::new, EntityClassification.CREATURE)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsdolphin").toString()));

	public static final RegistryObject<EntityType<SNSPretzelflyEntity>> SNSPRETZELFLY = ENTITY_TYPES
			.register("snspretzelfly", () -> EntityType.Builder.of(SNSPretzelflyEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.4f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snspretzelfly").toString()));

//HOSTILE

	public static final RegistryObject<EntityType<CandyCaneCrookEntity>> CANDYCANECROOK = ENTITY_TYPES
			.register("candycanecrook", () -> EntityType.Builder.of(CandyCaneCrookEntity::new, EntityClassification.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "candycanecrook").toString()));

	public static final RegistryObject<EntityType<MintImperialEntity>> MINTIMPERIAL = ENTITY_TYPES
			.register("mintimperial", () -> EntityType.Builder.of(MintImperialEntity::new, EntityClassification.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "mintimperial").toString()));

	public static final RegistryObject<EntityType<RSWMummyEntity>> RSWMUMMY = ENTITY_TYPES
			.register("rswmummy", () -> EntityType.Builder.of(RSWMummyEntity::new, EntityClassification.MONSTER)
					.sized(1f, 1f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "rswmummy").toString()));

	public static final RegistryObject<EntityType<PBAttackerEntity>> POISONBERRYATTACKER = ENTITY_TYPES
			.register("poisonberryattacker", () -> EntityType.Builder.of(PBAttackerEntity::new, EntityClassification.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryattacker").toString()));

	public static final RegistryObject<EntityType<PBDefenderEntity>> POISONBERRYDEFENDER = ENTITY_TYPES
			.register("poisonberrydefender", () -> EntityType.Builder.of(PBDefenderEntity::new, EntityClassification.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrydefender").toString()));

	public static final RegistryObject<EntityType<PBArcherEntity>> POISONBERRYARCHER = ENTITY_TYPES
			.register("poisonberryarcher", () -> EntityType.Builder.of( PBArcherEntity::new, EntityClassification.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryarcher").toString()));

	//public static final RegistryObject<EntityType<PoisonBerrySpriteEntity>> POISONBERRYSPRITE = ENTITY_TYPES
	//		.register("poisonberrysprite", () -> EntityType.Builder.of(PoisonBerrySpriteEntity::new, EntityClassification.MONSTER)
	//				.sized(0.5f, 0.5f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrysprite").toString()));



//boats

	public static final RegistryObject<EntityType<ModBoatEntity>> BOAT_ENTITY =
			ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new,
							EntityClassification.MISC).fireImmune().sized(1.375F, 0.5625F)
					.setCustomClientFactory((spawnEntity, world) -> new ModBoatEntity(world, 0, 0, 0))
					.build("mod_boat"));




}
