package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryWaferschundModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StrawberryWaferschundRenderer extends MobRenderer <StrawberryWaferschundEntity, 
StrawberryWaferschundModel<StrawberryWaferschundEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberrywaferschund/strawberrywaferschund.png");
	
	public StrawberryWaferschundRenderer(EntityRendererManager manager) {
		
		super(manager, new StrawberryWaferschundModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull StrawberryWaferschundEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberryWaferschundEntity entity) {
		return TEXTURE;
	}
	
	
}
