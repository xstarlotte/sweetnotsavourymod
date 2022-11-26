package com.charlotte.sweetnotsavourymod.core.util.variants.SheepVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum BoarryVariant implements IVariant {
    BLACKBOARRY(0),
    BLUEBOARRY(1),
    RASPBOARRY(2),
    STRAWBOARRY(3);

    private static final BoarryVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BoarryVariant::getId)).toArray(BoarryVariant[]::new);
    private final int id;

    BoarryVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static BoarryVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
