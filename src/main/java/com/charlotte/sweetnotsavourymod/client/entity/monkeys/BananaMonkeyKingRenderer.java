package com.charlotte.sweetnotsavourymod.client.entity.monkeys;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.monkeys.BananaMonkeyKingModel;
import com.charlotte.sweetnotsavourymod.common.entity.monkeys.BananaMonkeyKingEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BananaMonkeyKingRenderer extends MobRenderer <BananaMonkeyKingEntity, 
BananaMonkeyKingModel<BananaMonkeyKingEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/bananamonkeyking/bananamonkeyking.png");
	
	public BananaMonkeyKingRenderer(EntityRendererManager manager) {
		
		super(manager, new BananaMonkeyKingModel<>(), 0.1f);
		
	}
	

	@Override
	protected void preRenderCallback(@NotNull BananaMonkeyKingEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
	
	@Override
	public ResourceLocation getEntityTexture(BananaMonkeyKingEntity entity) {
		return TEXTURE;
	}
	
	
}
