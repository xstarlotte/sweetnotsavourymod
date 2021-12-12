package com.charlotte.sweetnotsavourymod.client.entity.pugs;

import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.SNSPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;

import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSPugRenderer extends GeoEntityRenderer<SNSPugEntity> {
	public static final Map<FlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(FlavourVariant.class), (p_114874_) -> {
				p_114874_.put(FlavourVariant.BLUEBERRY, new ResourceLocation("textures/entity/pugs/blueberrypug.png"));
				p_114874_.put(FlavourVariant.ORANGE, new ResourceLocation("textures/entity/pugs/orangepug.png"));
				p_114874_.put(FlavourVariant.RASPBERRY, new ResourceLocation("textures/entity/pugs/raspberrypug.png"));
				p_114874_.put(FlavourVariant.STRAWBERRY, new ResourceLocation("textures/entity/pugs/strawberrypug.png"));
				p_114874_.put(FlavourVariant.VANILLA, new ResourceLocation("textures/entity/pugs/vanillapug.png"));
				p_114874_.put(FlavourVariant.BLACKBERRY, new ResourceLocation("textures/entity/pugs/blackberrypug.png"));
				p_114874_.put(FlavourVariant.LEMON, new ResourceLocation("textures/entity/pugs/lemonpug.png"));
				p_114874_.put(FlavourVariant.CHOCOLATE, new ResourceLocation("textures/entity/pugs/chocolatepug.png"));
				p_114874_.put(FlavourVariant.TOFFEE, new ResourceLocation("textures/entity/pugs/toffeepug.png"));
			});

	public SNSPugRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSPugModel());
		this.shadowRadius = 0.7F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSPugEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
    public void renderEarly(SNSPugEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.8F, 0.8F, 0.8F);
    }
}
