package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.ToffeeIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ToffeeIceCreamPugRenderer extends MobRenderer <ToffeeIceCreamPugEntity, 
ToffeeIceCreamPugModel<ToffeeIceCreamPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/toffeeicecreampug/toffeeicecreampug.png");
	
	public ToffeeIceCreamPugRenderer(EntityRendererManager manager) {
		
		super(manager, new ToffeeIceCreamPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull ToffeeIceCreamPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(ToffeeIceCreamPugEntity entity) {
		return TEXTURE;
	}
	
	
}
