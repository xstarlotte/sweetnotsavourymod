package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBaseBedBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.WAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.WAFFLEBEDHEAD;

public class WaffleBedBeRenderer extends BaseBedBeRenderer {
    public WaffleBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(WAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(WAFFLEBEDHEAD);
    }
}