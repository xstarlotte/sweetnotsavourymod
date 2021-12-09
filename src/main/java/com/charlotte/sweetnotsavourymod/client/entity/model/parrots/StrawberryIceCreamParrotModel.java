package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberryIceCreamParrotModel extends AnimatedGeoModel<StrawberryIceCreamParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(StrawberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(StrawberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/strawberryicecreamparrot/strawberryicecreamparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(StrawberryIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}