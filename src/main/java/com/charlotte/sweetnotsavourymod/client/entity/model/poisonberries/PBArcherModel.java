package com.charlotte.sweetnotsavourymod.client.entity.model.poisonberries;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


/*
public class PoisonBerryArcherModel<T extends PoisonBerryArcherEntity> extends EntityModel <T>{
	private final ModelRenderer body;
	private final ModelRenderer feet;
	private final ModelRenderer feet1;
	private final ModelRenderer feet2;
	private final ModelRenderer arms;
	private final ModelRenderer arm1;
	private final ModelRenderer sword_r1;
	private final ModelRenderer arm2;

	public PoisonBerryArcherModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(body, 0.0F, 3.1416F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-2.6F, -3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-0.6F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-1.6F, -6.4F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, false);

		feet = new ModelRenderer(this);
		feet.setRotationPoint(0.0F, 2.0F, 0.0F);
		body.addChild(feet);
		

		feet1 = new ModelRenderer(this);
		feet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		feet.addChild(feet1);
		feet1.setTextureOffset(28, 0).addBox(1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		feet2 = new ModelRenderer(this);
		feet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		feet.addChild(feet2);
		feet2.setTextureOffset(28, 0).addBox(-2.0F, 0.0F, 1.5F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 2.0F, 0.0F);
		body.addChild(arms);
		

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		arms.addChild(arm1);
		arm1.setTextureOffset(28, 2).addBox(1.9F, -2.4F, 2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		sword_r1 = new ModelRenderer(this);
		sword_r1.setRotationPoint(0.1F, -3.5F, 1.5F);
		arm1.addChild(sword_r1);
		setRotationAngle(sword_r1, -0.9819F, 0.0049F, 1.5843F);
		sword_r1.setTextureOffset(14, 12).addBox(1.6F, -5.3F, -0.1F, 0.0F, 7.0F, 7.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		arms.addChild(arm2);
		arm2.setTextureOffset(28, 2).addBox(-3.5F, -2.3F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles( PoisonBerryArcherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render( MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}*/