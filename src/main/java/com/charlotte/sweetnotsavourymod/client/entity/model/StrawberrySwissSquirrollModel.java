package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.squirrels.StrawberrySwissSquirrollEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class StrawberrySwissSquirrollModel<T extends StrawberrySwissSquirrollEntity> extends EntityModel<T> {
	private final ModelRenderer wholebody2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;

	public StrawberrySwissSquirrollModel() {
		textureWidth = 128;
		textureHeight = 128;

		wholebody2 = new ModelRenderer(this);
		wholebody2.setRotationPoint(-3.0F, 12.6F, 0.0F);
		wholebody2.setTextureOffset(54, 47).addBox(-1.0F, -17.0F, -6.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		wholebody2.setTextureOffset(0, 38).addBox(-4.3F, -4.6F, -3.4F, 14.0F, 14.0F, 13.0F, 0.0F, false);
		wholebody2.setTextureOffset(0, 65).addBox(-6.2F, 1.3F, -1.7F, 2.0F, 9.0F, 9.0F, 0.0F, false);
		wholebody2.setTextureOffset(45, 61).addBox(9.8F, 1.3F, -1.7F, 2.0F, 9.0F, 9.0F, 0.0F, false);
		wholebody2.setTextureOffset(22, 65).addBox(9.9F, 9.3F, -5.1F, 2.0F, 2.0F, 9.0F, 0.0F, false);
		wholebody2.setTextureOffset(70, 0).addBox(-6.3F, 9.3F, -5.1F, 2.0F, 2.0F, 9.0F, 0.0F, false);
		wholebody2.setTextureOffset(0, 0).addBox(-1.7F, -11.1F, 9.6F, 8.0F, 20.0F, 18.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebody2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(34, 0).addBox(5.7F, -15.7F, -5.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 38).addBox(-1.7F, -15.7F, -5.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.25F, -9.0763F, -17.6467F);
		wholebody2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.48F, -0.5236F, 0.0F);
		cube_r2.setTextureOffset(0, 65).addBox(1.3F, -0.35F, 11.9F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.55F, -9.0763F, -17.5467F);
		wholebody2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.6109F, 0.0F);
		cube_r3.setTextureOffset(0, 46).addBox(-0.85F, -1.1F, 13.45F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.95F, -8.9763F, -17.0467F);
		wholebody2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
		cube_r4.setTextureOffset(14, 76).addBox(1.1F, 5.15F, 11.6F, 2.0F, 3.0F, 8.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.05F, -8.9763F, -17.0467F);
		wholebody2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(1.3F, 5.05F, 10.1F, 2.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.3F, -8.4F, -16.8F);
		wholebody2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(60, 73).addBox(8.3F, 4.7F, 14.2F, 3.0F, 6.0F, 7.0F, 0.0F, false);
		cube_r6.setTextureOffset(75, 11).addBox(-6.3F, 4.7F, 14.2F, 3.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.7F, -17.5F, -8.2F);
		wholebody2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.48F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(41, 24).addBox(-6.6F, 11.0F, -3.7F, 15.0F, 9.0F, 14.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -19.5F, -7.3F);
		wholebody2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(34, 0).addBox(-3.9F, 10.2F, -7.3F, 12.0F, 3.0F, 12.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.35F, -3.9F, -0.85F);
		wholebody2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.6283F);
		cube_r9.setTextureOffset(0, 10).addBox(-6.25F, -15.1F, -0.35F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.55F, -3.9F, -0.85F);
		wholebody2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7418F);
		cube_r10.setTextureOffset(52, 15).addBox(5.95F, -12.6F, -0.35F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.95F, -3.1F, -1.95F);
		wholebody2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 0).addBox(0.55F, -14.4F, -6.05F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.95F, -3.1F, -1.95F);
		wholebody2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(58, 61).addBox(-0.95F, -13.7F, -7.15F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.85F, -3.3F, -1.45F);
		wholebody2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(67, 61).addBox(-1.85F, -14.2F, -6.45F, 7.0F, 6.0F, 6.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		wholebody2.render(matrixStack, buffer, packedLight, packedOverlay);
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
