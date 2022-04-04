package com.charlotte.sweetnotsavourymod.common.block;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class SNSCropBlock extends CropBlock {

    public static final int MAX_AGE = 2;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_2;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]
            {Block.box(0.0D, 0.0D, 0.0D,
            16.0D, 2.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D,
                    16.0D, 4.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D,
                    16.0D, 6.0D, 16.0D)};


    public Supplier <Item> seedItem;



    public SNSCropBlock(Properties properties, Supplier <Item> supplier) {
        super(properties);
        seedItem = supplier;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_builder) {
        p_builder.add(AGE);
    }

    @Override
    public IntegerProperty getAgeProperty()
    {return AGE;}

    @Override
    public int getMaxAge()
    {return 2;}

    @Override
    protected ItemLike getBaseSeedId() {
        return seedItem.get();
    }
}
