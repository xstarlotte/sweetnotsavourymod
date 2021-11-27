package com.charlotte.sweetnotsavourymod.client.entity;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonCurdCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.LemonCurdCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LemonCurdCakeRabbitRenderer extends GeoEntityRenderer <LemonCurdCakeRabbitEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemoncurdcakerabbit/lemoncurdcakerabbit.png");
	
	public LemonCurdCakeRabbitRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new LemonCurdCakeRabbitModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(LemonCurdCakeRabbitEntity entity) {
		return TEXTURE;
	}				
}