package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.RaspberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RaspberryIceCreamPugRenderer extends MobRenderer <RaspberryIceCreamPugEntity, 
RaspberryIceCreamPugModel<RaspberryIceCreamPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/raspberryicecreampug/raspberryicecreampug.png");
	
	public RaspberryIceCreamPugRenderer(EntityRendererManager manager) {
		
		super(manager, new RaspberryIceCreamPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull RaspberryIceCreamPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(RaspberryIceCreamPugEntity entity) {
		return TEXTURE;
	}
	
	
}
