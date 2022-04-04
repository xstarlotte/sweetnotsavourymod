package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum ICFishVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    LEMON(4),
    ORANGE(5),
    VANILLA(6),
    CHOCOLATE(7),
    TOFFEE(8),
    PEACH(9),
    MANGO(10),
    PINEAPPLE(11),
    LIME(12),
    WAFER(13);


   ;

    private static final ICFishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ICFishVariant::getId)).toArray((i) -> new ICFishVariant[i]);
    private final int id;

    private ICFishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ICFishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
