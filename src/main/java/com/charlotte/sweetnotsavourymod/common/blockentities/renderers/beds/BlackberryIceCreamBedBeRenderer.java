package com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds;

import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLACKBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.client.events.ClientEvents.BLACKBERRYICECREAMBEDHEAD;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.SNSBaseBedBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BlackberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public BlackberryIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(BLACKBERRYICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(BLACKBERRYICECREAMBEDHEAD);
    }
}