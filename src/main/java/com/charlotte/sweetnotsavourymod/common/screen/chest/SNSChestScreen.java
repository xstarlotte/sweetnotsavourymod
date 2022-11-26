package com.charlotte.sweetnotsavourymod.common.screen.chest;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestScreen extends ContainerScreen<SNSChestMenu> {
	public final SNSChestMenuTemplate template;

	public SNSChestScreen(SNSChestMenu menu, PlayerInventory inventory, ITextComponent title) {
		super(menu, inventory, title);
		this.template = menu.template;
		this.imageWidth = template.width;
		this.imageHeight = template.height;
	}

	@Override
	public void render(MatrixStack stack, int mx, int my, float partialTick) {
		super.render(stack, mx, my, partialTick);
		renderTooltip(stack, mx, my);
	}
	
	

	@Override
	protected void renderBg(MatrixStack stack, float partialTick, int mx, int my) {
		renderBackground(stack);
		
		RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.minecraft.getTextureManager().bind(menu.template.texture);

		blit(stack, leftPos, topPos, 0, 0, imageWidth, imageHeight);
	}

	@Override
	protected void renderLabels(MatrixStack pPoseStack, int pMouseX, int pMouseY) {}
}
