package com.charlotte.sweetnotsavourymod.common.screen.chest;

import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenu;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuTemplate;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestScreen extends AbstractContainerScreen<SNSChestMenu> {
	public final SNSChestMenuTemplate template;

	public SNSChestScreen(SNSChestMenu menu, Inventory inventory, Component title) {
		super(menu, inventory, title);
		this.template = menu.template;
		this.imageWidth = template.width;
		this.imageHeight = template.height;
	}

	@Override
	protected void renderBg(PoseStack stack, float partialTick, int mx, int my) {
		renderBackground(stack);
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
		RenderSystem.setShaderTexture(0, menu.template.texture);

		blit(stack, leftPos, topPos, 0, 0, imageWidth, imageHeight);
	}

	@Override
	protected void renderLabels(PoseStack pPoseStack, int pMouseX, int pMouseY) {}
}
