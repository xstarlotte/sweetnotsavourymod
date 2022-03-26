package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBaseBedBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.TOFFEEWAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.TOFFEEWAFFLEBEDHEAD;

public class ToffeeWaffleBedBeRenderer extends BaseBedBeRenderer {
    public ToffeeWaffleBedBeRenderer(BlockEntityRendererProvider.Context context){
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