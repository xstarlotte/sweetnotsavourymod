package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSMouseModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.MouseFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSMouseRenderer extends GeoEntityRenderer <SNSMouseEntity> {
	public static final Map<MouseFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(MouseFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(MouseFlavourVariant.MARSHMALLOWPIE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/marshmallowpiemouse.png"));
				p_114874_.put(MouseFlavourVariant.HAZELNUTCHEESECAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/hazelnutcheesecakemouse.png"));
				p_114874_.put(MouseFlavourVariant.STRAWBERRYCHEESECAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/strawberrycheesecakemouse.png"));

			});

	public SNSMouseRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSMouseModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSMouseEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSMouseEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSMouseEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.1F, 0.1F, 0.1F);
		} else {
			stackIn.scale(0.2F, 0.2F, 0.2F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}