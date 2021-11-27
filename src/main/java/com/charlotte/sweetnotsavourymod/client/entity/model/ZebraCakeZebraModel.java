package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZebraCakeZebraModel extends AnimatedGeoModel<ZebraCakeZebraEntity>
{
	@Override
	public ResourceLocation getModelLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/zebra.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/zebracakezebra/zebracakezebra.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/zebra.animation.json");
	}
	
}