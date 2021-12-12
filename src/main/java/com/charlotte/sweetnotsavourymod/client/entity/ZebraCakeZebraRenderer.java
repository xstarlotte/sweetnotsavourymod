package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.ZebraCakeZebraModel;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
/*
public class ZebraCakeZebraRenderer extends GeoEntityRenderer <ZebraCakeZebraEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID,
			"textures/entity/zebracakezebra/zebracakezebra.png");

	public ZebraCakeZebraRenderer(EntityRendererManager renderManager) {

		super(renderManager, new ZebraCakeZebraModel());
		this.shadowSize = 0.2F;

	}

	@Override
	public ResourceLocation getEntityTexture(ZebraCakeZebraEntity entity) {
		return TEXTURE;
	}

	@Override
	public void render(ZebraCakeZebraEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {



		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}

	@Override
    public void renderEarly(ZebraCakeZebraEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1.6F, 1.6F, 1.6F);
    }


}

*/