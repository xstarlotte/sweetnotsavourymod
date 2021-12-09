package com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.LEMONICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.tileentities.beds.LemonIceCreamBedTe;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.LEMONICECREAMBEDBOTTOM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class LemonIceCreamBedTeRenderer extends BaseBedTeRenderer{
    public LemonIceCreamBedTeRenderer( TileEntityRendererDispatcher rendererDispatcherIn ){
        super( rendererDispatcherIn );
    }

    @Override
    protected void setTileEntityAndModels( TileEntity te ){
        if(te instanceof LemonIceCreamBedTe)
            this.te = te;
        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel( LEMONICECREAMBEDBOTTOM );
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel( LEMONICECREAMBEDHEAD );

    }


}
