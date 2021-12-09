package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueberryIceCreamParrotModel extends AnimatedGeoModel<BlueberryIceCreamParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(BlueberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(BlueberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/blueberryicecreamparrot/blueberryicecreamparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(BlueberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}