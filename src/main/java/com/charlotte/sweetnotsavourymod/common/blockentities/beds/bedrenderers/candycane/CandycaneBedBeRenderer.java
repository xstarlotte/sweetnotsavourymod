package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.candycane;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import com.charlotte.sweetnotsavourymod.common.events.ClientEventBusSubscriber;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class CandycaneBedBeRenderer extends BaseBedBeRenderer {
    public CandycaneBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.CANDYCANEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(ClientEventBusSubscriber.CANDYCANEBEDHEAD);
    }
}