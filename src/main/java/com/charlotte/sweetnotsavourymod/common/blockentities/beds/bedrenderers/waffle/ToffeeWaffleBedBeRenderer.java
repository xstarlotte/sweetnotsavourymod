package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.TOFFEEWAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.TOFFEEWAFFLEBEDHEAD;

public class ToffeeWaffleBedBeRenderer extends BaseBedBeRenderer {
    public ToffeeWaffleBedBeRenderer(TileEntityRendererDispatcher context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(TOFFEEWAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(TOFFEEWAFFLEBEDHEAD);
    }
}