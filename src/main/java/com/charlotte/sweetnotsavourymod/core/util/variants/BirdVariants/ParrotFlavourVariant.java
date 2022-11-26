package com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ParrotFlavourVariant implements IVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    PEACH(4),
    BLACKBERRY(5),
    LEMON(6),
    CHOCOLATE(7),
    PINEAPPLE(8),
    TOFFEE(9),
    LIME(10),
    MANGO(11);

    private static final ParrotFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ParrotFlavourVariant::getId)).toArray(ParrotFlavourVariant[]::new);
    private final int id;

    ParrotFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ParrotFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
