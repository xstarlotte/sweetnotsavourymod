package com.charlotte.sweetnotsavourymod.client.entity.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.BlueberryPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueberryPugRenderer extends GeoEntityRenderer <BlueberryPugEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/pugs/blueberrypug.png");
	
	public BlueberryPugRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new BlueberryPugModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(BlueberryPugEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(BlueberryPugEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.8F, 0.8F, 0.8F);
    }
	
}
