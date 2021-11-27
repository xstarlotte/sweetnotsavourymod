package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.CandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CandyCaneWolfModel extends AnimatedGeoModel<CandyCaneWolfEntity>
{
	@Override
	public ResourceLocation getModelLocation(CandyCaneWolfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/wolf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(CandyCaneWolfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/candycanewolf/candycanewolf.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(CandyCaneWolfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wolf.animation.json");
	}
	
}