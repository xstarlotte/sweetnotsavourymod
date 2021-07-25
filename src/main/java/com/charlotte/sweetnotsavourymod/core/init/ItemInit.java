package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<Item> SPRINKLES = ITEMS.register("sprinkles", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<Item> STRAWBERRYCANDY = ITEMS.register("strawberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDSTRAWBERRYCANDY = ITEMS.register("wrappedstrawberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> STRAWBERRYLOLLIPOP = ITEMS.register("strawberrylollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	
	public static final RegistryObject<Item> RASPBERRYCANDY = ITEMS.register("raspberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDRASPBERRYCANDY = ITEMS.register("wrappedraspberrycandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> RASPBERRYLOLLIPOP = ITEMS.register("raspberrylollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));

	public static final RegistryObject<Item> LEMONCANDY = ITEMS.register("lemoncandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> WRAPPEDLEMONCANDY = ITEMS.register("wrappedlemoncandy", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
	public static final RegistryObject<Item> LEMONLOLLIPOP = ITEMS.register("lemonlollipop", () -> new Item(new Item.Properties().group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD)));
}
