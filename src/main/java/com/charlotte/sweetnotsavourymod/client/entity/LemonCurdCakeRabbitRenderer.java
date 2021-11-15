package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonCurdCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.LemonCurdCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LemonCurdCakeRabbitRenderer extends MobRenderer <LemonCurdCakeRabbitEntity, 
LemonCurdCakeRabbitModel<LemonCurdCakeRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemoncurdcakerabbit/lemoncurdcakerabbit.png");
	
	public LemonCurdCakeRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new LemonCurdCakeRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull LemonCurdCakeRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(LemonCurdCakeRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}

