package com.charlotte.sweetnotsavourymod.common.registry_group;

import com.charlotte.sweetnotsavourymod.common.block.machineblocks.SNSMachine;
import com.charlotte.sweetnotsavourymod.common.blockentities.machines.SNSTickedMachineBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

public class SNSMachineType {
//	private final RegistryObject<? extends SNSMachine<?>> block;
//	private final RegistryObject<? extends BlockEntityType<? extends SNSTickedMachineBlockEntity>> machine;
//
//	public SNSMachineType(SlotPos[] input, SlotPos[] output, FuelDefinition fuel, TickingDefinition ticking) {
//
//	}
	
	public record FuelDefinition(SlotPos position, SNSFuelType type) {}
	public record TickingDefinition(SlotPos position, int speedMultiplier) {}
	
}
