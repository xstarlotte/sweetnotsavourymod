package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.HazelnutCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.MarshmallowPieMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.StrawberryCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PeachIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PeachParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PineappleParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.RaspberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.RaspberryParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ToffeeIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerryArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.*;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.CinnamonSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.StrawberrySwissSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.CandyCaneWolfEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<EntityType<PoisonBerryAttackerEntity>> POISONBERRYATTACKER = ENTITY_TYPES
			.register("poisonberryattacker", () -> EntityType.Builder.of(PoisonBerryAttackerEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryattacker").toString()));

	public static final RegistryObject<EntityType<PoisonBerryArcherEntity>> POISONBERRYARCHER = ENTITY_TYPES
			.register("poisonberryarcher", () -> EntityType.Builder.of( PoisonBerryArcherEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryarcher").toString()));
	
	//public static final RegistryObject<EntityType<PoisonBerrySpriteEntity>> POISONBERRYSPRITE = ENTITY_TYPES
	//		.register("poisonberrysprite", () -> EntityType.Builder.of(PoisonBerrySpriteEntity::new, MobCategory.MONSTER)
	//				.sized(0.5f, 0.5f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrysprite").toString()));
	


	
	public static final RegistryObject<EntityType<StrawberryWaferschundEntity>> STRAWBERRYWAFERSCHUND = ENTITY_TYPES
			.register("strawberrywaferschund", () -> EntityType.Builder.of(StrawberryWaferschundEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrywaferschund").toString()));
	
	public static final RegistryObject<EntityType<StrawberryParfaitPixieEntity>> STRAWBERRYPARFAITPIXIE = ENTITY_TYPES
			.register("strawberryparfaitpixie", () -> EntityType.Builder.of(StrawberryParfaitPixieEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryparfaitpixie").toString()));

	//public static final RegistryObject<EntityType<BlueberryParfaitPixieEntity>> BLUEBERRYPARFAITPIXIE = ENTITY_TYPES
	//		.register("blueberryparfaitpixie", () -> EntityType.Builder.of(BlueberryParfaitPixieEntity::new, MobCategory.CREATURE)
	//				.sized(0.6f, 0.6f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryparfaitpixie").toString()));

	//mice
	
	public static final RegistryObject<EntityType<StrawberryCheesecakeMouseEntity>> STRAWBERRYCHEESECAKEMOUSE = ENTITY_TYPES
			.register("strawberrycheesecakemouse", () -> EntityType.Builder.of(StrawberryCheesecakeMouseEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrycheesecakemouse").toString()));
	
	public static final RegistryObject<EntityType<HazelnutCheesecakeMouseEntity>> HAZELNUTCHEESECAKEMOUSE = ENTITY_TYPES
			.register("hazelnutcheesecakemouse", () -> EntityType.Builder.of(HazelnutCheesecakeMouseEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "hazelnutcheesecakemouse").toString()));
	
	public static final RegistryObject<EntityType<MarshmallowPieMouseEntity>> MARSHMALLOWPIEMOUSE = ENTITY_TYPES
			.register("marshmallowpiemouse", () -> EntityType.Builder.of(MarshmallowPieMouseEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "marshmallowpiemouse").toString()));
	
//pugs
	
	public static final RegistryObject<EntityType<SNSPugEntity>> STRAWBERRYPUG = ENTITY_TYPES
			.register("strawberrypug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrypug").toString()));
	
	public static final RegistryObject<EntityType<SNSPugEntity>> BLUEBERRYPUG = ENTITY_TYPES
			.register("blueberrypug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberrypug").toString()));
	
	public static final RegistryObject<EntityType<SNSPugEntity>> RASPBERRYPUG = ENTITY_TYPES
			.register("raspberrypug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberrypug").toString()));
	
	public static final RegistryObject<EntityType<SNSPugEntity>> CHOCOLATEPUG = ENTITY_TYPES
			.register("chocolatepug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatepug").toString()));
	
	public static final RegistryObject<EntityType<SNSPugEntity>> TOFFEEPUG = ENTITY_TYPES
			.register("toffeepug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeepug").toString()));
	
	public static final RegistryObject<EntityType<SNSPugEntity>> ORANGEPUG = ENTITY_TYPES
			.register("orangepug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangepug").toString()));

	public static final RegistryObject<EntityType<SNSPugEntity>>LEMONPUG = ENTITY_TYPES
			.register("lemonpug", () -> EntityType.Builder.of(SNSPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonpug").toString()));

	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>> TOFFEEICECREAMPUG = ENTITY_TYPES
			.register("toffeeicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeeicecreampug").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>BLUEBERRYICECREAMPUG = ENTITY_TYPES
			.register("blueberryicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>CHOCOLATEICECREAMPUG = ENTITY_TYPES
			.register("chocolateicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreampug").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>RASPBERRYICECREAMPUG = ENTITY_TYPES
			.register("raspberryicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>STRAWBERRYICECREAMPUG = ENTITY_TYPES
			.register("strawberryicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamPugEntity>>ORANGEICECREAMPUG = ENTITY_TYPES
			.register("orangeicecreampug", () -> EntityType.Builder.of(SNSIceCreamPugEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeicecreampug").toString()));

	public static final RegistryObject<EntityType<StrawberryElfEntity>>STRAWBERRYELF = ENTITY_TYPES
			.register("strawberryelf", () -> EntityType.Builder.of(StrawberryElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryelf").toString()));
	
	public static final RegistryObject<EntityType<SNSElfEntity>>LEMONELF = ENTITY_TYPES
			.register("lemonelf", () -> EntityType.Builder.of(SNSElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonelf").toString()));
	
	public static final RegistryObject<EntityType<BlueberryElfEntity>>BLUEBERRYELF = ENTITY_TYPES
			.register("blueberryelf", () -> EntityType.Builder.of(BlueberryElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryelf").toString()));
	
	public static final RegistryObject<EntityType<VanillaElfEntity>>VANILLAELF = ENTITY_TYPES
			.register("vanillaelf", () -> EntityType.Builder.of(VanillaElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillaelf").toString()));
	
	public static final RegistryObject<EntityType<RaspberryElfEntity>>RASPBERRYELF = ENTITY_TYPES
			.register("raspberryelf", () -> EntityType.Builder.of(RaspberryElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryelf").toString()));
	
	public static final RegistryObject<EntityType<OrangeElfEntity>>ORANGEELF = ENTITY_TYPES
			.register("orangeelf", () -> EntityType.Builder.of(OrangeElfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeelf").toString()));
	
	//public static final RegistryObject<EntityType<BananaMonkeyEntity>>BANANAMONKEY = ENTITY_TYPES
	//		.register("bananamonkey", () -> EntityType.Builder.of(BananaMonkeyEntity::new, MobCategory.CREATURE)
	//				.sized(0.6f, 0.6f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkey").toString()));
	//
	//public static final RegistryObject<EntityType<BananaMonkeyKingEntity>>BANANAMONKEYKING = ENTITY_TYPES
	//		.register("bananamonkeyking", () -> EntityType.Builder.of(BananaMonkeyKingEntity::new, MobCategory.CREATURE)
	//				.sized(0.6f, 0.6f)
	//				.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkeyking").toString()));
	

	
	public static final RegistryObject<EntityType<CarrotCakeRabbitEntity>>CARROTCAKERABBIT = ENTITY_TYPES
			.register("carrotcakerabbit", () -> EntityType.Builder.of(CarrotCakeRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "carrotcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ChocolateCherryCakeRabbitEntity>>CHOCOLATECHERRYCAKERABBIT = ENTITY_TYPES
			.register("chocolatecherrycakerabbit", () -> EntityType.Builder.of(ChocolateCherryCakeRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatecherrycakerabbit").toString()));
	
	public static final RegistryObject<EntityType<BananaBreadRabbitEntity>>BANANABREADRABBIT = ENTITY_TYPES
			.register("bananabreadrabbit", () -> EntityType.Builder.of(BananaBreadRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananabreadrabbit").toString()));
	
	public static final RegistryObject<EntityType<SNSRabbitEntity>>ANGELCAKERABBIT = ENTITY_TYPES
			.register("angelcakerabbit", () -> EntityType.Builder.of(SNSRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "angelcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<VanillaCakeRabbitEntity>>VANILLACAKERABBIT = ENTITY_TYPES
			.register("vanillacakerabbit", () -> EntityType.Builder.of(VanillaCakeRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillacakerabbit").toString()));
	
	public static final RegistryObject<EntityType<LemonCurdCakeRabbitEntity>>LEMONCURDCAKERABBIT = ENTITY_TYPES
			.register("lemoncurdcakerabbit", () -> EntityType.Builder.of(LemonCurdCakeRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemoncurdcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<RedVelvetCakeRabbitEntity>>REDVELVETCAKERABBIT = ENTITY_TYPES
			.register("redvelvetcakerabbit", () -> EntityType.Builder.of(RedVelvetCakeRabbitEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "redvelvetcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ZebraCakeZebraEntity>>ZEBRACAKEZEBRA = ENTITY_TYPES
			.register("zebracakezebra", () -> EntityType.Builder.of(ZebraCakeZebraEntity::new, MobCategory.CREATURE)
					.sized(2.0f, 2.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "zebracakezebra").toString()));
	
	public static final RegistryObject<EntityType<CinnamonSquirrollEntity>>CINNAMONSQUIRROLL = ENTITY_TYPES
			.register("cinnamonsquirroll", () -> EntityType.Builder.of(CinnamonSquirrollEntity::new, MobCategory.CREATURE)
					.sized(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "cinnamonsquirroll").toString()));
	
	public static final RegistryObject<EntityType<StrawberrySwissSquirrollEntity>>STRAWBERRYSWISSSQUIRROLL = ENTITY_TYPES
			.register("strawberryswisssquirroll", () -> EntityType.Builder.of(StrawberrySwissSquirrollEntity::new, MobCategory.CREATURE)
					.sized(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryswisssquirroll").toString()));
	
	public static final RegistryObject<EntityType<ToffeeToadEntity>>TOFFEETOAD = ENTITY_TYPES
			.register("toffeetoad", () -> EntityType.Builder.of(ToffeeToadEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeetoad").toString()));
	
//parrots
	
	public static final RegistryObject<EntityType<LemonParrotEntity>>LEMONPARROT = ENTITY_TYPES
			.register("lemonparrot", () -> EntityType.Builder.of(LemonParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonparrot").toString()));
	
	public static final RegistryObject<EntityType<SNSParrotEntity>>BLUEBERRYPARROT = ENTITY_TYPES
			.register("blueberryparrot", () -> EntityType.Builder.of(SNSParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryparrot").toString()));
	
	public static final RegistryObject<EntityType<RaspberryParrotEntity>>RASPBERRYPARROT = ENTITY_TYPES
			.register("raspberryparrot", () -> EntityType.Builder.of(RaspberryParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryparrot").toString()));
	
	public static final RegistryObject<EntityType<PineappleParrotEntity>>PINEAPPLEPARROT = ENTITY_TYPES
			.register("pineappleparrot", () -> EntityType.Builder.of(PineappleParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "pineappleparrot").toString()));
	
	public static final RegistryObject<EntityType<OrangeParrotEntity>>ORANGEPARROT = ENTITY_TYPES
			.register("orangeparrot", () -> EntityType.Builder.of(OrangeParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeparrot").toString()));
	
	public static final RegistryObject<EntityType<PeachParrotEntity>>PEACHPARROT = ENTITY_TYPES
			.register("peachparrot", () -> EntityType.Builder.of(PeachParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "peachparrot").toString()));
	
	public static final RegistryObject<EntityType<OrangeIceCreamParrotEntity>>ORANGEICECREAMPARROT = ENTITY_TYPES
			.register("orangeicecreamparrot", () -> EntityType.Builder.of(OrangeIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<PeachIceCreamParrotEntity>>PEACHICECREAMPARROT = ENTITY_TYPES
			.register("peachicecreamparrot", () -> EntityType.Builder.of(PeachIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "peachicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<ToffeeIceCreamParrotEntity>>TOFFEEICECREAMPARROT = ENTITY_TYPES
			.register("toffeeicecreamparrot", () -> EntityType.Builder.of(ToffeeIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeeicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<StrawberryParrotEntity>>STRAWBERRYPARROT = ENTITY_TYPES
			.register("strawberryparrot", () -> EntityType.Builder.of(StrawberryParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryparrot").toString()));
	
	public static final RegistryObject<EntityType<LemonIceCreamParrotEntity>>LEMONICECREAMPARROT = ENTITY_TYPES
			.register("lemonicecreamparrot", () -> EntityType.Builder.of(LemonIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<StrawberryIceCreamParrotEntity>>STRAWBERRYICECREAMPARROT = ENTITY_TYPES
			.register("strawberryicecreamparrot", () -> EntityType.Builder.of(StrawberryIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<SNSIceCreamParrotEntity>>BLUEBERRYICECREAMPARROT = ENTITY_TYPES
			.register("blueberryicecreamparrot", () -> EntityType.Builder.of(SNSIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<RaspberryIceCreamParrotEntity>>RASPBERRYICECREAMPARROT = ENTITY_TYPES
			.register("raspberryicecreamparrot", () -> EntityType.Builder.of(RaspberryIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<ChocolateIceCreamParrotEntity>>CHOCOLATEICECREAMPARROT = ENTITY_TYPES
			.register("chocolateicecreamparrot", () -> EntityType.Builder.of(ChocolateIceCreamParrotEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<CandyCaneWolfEntity>> CANDYCANEWOLF = ENTITY_TYPES
			.register("candycanewolf", () -> EntityType.Builder.of(CandyCaneWolfEntity::new, MobCategory.CREATURE)
					.sized(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "candycanewolf").toString()));
	
	
	
}
