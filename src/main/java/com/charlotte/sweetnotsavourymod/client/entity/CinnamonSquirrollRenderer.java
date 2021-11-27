package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.CinnamonSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.CinnamonSquirrollEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CinnamonSquirrollRenderer extends MobRenderer <CinnamonSquirrollEntity, 
CinnamonSquirrollModel<CinnamonSquirrollEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/cinnamonsquirroll/cinnamonsquirroll.png");
	
	public CinnamonSquirrollRenderer(EntityRendererManager manager) {
		
		super(manager, new CinnamonSquirrollModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull CinnamonSquirrollEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.15F, 0.15F, 0.15F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(CinnamonSquirrollEntity entity) {
		return TEXTURE;
	}
	
	
}