package com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum IceCreamParrotFlavourVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    PEACH(4),
    BLACKBERRY(5),
    LEMON(6),
    CHOCOLATE(7),
    TOFFEE(8),
    MANGO(9),
    LIME(10);
   ;

    private static final IceCreamParrotFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(IceCreamParrotFlavourVariant::getId)).toArray((i) -> new IceCreamParrotFlavourVariant[i]);
    private final int id;

    private IceCreamParrotFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static IceCreamParrotFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
