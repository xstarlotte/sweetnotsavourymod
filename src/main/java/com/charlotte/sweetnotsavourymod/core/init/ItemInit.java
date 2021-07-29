package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<CustomSpawnEggItem> POISONBERRYATTACKERSPAWNEGG = ITEMS.register("poisonberryattackerspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYATTACKER, 0x2e0d39, 0x055330, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));

	public static final RegistryObject<CustomSpawnEggItem> POISONBERRYARCHERSPAWNEGG = ITEMS.register("poisonberryarcherspawnegg",
			() -> new CustomSpawnEggItem(EntityTypesInit.POISONBERRYARCHER, 0x2e0d39, 0x055330, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYPUGSPAWNEGG = ITEMS.register("strawberrypugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYPUG, 0x730813, 0xbe9129, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> TOFFEEICECREAMPUGSPAWNEGG = ITEMS.register("toffeeicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.TOFFEEICECREAMPUG, 0xffffff, 0x835e1e, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BLUEBERRYICECREAMPUGSPAWNEGG = ITEMS.register("blueberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BLUEBERRYICECREAMPUG, 0xffffff, 0x3b4f7d, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATEICECREAMPUGSPAWNEGG = ITEMS.register("chocolateicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATEICECREAMPUG, 0xffffff, 0x492d08, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> RASPBERRYICECREAMPUGSPAWNEGG = ITEMS.register("raspberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.RASPBERRYICECREAMPUG, 0xffffff, 0xd895bd, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYICECREAMPUGSPAWNEGG = ITEMS.register("strawberryicecreampugspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYICECREAMPUG, 0xffffff, 0x882229, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYELFSPAWNEGG = ITEMS.register("strawberryelfspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYELF, 0x730813, 0xbe9129, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> STRAWBERRYPIGSPAWNEGG = ITEMS.register("strawberrypigspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.STRAWBERRYPIG, 0x730813, 0xbe9129, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CARROTCAKERABBITSPAWNEGG = ITEMS.register("carrotcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CARROTCAKERABBIT, 0xd78a1d, 0x043c21, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> CHOCOLATECHERRYCAKERABBITSPAWNEGG = ITEMS.register("chocolatecherrycakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT, 0x2f1903, 0x4f040a, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> BANANABREADRABBITSPAWNEGG = ITEMS.register("bananabreadrabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.BANANABREADRABBIT, 0xf2db4b, 0x6c3c06, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ANGELCAKERABBITSPAWNEGG = ITEMS.register("angelcakerabbitspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ANGELCAKERABBIT, 0xe7dfa5, 0xefb0a3, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<CustomSpawnEggItem> ZEBRACAKEZEBRASPAWNEGG = ITEMS.register("zebracakezebraspawnegg", 
			() -> new CustomSpawnEggItem(EntityTypesInit.ZEBRACAKEZEBRA, 0xf3eeef, 0x520514, new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	
	
	
	public static final RegistryObject<Item> SPRINKLES = ITEMS.register("sprinkles", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> CINNAMONROLL = ITEMS.register("cinnamonroll", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRYSWISSROLL = ITEMS.register("strawberryswissroll", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<Item> VANILLAICECREAMSWORD = ITEMS.register("vanillaicecreamsword", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<Item> STRAWBERRYCANDY = ITEMS.register("strawberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDSTRAWBERRYCANDY = ITEMS.register("wrappedstrawberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRYLOLLIPOP = ITEMS.register("strawberrylollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRYICECREAMSWORD = ITEMS.register("strawberryicecreamsword", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<Item> RASPBERRYCANDY = ITEMS.register("raspberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDRASPBERRYCANDY = ITEMS.register("wrappedraspberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRYLOLLIPOP = ITEMS.register("raspberrylollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRYICECREAMSWORD = ITEMS.register("raspberryicecreamsword", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));

	public static final RegistryObject<Item> LEMONCANDY = ITEMS.register("lemoncandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDLEMONCANDY = ITEMS.register("wrappedlemoncandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMONLOLLIPOP = ITEMS.register("lemonlollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMONICECREAMSWORD = ITEMS.register("lemonicecreamsword", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
}
