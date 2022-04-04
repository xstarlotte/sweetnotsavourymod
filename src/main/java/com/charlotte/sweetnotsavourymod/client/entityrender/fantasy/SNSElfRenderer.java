package com.charlotte.sweetnotsavourymod.client.entityrender.fantasy;

import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.SNSElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.ElfFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSElfRenderer extends GeoEntityRenderer<SNSElfEntity> {
	public static final Map<ElfFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ElfFlavourVariant.class), (p_114874_) -> {
		p_114874_.put(ElfFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/blueberryelf.png"));
		p_114874_.put(ElfFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/orangeelf.png"));
		p_114874_.put(ElfFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/raspberryelf.png"));
		p_114874_.put(ElfFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/strawberryelf.png"));
		p_114874_.put(ElfFlavourVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/vanillaelf.png"));
		p_114874_.put(ElfFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/blackberryelf.png"));
		p_114874_.put(ElfFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/lemonelf.png"));
		p_114874_.put(ElfFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/chocolateelf.png"));
		p_114874_.put(ElfFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/toffeeelf.png"));
		p_114874_.put(ElfFlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/peachelf.png"));
		p_114874_.put(ElfFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/mangoelf.png"));
		p_114874_.put(ElfFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/limeelf.png"));
		p_114874_.put(ElfFlavourVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/elves/pineappleelf.png"));

	});

	public SNSElfRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SNSElfModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSElfEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSElfEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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