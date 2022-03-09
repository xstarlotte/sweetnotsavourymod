package com.charlotte.sweetnotsavourymod.client.entity.parrots;

import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.SNSIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.IceCreamParrotFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSIceCreamParrotRenderer extends GeoEntityRenderer<SNSIceCreamParrotEntity> {
	public static final Map<IceCreamParrotFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(IceCreamParrotFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(IceCreamParrotFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/blueberryicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/orangeicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/raspberryicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/strawberryicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/peachicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/blackberryicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/lemonicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/chocolateicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/toffeeicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/mangoicecreamparrot.png"));
				p_114874_.put(IceCreamParrotFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamparrots/limeicecreamparrot.png"));
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
	public RenderType getRenderType(SNSIceCreamParrotEntity animatable, float partialTicks, PoseStack stack,
									MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(0.6F, 0.6F, 0.6F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
