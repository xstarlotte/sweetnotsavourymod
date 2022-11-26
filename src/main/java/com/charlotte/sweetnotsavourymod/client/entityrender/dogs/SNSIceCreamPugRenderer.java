package com.charlotte.sweetnotsavourymod.client.entityrender.dogs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.SNSIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.IceCreamPugFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSIceCreamPugRenderer extends GeoEntityRenderer<SNSIceCreamPugEntity> {
	public static final Map<IceCreamPugFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(IceCreamPugFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(IceCreamPugFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/blueberryicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/orangeicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/raspberryicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/strawberryicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/blackberryicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/lemonicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/chocolateicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/toffeeicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/mangoicecreampug.png"));
				p_114874_.put(IceCreamPugFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/limeicecreampug.png"));
			});

	public SNSIceCreamPugRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSIceCreamPugModel());
		this.shadowRadius = 0.4F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamPugEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSIceCreamPugEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
