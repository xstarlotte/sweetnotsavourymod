package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum RabbitFlavourVariants {
    ANGEL(0),
    BANANA(1),
    CARROT(2),
    CHOCOLATECHERRY(3),
    LEMONCURD(4),
    REDVELVET(5),
    VANILLA(6);

    private static final RabbitFlavourVariants[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(RabbitFlavourVariants::getId)).toArray(RabbitFlavourVariants[]::new);
    private final int id;

    private RabbitFlavourVariants(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static RabbitFlavourVariants byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
