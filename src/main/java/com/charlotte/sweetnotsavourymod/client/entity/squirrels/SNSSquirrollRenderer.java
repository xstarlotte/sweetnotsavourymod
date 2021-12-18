package com.charlotte.sweetnotsavourymod.client.entity.squirrels;

import com.charlotte.sweetnotsavourymod.client.entity.model.mice.SNSMouseModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.squirrels.SNSSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.core.util.MouseFlavourVariant;
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

public class SNSSquirrollRenderer extends GeoEntityRenderer <SNSSquirrollEntity> {
	public static final Map<SquirrollFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(SquirrollFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(SquirrollFlavourVariant.CINNAMON, new ResourceLocation("sweetnotsavourymod:textures/entity/squirrolls/cinnamonsquirroll.png"));
				p_114874_.put(SquirrollFlavourVariant.STRAWBERRYSWISS, new ResourceLocation("sweetnotsavourymod:textures/entity/squirrolls/strawberryswisssquirroll.png"));

			});

	public SNSSquirrollRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSSquirrollModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSquirrollEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSSquirrollEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSSquirrollEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);
		stackIn.scale(0.2F, 0.2F, 0.2F);
	}
}