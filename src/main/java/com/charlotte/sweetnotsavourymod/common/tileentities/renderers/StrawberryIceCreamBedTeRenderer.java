package com.charlotte.sweetnotsavourymod.common.tileentities.renderers;

import com.charlotte.sweetnotsavourymod.common.tileentities.StrawberryIceCreamBedTe;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.vector.Vector4f;
import net.minecraft.world.World;

import static com.charlotte.sweetnotsavourymod.core.events.ModEvents.STRAWBERRYICECREAMBED;

public class StrawberryIceCreamBedTeRenderer extends TileEntityRenderer<StrawberryIceCreamBedTe>{

    public StrawberryIceCreamBedTeRenderer( TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }



    @Override
    public void render( StrawberryIceCreamBedTe te , float partialTicks , MatrixStack matrixStackIn , IRenderTypeBuffer bufferIn , int combinedLightIn , int combinedOverlayIn ){
        World level = te.getWorld();
        BlockState state = te.getBlockState();
        BlockPos pos = te.getPos();
        switch((te.getBlockState().get( BlockStateProperties.HORIZONTAL_FACING ))){
            case DOWN:
                break;
            case UP:
                break;
            case NORTH:
                int zn = pos.getZ() + 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBedCorrectly( level , pos , state , matrixStackIn , te , bufferIn , 180 , -1 , 0 );
                }
                break;
            case SOUTH:
                int zs = pos.getZ() - 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBedCorrectly( level , pos , state , matrixStackIn , te , bufferIn , 0 , 0 , 1 );
                }
                break;
            case WEST:
                int xw = pos.getX() + 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBedCorrectly( level , pos , state , matrixStackIn , te , bufferIn , 270 , 0 , 0 );
                }
                break;
            case EAST:
                int xe = pos.getX() - 1;
                if (state.get( BedBlock.PART) == BedPart.FOOT ){
                    renderBedCorrectly( level , pos , state , matrixStackIn , te , bufferIn , 90 , -1 , 1 );
                }
                break;
        }
    }

    private void renderBedCorrectly(World level, BlockPos pos, BlockState state, MatrixStack matrixStackIn, StrawberryIceCreamBedTe te, IRenderTypeBuffer bufferIn, int rotation,
                                    float tx, float tz){

            IBakedModel strawberryicecreambed = Minecraft.getInstance().getModelManager().getModel( STRAWBERRYICECREAMBED );
            RenderType renderType = RenderTypeLookup.func_239220_a_( state , false );
            matrixStackIn.push();
            matrixStackIn.rotate( Vector3f.YP.rotationDegrees(rotation) );
            matrixStackIn.translate( tx, 0, tz );
            Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelRenderer().renderModelFlat( level , strawberryicecreambed , state , pos , matrixStackIn , bufferIn.getBuffer( renderType ) , false , level.rand , state.getPositionRandom( pos ) , OverlayTexture.NO_OVERLAY ,
                    net.minecraftforge.client.model.data.EmptyModelData.INSTANCE );
            matrixStackIn.pop();

    }

    @Override
    public boolean isGlobalRenderer( StrawberryIceCreamBedTe te ){
        return true;
    }
}
