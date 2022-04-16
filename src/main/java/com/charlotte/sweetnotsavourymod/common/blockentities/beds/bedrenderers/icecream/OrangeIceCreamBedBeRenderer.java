package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.ORANGEICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.ORANGEICECREAMBEDHEAD;

public class OrangeIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public OrangeIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(ORANGEICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(ORANGEICECREAMBEDHEAD);
    }
}