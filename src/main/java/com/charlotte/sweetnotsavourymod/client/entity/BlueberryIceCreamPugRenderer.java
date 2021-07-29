package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BlueberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlueberryIceCreamPugRenderer extends MobRenderer <BlueberryIceCreamPugEntity, 
BlueberryIceCreamPugModel<BlueberryIceCreamPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/blueberryicecreampug/blueberryicecreampug.png");
	
	public BlueberryIceCreamPugRenderer(EntityRendererManager manager) {
		
		super(manager, new BlueberryIceCreamPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BlueberryIceCreamPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BlueberryIceCreamPugEntity entity) {
		return TEXTURE;
	}
	
	
}

