package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import com.charlotte.sweetnotsavourymod.common.events.ClientEventBusSubscriber;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BlueberryWaffleBedBeRenderer extends BaseBedBeRenderer {
    public BlueberryWaffleBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.BLUEBERRYWAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.BLUEBERRYWAFFLEBEDHEAD);
    }
}