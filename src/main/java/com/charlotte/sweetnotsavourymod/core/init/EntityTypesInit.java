package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyKingEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CinnamonSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonCurdCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerrySpriteEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RedVelvetCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberrySwissSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaElfEntity;
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

	public static final RegistryObject<EntityType<PoisonBerryArcherEntity>> POISONBERRYARCHER = ENTITY_TYPES
			.register("poisonberryarcher", () -> EntityType.Builder.create( PoisonBerryArcherEntity::new, EntityClassification.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryarcher").toString()));
	
	public static final RegistryObject<EntityType<PoisonBerrySpriteEntity>> POISONBERRYSPRITE = ENTITY_TYPES
			.register("poisonberrysprite", () -> EntityType.Builder.create(PoisonBerrySpriteEntity::new, EntityClassification.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrysprite").toString()));
	
	public static final RegistryObject<EntityType<StrawberryCheesecakeMouseEntity>> STRAWBERRYCHEESECAKEMOUSE = ENTITY_TYPES
			.register("strawberrycheesecakemouse", () -> EntityType.Builder.create(StrawberryCheesecakeMouseEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrycheesecakemouse").toString()));

	
	public static final RegistryObject<EntityType<StrawberryWaferschundEntity>> STRAWBERRYWAFERSCHUND = ENTITY_TYPES
			.register("strawberrywaferschund", () -> EntityType.Builder.create(StrawberryWaferschundEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrywaferschund").toString()));

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
	
	public static final RegistryObject<EntityType<LemonPugEntity>>LEMONPUG = ENTITY_TYPES
			.register("lemonpug", () -> EntityType.Builder.create(LemonPugEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonpug").toString()));
	
	public static final RegistryObject<EntityType<StrawberryElfEntity>>STRAWBERRYELF = ENTITY_TYPES
			.register("strawberryelf", () -> EntityType.Builder.create(StrawberryElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryelf").toString()));
	
	public static final RegistryObject<EntityType<LemonElfEntity>>LEMONELF = ENTITY_TYPES
			.register("lemonelf", () -> EntityType.Builder.create(LemonElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonelf").toString()));
	
	public static final RegistryObject<EntityType<BlueberryElfEntity>>BLUEBERRYELF = ENTITY_TYPES
			.register("blueberryelf", () -> EntityType.Builder.create(BlueberryElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryelf").toString()));
	
	public static final RegistryObject<EntityType<VanillaElfEntity>>VANILLAELF = ENTITY_TYPES
			.register("vanillaelf", () -> EntityType.Builder.create(VanillaElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillaelf").toString()));
	
	public static final RegistryObject<EntityType<RaspberryElfEntity>>RASPBERRYELF = ENTITY_TYPES
			.register("raspberryelf", () -> EntityType.Builder.create(RaspberryElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryelf").toString()));
	
	public static final RegistryObject<EntityType<OrangeElfEntity>>ORANGEELF = ENTITY_TYPES
			.register("orangeelf", () -> EntityType.Builder.create(OrangeElfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeelf").toString()));
	
	public static final RegistryObject<EntityType<BananaMonkeyEntity>>BANANAMONKEY = ENTITY_TYPES
			.register("bananamonkey", () -> EntityType.Builder.create(BananaMonkeyEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkey").toString()));
	
	public static final RegistryObject<EntityType<BananaMonkeyKingEntity>>BANANAMONKEYKING = ENTITY_TYPES
			.register("bananamonkeyking", () -> EntityType.Builder.create(BananaMonkeyKingEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkeyking").toString()));
	
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
	
	public static final RegistryObject<EntityType<VanillaCakeRabbitEntity>>VANILLACAKERABBIT = ENTITY_TYPES
			.register("vanillacakerabbit", () -> EntityType.Builder.create(VanillaCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillacakerabbit").toString()));
	
	public static final RegistryObject<EntityType<LemonCurdCakeRabbitEntity>>LEMONCURDCAKERABBIT = ENTITY_TYPES
			.register("lemoncurdcakerabbit", () -> EntityType.Builder.create(LemonCurdCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemoncurdcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<RedVelvetCakeRabbitEntity>>REDVELVETCAKERABBIT = ENTITY_TYPES
			.register("redvelvetcakerabbit", () -> EntityType.Builder.create(RedVelvetCakeRabbitEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "redvelvetcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ZebraCakeZebraEntity>>ZEBRACAKEZEBRA = ENTITY_TYPES
			.register("zebracakezebra", () -> EntityType.Builder.create(ZebraCakeZebraEntity::new, EntityClassification.CREATURE)
					.size(2.0f, 2.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "zebracakezebra").toString()));
	
	public static final RegistryObject<EntityType<CinnamonSquirrollEntity>>CINNAMONSQUIRROLL = ENTITY_TYPES
			.register("cinnamonsquirroll", () -> EntityType.Builder.create(CinnamonSquirrollEntity::new, EntityClassification.CREATURE)
					.size(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "cinnamonsquirroll").toString()));
	
	public static final RegistryObject<EntityType<StrawberrySwissSquirrollEntity>>STRAWBERRYSWISSSQUIRROLL = ENTITY_TYPES
			.register("strawberryswisssquirroll", () -> EntityType.Builder.create(StrawberrySwissSquirrollEntity::new, EntityClassification.CREATURE)
					.size(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryswisssquirroll").toString()));
	
	public static final RegistryObject<EntityType<ToffeeToadEntity>>TOFFEETOAD = ENTITY_TYPES
			.register("toffeetoad", () -> EntityType.Builder.create(ToffeeToadEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeetoad").toString()));
	
	public static final RegistryObject<EntityType<LemonParrotEntity>>LEMONPARROT = ENTITY_TYPES
			.register("lemonparrot", () -> EntityType.Builder.create(LemonParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonparrot").toString()));
	
	public static final RegistryObject<EntityType<LemonIceCreamParrotEntity>>LEMONICECREAMPARROT = ENTITY_TYPES
			.register("lemonicecreamparrot", () -> EntityType.Builder.create(LemonIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<StrawberryIceCreamParrotEntity>>STRAWBERRYICECREAMPARROT = ENTITY_TYPES
			.register("strawberryicecreamparrot", () -> EntityType.Builder.create(StrawberryIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<BlueberryIceCreamParrotEntity>>BLUEBERRYICECREAMPARROT = ENTITY_TYPES
			.register("blueberryicecreamparrot", () -> EntityType.Builder.create(BlueberryIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<RaspberryIceCreamParrotEntity>>RASPBERRYICECREAMPARROT = ENTITY_TYPES
			.register("raspberryicecreamparrot", () -> EntityType.Builder.create(RaspberryIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<ChocolateIceCreamParrotEntity>>CHOCOLATEICECREAMPARROT = ENTITY_TYPES
			.register("chocolateicecreamparrot", () -> EntityType.Builder.create(ChocolateIceCreamParrotEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<CandyCaneWolfEntity>>CANDYCANEWOLF = ENTITY_TYPES
			.register("candycanewolf", () -> EntityType.Builder.create(CandyCaneWolfEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "candycanewolf").toString()));
	
	
	
}
