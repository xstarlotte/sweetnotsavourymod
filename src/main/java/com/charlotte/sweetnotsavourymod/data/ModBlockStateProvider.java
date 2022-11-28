package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
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
    }

    private <T extends Block> void doorBlock(RegistryObject<T> block) {
        if (block.get() instanceof DoorBlock doorBlock) {
            doorBlock(doorBlock, modLoc("blocks/%s_bottom".formatted(block.getId().getPath())), modLoc("blocks/%s_top".formatted(block.getId().getPath())));
        } else {
            throw new IllegalArgumentException("%s is not an instance of DoorBlock".formatted(block));
        }
    }
}
