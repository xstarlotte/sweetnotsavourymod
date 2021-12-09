package com.charlotte.sweetnotsavourymod.client.entity.rabbits;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.ChocolateCherryCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.ChocolateCherryCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChocolateCherryCakeRabbitRenderer extends GeoEntityRenderer <ChocolateCherryCakeRabbitEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/chocolatecherrycakerabbit/chocolatecherrycakerabbit.png");
	
	public ChocolateCherryCakeRabbitRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new ChocolateCherryCakeRabbitModel()); 
		this.shadowSize = 0.2F;			
	}

	@Override
	public ResourceLocation getEntityTexture(ChocolateCherryCakeRabbitEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(ChocolateCherryCakeRabbitEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.6F, 0.6F, 0.6F);
    }
	
}