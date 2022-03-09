package com.charlotte.sweetnotsavourymod.client.entity.unicorns;



import com.charlotte.sweetnotsavourymod.client.entity.model.unicorns.SNSUnicornModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.zebras.SNSZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.unicorns.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.core.util.UnicornFlavourVariant;
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

public class SNSUnicornRenderer extends GeoEntityRenderer<SNSUnicornEntity> {
	public static final Map<UnicornFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(UnicornFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(UnicornFlavourVariant.CARROTCORN, new ResourceLocation("sweetnotsavourymod:textures/entity/unicorns/carrotcorn.png"));
				p_114874_.put(UnicornFlavourVariant.BANANACORN, new ResourceLocation("sweetnotsavourymod:textures/entity/unicorns/bananacorn.png"));

			});

	public SNSUnicornRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSUnicornModel());
		this.shadowRadius = 0.8F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSUnicornEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(SNSUnicornEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(1.4F, 1.4F, 1.4F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}