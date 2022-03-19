package com.charlotte.sweetnotsavourymod.client.entity.rabbits;

import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.SNSRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.core.util.RabbitFlavourVariant;
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
	public static final Map<RabbitFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(RabbitFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(RabbitFlavourVariant.ANGEL, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/angelcakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.BANANA, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/bananabreadrabbit.png"));
				p_114874_.put(RabbitFlavourVariant.CARROT, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/carrotcakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.CHOCOLATECHERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/chocolatecherrycakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.LEMONCURD, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/lemoncurdcakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.REDVELVET, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/redvelvetcakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/vanillacakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.VICTORIASPONGE, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/victoriaspongecakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.CHOCOLATEORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/chocolateorangecakerabbit.png"));
				p_114874_.put(RabbitFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/rabbits/strawberrycakerabbit.png"));
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
		if(animatable.isBaby()) {
			stackIn.scale(0.3F, 0.3F, 0.3F);
		} else {
			stackIn.scale(0.6F, 0.6F, 0.6F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}