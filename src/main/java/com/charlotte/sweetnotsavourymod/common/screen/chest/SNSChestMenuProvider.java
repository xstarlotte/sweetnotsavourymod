package com.charlotte.sweetnotsavourymod.common.screen.chest;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestMenuProvider implements INamedContainerProvider {
	private final SNSChestMenuType type;
	private final IInventory container;

	public SNSChestMenuProvider(SNSChestMenuType type, IInventory container) {
		this.type = type;
		this.container = container;
	}

	@Override
	public ITextComponent getDisplayName() {
		return new StringTextComponent("");
	}

	@Nullable
	@Override
	public Container createMenu(int pContainerId, PlayerInventory pInventory, PlayerEntity pPlayer) {
		return new SNSChestMenu(type, pContainerId, type.template, pInventory, container);
	}
}
