package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.RaspberryElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaspberryElfRenderer extends GeoEntityRenderer <RaspberryElfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/raspberryelf/raspberryelf.png");
	
	public RaspberryElfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new RaspberryElfModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(RaspberryElfEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(RaspberryElfEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
}
