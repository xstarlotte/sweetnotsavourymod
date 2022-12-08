package com.charlotte.sweetnotsavourymod.core.util.variants.CatVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum LionVariant implements IVariant {
    CANDYFLOSS(0),
    BLUECANDYFLOSS(1);

    private static final LionVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(LionVariant::getId)).toArray(LionVariant[]::new);
    private final int id;

    LionVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static LionVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
