package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StrawberryIceCreamParrotRenderer extends MobRenderer <StrawberryIceCreamParrotEntity, 
StrawberryIceCreamParrotModel<StrawberryIceCreamParrotEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberryicecreamparrot/strawberryicecreamparrot.png");
	
	public StrawberryIceCreamParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new StrawberryIceCreamParrotModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull StrawberryIceCreamParrotEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberryIceCreamParrotEntity entity) {
		return TEXTURE;
	}
	
	
}