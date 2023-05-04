package com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum WormVariant implements IVariant {
    STRAWBERRYLACE(0),
    COLALACE(1),
    LEMONLACE(2),
    LIMELACE(3),
    CANDYCANE(4),
    LEMONCANDYCANE(5),
    MINTCANDYCANE(6),
    PEPPERMINTCANDYCANE(7),
    SPEARMINTCANDYCANE(8);


    private static final WormVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WormVariant::getId)).toArray(WormVariant[]::new);
    private final int id;

    WormVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WormVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
