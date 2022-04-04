package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSJamsterModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSJamsterEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.JamsterVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSJamsterRenderer extends GeoEntityRenderer <SNSJamsterEntity> {
	public static final Map<JamsterVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(JamsterVariant.class), (p_114874_) -> {
				p_114874_.put(JamsterVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/jamsters/strawberryjamster.png"));
				p_114874_.put(JamsterVariant.HONEY, new ResourceLocation("sweetnotsavourymod:textures/entity/jamsters/honeyjamster.png"));


			});

	public SNSJamsterRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSJamsterModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSJamsterEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSJamsterEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSJamsterEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.32F, 0.32F, 0.32F);
		} else {
			stackIn.scale(0.64F, 0.64F, 0.64F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}