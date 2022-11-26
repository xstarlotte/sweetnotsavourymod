package com.charlotte.sweetnotsavourymod.client.entityrender.hostile.crooks;

import com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.crooks.CandyCaneCrookModel;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.HostileVariants.CCCrookVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class CandyCaneCrookRenderer extends GeoEntityRenderer<CandyCaneCrookEntity> {
	public static final Map<CCCrookVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(CCCrookVariant.class), (p_114874_) -> {
		p_114874_.put(CCCrookVariant.RED, new ResourceLocation("sweetnotsavourymod:textures/entity/crooks/candycanecrook.png"));
		p_114874_.put(CCCrookVariant.WHITE, new ResourceLocation("sweetnotsavourymod:textures/entity/crooks/candycanecrook2.png"));

	});

	public CandyCaneCrookRenderer(EntityRendererManager renderManager) {
		super(renderManager, new CandyCaneCrookModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(CandyCaneCrookEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(CandyCaneCrookEntity animatable, float partialTicks, MatrixStack stack,
									IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(0.8F, 0.8F, 0.8F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
