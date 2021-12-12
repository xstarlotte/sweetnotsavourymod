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
	//poison berries-3
	public static final RegistryObject<CustomSpawnEggItem> POISONBERRYATTACKERSPAWNEGG = ITEMS.register("poisonberryattackerspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYATTACKER, 0x2e0d39, 0x055330, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));

	public static final RegistryObject<CustomSpawnEggItem> POISONBERRYARCHERSPAWNEGG = ITEMS.register("poisonberryarcherspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYARCHER, 0x2e0d39, 0x055330, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	//public static final RegistryObject<CustomSpawnEggItem> POISONBERRYSPRITESPAWNEGG = ITEMS.register("poisonberryspritespawnegg", 
	//		() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYSPRITE, 0x2e0d39, 0x055330, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//waferschund-1
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYWAFERSCHUNDSPAWNEGG = ITEMS.register("strawberrywaferschundspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYWAFERSCHUND, 0x754343, 0xc2b991, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//pixies-2
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYPARFAITPIXIESPAWNEGG = ITEMS.register("strawberryparfaitpixiespawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYPARFAITPIXIE, 0xe9be8a, 0x913826, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));

	//public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYPARFAITPIXIESPAWNEGG = ITEMS.register("blueberryparfaitpixiespawnegg",
	//		() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYPARFAITPIXIE, 0xe9be8a, 0x6a8cb7, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//pugs-7
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYPUGSPAWNEGG = ITEMS.register("strawberrypugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYPUG, 0x730813, 0xbe9129, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> LEMONPUGSPAWNEGG = ITEMS.register("lemonpugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.LEMONPUG, 0xedf35f, 0x53c66f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATEPUGSPAWNEGG = ITEMS.register("chocolatepugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATEPUG, 0x2c1a04, 0xccbba7, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> TOFFEEPUGSPAWNEGG = ITEMS.register("toffeepugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.TOFFEEPUG, 0x917019, 0xa08234, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYPUGSPAWNEGG = ITEMS.register("blueberrypugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYPUG, 0x405592, 0x022e0d, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYPUGSPAWNEGG = ITEMS.register("raspberrypugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYPUG, 0xb079a1, 0x1e8269, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ORANGEPUGSPAWNEGG = ITEMS.register("orangepugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ORANGEPUG, 0xc18538, 0x086e22, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//icecreampug-6
	public static final RegistryObject<CustomSpawnEggItem> ORANGEICECREAMPUGSPAWNEGG = ITEMS.register("orangeicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ORANGEICECREAMPUG, 0xffffff, 0xb67a2c, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> TOFFEEICECREAMPUGSPAWNEGG = ITEMS.register("toffeeicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.TOFFEEICECREAMPUG, 0xffffff, 0x835e1e, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYICECREAMPUGSPAWNEGG = ITEMS.register("blueberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYICECREAMPUG, 0xffffff, 0x3b4f7d, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATEICECREAMPUGSPAWNEGG = ITEMS.register("chocolateicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATEICECREAMPUG, 0xffffff, 0x492d08, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYICECREAMPUGSPAWNEGG = ITEMS.register("raspberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYICECREAMPUG, 0xffffff, 0xd895bd, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYICECREAMPUGSPAWNEGG = ITEMS.register("strawberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYICECREAMPUG, 0xffffff, 0x882229, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//elf-6
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYELFSPAWNEGG = ITEMS.register("strawberryelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYELF, 0x730813, 0xbe9129, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYELFSPAWNEGG = ITEMS.register("blueberryelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYELF, 0x4b68c3, 0x3b2b66, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYELFSPAWNEGG = ITEMS.register("raspberryelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYELF, 0xedc9e0, 0x072d1d, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> VANILLAELFSPAWNEGG = ITEMS.register("vanillaelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.VANILLAELF, 0xf7f2e3, 0x2c1a04, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ORANGEELFSPAWNEGG = ITEMS.register("orangeelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ORANGEELF, 0xda933c, 0x072d1d, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));	
	
	public static final RegistryObject<CustomSpawnEggItem> LEMONELFSPAWNEGG = ITEMS.register("lemonelfspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.LEMONELF, 0xe2d546, 0x1a765f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//monkeys-2
	//public static final RegistryObject<CustomSpawnEggItem> BANANAMONKEYSPAWNEGG = ITEMS.register("bananamonkeyspawnegg", 
	//		() -> new CustomSpawnEggItem(EntityTypesInit.BANANAMONKEY, 0xf1f09a, 0x496138, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//
	//public static final RegistryObject<CustomSpawnEggItem> BANANAMONKEYKINGSPAWNEGG = ITEMS.register("bananamonkeykingspawnegg", 
	//		() -> new CustomSpawnEggItem(EntityTypesInit.BANANAMONKEYKING, 0xf1f09a, 0x496138, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//pigs-1

	//wolves-1
	public static final RegistryObject<CustomSpawnEggItem> CANDYCANEWOLFSPAWNEGG = ITEMS.register("candycanewolfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CANDYCANEWOLF, 0xac0e1c, 0xfffcfd, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//rabbits-7
	public static final RegistryObject<CustomSpawnEggItem> CARROTCAKERABBITSPAWNEGG = ITEMS.register("carrotcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CARROTCAKERABBIT, 0xd78a1d, 0x043c21, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATECHERRYCAKERABBITSPAWNEGG = ITEMS.register("chocolatecherrycakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT, 0x2f1903, 0x4f040a, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BANANABREADRABBITSPAWNEGG = ITEMS.register("bananabreadrabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BANANABREADRABBIT, 0xf2db4b, 0x6c3c06, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ANGELCAKERABBITSPAWNEGG = ITEMS.register("angelcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ANGELCAKERABBIT, 0xe7dfa5, 0xefb0a3, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> VANILLACAKERABBITSPAWNEGG = ITEMS.register("vanillacakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.VANILLACAKERABBIT, 0xf2ebce, 0xd5b08a, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> LEMONCURDCAKERABBITSPAWNEGG = ITEMS.register("lemoncurdcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.LEMONCURDCAKERABBIT, 0xe3db48, 0xf1efc3, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> REDVELVETCAKERABBITSPAWNEGG = ITEMS.register("redvelvetcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.REDVELVETCAKERABBIT, 0x490a0a, 0xeddbdb, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//zebras-1
	public static final RegistryObject<CustomSpawnEggItem> ZEBRACAKEZEBRASPAWNEGG = ITEMS.register("zebracakezebraspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ZEBRACAKEZEBRA, 0xf3eeef, 0x520514, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//squirrolls-2
	public static final RegistryObject<CustomSpawnEggItem> CINNAMONSQUIRROLLSPAWNEGG = ITEMS.register("cinnamonsquirrollspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CINNAMONSQUIRROLL, 0xbe8c3d, 0x392608, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYSWISSSQUIRROLLSPAWNEGG = ITEMS.register("strawberryswisssquirrollspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYSWISSSQUIRROLL, 0xeacc96, 0xab4e37, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//toads-1
	public static final RegistryObject<CustomSpawnEggItem> TOFFEETOADSPAWNEGG = ITEMS.register("toffeetoadspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.TOFFEETOAD, 0x9c722b, 0xf1cf97, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//icecream parrots-8
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYICECREAMPARROTSPAWNEGG = ITEMS.register("strawberryicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYICECREAMPARROT, 0xf7ac6b, 0xb12610, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYICECREAMPARROTSPAWNEGG = ITEMS.register("blueberryicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYICECREAMPARROT, 0xf7ac6b, 0x3893bc, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYICECREAMPARROTSPAWNEGG = ITEMS.register("raspberryicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYICECREAMPARROT, 0xf7ac6b, 0xf1989e, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> LEMONICECREAMPARROTSPAWNEGG = ITEMS.register("lemonicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.LEMONICECREAMPARROT, 0xf7ac6b, 0xefe17c, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATEICECREAMPARROTSPAWNEGG = ITEMS.register("chocolateicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATEICECREAMPARROT, 0xf7ac6b, 0x4d2606, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ORANGEICECREAMPARROTSPAWNEGG = ITEMS.register("orangeicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ORANGEICECREAMPARROT, 0xf7ac6b, 0xba7016, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> PEACHICECREAMPARROTSPAWNEGG = ITEMS.register("peachicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.PEACHICECREAMPARROT, 0xf7ac6b, 0xb9937f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> TOFFEEICECREAMPARROTSPAWNEGG = ITEMS.register("toffeeicecreamparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.TOFFEEICECREAMPARROT, 0xf7ac6b, 0xb07425, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//parrots-7
	public static final RegistryObject<CustomSpawnEggItem> LEMONPARROTSPAWNEGG = ITEMS.register("lemonparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.LEMONPARROT, 0xedf35f, 0x53c66f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYPARROTSPAWNEGG = ITEMS.register("strawberryparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYPARROT, 0x730813, 0xbe9129, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYPARROTSPAWNEGG = ITEMS.register("blueberryparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYPARROT, 0x132142, 0x021f17, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYPARROTSPAWNEGG = ITEMS.register("raspberryparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYPARROT, 0xc49bb6, 0x1a765f, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> PEACHPARROTSPAWNEGG = ITEMS.register("peachparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.PEACHPARROT, 0xb9937f, 0x35974e, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> PINEAPPLEPARROTSPAWNEGG = ITEMS.register("pineappleparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.PINEAPPLEPARROT, 0xd1a941, 0x78d266, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ORANGEPARROTSPAWNEGG = ITEMS.register("orangeparrotspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ORANGEPARROT, 0xba7016, 0x025f19, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	//mice-3
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYCHEESECAKEMOUSESPAWNEGG = ITEMS.register("strawberrycheesecakemousespawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYCHEESECAKEMOUSE, 0x521306, 0xf9f7e7, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> HAZELNUTCHEESECAKEMOUSESPAWNEGG = ITEMS.register("hazelnutcheesecakemousespawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.HAZELNUTCHEESECAKEMOUSE, 0x452a05, 0x77541d, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> MARSHMALLOWPIEMOUSESPAWNEGG = ITEMS.register("marshmallowpiemousespawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.MARSHMALLOWPIEMOUSE, 0xffffff, 0xd9ccb0, new Item.Properties().tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
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

