package com.charlotte.sweetnotsavourymod.client.entityrender.birds;

import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.ChocolatePenguinModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.SNSElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolatePenguinEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants.PenguinVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class ChocolatePenguinRenderer extends GeoEntityRenderer<ChocolatePenguinEntity> {
	public static final Map<PenguinVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(PenguinVariant.class), (p_114874_) -> {
				p_114874_.put(PenguinVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/penguins/chocolatepenguin.png"));
				p_114874_.put(PenguinVariant.DARKCHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/penguins/darkchocolatepenguin.png"));
				p_114874_.put(PenguinVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/penguins/whitechocolatepenguin.png"));

	});

	public ChocolatePenguinRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChocolatePenguinModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(ChocolatePenguinEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(ChocolatePenguinEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.3F, 0.3F, 0.3F);
		} else {
			stackIn.scale(0.6F, 0.6F, 0.6F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}