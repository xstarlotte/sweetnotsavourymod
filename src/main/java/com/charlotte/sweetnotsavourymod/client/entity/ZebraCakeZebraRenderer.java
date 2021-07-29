package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.ZebraCakeZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ZebraCakeZebraRenderer extends MobRenderer <ZebraCakeZebraEntity, 
ZebraCakeZebraModel<ZebraCakeZebraEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/zebracakezebra/zebracakezebra.png");
	
	public ZebraCakeZebraRenderer(EntityRendererManager manager) {
		
		super(manager, new ZebraCakeZebraModel<>(), 0.5f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull ZebraCakeZebraEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.8F, 0.8F, 0.8F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(ZebraCakeZebraEntity entity) {
		return TEXTURE;
	}
	
	
}

