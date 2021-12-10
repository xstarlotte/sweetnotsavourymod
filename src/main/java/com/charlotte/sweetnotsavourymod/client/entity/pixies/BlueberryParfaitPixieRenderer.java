package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryParfaitPixieModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueberryParfaitPixieRenderer extends GeoEntityRenderer <BlueberryParfaitPixieEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/pixies/blueberryparfaitpixie.png");
	
	public BlueberryParfaitPixieRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new BlueberryParfaitPixieModel());
		this.shadowSize = 0.2F;			
	}

	@Override
	public ResourceLocation getEntityTexture(BlueberryParfaitPixieEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(BlueberryParfaitPixieEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.7F, 0.7F, 0.7F);
    }
	
}
