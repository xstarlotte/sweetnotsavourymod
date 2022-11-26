package com.charlotte.sweetnotsavourymod.common.blockentities.chest;

import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.mojang.blaze3d.matrix.MatrixStack;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.state.properties.ChestType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestRenderer extends TileEntityRenderer<SNSChestBlockEntity> {
	private final SNSChestBlock chestBlock;
	private final double axisDistance, axisHeight;

	private final ResourceLocation base, lid, base2, lid2;

	public SNSChestRenderer(TileEntityRendererDispatcher dispatcher, SNSChestBlock chestBlock, double axisDistance, double axisHeight) {
		super(dispatcher);
		this.chestBlock = chestBlock;

		this.axisDistance = axisDistance;
		this.axisHeight = axisHeight;

		ResourceLocation loc = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(chestBlock));
		String ns = loc.getNamespace();
		String path = loc.getPath();

		base  = new ResourceLocation(ns, "block/" + path + "_base");
		lid   = new ResourceLocation(ns, "block/" + path + "_lid");
		base2 = new ResourceLocation(ns, "block/" + path + "_base2");
		lid2  = new ResourceLocation(ns, "block/" + path + "_lid2");
	}

	private static final float HALF_PI = (float)Math.PI / 2;
	@Override
	public void render(SNSChestBlockEntity entity, float partialTick, MatrixStack stack, IRenderTypeBuffer bufferSource, int light, int overlay) {
		Minecraft minecraft = Minecraft.getInstance();
		ModelManager models = minecraft.getModelManager();

		World level = entity.getLevel();
		BlockPos pos = entity.getBlockPos();
		BlockState state = entity.getBlockState();
		float openness = entity.getOpenNess(partialTick);

		if (level == null)
			return;


		boolean doubleChest = false;
		if (chestBlock.doubleAble) {
			ChestType type = state.getValue(SNSChestBlock.TYPE);
			if (type == ChestType.LEFT)
				return;
			if (type == ChestType.RIGHT)
				doubleChest = true;
		}
		
		
		IBakedModel baseModel = models.getModel(doubleChest ? base2 : base);
		IBakedModel lidModel = models.getModel(doubleChest ? lid2 : lid);

		stack.pushPose();

		transformFacing(stack, state.getValue(SNSChestBlock.FACING));
		render(level, pos, state, stack, bufferSource, baseModel);
		transformLid(stack, openness, axisHeight, axisDistance);
		render(level, pos, state, stack, bufferSource, lidModel);

		stack.popPose();
	}

	private static void transformFacing(MatrixStack stack, Direction direction) {
		switch (direction) {
			case NORTH: break;
			case SOUTH:
				stack.mulPose(Vector3f.YP.rotationDegrees(180));
				stack.translate(-1, 0, -1);
				break;
			case WEST:
				stack.mulPose(Vector3f.YP.rotationDegrees(90));
				stack.translate(-1, 0, 0);
				break;
			case EAST:
				stack.mulPose(Vector3f.YP.rotationDegrees(270));
				stack.translate(0, 0, -1);
				break;
		}
	}

	private static void transformLid(MatrixStack stack, float openness, double axisHeight, double axisDistance) {
		openness = 1.0F - openness;
		openness = 1.0F - openness * openness * openness;

		stack.translate(0, axisHeight, axisDistance);
		stack.mulPose(new Quaternion(Vector3f.XP, openness * HALF_PI, false));
		stack.translate(0, -axisHeight, -axisDistance);
	}

	private void render(World level, BlockPos pos, BlockState state, MatrixStack stack, IRenderTypeBuffer bufferIn, IBakedModel model){
		RenderType renderType = RenderType.cutout();
		Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , model , state , pos , stack , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY );

	}
}
