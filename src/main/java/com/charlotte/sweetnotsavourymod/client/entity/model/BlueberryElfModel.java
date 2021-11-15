package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.BlueberryElfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BlueberryElfModel<T extends BlueberryElfEntity> extends EntityModel<T> {
	private final ModelRenderer wholebody;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer nose;
	private final ModelRenderer hair;
	private final ModelRenderer hat1;
	private final ModelRenderer hat17;
	private final ModelRenderer hat8;
	private final ModelRenderer hat16;
	private final ModelRenderer hat3;
	private final ModelRenderer hat32;
	private final ModelRenderer hat33;
	private final ModelRenderer hat34;
	private final ModelRenderer hat35;
	private final ModelRenderer hat45;
	private final ModelRenderer hat36;
	private final ModelRenderer hat19;
	private final ModelRenderer hat28;
	private final ModelRenderer hat30;
	private final ModelRenderer hat31;
	private final ModelRenderer hat29;
	private final ModelRenderer hat4;
	private final ModelRenderer hat14;
	private final ModelRenderer hat7;
	private final ModelRenderer hat18;
	private final ModelRenderer hat5;
	private final ModelRenderer hat13;
	private final ModelRenderer hat6;
	private final ModelRenderer hat43;
	private final ModelRenderer hat44;
	private final ModelRenderer hat15;
	private final ModelRenderer hat9;
	private final ModelRenderer hat22;
	private final ModelRenderer hat11;
	private final ModelRenderer hat21;
	private final ModelRenderer hat12;
	private final ModelRenderer hat20;
	private final ModelRenderer hat24;
	private final ModelRenderer hat37;
	private final ModelRenderer hat38;
	private final ModelRenderer hat39;
	private final ModelRenderer hat40;
	private final ModelRenderer hat41;
	private final ModelRenderer hat42;
	private final ModelRenderer hat10;
	private final ModelRenderer hat23;
	private final ModelRenderer hat25;
	private final ModelRenderer stalk;
	private final ModelRenderer stalk_r1;
	private final ModelRenderer stalk_r2;
	private final ModelRenderer stalk_r3;
	private final ModelRenderer stalk2;
	private final ModelRenderer allears;
	private final ModelRenderer ears2;
	private final ModelRenderer ears;
	private final ModelRenderer body;
	private final ModelRenderer dress;
	private final ModelRenderer frill2;
	private final ModelRenderer frill3;
	private final ModelRenderer frill4;
	private final ModelRenderer neck;
	private final ModelRenderer arms;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer legs;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public BlueberryElfModel() {
		textureWidth = 32;
		textureHeight = 32;

		wholebody = new ModelRenderer(this);
		wholebody.setRotationPoint(0.0F, 24.8F, 0.0F);
		setRotationAngle(wholebody, 0.0F, -3.098F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, 0.0F);
		wholebody.addChild(head);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, -0.0436F, 0.0F);
		head_r1.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(-0.6F, 0.7F, -1.2F);
		head.addChild(nose);
		setRotationAngle(nose, 0.7854F, 0.6109F, -0.5236F);
		nose.setTextureOffset(20, 20).addBox(-1.0843F, 0.9655F, 1.9588F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.addChild(hair);
		

		hat1 = new ModelRenderer(this);
		hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hat1);
		hat1.setTextureOffset(18, 4).addBox(-3.0F, 2.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat17 = new ModelRenderer(this);
		hat17.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hat17);
		hat17.setTextureOffset(8, 13).addBox(-3.0F, -2.1F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		hat17.setTextureOffset(0, 20).addBox(-2.0402F, -2.2F, 0.4428F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		hat17.setTextureOffset(0, 17).addBox(-2.0577F, -2.1F, 0.8424F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		hat8 = new ModelRenderer(this);
		hat8.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hat8);
		setRotationAngle(hat8, 0.0F, -0.7418F, 0.0F);
		hat8.setTextureOffset(8, 13).addBox(-3.0F, -2.1F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat16 = new ModelRenderer(this);
		hat16.setRotationPoint(-0.8F, 5.0F, -0.1F);
		hair.addChild(hat16);
		setRotationAngle(hat16, -0.48F, -0.9163F, 0.5236F);
		hat16.setTextureOffset(0, 19).addBox(-3.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(-1.3F, 0.0F, 0.4F);
		hair.addChild(hat3);
		setRotationAngle(hat3, 0.0F, 2.5307F, -0.1745F);
		hat3.setTextureOffset(0, 19).addBox(-3.8187F, 2.0008F, 0.2525F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat32 = new ModelRenderer(this);
		hat32.setRotationPoint(0.3F, 2.0F, 0.4F);
		hair.addChild(hat32);
		setRotationAngle(hat32, 0.0F, 2.5307F, 0.2618F);
		hat32.setTextureOffset(0, 19).addBox(-3.8701F, 2.0F, 0.1718F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat33 = new ModelRenderer(this);
		hat33.setRotationPoint(-1.6F, 2.0F, 0.0F);
		hair.addChild(hat33);
		setRotationAngle(hat33, 0.0F, 0.5236F, -0.3054F);
		hat33.setTextureOffset(0, 19).addBox(-3.4696F, 2.0982F, 0.176F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat34 = new ModelRenderer(this);
		hat34.setRotationPoint(1.5F, 3.8F, -1.1F);
		hair.addChild(hat34);
		setRotationAngle(hat34, 0.0F, 0.1309F, 0.5672F);
		hat34.setTextureOffset(0, 8).addBox(-3.9516F, 1.9741F, 0.2236F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat35 = new ModelRenderer(this);
		hat35.setRotationPoint(-2.1F, 2.8F, -1.1F);
		hair.addChild(hat35);
		setRotationAngle(hat35, 0.0F, 0.1309F, -0.4363F);
		hat35.setTextureOffset(0, 19).addBox(-3.4665F, 1.8713F, 0.2875F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat45 = new ModelRenderer(this);
		hat45.setRotationPoint(1.9F, 2.8F, 1.0F);
		hair.addChild(hat45);
		setRotationAngle(hat45, 0.0F, -3.0543F, 0.4363F);
		hat45.setTextureOffset(0, 19).addBox(-3.4665F, 1.8713F, 0.2875F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat36 = new ModelRenderer(this);
		hat36.setRotationPoint(-0.3F, 2.8F, -1.2F);
		hair.addChild(hat36);
		setRotationAngle(hat36, 0.3491F, -0.829F, -0.3927F);
		hat36.setTextureOffset(0, 19).addBox(-3.6139F, 1.8251F, 0.1605F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat19 = new ModelRenderer(this);
		hat19.setRotationPoint(-0.9F, 0.0F, 0.8F);
		hair.addChild(hat19);
		setRotationAngle(hat19, 0.0F, 2.5307F, 0.0F);
		hat19.setTextureOffset(18, 4).addBox(-3.7076F, -2.0F, 0.4189F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat28 = new ModelRenderer(this);
		hat28.setRotationPoint(-2.9F, 1.0F, 0.8F);
		hair.addChild(hat28);
		setRotationAngle(hat28, 0.0F, 2.5307F, -0.8727F);
		hat28.setTextureOffset(0, 8).addBox(-4.9991F, 0.8243F, 0.9571F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat30 = new ModelRenderer(this);
		hat30.setRotationPoint(1.8F, 3.4F, 0.8F);
		hair.addChild(hat30);
		setRotationAngle(hat30, 0.0F, 2.5307F, -2.2253F);
		hat30.setTextureOffset(12, 19).addBox(-4.7968F, 0.886F, 1.1817F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hat31 = new ModelRenderer(this);
		hat31.setRotationPoint(-3.8F, -1.7F, -3.0F);
		hair.addChild(hat31);
		setRotationAngle(hat31, 0.0F, 1.5272F, -0.7854F);
		hat31.setTextureOffset(12, 19).addBox(-5.1102F, 1.4461F, 1.596F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hat29 = new ModelRenderer(this);
		hat29.setRotationPoint(1.9F, 2.2F, 0.4F);
		hair.addChild(hat29);
		setRotationAngle(hat29, 0.0F, 2.5307F, -2.4871F);
		hat29.setTextureOffset(0, 8).addBox(-5.3264F, -1.5127F, 0.8201F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat4 = new ModelRenderer(this);
		hat4.setRotationPoint(-1.9F, 1.0F, -2.8F);
		hair.addChild(hat4);
		setRotationAngle(hat4, 0.3927F, 2.2689F, -0.1309F);
		hat4.setTextureOffset(0, 19).addBox(-3.2989F, 2.0F, 0.6033F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat14 = new ModelRenderer(this);
		hat14.setRotationPoint(0.7F, 0.0F, 1.1F);
		hair.addChild(hat14);
		setRotationAngle(hat14, 0.0F, -2.2253F, 0.0F);
		hat14.setTextureOffset(8, 13).addBox(-3.2989F, -2.1F, 0.6033F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat7 = new ModelRenderer(this);
		hat7.setRotationPoint(-0.9F, 0.0F, 2.2F);
		hair.addChild(hat7);
		setRotationAngle(hat7, 0.0F, -2.618F, 0.0F);
		hat7.setTextureOffset(18, 4).addBox(0.418F, -1.7F, 0.7937F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat18 = new ModelRenderer(this);
		hat18.setRotationPoint(-1.4F, 4.0F, 2.2F);
		hair.addChild(hat18);
		setRotationAngle(hat18, -0.2182F, -2.4871F, 0.3927F);
		hat18.setTextureOffset(0, 19).addBox(0.4305F, -2.073F, 0.6705F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat5 = new ModelRenderer(this);
		hat5.setRotationPoint(0.0F, 0.0F, 1.0F);
		hair.addChild(hat5);
		setRotationAngle(hat5, 0.0F, 3.1416F, 0.0F);
		hat5.setTextureOffset(8, 13).addBox(-3.0F, -2.2F, 0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat13 = new ModelRenderer(this);
		hat13.setRotationPoint(0.6F, 4.0F, 1.0F);
		hair.addChild(hat13);
		setRotationAngle(hat13, 0.0F, 3.1416F, -0.2618F);
		hat13.setTextureOffset(18, 4).addBox(-3.0F, -2.0F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat6 = new ModelRenderer(this);
		hat6.setRotationPoint(2.7F, 0.0F, -2.6F);
		hair.addChild(hat6);
		setRotationAngle(hat6, -0.3927F, 0.0436F, 0.0436F);
		hat6.setTextureOffset(0, 19).addBox(-3.0F, 2.0F, 0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat43 = new ModelRenderer(this);
		hat43.setRotationPoint(2.4F, 4.0F, -5.7F);
		hair.addChild(hat43);
		setRotationAngle(hat43, 0.2618F, -0.0873F, 0.0436F);
		hat43.setTextureOffset(0, 19).addBox(0.4367F, 1.791F, 1.8538F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat44 = new ModelRenderer(this);
		hat44.setRotationPoint(2.4F, 4.0F, -5.7F);
		hair.addChild(hat44);
		setRotationAngle(hat44, 0.2618F, 0.0436F, 0.0436F);
		hat44.setTextureOffset(0, 19).addBox(-3.0177F, 2.1F, 0.8734F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hat15 = new ModelRenderer(this);
		hat15.setRotationPoint(1.0F, 0.0F, 0.0F);
		hair.addChild(hat15);
		setRotationAngle(hat15, 0.0F, -1.5708F, 0.0F);
		hat15.setTextureOffset(8, 13).addBox(-3.0F, -2.1F, 0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat9 = new ModelRenderer(this);
		hat9.setRotationPoint(1.0F, 0.0F, 0.0F);
		hair.addChild(hat9);
		setRotationAngle(hat9, 0.0F, -1.9635F, 0.0F);
		hat9.setTextureOffset(16, 16).addBox(-2.5539F, 2.0F, 0.5317F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat22 = new ModelRenderer(this);
		hat22.setRotationPoint(1.0F, 0.0F, 0.0F);
		hair.addChild(hat22);
		setRotationAngle(hat22, 0.0F, -1.9635F, 0.0F);
		hat22.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat11 = new ModelRenderer(this);
		hat11.setRotationPoint(0.7F, 0.0F, -0.6F);
		hair.addChild(hat11);
		setRotationAngle(hat11, 0.0F, -1.1781F, 0.0F);
		hat11.setTextureOffset(16, 16).addBox(-2.5539F, 2.0F, 0.5317F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat21 = new ModelRenderer(this);
		hat21.setRotationPoint(0.7F, 0.0F, -0.6F);
		hair.addChild(hat21);
		setRotationAngle(hat21, 0.0F, -1.1781F, 0.0F);
		hat21.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat12 = new ModelRenderer(this);
		hat12.setRotationPoint(0.1F, 0.0F, -0.7F);
		hair.addChild(hat12);
		setRotationAngle(hat12, 0.0F, -0.48F, 0.0F);
		hat12.setTextureOffset(16, 16).addBox(-2.5539F, 2.0F, 0.5317F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat20 = new ModelRenderer(this);
		hat20.setRotationPoint(0.1F, 0.0F, -0.7F);
		hair.addChild(hat20);
		setRotationAngle(hat20, 0.0F, -0.48F, 0.0F);
		hat20.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat24 = new ModelRenderer(this);
		hat24.setRotationPoint(-1.4F, 0.0F, -1.3F);
		hair.addChild(hat24);
		setRotationAngle(hat24, 0.0F, 0.5672F, 0.0F);
		hat24.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		hat24.setTextureOffset(0, 13).addBox(-2.5539F, 1.4F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat37 = new ModelRenderer(this);
		hat37.setRotationPoint(-0.5F, 4.7F, -1.1F);
		hair.addChild(hat37);
		setRotationAngle(hat37, 0.0F, 0.5672F, 0.5672F);
		hat37.setTextureOffset(8, 19).addBox(-2.1746F, 2.506F, 0.5362F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hat38 = new ModelRenderer(this);
		hat38.setRotationPoint(-0.1F, 5.5F, -3.3F);
		hair.addChild(hat38);
		setRotationAngle(hat38, -0.2618F, -0.5236F, 0.5672F);
		hat38.setTextureOffset(0, 0).addBox(-0.5657F, 0.8654F, 2.7065F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat39 = new ModelRenderer(this);
		hat39.setRotationPoint(2.2F, 5.6F, -2.8F);
		hair.addChild(hat39);
		setRotationAngle(hat39, -0.9599F, -0.9599F, 1.1781F);
		hat39.setTextureOffset(0, 0).addBox(-0.5657F, 0.8654F, 2.7065F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat40 = new ModelRenderer(this);
		hat40.setRotationPoint(5.3F, 16.1F, -2.4F);
		hair.addChild(hat40);
		setRotationAngle(hat40, -1.7453F, 1.9635F, 1.0908F);
		hat40.setTextureOffset(0, 0).addBox(3.4343F, 6.8654F, 0.7065F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat41 = new ModelRenderer(this);
		hat41.setRotationPoint(6.7F, 15.5F, 1.3F);
		hair.addChild(hat41);
		setRotationAngle(hat41, -2.0508F, 1.7453F, 0.7854F);
		hat41.setTextureOffset(0, 0).addBox(3.4343F, 6.8654F, 0.7065F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hat42 = new ModelRenderer(this);
		hat42.setRotationPoint(-2.4F, 2.5F, 3.8F);
		hair.addChild(hat42);
		setRotationAngle(hat42, -2.0071F, 1.7453F, -2.7053F);
		hat42.setTextureOffset(8, 19).addBox(3.4343F, 5.8654F, 0.7065F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hat10 = new ModelRenderer(this);
		hat10.setRotationPoint(0.7F, 0.0F, 0.9F);
		hair.addChild(hat10);
		setRotationAngle(hat10, 0.0F, -2.618F, -0.0436F);
		hat10.setTextureOffset(16, 16).addBox(-2.5758F, 2.0049F, 0.519F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hat23 = new ModelRenderer(this);
		hat23.setRotationPoint(0.7F, 0.0F, 0.9F);
		hair.addChild(hat23);
		setRotationAngle(hat23, 0.0F, -2.618F, -0.0436F);
		hat23.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		hat25 = new ModelRenderer(this);
		hat25.setRotationPoint(0.3F, 0.0F, 1.1F);
		hair.addChild(hat25);
		setRotationAngle(hat25, 0.0F, 2.7489F, -0.0436F);
		hat25.setTextureOffset(0, 13).addBox(-2.5539F, -2.0F, 0.5317F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		hat25.setTextureOffset(0, 13).addBox(-2.421F, 1.2969F, 0.4767F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		stalk = new ModelRenderer(this);
		stalk.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(stalk);
		stalk.setTextureOffset(4, 22).addBox(-2.0F, -6.7F, -0.1F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		stalk_r1 = new ModelRenderer(this);
		stalk_r1.setRotationPoint(0.0F, 10.0F, 0.0F);
		stalk.addChild(stalk_r1);
		setRotationAngle(stalk_r1, -3.1416F, -0.6109F, 3.1416F);
		stalk_r1.setTextureOffset(4, 22).addBox(-2.0F, -16.7F, -0.1F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		stalk_r2 = new ModelRenderer(this);
		stalk_r2.setRotationPoint(0.0F, 10.0F, 0.0F);
		stalk.addChild(stalk_r2);
		setRotationAngle(stalk_r2, -3.1416F, 0.5672F, 3.1416F);
		stalk_r2.setTextureOffset(4, 22).addBox(-2.0F, -16.7F, -0.1F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		stalk_r3 = new ModelRenderer(this);
		stalk_r3.setRotationPoint(0.0F, 10.0F, 0.0F);
		stalk.addChild(stalk_r3);
		setRotationAngle(stalk_r3, -3.1416F, 1.5272F, 3.1416F);
		stalk_r3.setTextureOffset(4, 22).addBox(-2.0F, -16.7F, -0.1F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		stalk2 = new ModelRenderer(this);
		stalk2.setRotationPoint(-1.0F, -1.6F, 0.0F);
		hair.addChild(stalk2);
		setRotationAngle(stalk2, 0.0F, 0.0F, 0.4363F);
		

		allears = new ModelRenderer(this);
		allears.setRotationPoint(0.0F, -1.3F, 1.5F);
		head.addChild(allears);
		

		ears2 = new ModelRenderer(this);
		ears2.setRotationPoint(5.2F, -0.7F, -1.5F);
		allears.addChild(ears2);
		ears2.setTextureOffset(17, 27).addBox(-4.1F, 0.2F, 1.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		ears2.setTextureOffset(17, 28).addBox(-9.5F, 0.2F, 1.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, -0.7F, -1.5F);
		allears.addChild(ears);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -6.8F, 0.0F);
		wholebody.addChild(body);
		

		dress = new ModelRenderer(this);
		dress.setRotationPoint(0.0F, 0.6375F, 0.5875F);
		body.addChild(dress);
		dress.setTextureOffset(16, 14).addBox(-0.5F, -1.2375F, -0.3875F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dress.setTextureOffset(12, 8).addBox(-1.0F, -0.2375F, -0.7875F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		dress.setTextureOffset(12, 0).addBox(-1.5F, 0.6625F, -1.4875F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		dress.setTextureOffset(0, 8).addBox(-2.0F, 1.6625F, -2.2875F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		dress.setTextureOffset(12, 11).addBox(-2.0F, 2.1625F, 1.7125F, 4.0F, 1.0F, 0.0F, 0.0F, false);

		frill2 = new ModelRenderer(this);
		frill2.setRotationPoint(0.0F, 1.1625F, 2.4125F);
		dress.addChild(frill2);
		setRotationAngle(frill2, 0.0F, 1.5708F, 0.0F);
		frill2.setTextureOffset(12, 11).addBox(0.7F, 1.0F, 1.9F, 4.0F, 1.0F, 0.0F, 0.0F, false);

		frill3 = new ModelRenderer(this);
		frill3.setRotationPoint(2.0F, 1.1625F, -0.5875F);
		dress.addChild(frill3);
		setRotationAngle(frill3, 0.0F, 3.1416F, 0.0F);
		frill3.setTextureOffset(12, 11).addBox(0.0F, 1.0F, 1.7F, 4.0F, 1.0F, 0.0F, 0.0F, false);

		frill4 = new ModelRenderer(this);
		frill4.setRotationPoint(-3.9F, 1.1625F, 2.4125F);
		dress.addChild(frill4);
		setRotationAngle(frill4, 0.0F, 1.5708F, 0.0F);
		frill4.setTextureOffset(12, 11).addBox(0.8F, 1.0F, 1.9F, 4.0F, 1.0F, 0.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -1.8375F, -1.5875F);
		dress.addChild(neck);
		neck.setTextureOffset(19, 15).addBox(-1.6F, 1.0F, 1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(19, 15).addBox(0.6F, 1.0F, 1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(-0.0135F, -6.0F, 3.6019F);
		wholebody.addChild(arms);
		

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-1.7999F, -0.7F, -2.5044F);
		arms.addChild(arm1);
		arm1.setTextureOffset(12, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(1.4998F, -0.7F, -2.4913F);
		arms.addChild(arm2);
		arm2.setTextureOffset(12, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		legs = new ModelRenderer(this);
		legs.setRotationPoint(-0.048F, -4.0F, 2.099F);
		wholebody.addChild(legs);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-0.7F, 0.3F, -1.5F);
		legs.addChild(leg1);
		leg1.setTextureOffset(12, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.5F, 0.3F, -1.5F);
		legs.addChild(leg2);
		leg2.setTextureOffset(12, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		wholebody.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}



	@Override
	public void setRotationAngles(BlueberryElfEntity entityIn, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		 
	
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 1.2F) * 2.4F * limbSwingAmount;
	      this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 1.2F + (float)Math.PI) * 2.4F * limbSwingAmount;
	      
	      this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 1.2F) * 2.4F * limbSwingAmount;
	      this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 1.2F + (float)Math.PI) * 2.4F * limbSwingAmount; 
		
	}
}
