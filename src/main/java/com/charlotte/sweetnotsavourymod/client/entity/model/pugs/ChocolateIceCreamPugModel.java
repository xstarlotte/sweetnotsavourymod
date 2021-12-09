package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolateIceCreamPugModel extends AnimatedGeoModel<ChocolateIceCreamPugEntity>
{
	@Override
	public ResourceLocation getModelLocation(ChocolateIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreampug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ChocolateIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/chocolateicecreampug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ChocolateIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}