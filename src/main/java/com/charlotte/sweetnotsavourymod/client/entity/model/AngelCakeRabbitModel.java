package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class AngelCakeRabbitModel<T extends AngelCakeRabbitEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_thigh;
	private final ModelRenderer right_thigh;
	private final ModelRenderer left_foot;
	private final ModelRenderer right_foot;
	private final ModelRenderer tail;

	public AngelCakeRabbitModel() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.5F, -3.0F);
		head.setTextureOffset(32, 0).addBox(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 16.5F, -3.0F);
		nose.setTextureOffset(32, 9).addBox(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(0.0F, 16.5F, -3.0F);
		left_ear.setTextureOffset(58, 0).addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(0.0F, 16.5F, -3.0F);
		right_ear.setTextureOffset(52, 0).addBox(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 7.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -3.0F);
		left_arm.setTextureOffset(8, 15).addBox(5.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 17.0F, -3.0F);
		right_arm.setTextureOffset(0, 15).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		left_thigh = new ModelRenderer(this);
		left_thigh.setRotationPoint(-3.0F, 16.0F, 2.5F);
		left_thigh.setTextureOffset(16, 15).addBox(5.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		right_thigh = new ModelRenderer(this);
		right_thigh.setRotationPoint(3.0F, 16.0F, 2.5F);
		right_thigh.setTextureOffset(30, 15).addBox(-7.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-3.0F, 14.5F, 4.2F);
		left_foot.setTextureOffset(26, 24).addBox(5.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(3.0F, 14.5F, 4.2F);
		right_foot.setTextureOffset(8, 24).addBox(-7.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 17.25F, 6.5F);
		tail.setTextureOffset(52, 6).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		right_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}



	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}
