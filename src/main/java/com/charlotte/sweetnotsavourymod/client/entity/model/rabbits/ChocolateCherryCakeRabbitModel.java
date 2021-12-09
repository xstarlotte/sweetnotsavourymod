package com.charlotte.sweetnotsavourymod.client.entity.model.rabbits;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.ChocolateCherryCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolateCherryCakeRabbitModel extends AnimatedGeoModel<ChocolateCherryCakeRabbitEntity>
{
	@Override
	public ResourceLocation getModelLocation(ChocolateCherryCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rabbit.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ChocolateCherryCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/chocolatecherrycakerabbit/chocolatecherrycakerabbit.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ChocolateCherryCakeRabbitEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rabbit.animation.json");
	}
	
}