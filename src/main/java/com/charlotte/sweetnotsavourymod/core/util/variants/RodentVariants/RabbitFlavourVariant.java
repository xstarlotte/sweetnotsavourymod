package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum RabbitFlavourVariant implements IVariant {
    ANGEL(0),
    BANANA(1),
    CARROT(2),
    CHOCOLATECHERRY(3),
    LEMONCURD(4),
    REDVELVET(5),
    VANILLA(6),
    VICTORIASPONGE(7),
    CHOCOLATEORANGE(8),
    STRAWBERRY(9);

    private static final RabbitFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(RabbitFlavourVariant::getId)).toArray(RabbitFlavourVariant[]::new);
    private final int id;

    RabbitFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static RabbitFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
