package com.charlotte.sweetnotsavourymod.client.entity.pugs;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.BlueberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueberryIceCreamPugRenderer extends GeoEntityRenderer <BlueberryIceCreamPugEntity> {


	public BlueberryIceCreamPugRenderer(EntityRendererProvider.Context renderManager) {
		
		super(renderManager, new BlueberryIceCreamPugModel()); 
		this.shadowRadius = 0.3F;
	}


	@Override
	public RenderType getRenderType(BlueberryIceCreamPugEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
        super.renderEarly(animatable, stack, ticks, renderTypeBuffer, vertexBuilder, packedLightIn,
				packedOverlayIn, red, green, blue, partialTicks);
        stack.scale(0.8F, 0.8F, 0.8F);
    }
	
}

