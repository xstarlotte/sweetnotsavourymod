package com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures;

import com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures.GingerbreadManModel;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.GingerbreadManEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.GingerbreadManVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class GingerbreadManRenderer extends GeoEntityRenderer<GingerbreadManEntity> {
	public static final Map<GingerbreadManVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(GingerbreadManVariant.class), (p_114874_) -> {
				p_114874_.put(GingerbreadManVariant.PLAIN, new ResourceLocation("sweetnotsavourymod:textures/entity/gingerbreadman/gingerbread_man.png"));
			});

	public GingerbreadManRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GingerbreadManModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(GingerbreadManEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
    public void renderEarly(GingerbreadManEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.25F, 0.25F, 0.25F);
		} else {
			stackIn.scale(0.5F, 0.5F, 0.5F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}
