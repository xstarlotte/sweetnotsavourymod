package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.RedVelvetCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.RedVelvetCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedVelvetCakeRabbitRenderer extends MobRenderer <RedVelvetCakeRabbitEntity, 
RedVelvetCakeRabbitModel<RedVelvetCakeRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/redvelvetcakerabbit/redvelvetcakerabbit.png");
	
	public RedVelvetCakeRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new RedVelvetCakeRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull RedVelvetCakeRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(RedVelvetCakeRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}
