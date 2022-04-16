package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.BaseBedBeRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.LEMONICECREAMBEDBOTTOM;
import static com.charlotte.sweetnotsavourymod.common.events.ClientEvents.LEMONICECREAMBEDHEAD;

public class LemonIceCreamBedBeRenderer extends BaseBedBeRenderer {
    public LemonIceCreamBedBeRenderer(BlockEntityRendererProvider.Context context){
        super(context);
    }

    @Override
    protected void setBlockEntityAndModels(SNSBaseBedBlockEntity be){
        if(be != null) {
            this.be = be;
        }

        this.bottombedmodel = Minecraft.getInstance().getModelManager().getModel(LEMONICECREAMBEDBOTTOM);
        this.headbedmodel = Minecraft.getInstance().getModelManager().getModel(LEMONICECREAMBEDHEAD);
    }
}
