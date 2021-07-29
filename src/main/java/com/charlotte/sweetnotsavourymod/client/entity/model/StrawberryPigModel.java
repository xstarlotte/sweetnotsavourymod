package com.charlotte.sweetnotsavourymod.client.entity.model;

import javax.swing.text.html.parser.Entity;

import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class StrawberryPigModel<T extends StrawberryPigEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer head;
	private final ModelRenderer ear1;
	private final ModelRenderer ear2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public StrawberryPigModel() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 2.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(body_sub_1);
		body_sub_1.setTextureOffset(16, 4).addBox(-6.0F, -10.0F, -8.0F, 12.0F, 15.0F, 12.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-1.0F, 5.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-1.0F, 6.0F, -2.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-1.0F, 6.5F, -2.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-1.75F, 6.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-0.95F, 6.5F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-2.45F, 6.2F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-3.45F, 5.8F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-3.65F, 5.9F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body_sub_1.setTextureOffset(46, 0).addBox(-3.45F, 5.6F, -2.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -6.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 28).addBox(-1.5F, 1.0F, -9.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(0.0F, -3.0F, -5.0F);
		head.addChild(ear1);
		setRotationAngle(ear1, 0.0F, 0.0F, -0.6109F);
		ear1.setTextureOffset(60, 0).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(0.0F, -3.0F, -5.0F);
		head.addChild(ear2);
		setRotationAngle(ear2, 0.015F, 0.0214F, 0.611F);
		ear2.setTextureOffset(60, 0).addBox(3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 18.0F, 7.0F);
		leg1.setTextureOffset(0, 16).addBox(5.0F, 1.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 18.0F, 7.0F);
		leg2.setTextureOffset(0, 16).addBox(-7.0F, 1.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 18.0F, -5.0F);
		leg3.setTextureOffset(0, 16).addBox(5.0F, 1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, 18.0F, -5.0F);
		leg4.setTextureOffset(0, 16).addBox(-7.0F, 1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
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
