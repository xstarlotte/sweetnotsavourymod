package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToffeeToadModel extends AnimatedGeoModel<ToffeeToadEntity>
{
	@Override
	public ResourceLocation getModelLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/toad.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/toffeetoad/toffeetoad.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/toad.animation.json");
	}
	
}