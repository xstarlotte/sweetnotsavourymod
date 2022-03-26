package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBaseBedBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.RASPBERRYWAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.RASPBERRYWAFFLEBEDHEAD;

public class RaspberryWaffleBedBeRenderer extends BaseBedBeRenderer {
    public RaspberryWaffleBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(RASPBERRYWAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(RASPBERRYWAFFLEBEDHEAD);
    }
}