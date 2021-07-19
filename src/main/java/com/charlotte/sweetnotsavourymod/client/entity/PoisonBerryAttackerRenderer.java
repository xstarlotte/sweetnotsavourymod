package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.PoisonBerryAttackerModel;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PoisonBerryAttackerRenderer extends MobRenderer<PoisonBerryAttackerEntity, 
PoisonBerryAttackerModel<PoisonBerryAttackerEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/poisonberryattacker/poisonberryattacker.png");
	
	public PoisonBerryAttackerRenderer(EntityRendererManager manager) {
		
		super(manager, new PoisonBerryAttackerModel<>(), 0.7f);
		
	}

	@Override
	public ResourceLocation getEntityTexture(PoisonBerryAttackerEntity entity) {
		return TEXTURE;
	}
	
	
}
