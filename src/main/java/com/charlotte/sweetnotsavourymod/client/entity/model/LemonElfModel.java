package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.LemonElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LemonElfModel extends AnimatedGeoModel<LemonElfEntity>
{
	@Override
	public ResourceLocation getModelLocation(LemonElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/elf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(LemonElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/lemonelf/lemonelf.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(LemonElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/elf.animation.json");
	}
	
}