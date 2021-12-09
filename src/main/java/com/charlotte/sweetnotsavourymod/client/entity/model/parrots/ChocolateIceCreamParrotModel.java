package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolateIceCreamParrotModel extends AnimatedGeoModel<ChocolateIceCreamParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(ChocolateIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ChocolateIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/chocolateicecreamparrot/chocolateicecreamparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ChocolateIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}