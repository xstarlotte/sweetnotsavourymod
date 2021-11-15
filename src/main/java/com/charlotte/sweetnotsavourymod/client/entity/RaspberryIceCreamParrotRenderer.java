package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.RaspberryIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RaspberryIceCreamParrotRenderer extends MobRenderer <RaspberryIceCreamParrotEntity, 
RaspberryIceCreamParrotModel<RaspberryIceCreamParrotEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/raspberryicecreamparrot/raspberryicecreamparrot.png");
	
	public RaspberryIceCreamParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new RaspberryIceCreamParrotModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull RaspberryIceCreamParrotEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(RaspberryIceCreamParrotEntity entity) {
		return TEXTURE;
	}
	
	
}