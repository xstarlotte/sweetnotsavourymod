package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberrySwissSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberrySwissSquirrollEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StrawberrySwissSquirrollRenderer extends MobRenderer <StrawberrySwissSquirrollEntity, 
StrawberrySwissSquirrollModel<StrawberrySwissSquirrollEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberryswisssquirroll/strawberryswisssquirroll.png");
	
	public StrawberrySwissSquirrollRenderer(EntityRendererManager manager) {
		
		super(manager, new StrawberrySwissSquirrollModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull StrawberrySwissSquirrollEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.15F, 0.15F, 0.15F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberrySwissSquirrollEntity entity) {
		return TEXTURE;
	}
	
	
}
