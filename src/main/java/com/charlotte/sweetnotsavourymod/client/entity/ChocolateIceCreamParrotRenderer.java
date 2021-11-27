package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.ChocolateIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.RaspberryIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.RaspberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ChocolateIceCreamParrotRenderer extends MobRenderer <ChocolateIceCreamParrotEntity, 
ChocolateIceCreamParrotModel<ChocolateIceCreamParrotEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/chocolateicecreamparrot/chocolateicecreamparrot.png");
	
	public ChocolateIceCreamParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new ChocolateIceCreamParrotModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull ChocolateIceCreamParrotEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(ChocolateIceCreamParrotEntity entity) {
		return TEXTURE;
	}
	
	
}
