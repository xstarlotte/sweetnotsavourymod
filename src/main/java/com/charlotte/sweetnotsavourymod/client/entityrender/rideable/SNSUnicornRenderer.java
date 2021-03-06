package com.charlotte.sweetnotsavourymod.client.entityrender.rideable;



import com.charlotte.sweetnotsavourymod.client.entitymodel.rideable.SNSUnicornModel;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RideableVariants.UnicornFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
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
	public void renderEarly(SNSUnicornEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.7F, 0.7F, 0.7F);
		} else {
			stackIn.scale(1.4F, 1.4F, 1.4F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}