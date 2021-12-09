package com.charlotte.sweetnotsavourymod.client.entity.model.rabbits;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.LemonCurdCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LemonCurdCakeRabbitModel extends AnimatedGeoModel<LemonCurdCakeRabbitEntity>
{
	@Override
	public ResourceLocation getModelLocation(LemonCurdCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rabbit.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(LemonCurdCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/lemoncurdcakerabbit/lemoncurdcakerabbit.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(LemonCurdCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rabbit.animation.json");
	}
	
}