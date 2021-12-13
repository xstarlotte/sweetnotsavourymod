package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.lamps.SNSLampBlock;
import com.charlotte.sweetnotsavourymod.common.block.poisonberry.PoisonOakMiniDoor;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SweetNotSavouryMod.MOD_ID);
//ICECREAM TREE - STUFF	
	public static final RegistryObject<Block> WAFERWOODBLOCK = BLOCKS.register("waferwoodblock",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)));
	
	public static final RegistryObject<Block> STRIPPEDWAFERWOODBLOCK = BLOCKS.register("strippedwaferwoodblock",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 3f)));
	
	public static final RegistryObject<Block> RAINBOWFROSTINGLEAVES = BLOCKS.register("rainbowfrostingleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	//public static final RegistryObject<Block> ICECREAMTREESAPLING = BLOCKS.register("icecreamtreesapling",
	//		() -> new IceCreamTreeSaplingBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
	//				.strength(0f)
	//				.randomTicks()
	//				.noOcclusion()
	//				.sound(SoundType.GRASS),
	//				TreeInit.ICECREAMTREE));
	
	public static final RegistryObject<Block> RAINBOWFROSTINGGRASSBLOCK = BLOCKS.register("rainbowfrostinggrassblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> FROSTINGBLOCK = BLOCKS.register("frostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> FROSTINGFLOWER = BLOCKS.register("frostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLACKBERRYFROSTINGFLOWER = BLOCKS.register("blackberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> RASPBERRYFROSTINGFLOWER = BLOCKS.register("raspberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLUEBERRYFROSTINGFLOWER = BLOCKS.register("blueberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> STRAWBERRYFROSTINGFLOWER = BLOCKS.register("strawberryfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> LEMONFROSTINGFLOWER = BLOCKS.register("lemonfrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> ORANGEFROSTINGFLOWER = BLOCKS.register("orangefrostingflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> FROSTINGGRASS = BLOCKS.register("frostinggrass",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLACKBERRYFROSTINGBLOCK = BLOCKS.register("blackberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> STRAWBERRYFROSTINGBLOCK = BLOCKS.register("strawberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLUEBERRYFROSTINGBLOCK = BLOCKS.register("blueberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> RASPBERRYFROSTINGBLOCK = BLOCKS.register("raspberryfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> ORANGEFROSTINGBLOCK = BLOCKS.register("orangefrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> LEMONFROSTINGBLOCK = BLOCKS.register("lemonfrostingblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
//CANDY-STUFF
	
	public static final RegistryObject<Block> STRAWBERRYCANDYBUSH = BLOCKS.register("strawberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> RASPBERRYCANDYBUSH = BLOCKS.register("raspberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> BLUEBERRYCANDYBUSH = BLOCKS.register("blueberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLACKBERRYCANDYBUSH = BLOCKS.register("blackberrycandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> LEMONCANDYBUSH = BLOCKS.register("lemoncandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> ORANGECANDYBUSH = BLOCKS.register("orangecandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> RAINBOWCANDYBUSH = BLOCKS.register("rainbowcandybush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> CHOCOLATECINERARIA = BLOCKS.register("chocolatecineraria",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLACKBERRYCONEFLOWER = BLOCKS.register("blackberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> BLUEBERRYCONEFLOWER = BLOCKS.register("blueberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> RASPBERRYCONEFLOWER = BLOCKS.register("raspberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> STRAWBERRYCONEFLOWER = BLOCKS.register("strawberryconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> ORANGECONEFLOWER = BLOCKS.register("orangeconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> LEMONCONEFLOWER = BLOCKS.register("lemonconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> VANILLACONEFLOWER = BLOCKS.register("vanillaconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> CHOCOLATECONEFLOWER = BLOCKS.register("chocolateconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> TOFFEECONEFLOWER = BLOCKS.register("toffeeconeflower",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
//POISONBERRY-STUFF	
	
	public static final RegistryObject<Block> POISONBERRYWOODPLANKS = BLOCKS.register("poisonberrywoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)
					.strength(2f, 10f)));
	
	public static final RegistryObject<Block> OVERGROWNPOISONBERRYWOODPLANKS = BLOCKS.register("overgrownpoisonberrywoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)
					.strength(2f, 10f)));
	
	public static final RegistryObject<Block> POISONBERRYLEAVES = BLOCKS.register("poisonberryleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> FLOWERINGPOISONBERRYLEAVES = BLOCKS.register("floweringpoisonberryleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_WHITE)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> POISONGRASSBLOCK = BLOCKS.register("poisongrassblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> POISONBERRYPLANT = BLOCKS.register("poisonberryplant",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE)
					.noCollission().
					instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	//other
	public static final RegistryObject<Block> CANDYCANEBUSH = BLOCKS.register("candycanebush",
			() -> new Block(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
					.noCollission()
					.instabreak()
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)));
	
	//public static final RegistryObject<Block> CANDYCANESUGARCANEBLOCK = BLOCKS.register("candycanesugarcaneblock",
	//		() -> new CandyCaneSugarCaneBlock(BlockBehaviour.Properties
	//				.of(Material.PLANTS)
	//				.noCollission()
	//				.randomTicks()
	//				.noOcclusion()
	//				.instabreak()
	//				.sound(SoundType.GRASS)));

	public static final RegistryObject<Block> CANDYCANEBLOCK = BLOCKS.register("candycaneblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.BAMBOO)));
	
	public static final RegistryObject<Block> RASPBERRYICINGBLOCK = BLOCKS.register("raspberryicingblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> RASPBERRYSORBETBLOCK = BLOCKS.register("raspberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> LEMONSORBETBLOCK = BLOCKS.register("lemonsorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> BLUEBERRYSORBETBLOCK = BLOCKS.register("blueberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLUE)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> STRAWBERRYSORBETBLOCK = BLOCKS.register("strawberrysorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_RED)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> PEACHMANGOSORBETBLOCK = BLOCKS.register("peachmangosorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> ORANGESORBETBLOCK = BLOCKS.register("orangesorbetblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.TERRACOTTA_ORANGE)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGCHOCOLATEBLOCK = BLOCKS.register("meltingchocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGBLUEBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingblueberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGRASPBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingraspberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGSTRAWBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingstrawberrychocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGORANGECHOCOLATEBLOCK = BLOCKS.register("meltingorangechocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> MELTINGLEMONCHOCOLATEBLOCK = BLOCKS.register("meltinglemonchocolateblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> CHOCOLATECHIPCOOKIEBLOCK = BLOCKS.register("chocolatechipcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)));
	
	public static final RegistryObject<Block> WHITECHOCOLATECHIPCOOKIEBLOCK = BLOCKS.register("whitechocolatechipcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)));
	
	public static final RegistryObject<Block> RAINBOWCOOKIEBLOCK = BLOCKS.register("rainbowcookieblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.WET_GRASS)));
	
	
	public static final RegistryObject<Block> RASPBERRYCANDYBLOCK = BLOCKS.register("raspberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PINK)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)));
	
	public static final RegistryObject<Block> STRAWBERRYCANDYBLOCK = BLOCKS.register("strawberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_RED)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)));
	
	public static final RegistryObject<Block> BLUEBERRYCANDYBLOCK = BLOCKS.register("blueberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLUE)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)));
	
	public static final RegistryObject<Block> LEMONCANDYBLOCK = BLOCKS.register("lemoncandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)));
	
	public static final RegistryObject<Block> ORANGECANDYBLOCK = BLOCKS.register("orangecandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_ORANGE)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)));
	
	public static final RegistryObject<Block> WAFERWOODPLANKS = BLOCKS.register("waferwoodplanks",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)));
	

	
	public static final RegistryObject<Block> POPCORNBLOCK = BLOCKS.register("popcornblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
	
	public static final RegistryObject<Block> STRAWBERRYCANDYOREBLOCK = BLOCKS.register("strawberrycandyoreblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> RASPBERRYCANDYOREBLOCK = BLOCKS.register("raspberrycandyoreblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> BLUEBERRYCANDYOREBLOCK = BLOCKS.register("blueberrycandyoreblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> LEMONCANDYOREBLOCK = BLOCKS.register("lemoncandyoreblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> ORANGECANDYOREBLOCK = BLOCKS.register("orangecandyoreblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

	
	
	//beds
	
	//public static final RegistryObject<Block> STRAWBERRYICECREAMBED = BLOCKS.register("strawberryicecreambed",
	//		() -> new SNSBedBlock( DyeColor.RED,BlockBehaviour.Properties.create(Material.WOOD,
	//				MaterialColor.RED).strength(10f).sound(SoundType.WOOD).noOcclusion()));
	//
	//public static final RegistryObject<Block> BLACKBERRYICECREAMBED = BLOCKS.register("blackberryicecreambed",
	//		() -> new SNSBedBlock( DyeColor.PURPLE,BlockBehaviour.Properties.create(Material.WOOD,
	//				MaterialColor.RED).strength(10f).sound(SoundType.WOOD).noOcclusion()));
	//
	//public static final RegistryObject<Block> BLUEBERRYICECREAMBED = BLOCKS.register("blueberryicecreambed",
	//		() -> new SNSBedBlock( DyeColor.BLUE,BlockBehaviour.Properties.create(Material.WOOD,
	//				MaterialColor.RED).strength(10f).sound(SoundType.WOOD).noOcclusion()));
	//
	//public static final RegistryObject<Block> RASPBERRYICECREAMBED = BLOCKS.register("raspberryicecreambed",
	//		() -> new SNSBedBlock( DyeColor.PINK,BlockBehaviour.Properties.create(Material.WOOD,
	//				MaterialColor.RED).strength(10f).sound(SoundType.WOOD).noOcclusion()));
	//
	//public static final RegistryObject<Block> LEMONICECREAMBED = BLOCKS.register("lemonicecreambed",
	//		() -> new SNSBedBlock( DyeColor.YELLOW,BlockBehaviour.Properties.create(Material.WOOD,
	//				MaterialColor.RED).strength(10f).sound(SoundType.WOOD).noOcclusion()));

//doors	
	
	public static final RegistryObject<Block> POISONOAKMINIDOOR = BLOCKS.register("poisonoakminidoor",
			() -> new PoisonOakMiniDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.BAMBOO)));	

//lanterns	
	
	      public static final RegistryObject<Block> POISONBERRYLANTERN = BLOCKS.register("poisonberrylantern",
	  			() -> new SNSLampBlock(BlockBehaviour
						.Properties
						.of(Material.METAL)
						.requiresCorrectToolForDrops()
						.strength(3.5F).sound(SoundType
								.LANTERN)
						.lightLevel((p_187433_) -> {
							return 15;
						}).noOcclusion()));
	      
	      public static final RegistryObject<Block> STRAWBERRYLAMP = BLOCKS.register("strawberrylamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> RASPBERRYLAMP = BLOCKS.register("raspberrylamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> BLUEBERRYLAMP = BLOCKS.register("blueberrylamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> BLACKBERRYLAMP = BLOCKS.register("blackberrylamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
						return 15;
					}).noOcclusion()));
	      
	      public static final RegistryObject<Block> LEMONLAMP = BLOCKS.register("lemonlamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> ORANGELAMP = BLOCKS.register("orangelamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> BLUEBERRYLOLLIPOPLAMP = BLOCKS.register("blueberrylollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> STRAWBERRYLOLLIPOPLAMP = BLOCKS.register("strawberrylollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> BLACKBERRYLOLLIPOPLAMP = BLOCKS.register("blackberrylollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	  					
	      public static final RegistryObject<Block> RASPBERRYLOLLIPOPLAMP = BLOCKS.register("raspberrylollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> ORANGELOLLIPOPLAMP = BLOCKS.register("orangelollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	      
	      public static final RegistryObject<Block> LEMONLOLLIPOPLAMP = BLOCKS.register("lemonlollipoplamp",
		  			() -> new SNSLampBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.requiresCorrectToolForDrops()
							.strength(3.5F).sound(SoundType
									.LANTERN)
							.lightLevel((p_187433_) -> {
								return 15;
							}).noOcclusion()));
	  					
	  								
	  					
}




