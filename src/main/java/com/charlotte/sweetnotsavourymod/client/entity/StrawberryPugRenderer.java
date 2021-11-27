package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryPugEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StrawberryPugRenderer extends GeoEntityRenderer <StrawberryPugEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberrypug/strawberrypug.png");
	
	public StrawberryPugRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new StrawberryPugModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(StrawberryPugEntity entity) {
		return TEXTURE;
	}				
}

