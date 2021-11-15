package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.PoisonBerrySpriteModel;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerrySpriteEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PoisonBerrySpriteRenderer extends MobRenderer<PoisonBerrySpriteEntity, 
PoisonBerrySpriteModel<PoisonBerrySpriteEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/poisonberrysprite/poisonberrysprite.png");
	
	public PoisonBerrySpriteRenderer(EntityRendererManager manager) {
		
		super(manager, new PoisonBerrySpriteModel<>(), 0.1f);
		
	}
	
	@Override
	protected void preRenderCallback(@NotNull PoisonBerrySpriteEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.96F, 0.96F, 0.96F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(PoisonBerrySpriteEntity entity) {
		return TEXTURE;
	}
}

