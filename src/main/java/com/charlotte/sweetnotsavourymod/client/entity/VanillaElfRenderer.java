package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VanillaElfRenderer extends MobRenderer <VanillaElfEntity, 
VanillaElfModel<VanillaElfEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/vanillaelf/vanillaelf.png");
	
	public VanillaElfRenderer(EntityRendererManager manager) {
		
		super(manager, new VanillaElfModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull VanillaElfEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(VanillaElfEntity entity) {
		return TEXTURE;
	}
	
	
}
