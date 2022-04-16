package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.STRAWBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.STRAWBERRYICECREAMBEDHEAD;

public class StrawberryIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public StrawberryIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYICECREAMBEDHEAD);
    }
}
