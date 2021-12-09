package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueberryIceCreamPugModel extends AnimatedGeoModel<BlueberryIceCreamPugEntity>
{
	@Override
	public ResourceLocation getModelLocation(BlueberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreampug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(BlueberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/blueberryicecreampug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(BlueberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}