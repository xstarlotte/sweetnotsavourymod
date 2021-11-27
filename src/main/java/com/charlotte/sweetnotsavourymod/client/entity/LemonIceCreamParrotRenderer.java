package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LemonIceCreamParrotRenderer extends MobRenderer <LemonIceCreamParrotEntity, 
LemonIceCreamParrotModel<LemonIceCreamParrotEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonicecreamparrot/lemonicecreamparrot.png");
	
	public LemonIceCreamParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new LemonIceCreamParrotModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull LemonIceCreamParrotEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(LemonIceCreamParrotEntity entity) {
		return TEXTURE;
	}
	
	
}
