package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSMouseModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.MouseFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSMouseRenderer extends GeoEntityRenderer <SNSMouseEntity> {
	public static final Map<MouseFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(MouseFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(MouseFlavourVariant.MARSHMALLOWPIE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/marshmallowpiemouse.png"));
				p_114874_.put(MouseFlavourVariant.HAZELNUTCHEESECAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/hazelnutcheesecakemouse.png"));
				p_114874_.put(MouseFlavourVariant.STRAWBERRYCHEESECAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/mice/strawberrycheesecakemouse.png"));

			});

	public SNSMouseRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSMouseModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSMouseEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSMouseEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSMouseEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.1F, 0.1F, 0.1F);
		} else {
			stackIn.scale(0.2F, 0.2F, 0.2F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}