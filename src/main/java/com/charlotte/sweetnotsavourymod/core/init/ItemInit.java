package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.boats.ModBoatEntity;
import com.charlotte.sweetnotsavourymod.common.fuel.CandyCaneSugarFuel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.*;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.common.item.ModArmorMaterials;
import com.charlotte.sweetnotsavourymod.common.item.ModBoatItem;
import com.charlotte.sweetnotsavourymod.common.item.ModTiers;
import com.charlotte.sweetnotsavourymod.common.item.SweetTierTools.HerbSwordItem;
import com.charlotte.sweetnotsavourymod.common.item.SweetTierTools.SweetSwordItem;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.charlotte.sweetnotsavourymod.core.sound.SoundsInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetNotSavouryMod.MOD_ID);

//MUSIC_DISCS

	public static final RegistryObject<Item> CHIPTRONICAL_RECORD = ITEMS.register("chiptronical_record",
			() -> new RecordItem(4, SoundsInit.CHIPTRONICAL,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODMUSIC).stacksTo(1)));


//SPAWN EGGS

	//elf-Blackberry, Blueberry, Strawberry, Raspberry, Lemon, Orange, Vanilla, Chocolate, Toffee
	public static final RegistryObject<CustomSpawnEggItem> SNSELFSPAWNEGG = ITEMS.register("snselfspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSELF, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATECHICKENSPAWNEGG = ITEMS.register("chocolatechickenspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATECHICKEN, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSRABBITSPAWNEGG = ITEMS.register("snsrabbitspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSRABBIT, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	//parrot-Blackberry, Blueberry, Strawberry, Raspberry, Lemon, Orange, Vanilla, Chocolate, Toffee
	public static final RegistryObject<CustomSpawnEggItem> SNSPARROTSPAWNEGG = ITEMS.register("snsparrotspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSPARROT, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	//ice cream parrot-Blackberry, Blueberry, Strawberry, Raspberry, Lemon, Orange, Vanilla, Chocolate, Toffee
	public static final RegistryObject<CustomSpawnEggItem> SNSICECREAMPARROTSPAWNEGG = ITEMS.register("snsicecreamparrotspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSICECREAMPARROT, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSICECREAMPUGSPAWNEGG = ITEMS.register("snsicecreampugspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSICECREAMPUG, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPUGSPAWNEGG = ITEMS.register("snspugspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSPUG, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPARFAITPIXIESPAWNEGG = ITEMS.register("snsparfaitpixiespawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSPARFAITPIXIE, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSCCWOLFSPAWNEGG = ITEMS.register("snscandycanewolfspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSCCWOLF, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSMOUSESPAWNEGG = ITEMS.register("snsmousespawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSMOUSE, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPRETZELFLYSPAWNEGG = ITEMS.register("snspretzelflyspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSPRETZELFLY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSSQUIRROLLSPAWNEGG = ITEMS.register("snssquirrollspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSSQUIRROLL, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSCHIPMUNKSPAWNEGG = ITEMS.register("snschipmunkspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSCHIPMUNK, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSZEBRASPAWNEGG = ITEMS.register("snszebraspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSZEBRA, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSTOADSPAWNEGG = ITEMS.register("snstoadspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSTOAD, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSJAMSTERPAWNEGG = ITEMS.register("snsjamsterspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSJAMSTER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSWAFERSCHUNDSPAWNEGG = ITEMS.register("snswaferschundspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSWAFERSCHUND, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSWAFFLEFISHSPAWNEGG = ITEMS.register("snswafflefishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSWAFFLEFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSMINIWAFFLEFISHSPAWNEGG = ITEMS.register("snsminiwafflefishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSMINIWAFFLEFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSGUMMYBEARSPAWNEGG = ITEMS.register("snsgummybearspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSGUMMYBEAR, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSBOARRYSPAWNEGG = ITEMS.register("snsboarryspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSBOARRY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSSPIDERSPAWNEGG = ITEMS.register("snsspiderspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSSPIDER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSCCCATSPAWNEGG = ITEMS.register("snscccatspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSCCCAT, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSCOOKIECATSPAWNEGG = ITEMS.register("snscookiecatspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSCOOKIECAT, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> ICECREAMCOWSPAWNEGG = ITEMS.register("icecreamcowspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.ICECREAMCOW, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSGPSPAWNEGG = ITEMS.register("snsgpspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSGP, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSUNICORNSPAWNEGG = ITEMS.register("snsunicornspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSUNICORN, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSSHEEPSPAWNEGG = ITEMS.register("snssheepspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSSHEEP, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSLIONSPAWNEGG = ITEMS.register("snslionspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSLION, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSSNAKESPAWNEGG = ITEMS.register("snssnakespawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSSNAKE, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> BONBONBINISPAWNEGG = ITEMS.register("bonbonbinispawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.BONBONBINI, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> GINGERBREAD_MANSPAWNEGG = ITEMS.register("gingerbread_manspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.GINGERBREAD_MAN, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));


	public static final RegistryObject<CustomSpawnEggItem> SNSCANDYCANEFISHSPAWNEGG = ITEMS.register("snscandycanefishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSCANDYCANEFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSICFISHSPAWNEGG = ITEMS.register("snsicfishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSICFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSANGELFISHSPAWNEGG = ITEMS.register("snsangelfishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSANGELFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSWHALESPAWNEGG = ITEMS.register("snswhalespawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSWHALE, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSDOLPHINSPAWNEGG = ITEMS.register("snsdolphinspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSDOLPHIN, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));


	public static final RegistryObject<CustomSpawnEggItem> SNSPBATTACKERSPAWNEGG = ITEMS.register("snspbattackerspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYATTACKER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPBARCHERSPAWNEGG = ITEMS.register("snspbarcherspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYARCHER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPBDEFENDERSPAWNEGG = ITEMS.register("snspbdefenderspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYDEFENDER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> CCCROOKSPAWNEGG = ITEMS.register("cccrookspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.CANDYCANECROOK, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> RSWMUMMYSPAWNEGG = ITEMS.register("rswmummyspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.RSWMUMMY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> MINTIMPERIALSPAWNEGG = ITEMS.register("mintimperialspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.MINTIMPERIAL, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

//liquid

	public static final RegistryObject<Item> CREAMY_MILK_BUCKET = ITEMS.register("creamy_milk_bucket",
			() -> new BucketItem(FluidInit.CREAMY_MILK_FLUID,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD).durability(500)));

//food
	public static final RegistryObject<Item> SPRINKLES = ITEMS.register("sprinkles", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
	        .nutrition(1)
	        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
	        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
	        .saturationMod(1.2f)
	        .build())));

	public static final RegistryObject<Item> CANDYCANESUGAR = ITEMS.register("candycanesugar", () -> new CandyCaneSugarFuel(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CANDYFLOSS = ITEMS.register("candyfloss", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> PRETZEL = ITEMS.register("pretzel", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> WAFFLECONE = ITEMS.register("wafflecone", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CINNAMONROLL = ITEMS.register("cinnamonroll", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYSWISSROLL = ITEMS.register("strawberryswissroll", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYCANDY = ITEMS.register("strawberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYLOLLIPOP = ITEMS.register("strawberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 8), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> RASPBERRYCANDY = ITEMS.register("raspberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> RASPBERRYLOLLIPOP = ITEMS.register("raspberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> LEMONCANDY = ITEMS.register("lemoncandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> LIMECANDY = ITEMS.register("limecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> MANGOCANDY = ITEMS.register("mangocandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> PEACHCANDY = ITEMS.register("peachcandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> LEMONLOLLIPOP = ITEMS.register("lemonlollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> BLUEBERRYCANDY = ITEMS.register("blueberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> BLUEBERRYLOLLIPOP = ITEMS.register("blueberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> ORANGECANDY = ITEMS.register("orangecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> ORANGELOLLIPOP = ITEMS.register("orangelollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> BLACKBERRYCANDY = ITEMS.register("blackberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BLACKBERRYLOLLIPOP = ITEMS.register("blackberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SUGARSTICK = ITEMS.register("sugarstick", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> SUGARWRAPPER = ITEMS.register("sugarwrapper", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));

	public static final RegistryObject<Item> STRAWBERRYICECREAMSCOOP = ITEMS.register("strawberryicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BLACKBERRYICECREAMSCOOP = ITEMS.register("blackberryicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> RASPBERRYICECREAMSCOOP = ITEMS.register("raspberryicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BLUEBERRYICECREAMSCOOP = ITEMS.register("blueberryicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> VANILLAICECREAMSCOOP = ITEMS.register("vanillaicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> ORANGEICECREAMSCOOP = ITEMS.register("orangeicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> LEMONICECREAMSCOOP = ITEMS.register("lemonicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> LIMEICECREAMSCOOP = ITEMS.register("limeicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> MANGOICECREAMSCOOP = ITEMS.register("mangoicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> PEACHICECREAMSCOOP = ITEMS.register("peachicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATEICECREAMSCOOP = ITEMS.register("chocolateicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> TOFFEEICECREAMSCOOP = ITEMS.register("toffeeicecreamscoop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> STRAWBERRYICECREAM = ITEMS.register("strawberryicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BLACKBERRYICECREAM = ITEMS.register("blackberryicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> RASPBERRYICECREAM = ITEMS.register("raspberryicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BLUEBERRYICECREAM = ITEMS.register("blueberryicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> VANILLAICECREAM = ITEMS.register("vanillaicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> ORANGEICECREAM = ITEMS.register("orangeicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> LEMONICECREAM = ITEMS.register("lemonicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> LIMEICECREAM = ITEMS.register("limeicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> MANGOICECREAM = ITEMS.register("mangoicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> PEACHICECREAM = ITEMS.register("peachicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATEICECREAM = ITEMS.register("chocolateicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> TOFFEEICECREAM = ITEMS.register("toffeeicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> ANGELCAKE = ITEMS.register("angelcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CARROTCAKE = ITEMS.register("carrotcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> STRAWBERRYCAKE = ITEMS.register("strawberrycake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATEORANGECAKE = ITEMS.register("chocolateorangecake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATECHERRYCAKE = ITEMS.register("chocolatecherrycake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> VICTORIASPONGECAKE = ITEMS.register("victoriaspongecake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> VANILLACAKE = ITEMS.register("vanillacake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> LEMONCURDCAKE = ITEMS.register("lemoncurdcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> BANANABREAD = ITEMS.register("bananabread", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> SWEETBANANA = ITEMS.register("sweetbanana", () -> new ItemNameBlockItem
			(BlockInit.BANANA_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETCARROT = ITEMS.register("sweetcarrot", () -> new ItemNameBlockItem
			(BlockInit.CARROT_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETPEACH = ITEMS.register("sweetpeach", () -> new ItemNameBlockItem
			(BlockInit.PEACH_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETBLACKBERRY = ITEMS.register("sweetblackberry", () -> new ItemNameBlockItem
			(BlockInit.BLACKBERRY_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETSTRAWBERRY = ITEMS.register("sweetstrawberry", () -> new ItemNameBlockItem
			(BlockInit.STRAWBERRY_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETBLUEBERRY = ITEMS.register("sweetblueberry", () -> new ItemNameBlockItem
			(BlockInit.BLUEBERRY_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETRASPBERRY = ITEMS.register("sweetraspberry", () -> new ItemNameBlockItem
			(BlockInit.RASPBERRY_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETLEMON = ITEMS.register("sweetlemon", () -> new ItemNameBlockItem
			(BlockInit.LEMON_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETLIME = ITEMS.register("sweetlime", () -> new ItemNameBlockItem
			(BlockInit.LIME_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETORANGE = ITEMS.register("sweetorange", () -> new ItemNameBlockItem
			(BlockInit.ORANGE_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETMANGO = ITEMS.register("sweetmango", () -> new ItemNameBlockItem
			(BlockInit.MANGO_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETPINEAPPLE = ITEMS.register("sweetpineapple", () -> new ItemNameBlockItem
			(BlockInit.PINEAPPLE_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla", () -> new ItemNameBlockItem
			(BlockInit.VANILLA_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> MINT = ITEMS.register("mint", () -> new ItemNameBlockItem
			(BlockInit.MINT_CROP.get(), new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
					.food(new FoodProperties.Builder()
							.nutrition(1)
							.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
							.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
							.saturationMod(1.2f)
							.build())));

	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> TOFFEE = ITEMS.register("toffee", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> BONBONS = ITEMS.register("bonbons", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> MINTIMPERIALS = ITEMS.register("mintimperials", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> COLABOTTLE = ITEMS.register("colabottle", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

//tools
	//candy_cane
	public static final RegistryObject<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword",
			() -> new HerbSwordItem(ModTiers.CANDY_CANE, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> CANDY_CANE_SHOVEL = ITEMS.register("candy_cane_shovel",
			() -> new ShovelItem(ModTiers.CANDY_CANE, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> CANDY_CANE_AXE = ITEMS.register("candy_cane_axe",
			() -> new AxeItem(ModTiers.CANDY_CANE, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> CANDY_CANE_PICKAXE = ITEMS.register("candy_cane_pickaxe",
			() -> new PickaxeItem(ModTiers.CANDY_CANE, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> CANDY_CANE_HOE = ITEMS.register("candy_cane_hoe",
			() -> new HoeItem(ModTiers.CANDY_CANE, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	//strawberry_candy
	public static final RegistryObject<Item> STRAWBERRY_CANDY_SWORD = ITEMS.register("strawberry_candy_sword",
			() -> new SweetSwordItem(ModTiers.STRAWBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> STRAWBERRY_CANDY_SHOVEL = ITEMS.register("strawberry_candy_shovel",
			() -> new ShovelItem(ModTiers.STRAWBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> STRAWBERRY_CANDY_AXE = ITEMS.register("strawberry_candy_axe",
			() -> new AxeItem(ModTiers.STRAWBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> STRAWBERRY_CANDY_PICKAXE = ITEMS.register("strawberry_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.STRAWBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> STRAWBERRY_CANDY_HOE = ITEMS.register("strawberry_candy_hoe",
			() -> new HoeItem(ModTiers.STRAWBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//raspberry_candy
	public static final RegistryObject<Item> RASPBERRY_CANDY_SWORD = ITEMS.register("raspberry_candy_sword",
			() -> new SweetSwordItem(ModTiers.RASPBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> RASPBERRY_CANDY_SHOVEL = ITEMS.register("raspberry_candy_shovel",
			() -> new ShovelItem(ModTiers.RASPBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> RASPBERRY_CANDY_AXE = ITEMS.register("raspberry_candy_axe",
			() -> new AxeItem(ModTiers.RASPBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> RASPBERRY_CANDY_PICKAXE = ITEMS.register("raspberry_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.RASPBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> RASPBERRY_CANDY_HOE = ITEMS.register("raspberry_candy_hoe",
			() -> new HoeItem(ModTiers.RASPBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//blueberry
	public static final RegistryObject<Item> BLUEBERRY_CANDY_SWORD = ITEMS.register("blueberry_candy_sword",
			() -> new SweetSwordItem(ModTiers.BLUEBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLUEBERRY_CANDY_SHOVEL = ITEMS.register("blueberry_candy_shovel",
			() -> new ShovelItem(ModTiers.BLUEBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLUEBERRY_CANDY_AXE = ITEMS.register("blueberry_candy_axe",
			() -> new AxeItem(ModTiers.BLUEBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLUEBERRY_CANDY_PICKAXE = ITEMS.register("blueberry_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.BLUEBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLUEBERRY_CANDY_HOE = ITEMS.register("blueberry_candy_hoe",
			() -> new HoeItem(ModTiers.BLUEBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	//blackberry
	public static final RegistryObject<Item> BLACKBERRY_CANDY_SWORD = ITEMS.register("blackberry_candy_sword",
			() -> new SweetSwordItem(ModTiers.BLACKBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLACKBERRY_CANDY_SHOVEL = ITEMS.register("blackberry_candy_shovel",
			() -> new ShovelItem(ModTiers.BLACKBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLACKBERRY_CANDY_AXE = ITEMS.register("blackberry_candy_axe",
			() -> new AxeItem(ModTiers.BLACKBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLACKBERRY_CANDY_PICKAXE = ITEMS.register("blackberry_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.BLACKBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> BLACKBERRY_CANDY_HOE = ITEMS.register("blackberry_candy_hoe",
			() -> new HoeItem(ModTiers.BLACKBERRY_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//orange_candy
	public static final RegistryObject<Item> ORANGE_CANDY_SWORD = ITEMS.register("orange_candy_sword",
			() -> new SweetSwordItem(ModTiers.ORANGE_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> ORANGE_CANDY_SHOVEL = ITEMS.register("orange_candy_shovel",
			() -> new ShovelItem(ModTiers.ORANGE_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> ORANGE_CANDY_AXE = ITEMS.register("orange_candy_axe",
			() -> new AxeItem(ModTiers.ORANGE_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> ORANGE_CANDY_PICKAXE = ITEMS.register("orange_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.ORANGE_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> ORANGE_CANDY_HOE = ITEMS.register("orange_candy_hoe",
			() -> new HoeItem(ModTiers.ORANGE_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//lemon_candy
	public static final RegistryObject<Item> LEMON_CANDY_SWORD = ITEMS.register("lemon_candy_sword",
			() -> new SweetSwordItem(ModTiers.LEMON_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LEMON_CANDY_SHOVEL = ITEMS.register("lemon_candy_shovel",
			() -> new ShovelItem(ModTiers.LEMON_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LEMON_CANDY_AXE = ITEMS.register("lemon_candy_axe",
			() -> new AxeItem(ModTiers.LEMON_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LEMON_CANDY_PICKAXE = ITEMS.register("lemon_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.LEMON_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LEMON_CANDY_HOE = ITEMS.register("lemon_candy_hoe",
			() -> new HoeItem(ModTiers.LEMON_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//lime
	public static final RegistryObject<Item> LIME_CANDY_SWORD = ITEMS.register("lime_candy_sword",
			() -> new SweetSwordItem(ModTiers.LIME_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LIME_CANDY_SHOVEL = ITEMS.register("lime_candy_shovel",
			() -> new ShovelItem(ModTiers.LIME_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LIME_CANDY_AXE = ITEMS.register("lime_candy_axe",
			() -> new AxeItem(ModTiers.LIME_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LIME_CANDY_PICKAXE = ITEMS.register("lime_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.LIME_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> LIME_CANDY_HOE = ITEMS.register("lime_candy_hoe",
			() -> new HoeItem(ModTiers.LIME_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//mango_candy
	public static final RegistryObject<Item> MANGO_CANDY_SWORD = ITEMS.register("mango_candy_sword",
			() -> new SweetSwordItem(ModTiers.MANGO_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> MANGO_CANDY_SHOVEL = ITEMS.register("mango_candy_shovel",
			() -> new ShovelItem(ModTiers.MANGO_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> MANGO_CANDY_AXE = ITEMS.register("mango_candy_axe",
			() -> new AxeItem(ModTiers.MANGO_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> MANGO_CANDY_PICKAXE = ITEMS.register("mango_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.MANGO_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> MANGO_CANDY_HOE = ITEMS.register("mango_candy_hoe",
			() -> new HoeItem(ModTiers.MANGO_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));


	//peach_candy
	public static final RegistryObject<Item> PEACH_CANDY_SWORD = ITEMS.register("peach_candy_sword",
			() -> new SweetSwordItem(ModTiers.PEACH_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> PEACH_CANDY_SHOVEL = ITEMS.register("peach_candy_shovel",
			() -> new ShovelItem(ModTiers.PEACH_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> PEACH_CANDY_AXE = ITEMS.register("peach_candy_axe",
			() -> new AxeItem(ModTiers.PEACH_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> PEACH_CANDY_PICKAXE = ITEMS.register("peach_candy_pickaxe",
			() -> new PickaxeItem(ModTiers.PEACH_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> PEACH_CANDY_HOE = ITEMS.register("peach_candy_hoe",
			() -> new HoeItem(ModTiers.PEACH_CANDY, 2, 3f,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

//armor
	//ice_cream
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_HELMET = ITEMS.register("vanilla_ice_cream_helmet",
			() -> new ArmorItem(ModArmorMaterials.VANILLA_ICE_CREAM, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_CHESTPLATE = ITEMS.register("vanilla_ice_cream_chestplate",
			() -> new ArmorItem(ModArmorMaterials.VANILLA_ICE_CREAM, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_LEGGINGS = ITEMS.register("vanilla_ice_cream_leggings",
			() -> new ArmorItem(ModArmorMaterials.VANILLA_ICE_CREAM, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_BOOTS = ITEMS.register("vanilla_ice_cream_boots",
			() -> new ArmorItem(ModArmorMaterials.VANILLA_ICE_CREAM, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//strawberry_candy
	public static final RegistryObject<Item> STRAWBERRY_CANDY_HELMET = ITEMS.register("strawberry_candy_helmet",
			() -> new StrawberryCandyArmorItem(ModArmorMaterials.STRAWBERRY_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_CHESTPLATE = ITEMS.register("strawberry_candy_chestplate",
			() -> new StrawberryCandyArmorItem(ModArmorMaterials.STRAWBERRY_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_LEGGINGS = ITEMS.register("strawberry_candy_leggings",
			() -> new StrawberryCandyArmorItem(ModArmorMaterials.STRAWBERRY_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_BOOTS = ITEMS.register("strawberry_candy_boots",
			() -> new StrawberryCandyArmorItem(ModArmorMaterials.STRAWBERRY_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//blueberry_candy
	public static final RegistryObject<Item> BLUEBERRY_CANDY_HELMET = ITEMS.register("blueberry_candy_helmet",
			() -> new BlueberryCandyArmorItem(ModArmorMaterials.BLUEBERRY_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_CHESTPLATE = ITEMS.register("blueberry_candy_chestplate",
			() -> new BlueberryCandyArmorItem(ModArmorMaterials.BLUEBERRY_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_LEGGINGS = ITEMS.register("blueberry_candy_leggings",
			() -> new BlueberryCandyArmorItem(ModArmorMaterials.BLUEBERRY_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_BOOTS = ITEMS.register("blueberry_candy_boots",
			() -> new BlueberryCandyArmorItem(ModArmorMaterials.BLUEBERRY_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//raspberry_candy
	public static final RegistryObject<Item> RASPBERRY_CANDY_HELMET = ITEMS.register("raspberry_candy_helmet",
			() -> new RaspberryCandyArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_CHESTPLATE = ITEMS.register("raspberry_candy_chestplate",
			() -> new RaspberryCandyArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_LEGGINGS = ITEMS.register("raspberry_candy_leggings",
			() -> new RaspberryCandyArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_BOOTS = ITEMS.register("raspberry_candy_boots",
			() -> new RaspberryCandyArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//BLACKBERRY
	public static final RegistryObject<Item> BLACKBERRY_CANDY_HELMET = ITEMS.register("blackberry_candy_helmet",
			() -> new BlackberryCandyArmorItem(ModArmorMaterials.BLACKBERRY_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLACKBERRY_CANDY_CHESTPLATE = ITEMS.register("blackberry_candy_chestplate",
			() -> new BlackberryCandyArmorItem(ModArmorMaterials.BLACKBERRY_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLACKBERRY_CANDY_LEGGINGS = ITEMS.register("blackberry_candy_leggings",
			() -> new BlackberryCandyArmorItem(ModArmorMaterials.BLACKBERRY_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLACKBERRY_CANDY_BOOTS = ITEMS.register("blackberry_candy_boots",
			() -> new BlackberryCandyArmorItem(ModArmorMaterials.BLACKBERRY_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//lemon_candy
	public static final RegistryObject<Item> LEMON_CANDY_HELMET = ITEMS.register("lemon_candy_helmet",
			() -> new LemonCandyArmorItem(ModArmorMaterials.LEMON_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_CHESTPLATE = ITEMS.register("lemon_candy_chestplate",
			() -> new LemonCandyArmorItem(ModArmorMaterials.LEMON_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_LEGGINGS = ITEMS.register("lemon_candy_leggings",
			() -> new LemonCandyArmorItem(ModArmorMaterials.LEMON_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_BOOTS = ITEMS.register("lemon_candy_boots",
			() -> new LemonCandyArmorItem(ModArmorMaterials.LEMON_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//orange_candy
	public static final RegistryObject<Item> ORANGE_CANDY_HELMET = ITEMS.register("orange_candy_helmet",
			() -> new OrangeCandyArmorItem(ModArmorMaterials.ORANGE_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_CHESTPLATE = ITEMS.register("orange_candy_chestplate",
			() -> new OrangeCandyArmorItem(ModArmorMaterials.ORANGE_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_LEGGINGS = ITEMS.register("orange_candy_leggings",
			() -> new OrangeCandyArmorItem(ModArmorMaterials.ORANGE_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_BOOTS = ITEMS.register("orange_candy_boots",
			() -> new OrangeCandyArmorItem(ModArmorMaterials.ORANGE_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//LIME_CANDY
	public static final RegistryObject<Item> LIME_CANDY_HELMET = ITEMS.register("lime_candy_helmet",
			() -> new LimeCandyArmorItem(ModArmorMaterials.LIME_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LIME_CANDY_CHESTPLATE = ITEMS.register("lime_candy_chestplate",
			() -> new LimeCandyArmorItem(ModArmorMaterials.LIME_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LIME_CANDY_LEGGINGS = ITEMS.register("lime_candy_leggings",
			() -> new LimeCandyArmorItem(ModArmorMaterials.LIME_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LIME_CANDY_BOOTS = ITEMS.register("lime_candy_boots",
			() -> new LimeCandyArmorItem(ModArmorMaterials.LIME_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//MANGO_CANDY
	public static final RegistryObject<Item> MANGO_CANDY_HELMET = ITEMS.register("mango_candy_helmet",
			() -> new MangoCandyArmorItem(ModArmorMaterials.MANGO_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> MANGO_CANDY_CHESTPLATE = ITEMS.register("mango_candy_chestplate",
			() -> new MangoCandyArmorItem(ModArmorMaterials.MANGO_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> MANGO_CANDY_LEGGINGS = ITEMS.register("mango_candy_leggings",
			() -> new MangoCandyArmorItem(ModArmorMaterials.MANGO_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> MANGO_CANDY_BOOTS = ITEMS.register("mango_candy_boots",
			() -> new MangoCandyArmorItem(ModArmorMaterials.MANGO_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

	//PEACH_CANDY
	public static final RegistryObject<Item> PEACH_CANDY_HELMET = ITEMS.register("peach_candy_helmet",
			() -> new PeachCandyArmorItem(ModArmorMaterials.PEACH_CANDY, EquipmentSlot.HEAD,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> PEACH_CANDY_CHESTPLATE = ITEMS.register("peach_candy_chestplate",
			() -> new PeachCandyArmorItem(ModArmorMaterials.PEACH_CANDY, EquipmentSlot.CHEST,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> PEACH_CANDY_LEGGINGS = ITEMS.register("peach_candy_leggings",
			() -> new PeachCandyArmorItem(ModArmorMaterials.PEACH_CANDY, EquipmentSlot.LEGS,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> PEACH_CANDY_BOOTS = ITEMS.register("peach_candy_boots",
			() -> new PeachCandyArmorItem(ModArmorMaterials.PEACH_CANDY, EquipmentSlot.FEET,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

//currency

	public static final RegistryObject<Item> WRAPPEDSTRAWBERRYCANDY = ITEMS.register("wrappedstrawberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDRASPBERRYCANDY = ITEMS.register("wrappedraspberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDLEMONCANDY = ITEMS.register("wrappedlemoncandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDORANGECANDY = ITEMS.register("wrappedorangecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDBLUEBERRYCANDY = ITEMS.register("wrappedblueberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

//crops


// boats

	public static final RegistryObject<Item> WAFERWOOD_BOAT = ITEMS.register("waferwood_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.WAFERWOOD));

	public static final RegistryObject<Item> CHOCOLATEWAFERWOOD_BOAT = ITEMS.register("chocolatewaferwood_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.CHOCOLATEWAFERWOOD));

	public static final RegistryObject<Item> WAFERPLANK_BOAT = ITEMS.register("waferplank_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.WAFERPLANK));

	public static final RegistryObject<Item> STRAWBERRYCANDY_BOAT = ITEMS.register("strawberrycandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.STRAWBERRYCANDY));

	public static final RegistryObject<Item> BLACKBERRYCANDY_BOAT = ITEMS.register("blackberrycandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.BLACKBERRYCANDY));

	public static final RegistryObject<Item> BLUEBERRYCANDY_BOAT = ITEMS.register("blueberrycandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.BLUEBERRYCANDY));

	public static final RegistryObject<Item> RASPBERRYCANDY_BOAT = ITEMS.register("raspberrycandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.RASPBERRYCANDY));

	public static final RegistryObject<Item> ORANGECANDY_BOAT = ITEMS.register("orangecandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.ORANGECANDY));

	public static final RegistryObject<Item> LEMONCANDY_BOAT = ITEMS.register("lemoncandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.LEMONCANDY));

	public static final RegistryObject<Item> LIMECANDY_BOAT = ITEMS.register("limecandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.LIMECANDY));

	public static final RegistryObject<Item> MANGOCANDY_BOAT = ITEMS.register("mangocandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.MANGOCANDY));

	public static final RegistryObject<Item> PEACHCANDY_BOAT = ITEMS.register("peachcandy_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.PEACHCANDY));

	public static final RegistryObject<Item> CANDYFLOSS_BOAT = ITEMS.register("candyfloss_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.CANDYFLOSS));

	public static final RegistryObject<Item> CANDYCANEBRICK_BOAT = ITEMS.register("candycanebrick_boat",
			() -> new ModBoatItem(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODDECORATION),
					ModBoatEntity.Type.CANDYCANEBRICK));

//animated

	public static final RegistryObject<Item> SAVOURY_ESSENCE = ITEMS.register("savoury_essence",
			() -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> SWEET_ESSENCE = ITEMS.register("sweet_essence",
			() -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

	public static final RegistryObject<Item> ENCHANTED_TOOTHPASTE = ITEMS.register("enchanted_toothpaste",
			() -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));

}
