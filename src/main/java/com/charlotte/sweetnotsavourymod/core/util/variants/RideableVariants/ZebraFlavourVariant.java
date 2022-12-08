package com.charlotte.sweetnotsavourymod.core.util.variants.RideableVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ZebraFlavourVariant implements IVariant {
    ZEBRACAKE(0),
    CANDYCANE(1),
    PEPPERMINTCANDYCANE(2),
    MINTCANDYCANE(3),
    SPEARMINTCANDYCANE(4),
    LEMONCANDYCANE(5),
    CHOCOLATEORANGECAKE(6);

    private static final ZebraFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ZebraFlavourVariant::getId)).toArray(ZebraFlavourVariant[]::new);
    private final int id;

    ZebraFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ZebraFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
