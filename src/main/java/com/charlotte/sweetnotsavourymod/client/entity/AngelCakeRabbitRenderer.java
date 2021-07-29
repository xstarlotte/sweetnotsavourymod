package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AngelCakeRabbitRenderer extends MobRenderer <AngelCakeRabbitEntity, 
AngelCakeRabbitModel<AngelCakeRabbitEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/angelcakerabbit/angelcakerabbit.png");
	
	public AngelCakeRabbitRenderer(EntityRendererManager manager) {
		
		super(manager, new AngelCakeRabbitModel<>(), 0.3f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull AngelCakeRabbitEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.45F, 0.45F, 0.45F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(AngelCakeRabbitEntity entity) {
		return TEXTURE;
	}
	
	
}

