package com.charlotte.sweetnotsavourymod.client.entity.chipmunk;

import com.charlotte.sweetnotsavourymod.client.entity.model.chipmunks.SNSChipmunkModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.squirrels.SNSSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.chipmunks.SNSChipmunkEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.core.util.ChipmunkFlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.SquirrollFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSChipmunkRenderer extends GeoEntityRenderer <SNSChipmunkEntity> {
	public static final Map<ChipmunkFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ChipmunkFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(ChipmunkFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/chipmunks/chocolatechipmunk.png"));
				p_114874_.put(ChipmunkFlavourVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/chipmunks/whitechocolatechipmunk.png"));


			});

	public SNSChipmunkRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSChipmunkModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSChipmunkEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSChipmunkEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSChipmunkEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);
		stackIn.scale(0.5F, 0.5F, 0.5F);
	}
}