package com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum PretzelflyVariant implements IVariant {
    SALTED(0),
    HONEY(1),
    STRAWBERRY(2),
    SUGAR(3),
    SPRINKLE(4),
    DARKCHOCOLATE(5),
    WHITECHOCOLATE(6),
    CHOCOLATE(7);

    private static final PretzelflyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(PretzelflyVariant::getId)).toArray(PretzelflyVariant[]::new);
    private final int id;

    PretzelflyVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static PretzelflyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
