package com.charlotte.sweetnotsavourymod.client.entityrender.dogs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.MintHumpugModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.SNSPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.MintHumpugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.HumpugVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.PugFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class MintHumpugRenderer extends GeoEntityRenderer<MintHumpugEntity> {
	public static final Map<HumpugVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(HumpugVariant.class), (p_114874_) -> {
				p_114874_.put(HumpugVariant.MINT, new ResourceLocation("sweetnotsavourymod:textures/entity/humpug/mint_humpug.png"));
			});

	public MintHumpugRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MintHumpugModel());
		this.shadowRadius = 0.4F;
	}

	@Override
	public ResourceLocation getTextureLocation(MintHumpugEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(MintHumpugEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.4F, 0.4F, 0.4F);
		} else {
			stackIn.scale(0.8F, 0.8F, 0.8F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}
