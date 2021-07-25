package com.charlotte.sweetnotsavourymod.common.tileentities.renderers;

import static com.charlotte.sweetnotsavourymod.core.events.ModEvents.BLACKBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.core.events.ModEvents.BLACKBERRYICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.tileentities.BlackberryIceCreamBedTe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

public class BlackberryIceCreamBedTeRenderer extends BaseBedTeRenderer{
    public BlackberryIceCreamBedTeRenderer( TileEntityRendererDispatcher rendererDispatcherIn ){
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