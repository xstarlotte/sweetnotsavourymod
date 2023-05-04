package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum JellybabyVariant implements IVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    LEMON(4),
    ORANGE(5),
    LIME(6),
    MANGO(7),
    PINEAPPLE(8),
    PEACH(9);

    private static final JellybabyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(JellybabyVariant::getId)).toArray(JellybabyVariant[]::new);
    private final int id;

    JellybabyVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static JellybabyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
