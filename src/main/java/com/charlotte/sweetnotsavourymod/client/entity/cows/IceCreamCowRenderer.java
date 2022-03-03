package com.charlotte.sweetnotsavourymod.client.entity.cows;

import com.charlotte.sweetnotsavourymod.client.entity.model.cows.IceCreamCowModel;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.core.util.IceCreamCowVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class IceCreamCowRenderer extends GeoEntityRenderer<IceCreamCowEntity> {
	public static final Map<IceCreamCowVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(IceCreamCowVariant.class), (p_114874_) -> {
				p_114874_.put(IceCreamCowVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/blackberryicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/blueberryicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/raspberryicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/strawberryicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/lemonicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/orangeicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/mangoicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/peachicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/pineappleicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/vanillaicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/chocolateicecreamcow.png"));
				p_114874_.put(IceCreamCowVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/cows/toffeeicecreamcow.png"));

			});

	public IceCreamCowRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new IceCreamCowModel());
		this.shadowRadius = 0.5F;
	}

	@Override
	public ResourceLocation getTextureLocation(IceCreamCowEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
    public void renderEarly(IceCreamCowEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
							VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1F, 1F, 1F);
    }
}
