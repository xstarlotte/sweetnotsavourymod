package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ChipmunkFlavourVariant implements IVariant {
    CHOCOLATE(0),
    WHITECHOCOLATE(1);

    private static final ChipmunkFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ChipmunkFlavourVariant::getId)).toArray(ChipmunkFlavourVariant[]::new);
    private final int id;

    ChipmunkFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ChipmunkFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
