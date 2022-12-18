package com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures;

import com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures.BonbonbiniModel;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.BonbonbiniEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.BonbonbiniVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class BonbonbiniRenderer extends GeoEntityRenderer<BonbonbiniEntity> {
	public static final Map<BonbonbiniVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(BonbonbiniVariant.class), (p_114874_) -> {
				p_114874_.put(BonbonbiniVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/bonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/redbonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/bluebonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/purplebonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/yellowbonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/orangebonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.APPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/greenbonbonbini.png"));
				p_114874_.put(BonbonbiniVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/bonbonbinis/whitebonbonbini.png"));
			});

	public BonbonbiniRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BonbonbiniModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(BonbonbiniEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
    public void renderEarly(BonbonbiniEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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
