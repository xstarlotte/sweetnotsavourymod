package com.charlotte.sweetnotsavourymod.client.entity.parrots;

import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.SNSIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
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

public class SNSIceCreamParrotRenderer extends GeoEntityRenderer<SNSIceCreamParrotEntity> {
	public static final Map<FlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(FlavourVariant.class), (p_114874_) -> {
				p_114874_.put(FlavourVariant.BLUEBERRY, new ResourceLocation("textures/entity/icecreamparrots/blueberryicecreamparrot.png"));
				p_114874_.put(FlavourVariant.ORANGE, new ResourceLocation("textures/entity/icecreamparrots/orangeicecreamparrot.png"));
				p_114874_.put(FlavourVariant.RASPBERRY, new ResourceLocation("textures/entity/icecreamparrots/raspberryicecreamparrot.png"));
				p_114874_.put(FlavourVariant.STRAWBERRY, new ResourceLocation("textures/entity/icecreamparrots/strawberryicecreamparrot.png"));
				p_114874_.put(FlavourVariant.VANILLA, new ResourceLocation("textures/entity/icecreamparrots/vanillaicecreamparrot.png"));
				p_114874_.put(FlavourVariant.BLACKBERRY, new ResourceLocation("textures/entity/icecreamparrots/blackberryicecreamparrot.png"));
				p_114874_.put(FlavourVariant.LEMON, new ResourceLocation("textures/entity/icecreamparrots/lemonicecreamparrot.png"));
				p_114874_.put(FlavourVariant.CHOCOLATE, new ResourceLocation("textures/entity/icecreamparrots/chocolateicecreamparrot.png"));
				p_114874_.put(FlavourVariant.TOFFEE, new ResourceLocation("textures/entity/icecreamparrots/toffeeicecreamparrot.png"));
			});

	public SNSIceCreamParrotRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSIceCreamParrotModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamParrotEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void render(SNSIceCreamParrotEntity entity, float entityYaw, float partialTicks, PoseStack stack,
					   MultiBufferSource bufferIn, int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSIceCreamParrotEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);
		stackIn.scale(0.6F, 0.6F, 0.6F);
	}
}
