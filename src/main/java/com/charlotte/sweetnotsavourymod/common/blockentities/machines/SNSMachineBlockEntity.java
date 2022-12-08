package com.charlotte.sweetnotsavourymod.common.blockentities.machines;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public abstract class SNSMachineBlockEntity extends BlockEntity implements MenuProvider {
	private final Component menuTitle;
	public SNSMachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, String name) {
		super(type, pos, state);
		this.menuTitle = SweetNotSavouryMod.translatable("container", name);
	}
	
	@Override
	public Component getDisplayName() {
		return menuTitle;
	}
	
	@Nullable
	@Override
	public AbstractContainerMenu createMenu(int pContainerId, Inventory inventory, Player player) {
		return null;
	}
}
