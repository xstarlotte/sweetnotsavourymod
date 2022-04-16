package com.charlotte.sweetnotsavourymod.common.block.beds.icecreambeds;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream.LemonIceCreamBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LemonIceCreamBedBlock extends SNSBedBlock {
    public LemonIceCreamBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LemonIceCreamBedBlockEntity(pos, state);
    }
}
