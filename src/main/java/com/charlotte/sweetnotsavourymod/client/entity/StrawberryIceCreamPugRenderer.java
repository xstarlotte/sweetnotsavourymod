package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StrawberryIceCreamPugRenderer extends MobRenderer <StrawberryIceCreamPugEntity, 
StrawberryIceCreamPugModel<StrawberryIceCreamPugEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberryicecreampug/strawberryicecreampug.png");
	
	public StrawberryIceCreamPugRenderer(EntityRendererManager manager) {
		
		super(manager, new StrawberryIceCreamPugModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull StrawberryIceCreamPugEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberryIceCreamPugEntity entity) {
		return TEXTURE;
	}
	
	
}

