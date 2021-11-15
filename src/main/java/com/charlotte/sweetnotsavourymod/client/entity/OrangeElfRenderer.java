package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.OrangeElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.OrangeElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class OrangeElfRenderer extends MobRenderer <OrangeElfEntity, 
OrangeElfModel<OrangeElfEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/orangeelf/orangeelf.png");
	
	public OrangeElfRenderer(EntityRendererManager manager) {
		
		super(manager, new OrangeElfModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull OrangeElfEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(OrangeElfEntity entity) {
		return TEXTURE;
	}
	
	
}

