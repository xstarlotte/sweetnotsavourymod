package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BananaMonkeyModel;
import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BananaMonkeyRenderer extends MobRenderer <BananaMonkeyEntity, 
BananaMonkeyModel<BananaMonkeyEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/bananamonkey/bananamonkey.png");
	
	public BananaMonkeyRenderer(EntityRendererManager manager) {
		
		super(manager, new BananaMonkeyModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BananaMonkeyEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BananaMonkeyEntity entity) {
		return TEXTURE;
	}
	
	
}
