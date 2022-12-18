package com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum WaferWitchVariant implements IVariant {
    VANILLA(0),
    RASPBERRY(1),
    BLUEBERRY(2),
    BLACKBERRY(3),
    STRAWBERRY(4),
    LEMON(5),
    ORANGE(6),
    LIME(7),
    MANGO(8),
    PEACH(9),
    PINEAPPLE(10),
    WHITE_CHOCOLATE(11),
    CHOCOLATE(12),
    TOFFEE(13);

    private static final WaferWitchVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WaferWitchVariant::getId)).toArray(WaferWitchVariant[]::new);
    private final int id;

    WaferWitchVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WaferWitchVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
