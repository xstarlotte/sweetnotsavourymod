package com.charlotte.sweetnotsavourymod.common.tileentities.renderers;

import com.charlotte.sweetnotsavourymod.common.tileentities.StrawberryIceCreamBedTe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.STRAWBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.STRAWBERRYICECREAMBEDHEAD;

public class StrawberryIceCreamBedTeRenderer extends  BaseBedTeRenderer{
    public StrawberryIceCreamBedTeRenderer( TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    @Override
    protected void setTileEntityAndModels( TileEntity te ){
        if(te instanceof StrawberryIceCreamBedTe)
            this.te = te;
        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel( STRAWBERRYICECREAMBEDBOTTOM );
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel( STRAWBERRYICECREAMBEDHEAD );

    }


}
