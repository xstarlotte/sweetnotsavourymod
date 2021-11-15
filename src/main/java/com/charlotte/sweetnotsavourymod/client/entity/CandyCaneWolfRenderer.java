package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.CandyCaneWolfModel;
import com.charlotte.sweetnotsavourymod.common.entity.CandyCaneWolfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CandyCaneWolfRenderer extends MobRenderer <CandyCaneWolfEntity, 
CandyCaneWolfModel<CandyCaneWolfEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/candycanewolf/candycanewolf.png");
	
	public CandyCaneWolfRenderer(EntityRendererManager manager) {
		
		super(manager, new CandyCaneWolfModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull CandyCaneWolfEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(CandyCaneWolfEntity entity) {
		return TEXTURE;
	}
	
	
}
