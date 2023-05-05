package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.common.registry_group.SNSFuelType;
import com.charlotte.sweetnotsavourymod.common.registry_group.SNSMachineType;
import com.charlotte.sweetnotsavourymod.common.registry_group.SlotPos;

public class GeneralInit {
	public static void loadClass() {}
	
	public static final SNSFuelType FUEL_SUGAR = new SNSFuelType("sugar");
	public static final SNSFuelType FUEL_MILK = new SNSFuelType("milk");
	
	public static final SNSMachineType MACHINE_BANANA_BAKER = new SNSMachineType("banana_baker", 2, new SlotPos(116, 46), new SlotPos(152, 64), new SNSMachineType.FuelDefinition(new SlotPos(116, 64), FUEL_SUGAR));
//	public static final SNSMachineType MACHINE_CAKE_BAKER = new SNSMachineType("cake_baker", 2, new SlotPos(116, 64), new SlotPos(152, 64), new SNSMachineType.FuelDefinition(new SlotPos(80, 64), FUEL_SUGAR));// another input: 98, 64
	public static final SNSMachineType MACHINE_CAKE_BAKER = new SNSMachineType("cake_baker", 2, new SlotPos(116, 64), new SlotPos(152, 64), new SNSMachineType.FuelDefinition(new SlotPos(80, 64), FUEL_MILK));// another input: 98, 64
	public static final SNSMachineType MACHINE_CANDYCANE_FURNACE = new SNSMachineType("candycane_furnace", 2, new SlotPos(116, 46), new SlotPos(152, 64), new SNSMachineType.FuelDefinition(new SlotPos(116, 64), FUEL_SUGAR));
	public static final SNSMachineType MACHINE_TEDDY_BEAR_PRINTER = new SNSMachineType("teddy_bear_printer", 2, new SlotPos( 116, 46), new SlotPos(152, 64));
	public static final SNSMachineType MACHINE_CANDYFLOSS_CRYSTALLIZER = new SNSMachineType("candyfloss_crystallizer", 2, new SlotPos(96, 64), new SlotPos(132, 64));
	public static final SNSMachineType MACHINE_ICE_CREAM_MACHINE = new SNSMachineType("ice_cream_machine", 2, new SlotPos(116, 64), new SlotPos(152, 64), new SNSMachineType.FuelDefinition(new SlotPos(98, 64), FUEL_MILK));
	public static final SNSMachineType MACHINE_WAFFLE_CONE_MACHINE = new SNSMachineType("waffle_cone_machine", 2, new SlotPos(116, 64), new SlotPos(152, 64));
	public static final SNSMachineType MACHINE_JAM_PRESSER = new SNSMachineType("jam_presser", 2, new SlotPos(116, 46), new SlotPos(152, 64));
}
