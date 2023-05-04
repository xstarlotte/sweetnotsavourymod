package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum GummyfishVariant implements IVariant {
    STRAWBERRY(0),
    RASPBERRY(1),
    BLUEBERRY(2),
    BLACKBERRY(3),
    LEMON(4),
    ORANGE(5),
    MANGO(6),
    PEACH(7),
    COLA(8),
    LIME(9),
    PINEAPPLE(10);

    private static final GummyfishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GummyfishVariant::getId)).toArray(GummyfishVariant[]::new);
    private final int id;

    GummyfishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static GummyfishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
