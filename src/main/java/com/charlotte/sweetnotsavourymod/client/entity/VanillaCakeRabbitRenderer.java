package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VanillaCakeRabbitRenderer extends MobRenderer <VanillaCakeRabbitEntity, 
VanillaCakeRabbitModel<VanillaCakeRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/vanillacakerabbit/vanillacakerabbit.png");
	
	public VanillaCakeRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new VanillaCakeRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull VanillaCakeRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(VanillaCakeRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}
