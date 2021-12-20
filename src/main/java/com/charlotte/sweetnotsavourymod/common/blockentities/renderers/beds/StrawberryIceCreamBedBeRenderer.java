package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBedBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;


import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.STRAWBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.STRAWBERRYICECREAMBEDHEAD;

public class StrawberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public StrawberryIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYICECREAMBEDHEAD);
    }
}
