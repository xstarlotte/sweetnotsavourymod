package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LemonParrotRenderer extends GeoEntityRenderer <LemonParrotEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonparrot/lemonparrot.png");
	
	public LemonParrotRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new LemonParrotModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(LemonParrotEntity entity) {
		return TEXTURE;
	}				
}