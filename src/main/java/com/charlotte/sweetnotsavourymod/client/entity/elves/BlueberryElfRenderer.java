package com.charlotte.sweetnotsavourymod.client.entity.elves;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.elves.BlueberryElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.elves.VanillaElfModel;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.HazelnutCheesecakeMouseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueberryElfRenderer extends GeoEntityRenderer <BlueberryElfEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/blueberryelf/blueberryelf.png");
	
	public BlueberryElfRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new BlueberryElfModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(BlueberryElfEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(BlueberryElfEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.8F, 0.8F, 0.8F);
    }
	
}
	

