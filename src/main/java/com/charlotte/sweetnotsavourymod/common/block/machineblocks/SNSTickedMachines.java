package com.charlotte.sweetnotsavourymod.common.block.machineblocks;

import com.charlotte.sweetnotsavourymod.common.blockentities.machines.SNSTickedMachineBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class SNSTickedMachines<BE extends SNSTickedMachineBlockEntity> extends SNSMachine<BE> {
	public SNSTickedMachines(Properties properties, Supplier<BlockEntityType<BE>> blockEntity) {
		super(properties, blockEntity);
	}
	
	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
//		return createTickerHelper(blockEntityType, getBlockEntity(), );
		//TODO
		return null;
	}
}
