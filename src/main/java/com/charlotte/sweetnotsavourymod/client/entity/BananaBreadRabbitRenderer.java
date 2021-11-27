package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.BananaBreadRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.BananaBreadRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BananaBreadRabbitRenderer extends GeoEntityRenderer <BananaBreadRabbitEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/bananabreadrabbit/bananabreadrabbit.png");
	
	public BananaBreadRabbitRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new BananaBreadRabbitModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(BananaBreadRabbitEntity entity) {
		return TEXTURE;
	}				
}