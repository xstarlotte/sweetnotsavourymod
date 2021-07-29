package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BananaBreadRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.BananaBreadRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BananaBreadRabbitRenderer extends MobRenderer <BananaBreadRabbitEntity, 
BananaBreadRabbitModel<BananaBreadRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/bananabreadrabbit/bananabreadrabbit.png");
	
	public BananaBreadRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new BananaBreadRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BananaBreadRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BananaBreadRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}

