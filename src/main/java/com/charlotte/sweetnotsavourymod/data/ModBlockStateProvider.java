package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
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
        doorBlock(BlockInit.CANDYFLOSS_DOOR);
        doorBlock(BlockInit.WAFER_WOOD_DOOR);
        doorBlock(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR);
        doorBlock(BlockInit.WAFER_PLANK_DOOR);
        doorBlock(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR);
        doorBlock(BlockInit.FROSTING_DOOR);
        doorBlock(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR);
        doorBlock(BlockInit.TOOTHPASTE_DOOR);
        doorBlock(BlockInit.CANDYCANE_DOOR);
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
        slabBlock(BlockInit.CANDYFLOSS_SLAB, BlockInit.CANDYFLOSSBLOCK);
    }

    private <T extends Block> void slabBlock(RegistryObject<T> slabObj, RegistryObject<Block> fullBlockObj) {
        if (slabObj.get() instanceof SlabBlock slabBlock) {
            slabBlock(slabBlock, modLoc("block/%s".formatted(fullBlockObj.getId().getPath())), modLoc("blocks/%s".formatted(fullBlockObj.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of SlabBlock".formatted(slabObj.get()));
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
