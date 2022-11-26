package com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ElfFlavourVariant implements IVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    VANILLA(4),
    BLACKBERRY(5),
    LEMON(6),
    CHOCOLATE(7),
    TOFFEE(8),
    PEACH(9),
    PINEAPPLE(10),
    LIME(11),
    MANGO(12);

    private static final ElfFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ElfFlavourVariant::getId)).toArray(ElfFlavourVariant[]::new);
    private final int id;

    ElfFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ElfFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
