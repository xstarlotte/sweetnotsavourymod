package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.LemonElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LemonElfRenderer extends GeoEntityRenderer <LemonElfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonelf/lemonelf.png");
	
	public LemonElfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new LemonElfModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(LemonElfEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(LemonElfEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
}

