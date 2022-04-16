package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLACKBERRYICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.BLACKBERRYICECREAMBEDHEAD;

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
