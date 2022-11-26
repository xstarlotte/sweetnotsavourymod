package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;

public abstract class BaseBedBeRenderer extends TileEntityRenderer<SNSBaseBedBlockEntity> {
    protected SNSBaseBedBlockEntity be;
    protected IBakedModel headbedmodel;
    protected IBakedModel bottombedmodel;

    public BaseBedBeRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    protected abstract void setBlockEntityAndModels(SNSBaseBedBlockEntity be);

    @Override
    public void render(SNSBaseBedBlockEntity blockentity, float partialTicks , MatrixStack matrixStackIn , IRenderTypeBuffer bufferIn , int combinedLightIn , int combinedOverlayIn ){
       setBlockEntityAndModels(blockentity);
        World level = be.getLevel();
        BlockState state = be.getBlockState();
        BlockPos pos = be.getBlockPos();
        switch((be.getBlockState().getValue(BlockStateProperties.HORIZONTAL_FACING))){
            case NORTH:
                int zn = pos.getZ() + 1;
                if (state.getValue( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 180 , -1 , -1 );
                }
                if (state.getValue( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 180 , -1 , -1 );
                }
                break;
            case SOUTH:
                int zs = pos.getZ() - 1;
                if (state.getValue( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 0 , 0 , 0 );
                }
                if (state.getValue( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 0 , 0 , 0 );
                }
                break;
            case WEST:
                int xw = pos.getX() + 1;
                if (state.getValue( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 270 , 0 , -1 );
                }
                if (state.getValue( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 270 , 0 , -1 );
                }
                break;
            case EAST:
                int xe = pos.getX() - 1;
                if (state.getValue( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 90 , -1 , 0 );
                }
                if (state.getValue( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 90 , -1 , 0 );
                }
                break;
        }
    }

    private void renderBottomBedCorrectly(World level, BlockPos pos, BlockState state, MatrixStack matrixStackIn, TileEntity be, IRenderTypeBuffer bufferIn, int rotation,
                                    float tx, float tz){
            RenderType renderType = RenderType.translucent();
            matrixStackIn.pushPose();
            matrixStackIn.mulPose( Vector3f.YP.rotationDegrees(rotation) );
            matrixStackIn.translate( tx, 0, tz );
            Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , bottombedmodel , state , pos , matrixStackIn , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY);
            matrixStackIn.popPose();

    }

    private void renderHeadBedCorrectly(World level, BlockPos pos, BlockState state, MatrixStack matrixStackIn, TileEntity be, IRenderTypeBuffer bufferIn, int rotation,
                                          float tx, float tz){
        RenderType renderType = RenderType.translucent();
        matrixStackIn.pushPose();
        matrixStackIn.mulPose( Vector3f.YP.rotationDegrees(rotation) );
        matrixStackIn.translate( tx, 0, tz );
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , headbedmodel , state , pos , matrixStackIn , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY);
        matrixStackIn.popPose();

    }

    @Override
    public boolean shouldRenderOffScreen(SNSBaseBedBlockEntity p_112306_) {
        return true;
    }
}
