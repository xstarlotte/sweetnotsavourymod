package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;

import net.minecraft.client.renderer.texture.OverlayTexture;

import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public abstract class BaseBedBeRenderer extends BlockEntityRenderer<BlockEntity> {

    protected BlockEntity be;
    protected BakedModel headbedmodel;
    protected BakedModel bottombedmodel;

    public BaseBedBeRenderer(BlockEntityRenderDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    protected abstract void setBlockEntityAndModels(BlockEntity be);

    @Override
    public void render(BlockEntity blockentity , float partialTicks , PoseStack matrixStackIn , MultiBufferSource bufferIn , int combinedLightIn , int combinedOverlayIn ){
       setBlockEntityAndModels(blockentity);
        Level level = be.getLevel();
        BlockState state = be.getBlockState();
        BlockPos pos = be.getPos();
        switch((be.getBlockState().get( BlockStateProperties.HORIZONTAL_FACING ))){
            case NORTH:
                int zn = pos.getZ() + 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 180 , -1 , -1 );
                }
                if (state.get( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 180 , -1 , -1 );
                }
                break;
            case SOUTH:
                int zs = pos.getZ() - 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 0 , 0 , 0 );
                }
                if (state.get( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 0 , 0 , 0 );
                }
                break;
            case WEST:
                int xw = pos.getX() + 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 270 , 0 , -1 );
                }
                if (state.get( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 270 , 0 , -1 );
                }
                break;
            case EAST:
                int xe = pos.getX() - 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBottomBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 90 , -1 , 0 );
                }
                if (state.get( BedBlock.PART) == BedPart.HEAD ){
                    renderHeadBedCorrectly( level , pos , state , matrixStackIn , be , bufferIn , 90 , -1 , 0 );
                }
                break;
        }
    }

    private void renderBottomBedCorrectly(Level level, BlockPos pos, BlockState state, PoseStack matrixStackIn, BlockEntity be, MultiBufferSource bufferIn, int rotation,
                                    float tx, float tz){
            RenderType renderType = ItemBlockRenderTypes.getRenderType( state , false );
            matrixStackIn.pushPose();
            matrixStackIn.rotate( Vector3f.YP.rotationDegrees(rotation) );
            matrixStackIn.translate( tx, 0, tz );
            Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , bottombedmodel , state , pos , matrixStackIn , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY ,
                    net.minecraftforge.client.model.data.EmptyModelData.INSTANCE );
            matrixStackIn.popPose();

    }

    private void renderHeadBedCorrectly(Level level, BlockPos pos, BlockState state, PoseStack matrixStackIn, BlockEntity be, MultiBufferSource bufferIn, int rotation,
                                          float tx, float tz){
        RenderType renderType = ItemBlockRenderTypes.getRenderType( state , false );
        matrixStackIn.pushPose();
        matrixStackIn.rotate( Vector3f.YP.rotationDegrees(rotation) );
        matrixStackIn.translate( tx, 0, tz );
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , headbedmodel , state , pos , matrixStackIn , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY ,
                net.minecraftforge.client.model.data.EmptyModelData.INSTANCE );
        matrixStackIn.popPose();

    }

    @Override
    public boolean isGlobalRenderer( BlockEntity be ){
            return true;
    }
}
