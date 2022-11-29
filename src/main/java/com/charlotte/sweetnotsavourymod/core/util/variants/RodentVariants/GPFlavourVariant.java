package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum GPFlavourVariant implements IVariant {
    VANILLA(0),
    CHOCOLATE(1),
    STRAWBERRY(2),
    LEMONCURD(3),
    COFFEE(4);

    private static final GPFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GPFlavourVariant::getId)).toArray(GPFlavourVariant[]::new);
    private final int id;

    GPFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static GPFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
