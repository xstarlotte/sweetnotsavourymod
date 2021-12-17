package com.charlotte.sweetnotsavourymod.client.entity.parrots;

import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.SNSParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;

import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
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

public class SNSParrotRenderer extends GeoEntityRenderer<SNSParrotEntity> {
	public static final Map<FlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(FlavourVariant.class), (p_114874_) -> {
				p_114874_.put(FlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/blueberryparrot.png"));
				p_114874_.put(FlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/orangeparrot.png"));
				p_114874_.put(FlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/raspberryparrot.png"));
				p_114874_.put(FlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/strawberryparrot.png"));
				p_114874_.put(FlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/blackberryparrot.png"));
				p_114874_.put(FlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/lemonparrot.png"));
				p_114874_.put(FlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/chocolateparrot.png"));
				p_114874_.put(FlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/toffeeparrot.png"));
				p_114874_.put(FlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/peachparrot.png"));
				p_114874_.put(FlavourVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/pineappleparrot.png"));
			});

	public SNSParrotRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSParrotModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSParrotEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(SNSParrotEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(0.6F, 0.6F, 0.6F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
