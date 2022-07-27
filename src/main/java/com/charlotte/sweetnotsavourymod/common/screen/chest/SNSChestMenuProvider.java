package com.charlotte.sweetnotsavourymod.common.screen.chest;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestMenuProvider implements MenuProvider {
	private final SNSChestMenuType type;
	private final Container container;

	public SNSChestMenuProvider(SNSChestMenuType type, Container container) {
		this.type = type;
		this.container = container;
	}

	@Override
	public Component getDisplayName() {
		return new TextComponent("");
	}

	@Nullable
	@Override
	public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
		return new SNSChestMenu(type, pContainerId, type.template, pInventory, container);
	}
}
