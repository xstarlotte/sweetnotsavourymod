package com.charlotte.sweetnotsavourymod.client.entity.zebras;


import com.charlotte.sweetnotsavourymod.client.entity.model.elves.SNSElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.zebras.SNSZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.ZebraFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSZebraRenderer extends GeoEntityRenderer<SNSZebraEntity> {
	public static final Map<ZebraFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ZebraFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(ZebraFlavourVariant.ZEBRACAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/zebracakezebra.png"));
			});

	public SNSZebraRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSZebraModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSZebraEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(SNSZebraEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(1.6F, 1.6F, 1.6F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}