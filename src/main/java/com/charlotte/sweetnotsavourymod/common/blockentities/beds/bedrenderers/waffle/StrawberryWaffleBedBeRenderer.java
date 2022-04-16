package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.STRAWBERRYWAFFLEBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.STRAWBERRYWAFFLEBEDHEAD;

public class StrawberryWaffleBedBeRenderer extends BaseBedBeRenderer {
    public StrawberryWaffleBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYWAFFLEBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(STRAWBERRYWAFFLEBEDHEAD);
    }
}