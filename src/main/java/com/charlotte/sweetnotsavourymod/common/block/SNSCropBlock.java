package com.charlotte.sweetnotsavourymod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.function.Supplier;

public class SNSCropBlock extends CropsBlock {

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
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_builder) {
        p_builder.add(AGE);
    }

    @Override
    public IntegerProperty getAgeProperty()
    {return AGE;}

    @Override
    public int getMaxAge()
    {return 2;}

    @Override
    protected IItemProvider getBaseSeedId() {
        return seedItem.get();
    }
}
