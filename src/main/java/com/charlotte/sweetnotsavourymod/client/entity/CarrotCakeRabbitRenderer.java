package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.CarrotCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.CarrotCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CarrotCakeRabbitRenderer extends MobRenderer <CarrotCakeRabbitEntity, 
CarrotCakeRabbitModel<CarrotCakeRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/carrotcakerabbit/carrotcakerabbit.png");
	
	public CarrotCakeRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new CarrotCakeRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull CarrotCakeRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(CarrotCakeRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}

