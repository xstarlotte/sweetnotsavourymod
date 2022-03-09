package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.common.item.ModArmorItem;
import com.charlotte.sweetnotsavourymod.common.item.ModArmorMaterials;
import com.charlotte.sweetnotsavourymod.common.item.ModTiers;
import com.charlotte.sweetnotsavourymod.common.item.SweetTier.SweetSwordItem;
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

	public static final RegistryObject<Item> CARTOON_WHY_WE_LOSE_RECORD = ITEMS.register("cartoon_why_we_lose_record",
			() -> new RecordItem(4, SoundsInit.CARTOON_WHY_WE_LOSE,
					new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODMUSIC).stacksTo(1)));


//SPAWN EGGS

	//elf-Blackberry, Blueberry, Strawberry, Raspberry, Lemon, Orange, Vanilla, Chocolate, Toffee
	public static final RegistryObject<CustomSpawnEggItem> SNSELFSPAWNEGG = ITEMS.register("snselfspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSELF, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

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

	public static final RegistryObject<CustomSpawnEggItem> ICECREAMCOWSPAWNEGG = ITEMS.register("icecreamcowspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.ICECREAMCOW, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSGPSPAWNEGG = ITEMS.register("snsgpspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSGP, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSUNICORNSPAWNEGG = ITEMS.register("snsunicornspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSUNICORN, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSICFISHSPAWNEGG = ITEMS.register("snsicfishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSICFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSANGELFISHSPAWNEGG = ITEMS.register("snsangelfishspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSANGELFISH, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSWHALESPAWNEGG = ITEMS.register("snswhalespawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSWHALE, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPBATTACKERSPAWNEGG = ITEMS.register("snspbattackerspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYATTACKER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> SNSPBARCHERSPAWNEGG = ITEMS.register("snspbarcherspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYARCHER, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

	public static final RegistryObject<CustomSpawnEggItem> CCCROOKSPAWNEGG = ITEMS.register("cccrookspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.CANDYCANECROOK, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODSPAWNEGGS)));

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

	public static final RegistryObject<Item> CANDYCANESUGAR = ITEMS.register("candycanesugar", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
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

	public static final RegistryObject<Item> STRAWBERRYICECREAM = ITEMS.register("strawberryicecream", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
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

	public static final RegistryObject<Item> ANGELCAKE = ITEMS.register("angelcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CARROTCAKE = ITEMS.register("carrotcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> STRAWBERRYCAKE = ITEMS.register("strawberrycake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATEORANGECAKE = ITEMS.register("chocolateorangecake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> CHOCOLATECHERRYCAKE = ITEMS.register("chocolatecherrycake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> VICTORIASPONGECAKE = ITEMS.register("victoriaspongecake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> VANILLACAKE = ITEMS.register("vanillacake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> LEMONCURDCAKE = ITEMS.register("lemoncurdcake", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> BANANABREAD = ITEMS.register("bananabread", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(3)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 6), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
					.saturationMod(3.6f)
					.build())));

	public static final RegistryObject<Item> SWEETBANANA = ITEMS.register("sweetbanana", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETCARROT = ITEMS.register("sweetcarrot", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETPEACH = ITEMS.register("sweetpeach", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETBLACKBERRY = ITEMS.register("sweetblackberry", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETSTRAWBERRY = ITEMS.register("sweetstrawberry", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETBLUEBERRY = ITEMS.register("sweetblueberry", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETRASPBERRY = ITEMS.register("sweetraspberry", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETLEMON = ITEMS.register("sweetlemon", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETLIME = ITEMS.register("sweetlime", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETORANGE = ITEMS.register("sweetorange", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETMANGO = ITEMS.register("sweetmango", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> SWEETPINEAPPLE = ITEMS.register("sweetpineapple", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
			.food(new FoodProperties.Builder()
					.nutrition(1)
					.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
					.saturationMod(1.2f)
					.build())));

	public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODFOOD)
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

	public static final RegistryObject<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword",
			() -> new SweetSwordItem(ModTiers.CANDY_CANE, 2, 3f,
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

//armor
	//ice_cream
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_HELMET = ITEMS.register("vanilla_ice_cream_helmet",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_CHESTPLATE = ITEMS.register("vanilla_ice_cream_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_LEGGINGS = ITEMS.register("vanilla_ice_cream_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_BOOTS = ITEMS.register("vanilla_ice_cream_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	
	//lemon_candy
	public static final RegistryObject<Item> LEMON_CANDY_HELMET = ITEMS.register("lemon_candy_helmet",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_CHESTPLATE = ITEMS.register("lemon_candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_LEGGINGS = ITEMS.register("lemon_candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> LEMON_CANDY_BOOTS = ITEMS.register("lemon_candy_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	
	//blueberry_candy
	public static final RegistryObject<Item> BLUEBERRY_CANDY_HELMET = ITEMS.register("blueberry_candy_helmet",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_CHESTPLATE = ITEMS.register("blueberry_candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_LEGGINGS = ITEMS.register("blueberry_candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_BOOTS = ITEMS.register("blueberry_candy_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	
	//strawberry_candy
	public static final RegistryObject<Item> STRAWBERRY_CANDY_HELMET = ITEMS.register("strawberry_candy_helmet",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_CHESTPLATE = ITEMS.register("strawberry_candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_LEGGINGS = ITEMS.register("strawberry_candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_BOOTS = ITEMS.register("strawberry_candy_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	
	//raspberry_candy
	public static final RegistryObject<Item> RASPBERRY_CANDY_HELMET = ITEMS.register("raspberry_candy_helmet",
			() -> new ModArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_CHESTPLATE = ITEMS.register("raspberry_candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_LEGGINGS = ITEMS.register("raspberry_candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_BOOTS = ITEMS.register("raspberry_candy_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	
	//orange_candy
	public static final RegistryObject<Item> ORANGE_CANDY_HELMET = ITEMS.register("orange_candy_helmet",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_CHESTPLATE = ITEMS.register("orange_candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_LEGGINGS = ITEMS.register("orange_candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));
	public static final RegistryObject<Item> ORANGE_CANDY_BOOTS = ITEMS.register("orange_candy_boots",
			() -> new ArmorItem(ModArmorMaterials.RASPBERRY_CANDY, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODARMOUR)));

//currency
	
	public static final RegistryObject<Item> WRAPPEDSTRAWBERRYCANDY = ITEMS.register("wrappedstrawberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDRASPBERRYCANDY = ITEMS.register("wrappedraspberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDLEMONCANDY = ITEMS.register("wrappedlemoncandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDORANGECANDY = ITEMS.register("wrappedorangecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	public static final RegistryObject<Item> WRAPPEDBLUEBERRYCANDY = ITEMS.register("wrappedblueberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODTOOLS)));
	
//crops


	
	
	
}

