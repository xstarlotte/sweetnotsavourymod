package com.charlotte.sweetnotsavourymod.common.blockentities.machines;

import com.charlotte.sweetnotsavourymod.common.blockentities.machines.SNSMachineBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public abstract class SNSTickedMachineBlockEntity extends SNSMachineBlockEntity {
	public SNSTickedMachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, String name) {
		super(type, pos, state, name);
	}
	
	public abstract void tick(Level level);
}
