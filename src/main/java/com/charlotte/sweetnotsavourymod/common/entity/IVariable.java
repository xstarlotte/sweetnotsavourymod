package com.charlotte.sweetnotsavourymod.common.entity;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;
import net.minecraft.network.chat.Component;

public interface IVariable<T extends IVariant> {
    T getVariant();
    void setVariant(T variant);
    int getTypeVariant();
    default Component getVariantName(Component parent) {
        return Component.translatable(parent.getString() + "." + getVariant().getId());
    }
}
