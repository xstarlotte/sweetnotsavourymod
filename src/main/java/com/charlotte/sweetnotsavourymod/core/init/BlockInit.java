package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.*;
import com.charlotte.sweetnotsavourymod.common.block.beds.icecreambeds.*;
import com.charlotte.sweetnotsavourymod.common.block.beds.wafflebeds.*;
import com.charlotte.sweetnotsavourymod.common.block.machineblocks.*;
import com.charlotte.sweetnotsavourymod.common.block.poisonberry.*;
import com.charlotte.sweetnotsavourymod.common.block.teddies.SNSTeddyBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestBlockEntity;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import com.charlotte.sweetnotsavourymod.common.world.dimension.PureHerbBlock;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.ChocolateIceCreamTreeGrower;
import com.charlotte.sweetnotsavourymod.common.world.features.tree.IceCreamTreeGrower;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
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

	//POTTED_FLOWERS_REGISTRY

	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}

	//ICECREAM TREE - STUFF
	public static final RegistryObject<Block> WAFERWOODBLOCK = registerBlock("waferwoodblock",
			() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CHOCOLATEWAFERWOODBLOCK = registerBlock("chocolatewaferwoodblock",
			() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRIPPEDWAFERWOODBLOCK = registerBlock("strippedwaferwoodblock",
			() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO)
					.strength(2f, 3f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RAINBOWFROSTINGLEAVES = registerBlock("rainbowfrostingleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}

			}, SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CHOCOLATERAINBOWFROSTINGLEAVES = registerBlock("chocolaterainbowfrostingleaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}

			}, SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ICECREAMTREESAPLING = registerBlock("icecreamtreesapling",
			() -> new SaplingBlock(new IceCreamTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
	SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATEICECREAMTREESAPLING = registerBlock("chocolateicecreamtreesapling",
			() -> new SaplingBlock(new ChocolateIceCreamTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

//REST


	public static final RegistryObject<Block> RAINBOWFROSTINGGRASSBLOCK = registerBlock("rainbowfrostinggrassblock",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONGRASSBLOCK = registerBlock("poisongrassblock",
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

	public static final RegistryObject<Block> FROSTINGGRASS = registerBlock("frostinggrass",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

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

	public static final RegistryObject<Block> CANDYCANE_GRASS_BLOCK = registerBlock("candycane_grass_block",
			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
					.strength(0.2f,1f)
					.randomTicks()
					.noOcclusion()
					.sound(SoundType.GRASS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

//flowers

	public static final RegistryObject<Block> FROSTINGFLOWER = registerBlock("frostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYFROSTINGFLOWER = registerBlock("blackberryfrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYFROSTINGFLOWER = registerBlock("raspberryfrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYFROSTINGFLOWER = registerBlock("blueberryfrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYFROSTINGFLOWER = registerBlock("strawberryfrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONFROSTINGFLOWER = registerBlock("lemonfrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEFROSTINGFLOWER = registerBlock("orangefrostingflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYCANDYBUSH = registerBlock("strawberrycandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYCANDYBUSH = registerBlock("raspberrycandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYCANDYBUSH = registerBlock("blueberrycandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYCANDYBUSH = registerBlock("blackberrycandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONCANDYBUSH = registerBlock("lemoncandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGECANDYBUSH = registerBlock("orangecandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIMECANDYBUSH = registerBlock("limecandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGOCANDYBUSH = registerBlock("mangocandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACHCANDYBUSH = registerBlock("peachcandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RAINBOWCANDYBUSH = registerBlock("rainbowcandybush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATECINERARIA = registerBlock("chocolatecineraria",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOFFEETULIP = registerBlock("toffeetulip",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYCONEFLOWER = registerBlock("blackberryconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYCONEFLOWER = registerBlock("blueberryconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYCONEFLOWER = registerBlock("raspberryconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRYCONEFLOWER = registerBlock("strawberryconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGECONEFLOWER = registerBlock("orangeconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONCONEFLOWER = registerBlock("lemonconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> VANILLACONEFLOWER = registerBlock("vanillaconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATECONEFLOWER = registerBlock("chocolateconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOFFEECONEFLOWER = registerBlock("toffeeconeflower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3, BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYCANEBUSH = registerBlock("candycanebush",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_FLOWER = registerBlock("candy_cane_flower",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_FLOWER_2 = registerBlock("candy_cane_flower_2",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_FLOWER_3 = registerBlock("candy_cane_flower_3",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_FLOWER_4 = registerBlock("candy_cane_flower_4",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_GRASS = registerBlock("candy_cane_grass",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_GRASS_LONG = registerBlock("candy_cane_grass_long",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYPLANT = registerBlock("poisonberryplant",
			() -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDY_CANE_SUGAR_CANE = registerBlock("candycanesugarcaneblock",
			()->new SugarCaneBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE)
					.noOcclusion()
					.noCollission()),
			SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	//potted flowers

	public static final RegistryObject<Block> POTTED_FROSTINGFLOWER = registerBlockWithoutBlockItem("potted_frostingflower",
			() -> new FlowerPotBlock(null, BlockInit.FROSTINGFLOWER, BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLACKBERRYFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_blackberryfrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.BLACKBERRYFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_RASPBERRYFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_raspberryfrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.RASPBERRYFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLUEBERRYFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_blueberryfrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.BLUEBERRYFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_STRAWBERRYFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_strawberryfrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.STRAWBERRYFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_LEMONFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_lemonfrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.LEMONFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_ORANGEFROSTINGFLOWER = registerBlockWithoutBlockItem("potted_orangefrostingflower",
			() -> new FlowerPotBlock(null, BlockInit.ORANGEFROSTINGFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_STRAWBERRYCANDYBUSH = registerBlockWithoutBlockItem("potted_strawberrycandybush",
			() -> new FlowerPotBlock(null, BlockInit.STRAWBERRYCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_RASPBERRYCANDYBUSH = registerBlockWithoutBlockItem("potted_raspberrycandybush",
			() -> new FlowerPotBlock(null, BlockInit.RASPBERRYCANDYBUSH, BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLUEBERRYCANDYBUSH = registerBlockWithoutBlockItem("potted_blueberrycandybush",
			() -> new FlowerPotBlock(null, BlockInit.BLUEBERRYCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLACKBERRYCANDYBUSH = registerBlockWithoutBlockItem("potted_blackberrycandybush",
			() -> new FlowerPotBlock(null, BlockInit.BLACKBERRYCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_LEMONCANDYBUSH = registerBlockWithoutBlockItem("potted_lemoncandybush",
			() -> new FlowerPotBlock(null, BlockInit.LEMONCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_LIMECANDYBUSH = registerBlockWithoutBlockItem("potted_limecandybush",
			() -> new FlowerPotBlock(null, BlockInit.LEMONCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_MANGOCANDYBUSH = registerBlockWithoutBlockItem("potted_mangocandybush",
			() -> new FlowerPotBlock(null, BlockInit.LEMONCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_PEACHCANDYBUSH = registerBlockWithoutBlockItem("potted_peachcandybush",
			() -> new FlowerPotBlock(null, BlockInit.LEMONCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_ORANGECANDYBUSH = registerBlockWithoutBlockItem("potted_orangecandybush",
			() -> new FlowerPotBlock(null, BlockInit.ORANGECANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_RAINBOWCANDYBUSH = registerBlockWithoutBlockItem("potted_rainbowcandybush",
			() -> new FlowerPotBlock(null, BlockInit.RAINBOWCANDYBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CHOCOLATECINERARIA = registerBlockWithoutBlockItem("potted_chocolatecineraria",
			() -> new FlowerPotBlock(null, BlockInit.CHOCOLATECINERARIA,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_TOFFEETULIP = registerBlockWithoutBlockItem("potted_toffeetulip",
			() -> new FlowerPotBlock(null, BlockInit.TOFFEETULIP,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLACKBERRYCONEFLOWER = registerBlockWithoutBlockItem("potted_blackberryconeflower",
			() -> new FlowerPotBlock(null, BlockInit.BLACKBERRYCONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_BLUEBERRYCONEFLOWER = registerBlockWithoutBlockItem("potted_blueberryconeflower",
			() -> new FlowerPotBlock(null, BlockInit.BLUEBERRYCONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_RASPBERRYCONEFLOWER = registerBlockWithoutBlockItem("potted_raspberryconeflower",
			() -> new FlowerPotBlock(null, BlockInit.RASPBERRYCONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_STRAWBERRYCONEFLOWER = registerBlockWithoutBlockItem("potted_strawberryconeflower",
			() -> new FlowerPotBlock(null, BlockInit.STRAWBERRYCONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_ORANGECONEFLOWER = registerBlockWithoutBlockItem("potted_orangeconeflower",
			() -> new FlowerPotBlock(null, BlockInit.ORANGECONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_LEMONCONEFLOWER = registerBlockWithoutBlockItem("potted_lemonconeflower",
			() -> new FlowerPotBlock(null, BlockInit.LEMONCONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_VANILLACONEFLOWER = registerBlockWithoutBlockItem("potted_vanillaconeflower",
			() -> new FlowerPotBlock(null, BlockInit.VANILLACONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CHOCOLATECONEFLOWER = registerBlockWithoutBlockItem("potted_chocolateconeflower",
			() -> new FlowerPotBlock(null, BlockInit.CHOCOLATECONEFLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_TOFFEECONEFLOWER = registerBlockWithoutBlockItem("potted_toffeeconeflower",
			() -> new FlowerPotBlock(null, BlockInit.TOFFEECONEFLOWER, BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDYCANEBUSH = registerBlockWithoutBlockItem("potted_candycanebush",
			() -> new FlowerPotBlock(null, BlockInit.CANDYCANEBUSH,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER = registerBlockWithoutBlockItem("potted_candy_cane_flower",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_FLOWER,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_2 = registerBlockWithoutBlockItem("potted_candy_cane_flower_2",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_FLOWER_2,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_3 = registerBlockWithoutBlockItem("potted_candy_cane_flower_3",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_FLOWER_3,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_4 = registerBlockWithoutBlockItem("potted_candy_cane_flower_4",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_FLOWER_4,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_GRASS = registerBlockWithoutBlockItem("potted_candy_cane_grass",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_GRASS,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_CANDY_CANE_GRASS_LONG = registerBlockWithoutBlockItem("potted_candy_cane_grass_long",
			() -> new FlowerPotBlock(null, BlockInit.CANDY_CANE_GRASS_LONG,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));

	public static final RegistryObject<Block> POTTED_POISONBERRYPLANT = registerBlockWithoutBlockItem("potted_poisonberryplant",
			() -> new FlowerPotBlock(null, BlockInit.POISONBERRYPLANT,BlockBehaviour.Properties.copy(Blocks.DANDELION)
					.noOcclusion()));


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


	public static final RegistryObject<Block> POISONBERRYWOODWINDOW = registerBlock("poisonberrywoodwindow",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONOAKWINDOW = registerBlock("poisonoakwindow",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> POISONBERRYWOODBED = registerBlock("poisonberrywoodbed",
			() -> new PoisonBerryWoodBed(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.BAMBOO)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYWOODWARDROBE = registerBlock("poisonberrywoodwardrobe",
			() -> new PoisonBerryWoodWardrobe(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.BAMBOO)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONBERRYLEAVESCHAIR = registerBlock("poisonberryleaveschair",
			() -> new PoisonBerryLeavesChair(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.GRASS)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONOAKSTOVE = registerBlock("poisonoakstove",
			() -> new PoisonOakStove(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.BAMBOO)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONOAKDRAWERS = registerBlock("poisonoakdrawers",
			() -> new PoisonOakDrawers(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.BAMBOO)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> POISONOAKTELEVISION = registerBlock("poisonoaktelevision",
			() -> new PoisonOakTelevision(BlockBehaviour
					.Properties
					.of(Material.WOOD)
					.strength(0F)
					.sound(SoundType.BAMBOO)
					.noOcclusion()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYCANEBLOCK = registerBlock("candycaneblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CANDYCANEBRICKS = registerBlock("candycanebricks",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ROTTENMOULDYCANDYCANEBLOCK = registerBlock("rottenmouldycandycaneblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ROTTENMOULDYCANDYCANEBRICKS = registerBlock("rottenmouldycandycanebricks",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

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

	public static final RegistryObject<Block> BLACKBERRYCANDYBLOCK = registerBlock("blackberrycandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PURPLE)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LEMONCANDYBLOCK = registerBlock("lemoncandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LIMECANDYBLOCK = registerBlock("limecandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> MANGOCANDYBLOCK = registerBlock("mangocandyblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)
					.strength(0.6f,1200f)
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> PEACHCANDYBLOCK = registerBlock("peachcandyblock",
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

	public static final RegistryObject<Block> CANDYFLOSSBLOCK = registerBlock("candyflossblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.SNOW)
					.strength(2f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> TOOTHPASTE_BLOCK = registerBlock("toothpaste_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.CAKE).sound(SoundType.HONEY_BLOCK)
					.strength(1f, 10f)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);



//windows

	public static final RegistryObject<Block> WAFERWOODWINDOW = registerBlock("waferwoodwindow",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CANDYCANEWINDOW = registerBlock("candycanewindow",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> CANDYCANEWINDOW2 = registerBlock("candycanewindow2",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_WINDOW = registerBlock("strawberry_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> RASPBERRY_CANDY_WINDOW = registerBlock("raspberry_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_WINDOW = registerBlock("blackberry_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_WINDOW = registerBlock("blueberry_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> ORANGE_CANDY_WINDOW = registerBlock("orange_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> LEMON_CANDY_WINDOW = registerBlock("lemon_candy_window",
			() -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
					.strength(2f, 10f).noOcclusion()), SweetNotSavouryModItemGroup.SNSMODBLOCKS);



	public static final RegistryObject<Block> POPCORNBLOCK = registerBlock("popcornblock",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> HARDENEDBANANASTONE = registerBlock("hardenedbananastone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> HARDENEDBANANABRICKS = registerBlock("hardenedbananabricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> HARDENEDBANANAPLANKS = registerBlock("hardenedbananaplanks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);

	public static final RegistryObject<Block> SMOOTHHARDENEDBANANASTONE = registerBlock("smoothhardenedbananastone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)), SweetNotSavouryModItemGroup.SNSMODBLOCKS);




//machines
public static final RegistryObject<Block> ICE_CREAM_MACHINE = registerBlock("ice_cream_machine",
		() -> new IceCreamMachineBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
				.strength(0.6f,1200f)
				.noOcclusion()
				.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> BANANA_BAKER = registerBlock("banana_baker",
			() -> new BananaBakerBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> JAM_PRESSER = registerBlock("jam_presser",
			() -> new JamPresserBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> WAFFLE_CONE_MACHINE = registerBlock("waffle_cone_machine",
			() -> new WaffleConeMachineBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> TEDDY_BEAR_PRINTER = registerBlock("teddy_bear_printer",
			() -> new TeddyBearPrinterBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> CAKE_BAKER = registerBlock("cake_baker",
			() -> new CakeBakerBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> CANDYCANE_FURNACE = registerBlock("candycane_furnace",
			() -> new CandycaneFurnaceBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);

	public static final RegistryObject<Block> CANDYFLOSS_CRYSTALIZER = registerBlock("candyfloss_crystalizer",
			() -> new CandyflossCrystalizerBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
					.strength(0.6f,1200f)
					.noOcclusion()
					.sound(SoundType.NETHER_BRICKS)), SweetNotSavouryModItemGroup.SNSMODMACHINES);




//crops

	public static final RegistryObject<Block> BANANA_CROP = BLOCKS.register("banana_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETBANANA.get()));

	public static final RegistryObject<Block> CARROT_CROP = BLOCKS.register("carrot_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETCARROT.get()));

	public static final RegistryObject<Block> PEACH_CROP = BLOCKS.register("peach_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETPEACH.get()));

	public static final RegistryObject<Block> BLACKBERRY_CROP = BLOCKS.register("blackberry_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETBLACKBERRY.get()));

	public static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETSTRAWBERRY.get()));

	public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETBLUEBERRY.get()));

	public static final RegistryObject<Block> RASPBERRY_CROP = BLOCKS.register("raspberry_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETRASPBERRY.get()));

	public static final RegistryObject<Block> LEMON_CROP = BLOCKS.register("lemon_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETLEMON.get()));

	public static final RegistryObject<Block> LIME_CROP = BLOCKS.register("lime_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETLIME.get()));

	public static final RegistryObject<Block> ORANGE_CROP = BLOCKS.register("orange_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETORANGE.get()));

	public static final RegistryObject<Block> MANGO_CROP = BLOCKS.register("mango_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETMANGO.get()));

	public static final RegistryObject<Block> PINEAPPLE_CROP = BLOCKS.register("pineapple_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.SWEETPINEAPPLE.get()));

	public static final RegistryObject<Block> VANILLA_CROP = BLOCKS.register("vanilla_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.VANILLA.get()));

	public static final RegistryObject<Block> MINT_CROP = BLOCKS.register("mint_crop",
			() -> new SNSCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)
					.noCollission().instabreak().noOcclusion(),
					() -> ItemInit.MINT.get()));

	//beds

	public static final RegistryObject<Block> STRAWBERRYICECREAMBED = registerBlock("strawberryicecreambed",
			() -> new StrawberryIceCreamBedBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.WOOD,
				MaterialColor.COLOR_RED).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYICECREAMBED = registerBlock("blackberryicecreambed",
			() -> new BlackberryIceCreamBedBlock(DyeColor.PURPLE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PURPLE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYICECREAMBED = registerBlock("blueberryicecreambed",
			() -> new BlueberryIceCreamBedBlock(DyeColor.BLUE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_BLUE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYICECREAMBED = registerBlock("raspberryicecreambed",
			() -> new RaspberryIceCreamBedBlock(DyeColor.PINK,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PINK).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONICECREAMBED = registerBlock("lemonicecreambed",
			() -> new LemonIceCreamBedBlock(DyeColor.YELLOW,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_YELLOW).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEICECREAMBED = registerBlock("orangeicecreambed",
			() -> new OrangeIceCreamBedBlock(DyeColor.ORANGE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_ORANGE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);




	public static final RegistryObject<Block> STRAWBERRYWAFFLEBED = registerBlock("strawberrywafflebed",
			() -> new StrawberryWaffleBedBlock(DyeColor.RED,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_RED).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRYWAFFLEBED = registerBlock("blueberrywafflebed",
			() -> new BlueberryWaffleBedBlock(DyeColor.BLUE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_BLUE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRYWAFFLEBED = registerBlock("raspberrywafflebed",
			() -> new RaspberryWaffleBedBlock(DyeColor.PINK,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PINK).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRYWAFFLEBED = registerBlock("blackberrywafflebed",
			() -> new BlackberryWaffleBedBlock(DyeColor.PURPLE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_PURPLE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGEWAFFLEBED = registerBlock("orangewafflebed",
			() -> new OrangeWaffleBedBlock(DyeColor.ORANGE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_ORANGE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMONWAFFLEBED = registerBlock("lemonwafflebed",
			() -> new LemonWaffleBedBlock(DyeColor.YELLOW,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_YELLOW).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOFFEEWAFFLEBED = registerBlock("toffeewafflebed",
			() -> new ToffeeWaffleBedBlock(DyeColor.ORANGE,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_ORANGE).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATEWAFFLEBED = registerBlock("chocolatewafflebed",
			() -> new ChocolateWaffleBedBlock(DyeColor.BROWN,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_BROWN).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> VANILLAWAFFLEBED = registerBlock("wafflebed",
			() -> new WaffleBedBlock(DyeColor.YELLOW,BlockBehaviour.Properties.of(Material.WOOD,
					MaterialColor.COLOR_YELLOW).strength(10f).sound(SoundType.WOOD).noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);


//doors

	public static final RegistryObject<Block> POISONOAKMINIDOOR = registerBlock("poisonoakminidoor",
			() -> new PoisonOakMiniDoor(BlockBehaviour
					.Properties
					.of(Material.WOOD,
							MaterialColor.COLOR_BROWN)
					.strength(0.6f,1200f)
					.sound(SoundType.BAMBOO)), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_DOOR = registerBlock("strawberry_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_DOOR = registerBlock("blueberry_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_DOOR = registerBlock("blackberry_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_DOOR = registerBlock("raspberry_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_DOOR = registerBlock("orange_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_DOOR = registerBlock("lemon_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_DOOR = registerBlock("lime_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_DOOR = registerBlock("mango_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_DOOR = registerBlock("peach_candy_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_DOOR = registerBlock("candyfloss_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_DOOR = registerBlock("wafer_wood_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATE_WAFER_WOOD_DOOR = registerBlock("chocolate_wafer_wood_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_PLANK_DOOR = registerBlock("wafer_plank_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CHOCOLATE_WAFER_PLANK_DOOR = registerBlock("chocolate_wafer_plank_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> FROSTING_DOOR = registerBlock("frosting_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ROTTEN_MOULDY_CANDY_CANE_DOOR = registerBlock("rotten_mouldy_candy_cane_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> TOOTHPASTE_DOOR = registerBlock("toothpaste_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(5f).requiresCorrectToolForDrops().noOcclusion()), SweetNotSavouryModItemGroup.SNSMODDECORATION);

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

//chains

	public static final RegistryObject<Block> ROTTENMOULDYCANDYCANECHAINS = registerBlock("rottenmouldycandycanechains",
			() -> new ChainBlock(BlockBehaviour
			.Properties.of(Material.METAL, MaterialColor.NONE)
			.strength(5.0F, 6.0F)
			.sound(SoundType.CHAIN)
					.noOcclusion()
					.requiresCorrectToolForDrops()
			), SweetNotSavouryModItemGroup.SNSMODDECORATION);

//stairs

	public static final RegistryObject<Block> HARDENED_BANANA_STAIRS = registerBlock
			("hardened_banana_stairs",
					() -> new StairBlock(() -> HARDENEDBANANAPLANKS.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.STONE)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_STAIRS = registerBlock
			("wafer_wood_stairs",
					() -> new StairBlock(() -> STRAWBERRYCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_STAIRS = registerBlock
			("strawberry_candy_stairs",
			() -> new StairBlock(() -> STRAWBERRYCANDYBLOCK.get().defaultBlockState(),
					BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_STAIRS = registerBlock
			("raspberry_candy_stairs",
					() -> new StairBlock(() -> RASPBERRYCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_STAIRS = registerBlock
			("blueberry_candy_stairs",
					() -> new StairBlock(() -> BLUEBERRYCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_STAIRS = registerBlock
			("blackberry_candy_stairs",
					() -> new StairBlock(() -> BLACKBERRYCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_STAIRS = registerBlock
			("orange_candy_stairs",
					() -> new StairBlock(() -> ORANGECANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_STAIRS = registerBlock
			("lemon_candy_stairs",
					() -> new StairBlock(() -> LEMONCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_STAIRS = registerBlock
			("lime_candy_stairs",
					() -> new StairBlock(() -> LEMONCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_STAIRS = registerBlock
			("mango_candy_stairs",
					() -> new StairBlock(() -> LEMONCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_STAIRS = registerBlock
			("peach_candy_stairs",
					() -> new StairBlock(() -> LEMONCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_STAIRS = registerBlock
			("candyfloss_stairs",
					() -> new StairBlock(() -> LEMONCANDYBLOCK.get().defaultBlockState(),
							BlockBehaviour
									.Properties
									.of(Material.METAL)
									.strength(5f)
									.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

//fence

	public static final RegistryObject<Block> HARDENED_BANANA_FENCE = registerBlock
			("hardened_banana_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.STONE)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_FENCE = registerBlock
			("wafer_wood_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_FENCE = registerBlock
			("strawberry_candy_fence",
			() -> new FenceBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.strength(5f)
					.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_FENCE = registerBlock
			("raspberry_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_FENCE = registerBlock
			("blackberry_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_FENCE = registerBlock
			("blueberry_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_FENCE = registerBlock
			("orange_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_FENCE = registerBlock
			("lemon_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_FENCE = registerBlock
			("lime_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_FENCE = registerBlock
			("mango_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_FENCE = registerBlock
			("peach_candy_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_FENCE = registerBlock
			("candyfloss_fence",
					() -> new FenceBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

//wall

	public static final RegistryObject<Block> HARDENED_BANANA_WALL = registerBlock
			("hardened_banana_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.STONE)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_WALL = registerBlock
			("wafer_wood_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_WALL = registerBlock
			("strawberry_candy_wall",
			() -> new WallBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.strength(5f)
					.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_WALL = registerBlock
			("raspberry_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_WALL = registerBlock
			("blackberry_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_WALL = registerBlock
			("blueberry_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_WALL = registerBlock
			("orange_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_WALL = registerBlock
			("lemon_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_WALL = registerBlock
			("lime_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_WALL = registerBlock
			("mango_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_WALL = registerBlock
			("peach_candy_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_WALL = registerBlock
			("candyfloss_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ROTTENMOULDYCANDYCANE_WALL = registerBlock
			("rottenmouldycandycane_wall",
					() -> new WallBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

//gate

	public static final RegistryObject<Block> HARDENED_BANANA_FENCE_GATE = registerBlock
			("hardened_banana_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.STONE)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_FENCE_GATE = registerBlock
			("wafer_wood_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_FENCE_GATE = registerBlock
			("strawberry_candy_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.strength(5f)
					.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_FENCE_GATE = registerBlock
			("raspberry_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_FENCE_GATE = registerBlock
			("blackberry_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_FENCE_GATE = registerBlock
			("blueberry_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_FENCE_GATE = registerBlock
			("orange_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_FENCE_GATE = registerBlock
			("lemon_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_FENCE_GATE = registerBlock
			("lime_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_FENCE_GATE = registerBlock
			("mango_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_FENCE_GATE = registerBlock
			("peach_candy_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_FENCE_GATE = registerBlock
			("candyfloss_fence_gate",
					() -> new FenceGateBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);
//slab

	public static final RegistryObject<Block> HARDENED_BANANA_SLAB = registerBlock
			("hardened_banana_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.STONE)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> WAFER_WOOD_SLAB = registerBlock
			("wafer_wood_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> STRAWBERRY_CANDY_SLAB = registerBlock
			("strawberry_candy_slab",
			() -> new SlabBlock(BlockBehaviour
					.Properties
					.of(Material.METAL)
					.strength(5f)
					.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> RASPBERRY_CANDY_SLAB = registerBlock
			("raspberry_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLACKBERRY_CANDY_SLAB = registerBlock
			("blackberry_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> BLUEBERRY_CANDY_SLAB = registerBlock
			("blueberry_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> ORANGE_CANDY_SLAB = registerBlock
			("orange_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LEMON_CANDY_SLAB = registerBlock
			("lemon_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> LIME_CANDY_SLAB = registerBlock
			("lime_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> MANGO_CANDY_SLAB = registerBlock
			("mango_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> PEACH_CANDY_SLAB = registerBlock
			("peach_candy_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	public static final RegistryObject<Block> CANDYFLOSS_SLAB = registerBlock
			("candyfloss_slab",
					() -> new SlabBlock(BlockBehaviour
							.Properties
							.of(Material.METAL)
							.strength(5f)
							.requiresCorrectToolForDrops()),
					SweetNotSavouryModItemGroup.SNSMODDECORATION);

	//test

	public static final RegistryObject<Block> PURE_HERB_BLOCK = registerBlock("pure_herb_block",
			() -> new PureHerbBlock(BlockBehaviour.Properties
					.of(Material.STONE)
					.strength(5f)
					.requiresCorrectToolForDrops()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);

	//bar

	public static final RegistryObject<Block> ROTTENMOULDYCANDYCANEBARS = registerBlock("rottenmouldycandycanebars",
			() -> new IronBarsBlock(BlockBehaviour
			.Properties.of(Material.METAL, MaterialColor.NONE)
			.requiresCorrectToolForDrops()
			.strength(5.0F, 6.0F)
			.sound(SoundType.METAL)
			.noOcclusion()),
			SweetNotSavouryModItemGroup.SNSMODDECORATION);




	public static RegistryObject<SNSChestBlock> registerChest(String name,
															  Supplier<BlockBehaviour.Properties> properties,
															  int containerSize, RegistryObject<SNSChestMenuType>
																	  menuSingle, @Nullable RegistryObject
			<SNSChestMenuType> menuDouble) {
//		AtomicReference<BlockEntityType<SNSChestBlockEntity>> entityAtomicReference = new AtomicReference<>();
//		RegistryObject<SNSChestBlock> chest = registerBlock(name,
//				()->new SNSChestBlock(properties.get(), entityAtomicReference::get, menuSingle, menuDouble == null ? ()->null : menuDouble, menuDouble != null),
//				SweetNotSavouryModItemGroup.SNSMODDECORATION);
//
//		BlockEntityTypesInit.BLOCK_ENTITY_TYPE.register(name, () -> {
//			BlockEntityType<SNSChestBlockEntity> type = BlockEntityType.Builder.of(
//					(pos, state)->new SNSChestBlockEntity(entityAtomicReference.get(), pos, state, containerSize, menuSingle),
//					chest.get()
//			).build(null);
//			entityAtomicReference.set(type);
//			return type;
//		});
//
//		return chest;


		AtomicReference<BlockEntityType<SNSChestBlockEntity>> entityAtomicReference = new AtomicReference<>();
		RegistryObject<SNSChestBlock> chest = registerBlock(name,
				menuDouble == null ?
						()->new SNSChestBlock(properties.get(), entityAtomicReference::get, menuSingle, containerSize) :
						()->new SNSChestBlockDoubleAble(properties.get(), entityAtomicReference::get, menuSingle, menuDouble, containerSize),
				SweetNotSavouryModItemGroup.SNSMODDECORATION);

		BlockEntityTypesInit.BLOCK_ENTITY_TYPE.register(name, () -> {
			SNSChestBlock chestGet = chest.get();
			BlockEntityType<SNSChestBlockEntity> type = BlockEntityType.Builder.of(
					chestGet::newBlockEntity,
					chestGet
			).build(null);
			entityAtomicReference.set(type);
			return type;
		});

		return chest;
	}

	public static final RegistryObject<SNSChestBlock> STRAWBERRY_CHEST = registerChest("strawberry_chest",
			()->BlockBehaviour.Properties.copy(Blocks.CHEST),
			15, MenuTypesInit.STRAWBERRY_CHEST, null);

	public static final RegistryObject<SNSChestBlock> WAFER_CHEST = registerChest("wafer_chest",
			()->BlockBehaviour.Properties.copy(Blocks.CHEST),
			27, MenuTypesInit.WAFER_CHEST, MenuTypesInit.WAFER_CHEST_2);

}
