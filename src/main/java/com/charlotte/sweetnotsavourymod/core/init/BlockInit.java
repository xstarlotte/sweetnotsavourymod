package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.BlackberryIceCreamBed;
import com.charlotte.sweetnotsavourymod.common.block.CandyCaneSugarCaneBlock;
import com.charlotte.sweetnotsavourymod.common.block.IceCreamTreeSaplingBlock;
import com.charlotte.sweetnotsavourymod.common.block.PoisonBerryLantern;
import com.charlotte.sweetnotsavourymod.common.block.PoisonOakMiniDoor;
import com.charlotte.sweetnotsavourymod.common.block.StrawberryChest;
import com.charlotte.sweetnotsavourymod.common.block.StrawberryIceCreamBed;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SweetNotSavouryMod.MOD_ID);
//ICECREAM TREE - STUFF	
	public static final RegistryObject<Block> WAFERWOODBLOCK = BLOCKS.register("waferwoodblock",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.BAMBOO)
					.hardnessAndResistance(2f, 10f).harvestLevel(0).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> STRIPPEDWAFERWOODBLOCK = BLOCKS.register("strippedwaferwoodblock",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.BAMBOO)
					.hardnessAndResistance(2f, 3f).harvestLevel(0).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> RAINBOWFROSTINGLEAVES = BLOCKS.register("rainbowfrostingleaves",
			() -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA)
					.hardnessAndResistance(0.2f,1f)
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> ICECREAMTREESAPLING = BLOCKS.register("icecreamtreesapling",
			() -> new IceCreamTreeSaplingBlock(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA)
					.hardnessAndResistance(0f)
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT),
					TreeInit.ICECREAMTREE));
	
//POISONBERRY-STUFF	
	
	public static final RegistryObject<Block> POISONBERRYWOODPLANKS = BLOCKS.register("poisonberrywoodplanks",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD)
					.hardnessAndResistance(2f, 10f).harvestLevel(0).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> OVERGROWNPOISONBERRYWOODPLANKS = BLOCKS.register("overgrownpoisonberrywoodplanks",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD)
					.hardnessAndResistance(2f, 10f).harvestLevel(0).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> POISONBERRYLEAVES = BLOCKS.register("poisonberryleaves",
			() -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA)
					.hardnessAndResistance(0.2f,1f)
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> FLOWERINGPOISONBERRYLEAVES = BLOCKS.register("floweringpoisonberryleaves",
			() -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA)
					.hardnessAndResistance(0.2f,1f)
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> POISONGRASSBLOCK = BLOCKS.register("poisongrassblock",
			() -> new Block(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA)
					.hardnessAndResistance(0.2f,1f)
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> POISONBERRYPLANT = BLOCKS.register("poisonberryplant",
			() -> new Block(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.PURPLE)
					.doesNotBlockMovement().
					zeroHardnessAndResistance()
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> CANDYCANEBUSH = BLOCKS.register("candycanebush",
			() -> new Block(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.RED)
					.doesNotBlockMovement()
					.zeroHardnessAndResistance()
					.tickRandomly()
					.notSolid()
					.sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> CANDYCANESUGARCANEBLOCK = BLOCKS.register("candycanesugarcaneblock",
			() -> new CandyCaneSugarCaneBlock(AbstractBlock.Properties
					.create(Material.PLANTS)
					.doesNotBlockMovement()
					.tickRandomly()
					.notSolid()
					.zeroHardnessAndResistance()
					.sound(SoundType.PLANT)));

	public static final RegistryObject<Block> CANDYCANEBLOCK = BLOCKS.register("candycaneblock",
			() -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.AXE)
					.harvestLevel(0)
					.sound(SoundType.BAMBOO)));
	
	public static final RegistryObject<Block> RASPBERRYICINGBLOCK = BLOCKS.register("raspberryicingblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.PINK)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> RASPBERRYSORBETBLOCK = BLOCKS.register("raspberrysorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.PINK)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> LEMONSORBETBLOCK = BLOCKS.register("lemonsorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.YELLOW)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> BLUEBERRYSORBETBLOCK = BLOCKS.register("blueberrysorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BLUE)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> STRAWBERRYSORBETBLOCK = BLOCKS.register("strawberrysorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.RED)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> PEACHMANGOSORBETBLOCK = BLOCKS.register("peachmangosorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.PINK)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> ORANGESORBETBLOCK = BLOCKS.register("orangesorbetblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.ORANGE_TERRACOTTA)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGCHOCOLATEBLOCK = BLOCKS.register("meltingchocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGBLUEBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingblueberrychocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGRASPBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingraspberrychocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGSTRAWBERRYCHOCOLATEBLOCK = BLOCKS.register("meltingstrawberrychocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGORANGECHOCOLATEBLOCK = BLOCKS.register("meltingorangechocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> MELTINGLEMONCHOCOLATEBLOCK = BLOCKS.register("meltinglemonchocolateblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.HONEY)));
	
	public static final RegistryObject<Block> CHOCOLATECHIPCOOKIEBLOCK = BLOCKS.register("chocolatechipcookieblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.WET_GRASS)));
	
	public static final RegistryObject<Block> WHITECHOCOLATECHIPCOOKIEBLOCK = BLOCKS.register("whitechocolatechipcookieblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.WET_GRASS)));
	
	public static final RegistryObject<Block> RAINBOWCOOKIEBLOCK = BLOCKS.register("rainbowcookieblock",
			() -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(0)
					.sound(SoundType.WET_GRASS)));
	
	
	public static final RegistryObject<Block> RASPBERRYCANDYBLOCK = BLOCKS.register("raspberrycandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.PINK)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	public static final RegistryObject<Block> STRAWBERRYCANDYBLOCK = BLOCKS.register("strawberrycandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.RED)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	public static final RegistryObject<Block> BLUEBERRYCANDYBLOCK = BLOCKS.register("blueberrycandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	public static final RegistryObject<Block> LEMONCANDYBLOCK = BLOCKS.register("lemoncandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.YELLOW)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	public static final RegistryObject<Block> ORANGECANDYBLOCK = BLOCKS.register("orangecandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.ORANGE_TERRACOTTA)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	
	public static final RegistryObject<Block> STRAWBERRYCHEST = BLOCKS.register("strawberrychest", 
			() -> new StrawberryChest(AbstractBlock.Properties.create(Material.WOOD)
					.hardnessAndResistance(2.5F).sound(SoundType.WOOD), null
					));				
	
	public static final RegistryObject<Block> STRAWBERRYCANDYOREBLOCK = BLOCKS.register("strawberrycandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> RASPBERRYCANDYOREBLOCK = BLOCKS.register("raspberrycandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> BLUEBERRYCANDYOREBLOCK = BLOCKS.register("blueberrycandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> LEMONCANDYOREBLOCK = BLOCKS.register("lemoncandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> ORANGECANDYOREBLOCK = BLOCKS.register("orangecandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> STRAWBERRYICECREAMBED = BLOCKS.register("strawberryicecreambed",
			() -> new StrawberryIceCreamBed( DyeColor.RED,AbstractBlock.Properties.create(Material.WOOD,
					MaterialColor.RED).hardnessAndResistance(10f).sound(SoundType.WOOD).notSolid()));
	
	public static final RegistryObject<Block> BLACKBERRYICECREAMBED = BLOCKS.register("blackberryicecreambed",
			() -> new BlackberryIceCreamBed( DyeColor.PURPLE,AbstractBlock.Properties.create(Material.WOOD,
					MaterialColor.RED).hardnessAndResistance(10f).sound(SoundType.WOOD).notSolid()));
	
	public static final RegistryObject<Block> POISONOAKMINIDOOR = BLOCKS.register("poisonoakminidoor",
			() -> new PoisonOakMiniDoor(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.AXE)
					.harvestLevel(0)
					.sound(SoundType.BAMBOO)));	
	
	      public static final RegistryObject<Block> POISONBERRYLANTERN = BLOCKS.register("poisonberrylantern",
	  			() -> new PoisonBerryLantern(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BROWN)
	  					.hardnessAndResistance(3.5f)
	  					.setRequiresTool()
	  					.sound(SoundType.LANTERN)
	  					.setLightLevel((state) -> {
	  				      return 15;  })
	  					.notSolid()));		
	  					
}




