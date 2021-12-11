package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.LEMONICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.LemonIceCreamBedTe;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.LEMONICECREAMBEDBOTTOM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class LemonIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public LemonIceCreamBedBeRenderer(TileEntityRendererDispatcher rendererDispatcherIn ){
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
