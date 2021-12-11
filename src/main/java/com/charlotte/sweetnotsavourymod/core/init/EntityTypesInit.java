package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.LemonElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.HazelnutCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.MarshmallowPieMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.StrawberryCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.monkeys.BananaMonkeyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.monkeys.BananaMonkeyKingEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryParrotEntity;
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
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerrySpriteEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ChocolatePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.RaspberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.LemonCurdCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.RedVelvetCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.VanillaCakeRabbitEntity;
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
			.register("poisonberryattacker", () -> EntityType.Builder.create(PoisonBerryAttackerEntity::new, MobCategory.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryattacker").toString()));

	public static final RegistryObject<EntityType<PoisonBerryArcherEntity>> POISONBERRYARCHER = ENTITY_TYPES
			.register("poisonberryarcher", () -> EntityType.Builder.create( PoisonBerryArcherEntity::new, MobCategory.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberryarcher").toString()));
	
	public static final RegistryObject<EntityType<PoisonBerrySpriteEntity>> POISONBERRYSPRITE = ENTITY_TYPES
			.register("poisonberrysprite", () -> EntityType.Builder.create(PoisonBerrySpriteEntity::new, MobCategory.MONSTER)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "poisonberrysprite").toString()));
	


	
	public static final RegistryObject<EntityType<StrawberryWaferschundEntity>> STRAWBERRYWAFERSCHUND = ENTITY_TYPES
			.register("strawberrywaferschund", () -> EntityType.Builder.create(StrawberryWaferschundEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrywaferschund").toString()));
	
	public static final RegistryObject<EntityType<StrawberryParfaitPixieEntity>> STRAWBERRYPARFAITPIXIE = ENTITY_TYPES
			.register("strawberryparfaitpixie", () -> EntityType.Builder.create(StrawberryParfaitPixieEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryparfaitpixie").toString()));

	public static final RegistryObject<EntityType<BlueberryParfaitPixieEntity>> BLUEBERRYPARFAITPIXIE = ENTITY_TYPES
			.register("blueberryparfaitpixie", () -> EntityType.Builder.create(BlueberryParfaitPixieEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryparfaitpixie").toString()));

	//mice
	
	public static final RegistryObject<EntityType<StrawberryCheesecakeMouseEntity>> STRAWBERRYCHEESECAKEMOUSE = ENTITY_TYPES
			.register("strawberrycheesecakemouse", () -> EntityType.Builder.create(StrawberryCheesecakeMouseEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrycheesecakemouse").toString()));
	
	public static final RegistryObject<EntityType<HazelnutCheesecakeMouseEntity>> HAZELNUTCHEESECAKEMOUSE = ENTITY_TYPES
			.register("hazelnutcheesecakemouse", () -> EntityType.Builder.create(HazelnutCheesecakeMouseEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "hazelnutcheesecakemouse").toString()));
	
	public static final RegistryObject<EntityType<MarshmallowPieMouseEntity>> MARSHMALLOWPIEMOUSE = ENTITY_TYPES
			.register("marshmallowpiemouse", () -> EntityType.Builder.create(MarshmallowPieMouseEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "marshmallowpiemouse").toString()));
	
//pugs
	
	public static final RegistryObject<EntityType<StrawberryPugEntity>> STRAWBERRYPUG = ENTITY_TYPES
			.register("strawberrypug", () -> EntityType.Builder.create(StrawberryPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberrypug").toString()));
	
	public static final RegistryObject<EntityType<BlueberryPugEntity>> BLUEBERRYPUG = ENTITY_TYPES
			.register("blueberrypug", () -> EntityType.Builder.create(BlueberryPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberrypug").toString()));
	
	public static final RegistryObject<EntityType<RaspberryPugEntity>> RASPBERRYPUG = ENTITY_TYPES
			.register("raspberrypug", () -> EntityType.Builder.create(RaspberryPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberrypug").toString()));
	
	public static final RegistryObject<EntityType<ChocolatePugEntity>> CHOCOLATEPUG = ENTITY_TYPES
			.register("chocolatepug", () -> EntityType.Builder.create(ChocolatePugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatepug").toString()));
	
	public static final RegistryObject<EntityType<ToffeePugEntity>> TOFFEEPUG = ENTITY_TYPES
			.register("toffeepug", () -> EntityType.Builder.create(ToffeePugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeepug").toString()));
	
	public static final RegistryObject<EntityType<OrangePugEntity>> ORANGEPUG = ENTITY_TYPES
			.register("orangepug", () -> EntityType.Builder.create(OrangePugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangepug").toString()));
	
	public static final RegistryObject<EntityType<ToffeeIceCreamPugEntity>> TOFFEEICECREAMPUG = ENTITY_TYPES
			.register("toffeeicecreampug", () -> EntityType.Builder.create(ToffeeIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeeicecreampug").toString()));
	
	public static final RegistryObject<EntityType<BlueberryIceCreamPugEntity>>BLUEBERRYICECREAMPUG = ENTITY_TYPES
			.register("blueberryicecreampug", () -> EntityType.Builder.create(BlueberryIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<ChocolateIceCreamPugEntity>>CHOCOLATEICECREAMPUG = ENTITY_TYPES
			.register("chocolateicecreampug", () -> EntityType.Builder.create(ChocolateIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreampug").toString()));
	
	public static final RegistryObject<EntityType<RaspberryIceCreamPugEntity>>RASPBERRYICECREAMPUG = ENTITY_TYPES
			.register("raspberryicecreampug", () -> EntityType.Builder.create(RaspberryIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<StrawberryIceCreamPugEntity>>STRAWBERRYICECREAMPUG = ENTITY_TYPES
			.register("strawberryicecreampug", () -> EntityType.Builder.create(StrawberryIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreampug").toString()));
	
	public static final RegistryObject<EntityType<OrangeIceCreamPugEntity>>ORANGEICECREAMPUG = ENTITY_TYPES
			.register("orangeicecreampug", () -> EntityType.Builder.create(OrangeIceCreamPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeicecreampug").toString()));
	
	public static final RegistryObject<EntityType<LemonPugEntity>>LEMONPUG = ENTITY_TYPES
			.register("lemonpug", () -> EntityType.Builder.create(LemonPugEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonpug").toString()));
	
	public static final RegistryObject<EntityType<StrawberryElfEntity>>STRAWBERRYELF = ENTITY_TYPES
			.register("strawberryelf", () -> EntityType.Builder.create(StrawberryElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryelf").toString()));
	
	public static final RegistryObject<EntityType<LemonElfEntity>>LEMONELF = ENTITY_TYPES
			.register("lemonelf", () -> EntityType.Builder.create(LemonElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonelf").toString()));
	
	public static final RegistryObject<EntityType<BlueberryElfEntity>>BLUEBERRYELF = ENTITY_TYPES
			.register("blueberryelf", () -> EntityType.Builder.create(BlueberryElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryelf").toString()));
	
	public static final RegistryObject<EntityType<VanillaElfEntity>>VANILLAELF = ENTITY_TYPES
			.register("vanillaelf", () -> EntityType.Builder.create(VanillaElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillaelf").toString()));
	
	public static final RegistryObject<EntityType<RaspberryElfEntity>>RASPBERRYELF = ENTITY_TYPES
			.register("raspberryelf", () -> EntityType.Builder.create(RaspberryElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryelf").toString()));
	
	public static final RegistryObject<EntityType<OrangeElfEntity>>ORANGEELF = ENTITY_TYPES
			.register("orangeelf", () -> EntityType.Builder.create(OrangeElfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeelf").toString()));
	
	public static final RegistryObject<EntityType<BananaMonkeyEntity>>BANANAMONKEY = ENTITY_TYPES
			.register("bananamonkey", () -> EntityType.Builder.create(BananaMonkeyEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkey").toString()));
	
	public static final RegistryObject<EntityType<BananaMonkeyKingEntity>>BANANAMONKEYKING = ENTITY_TYPES
			.register("bananamonkeyking", () -> EntityType.Builder.create(BananaMonkeyKingEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananamonkeyking").toString()));
	

	
	public static final RegistryObject<EntityType<CarrotCakeRabbitEntity>>CARROTCAKERABBIT = ENTITY_TYPES
			.register("carrotcakerabbit", () -> EntityType.Builder.create(CarrotCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "carrotcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ChocolateCherryCakeRabbitEntity>>CHOCOLATECHERRYCAKERABBIT = ENTITY_TYPES
			.register("chocolatecherrycakerabbit", () -> EntityType.Builder.create(ChocolateCherryCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolatecherrycakerabbit").toString()));
	
	public static final RegistryObject<EntityType<BananaBreadRabbitEntity>>BANANABREADRABBIT = ENTITY_TYPES
			.register("bananabreadrabbit", () -> EntityType.Builder.create(BananaBreadRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "bananabreadrabbit").toString()));
	
	public static final RegistryObject<EntityType<AngelCakeRabbitEntity>>ANGELCAKERABBIT = ENTITY_TYPES
			.register("angelcakerabbit", () -> EntityType.Builder.create(AngelCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "angelcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<VanillaCakeRabbitEntity>>VANILLACAKERABBIT = ENTITY_TYPES
			.register("vanillacakerabbit", () -> EntityType.Builder.create(VanillaCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "vanillacakerabbit").toString()));
	
	public static final RegistryObject<EntityType<LemonCurdCakeRabbitEntity>>LEMONCURDCAKERABBIT = ENTITY_TYPES
			.register("lemoncurdcakerabbit", () -> EntityType.Builder.create(LemonCurdCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemoncurdcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<RedVelvetCakeRabbitEntity>>REDVELVETCAKERABBIT = ENTITY_TYPES
			.register("redvelvetcakerabbit", () -> EntityType.Builder.create(RedVelvetCakeRabbitEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "redvelvetcakerabbit").toString()));
	
	public static final RegistryObject<EntityType<ZebraCakeZebraEntity>>ZEBRACAKEZEBRA = ENTITY_TYPES
			.register("zebracakezebra", () -> EntityType.Builder.create(ZebraCakeZebraEntity::new, MobCategory.CREATURE)
					.size(2.0f, 2.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "zebracakezebra").toString()));
	
	public static final RegistryObject<EntityType<CinnamonSquirrollEntity>>CINNAMONSQUIRROLL = ENTITY_TYPES
			.register("cinnamonsquirroll", () -> EntityType.Builder.create(CinnamonSquirrollEntity::new, MobCategory.CREATURE)
					.size(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "cinnamonsquirroll").toString()));
	
	public static final RegistryObject<EntityType<StrawberrySwissSquirrollEntity>>STRAWBERRYSWISSSQUIRROLL = ENTITY_TYPES
			.register("strawberryswisssquirroll", () -> EntityType.Builder.create(StrawberrySwissSquirrollEntity::new, MobCategory.CREATURE)
					.size(1.0f, 1.0f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryswisssquirroll").toString()));
	
	public static final RegistryObject<EntityType<ToffeeToadEntity>>TOFFEETOAD = ENTITY_TYPES
			.register("toffeetoad", () -> EntityType.Builder.create(ToffeeToadEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeetoad").toString()));
	
//parrots
	
	public static final RegistryObject<EntityType<LemonParrotEntity>>LEMONPARROT = ENTITY_TYPES
			.register("lemonparrot", () -> EntityType.Builder.create(LemonParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonparrot").toString()));
	
	public static final RegistryObject<EntityType<BlueberryParrotEntity>>BLUEBERRYPARROT = ENTITY_TYPES
			.register("blueberryparrot", () -> EntityType.Builder.create(BlueberryParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryparrot").toString()));
	
	public static final RegistryObject<EntityType<RaspberryParrotEntity>>RASPBERRYPARROT = ENTITY_TYPES
			.register("raspberryparrot", () -> EntityType.Builder.create(RaspberryParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryparrot").toString()));
	
	public static final RegistryObject<EntityType<PineappleParrotEntity>>PINEAPPLEPARROT = ENTITY_TYPES
			.register("pineappleparrot", () -> EntityType.Builder.create(PineappleParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "pineappleparrot").toString()));
	
	public static final RegistryObject<EntityType<OrangeParrotEntity>>ORANGEPARROT = ENTITY_TYPES
			.register("orangeparrot", () -> EntityType.Builder.create(OrangeParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeparrot").toString()));
	
	public static final RegistryObject<EntityType<PeachParrotEntity>>PEACHPARROT = ENTITY_TYPES
			.register("peachparrot", () -> EntityType.Builder.create(PeachParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "peachparrot").toString()));
	
	public static final RegistryObject<EntityType<OrangeIceCreamParrotEntity>>ORANGEICECREAMPARROT = ENTITY_TYPES
			.register("orangeicecreamparrot", () -> EntityType.Builder.create(OrangeIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "orangeicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<PeachIceCreamParrotEntity>>PEACHICECREAMPARROT = ENTITY_TYPES
			.register("peachicecreamparrot", () -> EntityType.Builder.create(PeachIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "peachicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<ToffeeIceCreamParrotEntity>>TOFFEEICECREAMPARROT = ENTITY_TYPES
			.register("toffeeicecreamparrot", () -> EntityType.Builder.create(ToffeeIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "toffeeicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<StrawberryParrotEntity>>STRAWBERRYPARROT = ENTITY_TYPES
			.register("strawberryparrot", () -> EntityType.Builder.create(StrawberryParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryparrot").toString()));
	
	public static final RegistryObject<EntityType<LemonIceCreamParrotEntity>>LEMONICECREAMPARROT = ENTITY_TYPES
			.register("lemonicecreamparrot", () -> EntityType.Builder.create(LemonIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "lemonicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<StrawberryIceCreamParrotEntity>>STRAWBERRYICECREAMPARROT = ENTITY_TYPES
			.register("strawberryicecreamparrot", () -> EntityType.Builder.create(StrawberryIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "strawberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<BlueberryIceCreamParrotEntity>>BLUEBERRYICECREAMPARROT = ENTITY_TYPES
			.register("blueberryicecreamparrot", () -> EntityType.Builder.create(BlueberryIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "blueberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<RaspberryIceCreamParrotEntity>>RASPBERRYICECREAMPARROT = ENTITY_TYPES
			.register("raspberryicecreamparrot", () -> EntityType.Builder.create(RaspberryIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "raspberryicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<ChocolateIceCreamParrotEntity>>CHOCOLATEICECREAMPARROT = ENTITY_TYPES
			.register("chocolateicecreamparrot", () -> EntityType.Builder.create(ChocolateIceCreamParrotEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "chocolateicecreamparrot").toString()));
	
	public static final RegistryObject<EntityType<CandyCaneWolfEntity>> CANDYCANEWOLF = ENTITY_TYPES
			.register("candycanewolf", () -> EntityType.Builder.create(CandyCaneWolfEntity::new, MobCategory.CREATURE)
					.size(0.6f, 0.6f)
					.build(new ResourceLocation(SweetNotSavouryMod.MOD_ID, "candycanewolf").toString()));
	
	
	
}
