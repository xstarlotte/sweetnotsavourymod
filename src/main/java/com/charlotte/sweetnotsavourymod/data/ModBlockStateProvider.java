package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SweetNotSavouryMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        doorBlock(BlockInit.STRAWBERRY_CANDY_DOOR);
        doorBlock(BlockInit.BLUEBERRY_CANDY_DOOR);
        doorBlock(BlockInit.BLACKBERRY_CANDY_DOOR);
        doorBlock(BlockInit.RASPBERRY_CANDY_DOOR);
        doorBlock(BlockInit.ORANGE_CANDY_DOOR);
        doorBlock(BlockInit.LEMON_CANDY_DOOR);
        doorBlock(BlockInit.LIME_CANDY_DOOR);
        doorBlock(BlockInit.MANGO_CANDY_DOOR);
        doorBlock(BlockInit.PEACH_CANDY_DOOR);
        doorBlock(BlockInit.PINEAPPLE_CANDY_DOOR);
        doorBlock(BlockInit.CANDYFLOSS_DOOR);
        doorBlock(BlockInit.WAFER_WOOD_DOOR);
        doorBlock(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR);
        doorBlock(BlockInit.WAFER_PLANK_DOOR);
        doorBlock(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR);
        doorBlock(BlockInit.FROSTING_DOOR);
        doorBlock(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR);
        doorBlock(BlockInit.DENTIST_DOOR);
        doorBlock(BlockInit.TOOTHPASTE_DOOR);
        doorBlock(BlockInit.CANDYCANE_DOOR);
        doorBlock(BlockInit.YELLOW_CANDYCANE_DOOR);
        doorBlock(BlockInit.GREEN_CANDYCANE_DOOR);
        doorBlock(BlockInit.BLUE_CANDYCANE_DOOR);
        doorBlock(BlockInit.LIGHTBLUE_CANDYCANE_DOOR);
        doorBlock(BlockInit.HARDENEDMINT_DOOR);
        doorBlock(BlockInit.HUMBUG_DOOR);

        fenceBlock(((FenceBlock) BlockInit.HUMBUG_BRICK_FENCE.get()), blockTexture(BlockInit.HUMBUGBRICKS.get()));

        fenceGateBlock(BlockInit.HARDENED_BANANA_FENCE_GATE, BlockInit.HARDENEDBANANAPLANKS);
        fenceGateBlock(BlockInit.WAFER_WOOD_FENCE_GATE, BlockInit.WAFERWOODBLOCK);
        fenceGateBlock(BlockInit.STRAWBERRY_CANDY_FENCE_GATE, BlockInit.STRAWBERRYCANDYBLOCK);
        fenceGateBlock(BlockInit.RASPBERRY_CANDY_FENCE_GATE, BlockInit.RASPBERRYCANDYBLOCK);
        fenceGateBlock(BlockInit.BLACKBERRY_CANDY_FENCE_GATE, BlockInit.BLACKBERRYCANDYBLOCK);
        fenceGateBlock(BlockInit.BLUEBERRY_CANDY_FENCE_GATE, BlockInit.BLUEBERRYCANDYBLOCK);
        fenceGateBlock(BlockInit.ORANGE_CANDY_FENCE_GATE, BlockInit.ORANGECANDYBLOCK);
        fenceGateBlock(BlockInit.LEMON_CANDY_FENCE_GATE, BlockInit.LEMONCANDYBLOCK);
        fenceGateBlock(BlockInit.LIME_CANDY_FENCE_GATE, BlockInit.LIMECANDYBLOCK);
        fenceGateBlock(BlockInit.MANGO_CANDY_FENCE_GATE, BlockInit.MANGOCANDYBLOCK);
        fenceGateBlock(BlockInit.PEACH_CANDY_FENCE_GATE, BlockInit.PEACHCANDYBLOCK);
        fenceGateBlock(BlockInit.CANDYFLOSS_FENCE_GATE, BlockInit.CANDYFLOSSBLOCK);
        fenceGateBlock(BlockInit.CANDYCANE_FENCE_GATE, BlockInit.CANDYCANEBLOCK);
        fenceGateBlock(BlockInit.CANDYCANEBRICK_FENCE_GATE, BlockInit.CANDYCANEBRICKS);
        fenceGateBlock(BlockInit.TOOTHPASTE_FENCE_GATE, BlockInit.TOOTHPASTE_BLOCK);
        fenceGateBlock(BlockInit.TOOTHPASTE_BRICK_FENCE_GATE, BlockInit.TOOTHPASTE_BRICKS);
        slabBlock(BlockInit.CANDYFLOSS_SLAB, BlockInit.CANDYFLOSSBLOCK);
        slabBlock(BlockInit.CANDYCANE_SLAB, BlockInit.CANDYCANEBLOCK);
        slabBlock(BlockInit.CANDYCANEBRICK_SLAB, BlockInit.CANDYCANEBRICKS);
        slabBlock(BlockInit.ROTTENMOULDYCANDYCANE_SLAB, BlockInit.ROTTENMOULDYCANDYCANEBLOCK);
        slabBlock(BlockInit.ROTTENMOULDYCANDYCANEBRICK_SLAB, BlockInit.ROTTENMOULDYCANDYCANEBRICKS);
        slabBlock(BlockInit.CHOCOLATE_WAFER_WOOD_SLAB, BlockInit.CHOCOLATEWAFERWOODBLOCK);
        slabBlock(BlockInit.WAFER_PLANK_SLAB, BlockInit.WAFERWOODPLANKS);
        slabBlock(BlockInit.POPCORN_SLAB, BlockInit.POPCORNBLOCK);
        slabBlock(BlockInit.CHOCOLATECHIPCOOKIE_SLAB, BlockInit.CHOCOLATECHIPCOOKIEBLOCK);
        slabBlock(BlockInit.WHITECHOCOLATECHIPCOOKIE_SLAB, BlockInit.WHITECHOCOLATECHIPCOOKIEBLOCK);
        slabBlock(BlockInit.RAINBOWCOOKIE_SLAB, BlockInit.RAINBOWCOOKIEBLOCK);
        slabBlock(BlockInit.TOOTHPASTE_SLAB, BlockInit.TOOTHPASTE_BLOCK);
        slabBlock(BlockInit.TOOTHPASTE_BRICK_SLAB, BlockInit.TOOTHPASTE_BRICKS);
        stairsBlock(BlockInit.CANDYCANE_STAIRS, BlockInit.CANDYCANEBLOCK);
        stairsBlock(BlockInit.CANDYCANEBRICK_STAIRS, BlockInit.CANDYCANEBRICKS);
        stairsBlock(BlockInit.YELLOW_CANDYCANEBRICK_STAIRS, BlockInit.YELLOW_CANDYCANEBRICKS);
        stairsBlock(BlockInit.GREEN_CANDYCANEBRICK_STAIRS, BlockInit.GREEN_CANDYCANEBRICKS);
        stairsBlock(BlockInit.BLUE_CANDYCANEBRICK_STAIRS, BlockInit.BLUE_CANDYCANEBRICKS);
        stairsBlock(BlockInit.LIGHTBLUE_CANDYCANEBRICK_STAIRS, BlockInit.LIGHTBLUE_CANDYCANEBRICKS);
        stairsBlock(BlockInit.MINT_CHOCOLATE_BRICK_STAIRS, BlockInit.MINT_CHOCOLATE_BRICKS);
        stairsBlock(BlockInit.WAFER_PLANK_STAIRS, BlockInit.WAFERWOODPLANKS);
        stairsBlock(BlockInit.ROTTENMOULDYCANDYCANEBRICKSTAIRS, BlockInit.ROTTENMOULDYCANDYCANEBRICKS);
        stairsBlock(BlockInit.ROTTENMOULDYCANDYCANESTAIRS, BlockInit.ROTTENMOULDYCANDYCANEBLOCK);
        stairsBlock(BlockInit.TOOTHPASTE_STAIRS, BlockInit.TOOTHPASTE_BLOCK);
        stairsBlock(BlockInit.TOOTHPASTE_BRICK_STAIRS, BlockInit.TOOTHPASTE_BRICKS);
        stairsBlock(BlockInit.HARDENEDMINTBRICK_STAIRS, BlockInit.HARDENEDMINTBRICKS);
        stairsBlock(BlockInit.HUMBUGBRICK_STAIRS, BlockInit.HUMBUGBRICKS);

    }

    private <T extends Block> void slabBlock(RegistryObject<T> slabObj, RegistryObject<Block> fullBlockObj) {
        if (slabObj.get() instanceof SlabBlock slabBlock) {
            slabBlock(slabBlock, modLoc("block/%s".formatted(fullBlockObj.getId().getPath())), modLoc("blocks/%s".formatted(fullBlockObj.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of SlabBlock".formatted(slabObj.get()));
        }
    }

    private <T extends Block> void stairsBlock(RegistryObject<T> stairBlockObj, RegistryObject<Block> textureBlockObj) {
        if (stairBlockObj.get() instanceof StairBlock stairBlock) {
            stairsBlock(stairBlock, modLoc("blocks/%s".formatted(textureBlockObj.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of StairBlock".formatted(stairBlockObj.get()));
        }
    }

    private <T extends Block> void fenceGateBlock(RegistryObject<T> gateBlockObj, RegistryObject<Block> textureBlockObj) {
        if (gateBlockObj.get() instanceof FenceGateBlock gateBlock) {
            fenceGateBlock(gateBlock, modLoc("blocks/%s".formatted(textureBlockObj.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of FenceGateBlock".formatted(gateBlockObj.get()));
        }
    }

    private <T extends Block> void doorBlock(RegistryObject<T> block) {
        if (block.get() instanceof DoorBlock doorBlock) {
            doorBlock(doorBlock, modLoc("blocks/%s_bottom".formatted(block.getId().getPath())), modLoc("blocks/%s_top".formatted(block.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of DoorBlock".formatted(block));
        }
    }
}
