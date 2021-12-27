package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.beds.*;
import com.charlotte.sweetnotsavourymod.common.block.lamps.SNSLampBlock;
import com.charlotte.sweetnotsavourymod.common.block.poisonberry.PoisonOakMiniDoor;

import com.charlotte.sweetnotsavourymod.common.block.teddies.SNSTeddyBlock;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SweetNotSavouryMod.MOD_ID);

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
		return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(tab)));
	}

	//ICECREAM TREE - STUFF
	public static final RegistryObject<Block> WAFERWOODBLOCK = registerBlock("waferwoodblock",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRIPPEDWAFERWOODBLOCK = registerBlock("strippedwaferwoodblock",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 3f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RAINBOWFROSTINGLEAVES = registerBlock("rainbowfrostingleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	//public static final RegistryObject<Block> ICECREAMTREESAPLING = registerBlock("icecreamtreesapling",
	//		() -> new IceCreamTreeSaplingBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
	//				.strength(0f)
	//				.randomTicks()
	//				.noOcclusion()
	//				.sound(SoundType.GRASS),
	//				TreeInit.ICECREAMTREE), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	
	public static final RegistryObject<Block> RAINBOWFROSTINGGRASSBLOCK = registerBlock("rainbowfrostinggrassblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> FROSTINGBLOCK = registerBlock("frostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> FROSTINGFLOWER = registerBlock("frostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYFROSTINGFLOWER = registerBlock("blackberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYFROSTINGFLOWER = registerBlock("raspberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYFROSTINGFLOWER = registerBlock("blueberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYFROSTINGFLOWER = registerBlock("strawberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONFROSTINGFLOWER = registerBlock("lemonfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEFROSTINGFLOWER = registerBlock("orangefrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> FROSTINGGRASS = registerBlock("frostinggrass",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYFROSTINGBLOCK = registerBlock("blackberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRAWBERRYFROSTINGBLOCK = registerBlock("strawberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> BLUEBERRYFROSTINGBLOCK = registerBlock("blueberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RASPBERRYFROSTINGBLOCK = registerBlock("raspberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ORANGEFROSTINGBLOCK = registerBlock("orangefrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LEMONFROSTINGBLOCK = registerBlock("lemonfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

//CANDY-STUFF
	
	public static final RegistryObject<Block> STRAWBERRYCANDYBUSH = registerBlock("strawberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYCANDYBUSH = registerBlock("raspberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYCANDYBUSH = registerBlock("blueberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYCANDYBUSH = registerBlock("blackberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONCANDYBUSH = registerBlock("lemoncandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGECANDYBUSH = registerBlock("orangecandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RAINBOWCANDYBUSH = registerBlock("rainbowcandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATECINERARIA = registerBlock("chocolatecineraria",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYCONEFLOWER = registerBlock("blackberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYCONEFLOWER = registerBlock("blueberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYCONEFLOWER = registerBlock("raspberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYCONEFLOWER = registerBlock("strawberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGECONEFLOWER = registerBlock("orangeconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONCONEFLOWER = registerBlock("lemonconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> VANILLACONEFLOWER = registerBlock("vanillaconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATECONEFLOWER = registerBlock("chocolateconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOFFEECONEFLOWER = registerBlock("toffeeconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

//POISONBERRY-STUFF	
	
	public static final RegistryObject<Block> POISONBERRYWOODPLANKS = registerBlock("poisonberrywoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> OVERGROWNPOISONBERRYWOODPLANKS = registerBlock("overgrownpoisonberrywoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONBERRYLEAVES = registerBlock("poisonberryleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> FLOWERINGPOISONBERRYLEAVES = registerBlock("floweringpoisonberryleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONGRASSBLOCK = registerBlock("poisongrassblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONBERRYPLANT = registerBlock("poisonberryplant",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE)
					.noCollission().
					instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	//other
	public static final RegistryObject<Block> CANDYCANEBUSH = registerBlock("candycanebush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	//public static final RegistryObject<Block> CANDYCANESUGARCANEBLOCK = registerBlock("candycanesugarcaneblock",
	//		() -> new CandyCaneSugarCaneBlock(BlockBehaviour.Properties
	//				.of(Material.PLANTS)
	//				.noCollission()
	//				.randomTicks()
	//				.noOcclusion()
	//				.instabreak()
	//				.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYCANEBLOCK = registerBlock("candycaneblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.BAMBOO)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RASPBERRYICINGBLOCK = registerBlock("raspberryicingblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RASPBERRYSORBETBLOCK = registerBlock("raspberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LEMONSORBETBLOCK = registerBlock("lemonsorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> BLUEBERRYSORBETBLOCK = registerBlock("blueberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLUE)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRAWBERRYSORBETBLOCK = registerBlock("strawberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_RED)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> PEACHMANGOSORBETBLOCK = registerBlock("peachmangosorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ORANGESORBETBLOCK = registerBlock("orangesorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.TERRACOTTA_ORANGE)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGCHOCOLATEBLOCK = registerBlock("meltingchocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGBLUEBERRYCHOCOLATEBLOCK = registerBlock("meltingblueberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGRASPBERRYCHOCOLATEBLOCK = registerBlock("meltingraspberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGSTRAWBERRYCHOCOLATEBLOCK = registerBlock("meltingstrawberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGORANGECHOCOLATEBLOCK = registerBlock("meltingorangechocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MELTINGLEMONCHOCOLATEBLOCK = registerBlock("meltinglemonchocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CHOCOLATECHIPCOOKIEBLOCK = registerBlock("chocolatechipcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> WHITECHOCOLATECHIPCOOKIEBLOCK = registerBlock("whitechocolatechipcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RAINBOWCOOKIEBLOCK = registerBlock("rainbowcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);


	public static final RegistryObject<Block> RASPBERRYCANDYBLOCK = registerBlock("raspberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRAWBERRYCANDYBLOCK = registerBlock("strawberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_RED)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> BLUEBERRYCANDYBLOCK = registerBlock("blueberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLUE)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LEMONCANDYBLOCK = registerBlock("lemoncandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ORANGECANDYBLOCK = registerBlock("orangecandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_ORANGE)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> WAFERWOODPLANKS = registerBlock("waferwoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> WAFERWOODWINDOW = registerBlock("waferwoodwindow",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);



	public static final RegistryObject<Block> POPCORNBLOCK = registerBlock("popcornblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> HARDENEDBANANASTONE = registerBlock("hardenedbananastone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> HARDENEDBANANABRICKS = registerBlock("hardenedbananabricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);
//ice-cream-machine
public static final RegistryObject<Block> ICE_CREAM_MACHINE = registerBlock("ice_cream_machine",
		() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
				.strength(0.6f,1200f)
				.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);



	//beds
	
	public static final RegistryObject<Block> STRAWBERRYICECREAMBED = registerBlock("strawberryicecreambed",
			() -> new StrawberryBedBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.WOOD,
				MaterialColor.COLOR_RED).strength(10f).sound(SoundType.WOOD).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYICECREAMBED = registerBlock("blackberryicecreambed",
			() -> new BlackberryBedBlock(DyeColor.PURPLE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PURPLE).strength(10f).sound(SoundType.WOOD).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYICECREAMBED = registerBlock("blueberryicecreambed",
			() -> new BlueberryBedBlock(DyeColor.BLUE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_BLUE).strength(10f).sound(SoundType.WOOD).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYICECREAMBED = registerBlock("raspberryicecreambed",
			() -> new RaspberryBedBlock(DyeColor.PINK,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PINK).strength(10f).sound(SoundType.WOOD).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONICECREAMBED = registerBlock("lemonicecreambed",
			() -> new LemonBedBlock(DyeColor.YELLOW,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_YELLOW).strength(10f).sound(SoundType.WOOD).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

//doors	
	
	public static final RegistryObject<Block> POISONOAKMINIDOOR = registerBlock("poisonoakminidoor",
			() -> new PoisonOakMiniDoor(BlockBehaviour
					.Properties
					.of(Material.WOOD,
							MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.BAMBOO)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

//lanterns	
	
	      public static final RegistryObject<Block> POISONBERRYLANTERN = registerBlock("poisonberrylantern",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> STRAWBERRYLAMP = registerBlock("strawberrylamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> RASPBERRYLAMP = registerBlock("raspberrylamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> BLUEBERRYLAMP = registerBlock("blueberrylamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> BLACKBERRYLAMP = registerBlock("blackberrylamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> LEMONLAMP = registerBlock("lemonlamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> ORANGELAMP = registerBlock("orangelamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> BLUEBERRYLOLLIPOPLAMP = registerBlock("blueberrylollipoplamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> STRAWBERRYLOLLIPOPLAMP = registerBlock("strawberrylollipoplamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> BLACKBERRYLOLLIPOPLAMP = registerBlock("blackberrylollipoplamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	  					
	      public static final RegistryObject<Block> RASPBERRYLOLLIPOPLAMP = registerBlock("raspberrylollipoplamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);
	      
	      public static final RegistryObject<Block> ORANGELOLLIPOPLAMP = registerBlock("orangelollipoplamp",
				  () -> new SNSLampBlock(BlockBehaviour
						  .Properties
						  .of(Material.METAL)
						  .requiresCorrectToolForDrops()
						  .strength(3.5F).sound(SoundType
								  .LANTERN)
						  .lightLevel((p_187433_) -> {
							  return 15;
						  }).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONLOLLIPOPLAMP = registerBlock("lemonlollipoplamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> VANILLAICECREAMLAMP = registerBlock("vanillaicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATEICECREAMLAMP = registerBlock("chocolateicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOFFEEICECREAMLAMP = registerBlock("toffeeicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYICECREAMLAMP = registerBlock("strawberryicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYICECREAMLAMP = registerBlock("raspberryicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYICECREAMLAMP = registerBlock("blackberryicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYICECREAMLAMP = registerBlock("blueberryicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONICECREAMLAMP = registerBlock("lemonicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEICECREAMLAMP = registerBlock("orangeicecreamlamp",
			() -> new SNSLampBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.requiresCorrectToolForDrops()
					.strength(3.5F).sound(SoundType
							.LANTERN)
					.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	//teddies

	public static final RegistryObject<Block> POISONBERRYATTACKERTEDDY = registerBlock("poisonberryattackerteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
					), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYARCHERTEDDY = registerBlock("poisonberryarcherteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYDEFENDERTEDDY = registerBlock("poisonberrydefenderteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYHEALERTEDDY = registerBlock("poisonberryhealerteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYGUMMYBEARTEDDY = registerBlock("strawberrygummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYGUMMYBEARTEDDY = registerBlock("raspberrygummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYGUMMYBEARTEDDY = registerBlock("blackberrygummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYGUMMYBEARTEDDY = registerBlock("blueberrygummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONGUMMYBEARTEDDY = registerBlock("lemongummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEGUMMYBEARTEDDY = registerBlock("orangegummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIMEGUMMYBEARTEDDY = registerBlock("limegummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGOGUMMYBEARTEDDY = registerBlock("mangogummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PINEAPPLEGUMMYBEARTEDDY = registerBlock("pineapplegummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACHGUMMYBEARTEDDY = registerBlock("peachgummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> COLAGUMMYBEARTEDDY = registerBlock("colagummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> APPLEGUMMYBEARTEDDY = registerBlock("applegummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHERRYGUMMYBEARTEDDY = registerBlock("cherrygummybearteddy",
			() -> new SNSTeddyBlock(BlockBehaviour
					.Properties
					.of(Material.CLOTH_DECORATION)
					.strength(0F)
					.sound(SoundType.WOOL)
					.noOcclusion()
					.noCollission()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

}




