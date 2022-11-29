package com.charlotte.sweetnotsavourymod.core.util.variants.CowVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum IceCreamCowVariant implements IVariant {

    BLACKBERRY(0),
    RASPBERRY(1),
    BLUEBERRY(2),
    STRAWBERRY(3),
    VANILLA(4),
    CHOCOLATE(5),
    TOFFEE(6),
    PEACH(7),
    MANGO(8),
    PINEAPPLE(9),
    LEMON(10),
    ORANGE(11);

    private static final IceCreamCowVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(IceCreamCowVariant::getId)).toArray(IceCreamCowVariant[]::new);
    private final int id;

    IceCreamCowVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static IceCreamCowVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
