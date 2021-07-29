package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.ChocolateIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ChocolateIceCreamPugRenderer extends MobRenderer <ChocolateIceCreamPugEntity, 
ChocolateIceCreamPugModel<ChocolateIceCreamPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/chocolateicecreampug/chocolateicecreampug.png");
	
	public ChocolateIceCreamPugRenderer(EntityRendererManager manager) {
		
		super(manager, new ChocolateIceCreamPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull ChocolateIceCreamPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(ChocolateIceCreamPugEntity entity) {
		return TEXTURE;
	}
	
	
}
