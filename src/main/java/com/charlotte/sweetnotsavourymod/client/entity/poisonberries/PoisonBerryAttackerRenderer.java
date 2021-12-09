package com.charlotte.sweetnotsavourymod.client.entity.poisonberries;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.poisonberries.PoisonBerryAttackerModel;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PoisonBerryAttackerRenderer extends MobRenderer<PoisonBerryAttackerEntity, 
PoisonBerryAttackerModel<PoisonBerryAttackerEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/poisonberryattacker/poisonberryattacker.png");
	
	public PoisonBerryAttackerRenderer(EntityRendererManager manager) {
		
		super(manager, new PoisonBerryAttackerModel<>(), 0.1f);
		
	}

	@Override
	public ResourceLocation getEntityTexture(PoisonBerryAttackerEntity entity) {
		return TEXTURE;
	}
	
	@Override
	protected void preRenderCallback(@NotNull PoisonBerryAttackerEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
}
