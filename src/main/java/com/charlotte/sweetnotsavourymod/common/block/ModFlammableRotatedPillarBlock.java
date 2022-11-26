package com.charlotte.sweetnotsavourymod.common.block;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.World;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player,
                                           ItemStack stack, ToolAction toolAction) {
        if(stack.getItem() instanceof AxeItem) {
            if(state.is(BlockInit.WAFERWOODBLOCK.get())) {
                return BlockInit.STRIPPEDWAFERWOODBLOCK.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(BlockInit.CHOCOLATEWAFERWOODBLOCK.get())) {
                return BlockInit.WAFERWOODBLOCK.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
    }
}
