package com.charlotte.sweetnotsavourymod.common.screen;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;

public class TeddyBearPrinterScreen extends ContainerScreen<TeddyBearPrinterMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/gui/teddy_bear_printer_gui.png");

    public TeddyBearPrinterScreen(TeddyBearPrinterMenu pMenu, PlayerInventory pPlayerInventory, ITextComponent pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(MatrixStack pPoseStack, float pPartialTicks, int pMouseX, int pMouseY) {
        
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bind(TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void render(MatrixStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
