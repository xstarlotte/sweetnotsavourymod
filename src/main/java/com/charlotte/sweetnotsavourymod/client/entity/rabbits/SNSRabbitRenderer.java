package com.charlotte.sweetnotsavourymod.client.entity.rabbits;

import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.SNSRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.core.util.RabbitFlavourVariants;
import com.google.common.collect.Maps;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSRabbitRenderer extends GeoEntityRenderer <SNSRabbitEntity> {
	public static final Map<RabbitFlavourVariants, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(RabbitFlavourVariants.class), (p_114874_) -> {
				p_114874_.put(RabbitFlavourVariants.ANGEL, new ResourceLocation("textures/entity/pugs/blueberrypug.png"));
				p_114874_.put(RabbitFlavourVariants.BANANA, new ResourceLocation("textures/entity/pugs/orangepug.png"));
				p_114874_.put(RabbitFlavourVariants.CARROT, new ResourceLocation("textures/entity/pugs/raspberrypug.png"));
				p_114874_.put(RabbitFlavourVariants.CHOCOLATECHERRY, new ResourceLocation("textures/entity/pugs/strawberrypug.png"));
				p_114874_.put(RabbitFlavourVariants.LEMONCURD, new ResourceLocation("textures/entity/pugs/vanillapug.png"));
				p_114874_.put(RabbitFlavourVariants.REDVELVET, new ResourceLocation("textures/entity/pugs/blackberrypug.png"));
				p_114874_.put(RabbitFlavourVariants.VANILLA, new ResourceLocation("textures/entity/pugs/lemonpug.png"));
			});

	public SNSRabbitRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSRabbitModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSRabbitEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSRabbitEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSRabbitEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);
		stackIn.scale(0.6F, 0.6F, 0.6F);
	}
}