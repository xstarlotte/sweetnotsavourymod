package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.BlackberryIceCreamBed;
import com.charlotte.sweetnotsavourymod.common.block.PoisonOakMiniDoor;
import com.charlotte.sweetnotsavourymod.common.block.StrawberryIceCreamBed;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
	
	public static final RegistryObject<Block> WAFERWOODBLOCK = BLOCKS.register("waferwoodblock",
			() -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.AXE)
					.harvestLevel(0)
					.sound(SoundType.BAMBOO)));
	
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
	
	public static final RegistryObject<Block> LEMONCANDYBLOCK = BLOCKS.register("lemoncandyblock",
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.YELLOW)
					.hardnessAndResistance(0.6f,1200f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.NETHER_BRICK)));
	
	public static final RegistryObject<Block> STRAWBERRYCANDYOREBLOCK = BLOCKS.register("strawberrycandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> RASPBERRYCANDYOREBLOCK = BLOCKS.register("raspberrycandyoreblock",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> LEMONCANDYOREBLOCK = BLOCKS.register("lemoncandyoreblock",
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
					
}




