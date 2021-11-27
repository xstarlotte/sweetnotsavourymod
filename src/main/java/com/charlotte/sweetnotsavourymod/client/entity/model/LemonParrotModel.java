package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ParrotModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LemonParrotModel extends AnimatedGeoModel<LemonParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(LemonParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(LemonParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/lemonparrot/lemonparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(LemonParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}