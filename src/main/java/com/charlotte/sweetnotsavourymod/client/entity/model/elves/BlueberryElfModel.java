package com.charlotte.sweetnotsavourymod.client.entity.model.elves;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueberryElfModel extends AnimatedGeoModel<BlueberryElfEntity>
{
	@Override
	public ResourceLocation getModelLocation(BlueberryElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/elf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(BlueberryElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/blueberryelf/blueberryelf.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(BlueberryElfEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/elf.animation.json");
	}
	
}