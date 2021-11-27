package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LemonPugRenderer extends GeoEntityRenderer <LemonPugEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonpug/lemonpug.png");
	
	public LemonPugRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new LemonPugModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(LemonPugEntity entity) {
		return TEXTURE;
	}				
}
