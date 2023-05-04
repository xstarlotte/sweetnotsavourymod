package com.charlotte.sweetnotsavourymod.client.entityrender.cows;

import com.charlotte.sweetnotsavourymod.client.entitymodel.cows.IceCreamCowModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.cows.MintHumbullModel;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.MintHumbullEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.CowVariants.HumbullVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class MintHumbullRenderer extends GeoEntityRenderer<MintHumbullEntity> {
	public static final Map<HumbullVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(HumbullVariant.class), (p_114874_) -> {
				p_114874_.put(HumbullVariant.MINT, new ResourceLocation("sweetnotsavourymod:textures/entity/humbull/mint_humbull.png"));

			});

	public MintHumbullRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MintHumbullModel());
		this.shadowRadius = 0.5F;
	}

	@Override
	public ResourceLocation getTextureLocation(MintHumbullEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
    public void renderEarly(MintHumbullEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.5F, 0.5F, 0.5F);
		} else {
			stackIn.scale(1F, 1F, 1F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}
