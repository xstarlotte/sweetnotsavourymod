package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BlueberryIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlueberryIceCreamParrotRenderer extends MobRenderer <BlueberryIceCreamParrotEntity, 
BlueberryIceCreamParrotModel<BlueberryIceCreamParrotEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/blueberryicecreamparrot/blueberryicecreamparrot.png");
	
	public BlueberryIceCreamParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new BlueberryIceCreamParrotModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BlueberryIceCreamParrotEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BlueberryIceCreamParrotEntity entity) {
		return TEXTURE;
	}
	
	
}
