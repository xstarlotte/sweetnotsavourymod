package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.common.material.IceCreamArmorMaterial;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetNotSavouryMod.MOD_ID);
//SPAWN EGGS

	//elf-6
	public static final RegistryObject<CustomSpawnEggItem> SNSELFSPAWNEGG = ITEMS.register("snselfspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SNSELF, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));


//food	
	public static final RegistryObject<Item> SPRINKLES = ITEMS.register("sprinkles", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
	        .nutrition(1)
	        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
	        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
	        .saturationMod(1.2f)
	        .build())));
	
	public static final RegistryObject<Item> CINNAMONROLL = ITEMS.register("cinnamonroll", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYSWISSROLL = ITEMS.register("strawberryswissroll", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYCANDY = ITEMS.register("strawberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> STRAWBERRYLOLLIPOP = ITEMS.register("strawberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 8), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> RASPBERRYCANDY = ITEMS.register("raspberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> RASPBERRYLOLLIPOP = ITEMS.register("raspberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	public static final RegistryObject<Item> LEMONCANDY = ITEMS.register("lemoncandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> LEMONLOLLIPOP = ITEMS.register("lemonlollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> BLUEBERRYCANDY = ITEMS.register("blueberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> BLUEBERRYLOLLIPOP = ITEMS.register("blueberrylollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> ORANGECANDY = ITEMS.register("orangecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> ORANGELOLLIPOP = ITEMS.register("orangelollipop", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> SUGARSTICK = ITEMS.register("sugarstick", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
	public static final RegistryObject<Item> SUGARWRAPPER = ITEMS.register("sugarwrapper", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)
			.food(new FoodProperties.Builder()
			        .nutrition(1)
			        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1.0f)
			        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 3), 1.0f)
			        .saturationMod(1.2f)
			        .build())));
	
//weapons
	
	// public static final RegistryObject<Item> VANILLAICECREAMSWORD = ITEMS.register("vanillaicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.VANILLAICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	// public static final RegistryObject<Item> STRAWBERRYICECREAMSWORD = ITEMS.register("strawberryicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.STRAWBERRYICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	// public static final RegistryObject<Item> RASPBERRYICECREAMSWORD = ITEMS.register("raspberryicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.RASPBERRYICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	// public static final RegistryObject<Item> LEMONICECREAMSWORD = ITEMS.register("lemonicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.LEMONICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	// public static final RegistryObject<Item> ORANGEICECREAMSWORD = ITEMS.register("orangeicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.ORANGEICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	// public static final RegistryObject<Item> BLUEBERRYICECREAMSWORD = ITEMS.register("blueberryicecreamsword",
	// 		() -> new SwordItem(IceCreamToolMaterial.BLUEBERRYICECREAMSWORD, 5, -1f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
//armor
	//ice_cream
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_HELMET = ITEMS.register("vanilla_ice_cream_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.VANILLAICECREAMARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_CHESTPLATE = ITEMS.register("vanilla_ice_cream_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.VANILLAICECREAMARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_LEGGINGS = ITEMS.register("vanilla_ice_cream_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.VANILLAICECREAMARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_BOOTS = ITEMS.register("vanilla_ice_cream_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.VANILLAICECREAMARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//lemon_candy
	public static final RegistryObject<Item> LEMON_CANDY_HELMET = ITEMS.register("lemon_candy_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.LEMONCANDYARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMON_CANDY_CHESTPLATE = ITEMS.register("lemon_candy_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.LEMONCANDYARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMON_CANDY_LEGGINGS = ITEMS.register("lemon_candy_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.LEMONCANDYARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMON_CANDY_BOOTS = ITEMS.register("lemon_candy_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.LEMONCANDYARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//blueberry_candy
	public static final RegistryObject<Item> BLUEBERRY_CANDY_HELMET = ITEMS.register("blueberry_candy_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.BLUEBERRYCANDYARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_CHESTPLATE = ITEMS.register("blueberry_candy_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.BLUEBERRYCANDYARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_LEGGINGS = ITEMS.register("blueberry_candy_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.BLUEBERRYCANDYARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> BLUEBERRY_CANDY_BOOTS = ITEMS.register("blueberry_candy_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.BLUEBERRYCANDYARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//strawberry_candy
	public static final RegistryObject<Item> STRAWBERRY_CANDY_HELMET = ITEMS.register("strawberry_candy_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.STRAWBERRYCANDYARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_CHESTPLATE = ITEMS.register("strawberry_candy_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.STRAWBERRYCANDYARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_LEGGINGS = ITEMS.register("strawberry_candy_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.STRAWBERRYCANDYARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRY_CANDY_BOOTS = ITEMS.register("strawberry_candy_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.STRAWBERRYCANDYARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//raspberry_candy
	public static final RegistryObject<Item> RASPBERRY_CANDY_HELMET = ITEMS.register("raspberry_candy_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.RASPBERRYCANDYARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_CHESTPLATE = ITEMS.register("raspberry_candy_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.RASPBERRYCANDYARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_LEGGINGS = ITEMS.register("raspberry_candy_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.RASPBERRYCANDYARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRY_CANDY_BOOTS = ITEMS.register("raspberry_candy_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.RASPBERRYCANDYARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//orange_candy
	public static final RegistryObject<Item> ORANGE_CANDY_HELMET = ITEMS.register("orange_candy_helmet",
			() -> new ArmorItem(IceCreamArmorMaterial.ORANGECANDYARMOR, EquipmentSlot.HEAD,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> ORANGE_CANDY_CHESTPLATE = ITEMS.register("orange_candy_chestplate",
			() -> new ArmorItem(IceCreamArmorMaterial.ORANGECANDYARMOR, EquipmentSlot.CHEST,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> ORANGE_CANDY_LEGGINGS = ITEMS.register("orange_candy_leggings",
			() -> new ArmorItem(IceCreamArmorMaterial.ORANGECANDYARMOR, EquipmentSlot.LEGS,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> ORANGE_CANDY_BOOTS = ITEMS.register("orange_candy_boots",
			() -> new ArmorItem(IceCreamArmorMaterial.ORANGECANDYARMOR, EquipmentSlot.FEET,
			new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
//currency
//currency
	
	public static final RegistryObject<Item> WRAPPEDSTRAWBERRYCANDY = ITEMS.register("wrappedstrawberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDRASPBERRYCANDY = ITEMS.register("wrappedraspberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDLEMONCANDY = ITEMS.register("wrappedlemoncandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDORANGECANDY = ITEMS.register("wrappedorangecandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDBLUEBERRYCANDY = ITEMS.register("wrappedblueberrycandy", () -> new Item(new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
//crops


	
	
	
}

