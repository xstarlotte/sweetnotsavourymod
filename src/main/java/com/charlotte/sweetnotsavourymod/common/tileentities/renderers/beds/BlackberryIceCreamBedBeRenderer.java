package com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLACKBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLACKBERRYICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.tileentities.beds.BlackberryIceCreamBedTe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class BlackberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public BlackberryIceCreamBedBeRenderer(TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    @Override
    protected void setTileEntityAndModels( TileEntity te ){
        if(te instanceof BlackberryIceCreamBedTe)
            this.te = te;
        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel( BLACKBERRYICECREAMBEDBOTTOM );
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel( BLACKBERRYICECREAMBEDHEAD );

    }


}