package com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.RASPBERRYICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.tileentities.beds.RaspberryIceCreamBedTe;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.RASPBERRYICECREAMBEDBOTTOM;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class RaspberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public RaspberryIceCreamBedBeRenderer(TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    @Override
    protected void setTileEntityAndModels( TileEntity te ){
        if(te instanceof RaspberryIceCreamBedTe)
            this.te = te;
        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel( RASPBERRYICECREAMBEDBOTTOM );
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel( RASPBERRYICECREAMBEDHEAD );

    }


}