package com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum WaferschundVariant implements IVariant {

    STRAWBERRY(0),
    PEACH(1),
    MANGO(2),
    WHITECHOCOLATE(3),
    BLACKBERRY(4),
    BLUEBERRY(5),
    PINEAPPLE(6),
    LIME(7),
    RASPBERRY(8),
    LEMON(9),
    CHOCOLATE(10),
    ORANGE(11);

    private static final WaferschundVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WaferschundVariant::getId)).toArray(WaferschundVariant[]::new);
    private final int id;

    WaferschundVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WaferschundVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
