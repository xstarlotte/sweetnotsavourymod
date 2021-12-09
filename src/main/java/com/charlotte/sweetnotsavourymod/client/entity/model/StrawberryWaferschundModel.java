package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberryWaferschundModel extends AnimatedGeoModel<StrawberryWaferschundEntity>
{
	@Override
	public ResourceLocation getModelLocation(StrawberryWaferschundEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/waferschund.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(StrawberryWaferschundEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/strawberrywaferschund/strawberrywaferschund.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(StrawberryWaferschundEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/waferschund.animation.json");
	}
	
}