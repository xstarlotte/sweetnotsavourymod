package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import com.charlotte.sweetnotsavourymod.common.events.ClientEventBusSubscriber;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BlueberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public BlueberryIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.BLUEBERRYICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.BLUEBERRYICECREAMBEDHEAD);
    }
}
