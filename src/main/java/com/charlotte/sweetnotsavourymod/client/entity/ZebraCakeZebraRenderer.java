package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.ZebraCakeZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ZebraCakeZebraRenderer extends GeoEntityRenderer <ZebraCakeZebraEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/zebracakezebra/zebracakezebra.png");
	
	public ZebraCakeZebraRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new ZebraCakeZebraModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(ZebraCakeZebraEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(ZebraCakeZebraEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
}

