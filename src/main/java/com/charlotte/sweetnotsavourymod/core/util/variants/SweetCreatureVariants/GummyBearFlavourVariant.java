package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum GummyBearFlavourVariant implements IVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    LEMON(4),
    ORANGE(5),
    LIME(6),
    COLA(7),
    MANGO(8),
    PINEAPPLE(9),
    PEACH(10),
    CHERRY(11),
    APPLE(12);

    private static final GummyBearFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GummyBearFlavourVariant::getId)).toArray(GummyBearFlavourVariant[]::new);
    private final int id;

    GummyBearFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static GummyBearFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
