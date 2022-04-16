package com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum IceCreamPugFlavourVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    BLACKBERRY(4),
    LEMON(5),
    CHOCOLATE(6),
    TOFFEE(7),
    MANGO(8),
    LIME(9);
   ;

    private static final IceCreamPugFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(IceCreamPugFlavourVariant::getId)).toArray((i) -> new IceCreamPugFlavourVariant[i]);
    private final int id;

    private IceCreamPugFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static IceCreamPugFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
