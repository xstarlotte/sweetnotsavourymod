package com.charlotte.sweetnotsavourymod.client.entityrender.rideable;



import com.charlotte.sweetnotsavourymod.client.entitymodel.rideable.SNSZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSZebraEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RideableVariants.ZebraFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSZebraRenderer extends GeoEntityRenderer<SNSZebraEntity> {
	public static final Map<ZebraFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ZebraFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(ZebraFlavourVariant.ZEBRACAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/zebracakezebra.png"));
				p_114874_.put(ZebraFlavourVariant.CHOCOLATEORANGECAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/chocolateorangecakezebra.png"));
				p_114874_.put(ZebraFlavourVariant.MINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/mintcandycanezebra.png"));
				p_114874_.put(ZebraFlavourVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/candycanezebra.png"));
				p_114874_.put(ZebraFlavourVariant.PEPPERMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/peppermintcandycanezebra.png"));
				p_114874_.put(ZebraFlavourVariant.SPEARMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/spearmintcandycanezebra.png"));
				p_114874_.put(ZebraFlavourVariant.LEMONCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/zebras/lemoncandycanezebra.png"));
			});

	public SNSZebraRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSZebraModel());
		this.shadowRadius = 0.8F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSZebraEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSZebraEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.7F, 0.7F, 0.7F);
		} else {
			stackIn.scale(1.4F, 1.4F, 1.4F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}