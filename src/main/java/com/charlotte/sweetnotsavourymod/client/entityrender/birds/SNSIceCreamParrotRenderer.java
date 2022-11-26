package com.charlotte.sweetnotsavourymod.client.entityrender.birds;

import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.SNSIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants.IceCreamParrotFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
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

	public SNSIceCreamParrotRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSIceCreamParrotModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamParrotEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSIceCreamParrotEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
