package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLACKBERRYWAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLACKBERRYWAFFLEBEDHEAD;

public class BlackberryWaffleBedBeRenderer extends BaseBedBeRenderer {
    public BlackberryWaffleBedBeRenderer(TileEntityRendererDispatcher context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(BLACKBERRYWAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(BLACKBERRYWAFFLEBEDHEAD);
    }
}