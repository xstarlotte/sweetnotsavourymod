package com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures;

import com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures.JellybabyModel;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.JellybabyEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.JellybabyVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.JellybabyVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class JellybabyRenderer extends GeoEntityRenderer<JellybabyEntity> {
	public static final Map<JellybabyVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(JellybabyVariant.class), (p_114874_) -> {
				p_114874_.put(JellybabyVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/blackberryjellybaby.png"));
				p_114874_.put(JellybabyVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/blueberryjellybaby.png"));
				p_114874_.put(JellybabyVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/raspberryjellybaby.png"));
				p_114874_.put(JellybabyVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/strawberryjellybaby.png"));
				p_114874_.put(JellybabyVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/lemonjellybaby.png"));
				p_114874_.put(JellybabyVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/orangejellybaby.png"));
				p_114874_.put(JellybabyVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/limejellybaby.png"));
				p_114874_.put(JellybabyVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/mangojellybaby.png"));
				p_114874_.put(JellybabyVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/pineapplejellybaby.png"));
				p_114874_.put(JellybabyVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/jellybabies/peachjellybaby.png"));
			});

	public JellybabyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new JellybabyModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(JellybabyEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
    public void renderEarly(JellybabyEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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
