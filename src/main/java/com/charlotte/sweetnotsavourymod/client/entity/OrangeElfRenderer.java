package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.OrangeElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OrangeElfRenderer extends GeoEntityRenderer <OrangeElfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/orangeelf/orangeelf.png");
	
	public OrangeElfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new OrangeElfModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(OrangeElfEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(OrangeElfEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
}

