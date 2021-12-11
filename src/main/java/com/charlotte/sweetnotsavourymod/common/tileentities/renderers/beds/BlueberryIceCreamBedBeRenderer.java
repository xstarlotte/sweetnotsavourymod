package com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLUEBERRYICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.tileentities.beds.BlueberryIceCreamBedTe;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLUEBERRYICECREAMBEDBOTTOM;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class BlueberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public BlueberryIceCreamBedBeRenderer(TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    @Override
    protected void setTileEntityAndModels( TileEntity te ){
        if(te instanceof BlueberryIceCreamBedTe)
            this.te = te;
        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel( BLUEBERRYICECREAMBEDBOTTOM );
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel( BLUEBERRYICECREAMBEDHEAD );

    }


}
