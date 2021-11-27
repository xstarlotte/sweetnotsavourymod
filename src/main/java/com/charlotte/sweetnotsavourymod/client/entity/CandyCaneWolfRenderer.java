package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.CandyCaneWolfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.CandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CandyCaneWolfRenderer extends GeoEntityRenderer <CandyCaneWolfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/candycanewolf/candycanewolf.png");
	
	public CandyCaneWolfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new CandyCaneWolfModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(CandyCaneWolfEntity entity) {
		return TEXTURE;
	}				
}
