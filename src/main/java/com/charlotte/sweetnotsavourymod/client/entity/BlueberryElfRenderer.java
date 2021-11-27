package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.BlueberryElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueberryElfRenderer extends GeoEntityRenderer <BlueberryElfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/blueberryelf/blueberryelf.png");
	
	public BlueberryElfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new BlueberryElfModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(BlueberryElfEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(BlueberryElfEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
}
