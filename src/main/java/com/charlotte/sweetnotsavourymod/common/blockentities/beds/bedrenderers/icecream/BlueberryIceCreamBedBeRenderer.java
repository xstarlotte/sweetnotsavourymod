package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLUEBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLUEBERRYICECREAMBEDHEAD;

public class BlueberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public BlueberryIceCreamBedBeRenderer(TileEntityRendererDispatcher context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(BLUEBERRYICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(BLUEBERRYICECREAMBEDHEAD);
    }
}
