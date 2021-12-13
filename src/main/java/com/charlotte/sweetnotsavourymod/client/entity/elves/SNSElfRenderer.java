package com.charlotte.sweetnotsavourymod.client.entity.elves;

import com.charlotte.sweetnotsavourymod.client.entity.model.elves.SNSElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;

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

public class SNSElfRenderer extends GeoEntityRenderer<SNSElfEntity> {
	public static final Map<FlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(FlavourVariant.class), (p_114874_) -> {
		p_114874_.put(FlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/blueberryelf.png"));
		p_114874_.put(FlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/orangeelf.png"));
		p_114874_.put(FlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/raspberryelf.png"));
		p_114874_.put(FlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/strawberryelf.png"));
		p_114874_.put(FlavourVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/vanillaelf.png"));
		p_114874_.put(FlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/blackberryelf.png"));
		p_114874_.put(FlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/lemonelf.png"));
		p_114874_.put(FlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/chocolateelf.png"));
		p_114874_.put(FlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/toffeeelf.png"));
	});

	public SNSElfRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSElfModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSElfEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(SNSElfEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(0.8F, 0.8F, 0.8F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
