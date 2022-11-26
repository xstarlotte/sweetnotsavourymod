package com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mintimperials;

import com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.mintimperials.MintImperialModel;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mintimperials.MintImperialEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.HostileVariants.MintImperialVariant;
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

public class MintImperialRenderer extends GeoEntityRenderer<MintImperialEntity> {
	public static final Map<MintImperialVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(MintImperialVariant.class), (p_114874_) -> {
		p_114874_.put(MintImperialVariant.ONE, new ResourceLocation("sweetnotsavourymod:textures/entity/mintimperials/mintimperial.png"));
		p_114874_.put(MintImperialVariant.TWO, new ResourceLocation("sweetnotsavourymod:textures/entity/mintimperials/mintimperial2.png"));
		p_114874_.put(MintImperialVariant.THREE, new ResourceLocation("sweetnotsavourymod:textures/entity/mintimperials/mintimperial3.png"));
		p_114874_.put(MintImperialVariant.FOUR, new ResourceLocation("sweetnotsavourymod:textures/entity/mintimperials/mintimperial4.png"));
	});

	public MintImperialRenderer(EntityRendererManager renderManager) {
		super(renderManager, new MintImperialModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(MintImperialEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public RenderType getRenderType(MintImperialEntity animatable, float partialTicks, MatrixStack stack,
									IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
									ResourceLocation textureLocation) {
		stack.scale(0.6F, 0.6F, 0.6F);
		return super.getRenderType(animatable, partialTicks, stack,
				renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
