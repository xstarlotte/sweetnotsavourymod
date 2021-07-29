package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryPigModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StrawberryPigRenderer extends MobRenderer <StrawberryPigEntity, 
StrawberryPigModel<StrawberryPigEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberrypig/strawberrypig.png");
	
	public StrawberryPigRenderer(EntityRendererManager manager) {
		
		super(manager, new StrawberryPigModel<>(), 0.35f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull StrawberryPigEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.5F, 0.5F, 0.5F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberryPigEntity entity) {
		return TEXTURE;
	}
	
	
}

