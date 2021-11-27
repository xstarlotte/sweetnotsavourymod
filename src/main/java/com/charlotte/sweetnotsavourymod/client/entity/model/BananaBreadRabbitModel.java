package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.BananaBreadRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BananaBreadRabbitModel extends AnimatedGeoModel<BananaBreadRabbitEntity>
{
	@Override
	public ResourceLocation getModelLocation(BananaBreadRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rabbit.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(BananaBreadRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/bananabreadrabbit/bananabreadrabbit.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(BananaBreadRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rabbit.animation.json");
	}
	
}