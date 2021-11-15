package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BlueberryElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlueberryElfRenderer extends MobRenderer <BlueberryElfEntity, 
BlueberryElfModel<BlueberryElfEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/blueberryelf/blueberryelf.png");
	
	public BlueberryElfRenderer(EntityRendererManager manager) {
		
		super(manager, new BlueberryElfModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BlueberryElfEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BlueberryElfEntity entity) {
		return TEXTURE;
	}
	
	
}
