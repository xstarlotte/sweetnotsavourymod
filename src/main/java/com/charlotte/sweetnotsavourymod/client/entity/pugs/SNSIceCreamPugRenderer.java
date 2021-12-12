package com.charlotte.sweetnotsavourymod.client.entity.pugs;

import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.SNSIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSIceCreamPugRenderer extends GeoEntityRenderer<SNSIceCreamPugEntity> {
	public static final Map<FlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(FlavourVariant.class), (p_114874_) -> {
				p_114874_.put(FlavourVariant.BLUEBERRY, new ResourceLocation("textures/entity/pugs/blueberryicecreampug.png"));
				p_114874_.put(FlavourVariant.ORANGE, new ResourceLocation("textures/entity/pugs/orangeicecreampug.png"));
				p_114874_.put(FlavourVariant.RASPBERRY, new ResourceLocation("textures/entity/pugs/raspberryicecreampug.png"));
				p_114874_.put(FlavourVariant.STRAWBERRY, new ResourceLocation("textures/entity/pugs/strawberryicecreampug.png"));
				p_114874_.put(FlavourVariant.VANILLA, new ResourceLocation("textures/entity/pugs/vanillaicecreampug.png"));
				p_114874_.put(FlavourVariant.BLACKBERRY, new ResourceLocation("textures/entity/pugs/blackberryicecreampug.png"));
				p_114874_.put(FlavourVariant.LEMON, new ResourceLocation("textures/entity/pugs/lemonicecreampug.png"));
				p_114874_.put(FlavourVariant.CHOCOLATE, new ResourceLocation("textures/entity/pugs/chocolateicecreampug.png"));
				p_114874_.put(FlavourVariant.TOFFEE, new ResourceLocation("textures/entity/pugs/toffeeicecreampug.png"));
			});

	public SNSIceCreamPugRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSIceCreamPugModel());
		this.shadowRadius = 0.3F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamPugEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(SNSIceCreamPugEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

