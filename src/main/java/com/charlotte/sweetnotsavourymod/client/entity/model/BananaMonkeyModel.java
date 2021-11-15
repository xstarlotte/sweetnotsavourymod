package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BananaMonkeyModel<T extends BananaMonkeyEntity> extends EntityModel<T> {
	private final ModelRenderer wholebodu;
	private final ModelRenderer body;
	private final ModelRenderer rightthigh;
	private final ModelRenderer rightfoot;
	private final ModelRenderer leftthigh;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightshoulder;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer righthand;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leftshoulder;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer lefthand;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;
	private final ModelRenderer snout;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer sheild;
	private final ModelRenderer sword;
	private final ModelRenderer cube_r29;

	public BananaMonkeyModel() {
		textureWidth = 32;
		textureHeight = 32;

		wholebodu = new ModelRenderer(this);
		wholebodu.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(body);
		body.setTextureOffset(0, 0).addBox(-3.0F, -7.0F, -2.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(rightthigh);
		rightthigh.setTextureOffset(13, 6).addBox(-4.0F, -4.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightthigh.addChild(rightfoot);
		rightfoot.setTextureOffset(21, 8).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightfoot.setTextureOffset(0, 10).addBox(-4.0F, 0.0F, -3.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(leftthigh);
		leftthigh.setTextureOffset(11, 12).addBox(1.0F, -4.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftthigh.addChild(leftfoot);
		leftfoot.setTextureOffset(4, 21).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftfoot.setTextureOffset(0, 9).addBox(1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		rightshoulder = new ModelRenderer(this);
		rightshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(rightshoulder);
		rightshoulder.setTextureOffset(18, 4).addBox(-4.0F, -7.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightshoulder.addChild(rightarm);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
		cube_r1.setTextureOffset(21, 0).addBox(-4.3F, -6.0F, -0.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(righthand);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		righthand.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
		cube_r2.setTextureOffset(0, 2).addBox(-4.3F, -6.0F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftshoulder = new ModelRenderer(this);
		leftshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(leftshoulder);
		leftshoulder.setTextureOffset(17, 16).addBox(1.0F, -7.0F, -1.4F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftshoulder.addChild(leftarm);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(16, 20).addBox(1.1F, -4.3F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(lefthand);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		lefthand.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(1.1F, -4.3F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(head);
		head.setTextureOffset(12, 0).addBox(-2.5F, -7.4F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 9).addBox(-3.0F, -10.4F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(25, 8).addBox(-1.9F, -11.4F, -0.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
		cube_r5.setTextureOffset(18, 8).addBox(-1.3F, -11.4F, -1.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.setTextureOffset(12, 18).addBox(-2.0F, -11.4F, 0.3F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
		cube_r7.setTextureOffset(24, 15).addBox(-1.5F, -11.4F, 0.9F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(rightear);
		rightear.setTextureOffset(0, 20).addBox(-4.4F, -10.0F, -0.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, -13.0F, 0.0F);
		head.addChild(leftear);
		leftear.setTextureOffset(12, 19).addBox(0.4F, 3.0F, -0.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(snout);
		snout.setTextureOffset(16, 12).addBox(-2.5F, -9.2F, -2.7F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		wholebodu.addChild(tail);
		tail.setTextureOffset(0, 25).addBox(-1.0F, -2.1F, 2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.829F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(16, 4).addBox(-1.0F, -11.9F, -2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(20, 20).addBox(-1.0F, -12.2F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(25, 3).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(21, 15).addBox(-1.0F, -11.5F, 3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(22, 4).addBox(-1.0F, -10.6F, 4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(11, 22).addBox(-1.0F, -8.4F, 6.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7418F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(21, 22).addBox(-1.0F, -5.6F, 8.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.0908F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(0, 23).addBox(-1.0F, -2.4F, 8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.4399F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(23, 11).addBox(-1.0F, 0.7F, 8.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.7017F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(14, 23).addBox(-1.0F, 2.8F, 6.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r17);
		setRotationAngle(cube_r17, 2.0071F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(23, 17).addBox(-1.0F, 4.7F, 4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r18);
		setRotationAngle(cube_r18, 2.3998F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(18, 23).addBox(-1.0F, 6.1F, 1.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r19);
		setRotationAngle(cube_r19, 2.7053F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(23, 19).addBox(-1.0F, 6.2F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r20);
		setRotationAngle(cube_r20, 2.9671F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(3, 24).addBox(-1.0F, 5.6F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r21);
		setRotationAngle(cube_r21, 2.5744F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(24, 6).addBox(-1.0F, 6.7F, -2.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r22);
		setRotationAngle(cube_r22, 2.0508F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(7, 24).addBox(-1.0F, 6.8F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.5272F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(11, 24).addBox(-1.0F, 5.3F, 3.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.1345F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(24, 13).addBox(-1.0F, 3.4F, 4.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(21, 24).addBox(-1.0F, 1.5F, 5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.48F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(24, 21).addBox(-1.0F, -0.1F, 4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(24, 23).addBox(-1.0F, -1.5F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.2618F, 0.0F, 0.0F);
		cube_r28.setTextureOffset(25, 0).addBox(-1.0F, -2.7F, 1.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		sheild = new ModelRenderer(this);
		sheild.setRotationPoint(0.0F, 24.0F, 0.0F);
		sheild.setTextureOffset(0, 15).addBox(-3.5F, -8.9F, -4.2F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		sword = new ModelRenderer(this);
		sword.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.6845F, -8.9782F, -3.7F);
		sword.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.5708F, 0.6545F, 1.5272F);
		cube_r29.setTextureOffset(8, 18).addBox(0.7F, -3.7F, -0.2F, 2.0F, 5.0F, 0.0F, 0.0F, false);
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		wholebodu.render(matrixStack, buffer, packedLight, packedOverlay);
		sheild.render(matrixStack, buffer, packedLight, packedOverlay);
		sword.render(matrixStack, buffer, packedLight, packedOverlay);
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
