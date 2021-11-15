package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.LemonPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LemonPugRenderer extends MobRenderer <LemonPugEntity, 
LemonPugModel<LemonPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonpug/lemonpug.png");
	
	public LemonPugRenderer(EntityRendererManager manager) {
		
		super(manager, new LemonPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull LemonPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(LemonPugEntity entity) {
		return TEXTURE;
	}
	
	
}
