package com.charlotte.sweetnotsavourymod.client.entityrender.dogs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.SNSPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.PugFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSPugRenderer extends GeoEntityRenderer<SNSPugEntity> {
	public static final Map<PugFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(PugFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(PugFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/blueberrypug.png"));
				p_114874_.put(PugFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/orangepug.png"));
				p_114874_.put(PugFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/raspberrypug.png"));
				p_114874_.put(PugFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/strawberrypug.png"));
				p_114874_.put(PugFlavourVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/vanillapug.png"));
				p_114874_.put(PugFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/blackberrypug.png"));
				p_114874_.put(PugFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/lemonpug.png"));
				p_114874_.put(PugFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/chocolatepug.png"));
				p_114874_.put(PugFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/toffeepug.png"));
				p_114874_.put(PugFlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/peachpug.png"));
				p_114874_.put(PugFlavourVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/pineapplepug.png"));
				p_114874_.put(PugFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/mangopug.png"));
				p_114874_.put(PugFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/pugs/limepug.png"));
			});

	public SNSPugRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSPugModel());
		this.shadowRadius = 0.4F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSPugEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSPugEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
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
