package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;
import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberryIceCreamPugModel extends AnimatedGeoModel<StrawberryIceCreamPugEntity>
{
	@Override
	public ResourceLocation getModelLocation(StrawberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreampug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(StrawberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/strawberryicecreampug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(StrawberryIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}