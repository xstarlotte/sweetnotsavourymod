package com.charlotte.sweetnotsavourymod.common.tileentities.renderers;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLUEBERRYICECREAMBEDHEAD;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLUEBERRYICECREAMBEDBOTTOM;
import com.charlotte.sweetnotsavourymod.common.tileentities.BlueberryIceCreamBedTe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class BlueberryIceCreamBedTeRenderer extends  BaseBedTeRenderer{
    public BlueberryIceCreamBedTeRenderer( TileEntityRendererDispatcher rendererDispatcherIn ){
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
