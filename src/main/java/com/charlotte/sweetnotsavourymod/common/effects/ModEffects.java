package com.charlotte.sweetnotsavourymod.common.effects;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<Effect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.POTIONS, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<Effect> POISON_RESISTANCE = MOB_EFFECTS.register("poison_resistance",
            () -> new PoisonResistanceEffect(EffectType.BENEFICIAL, 0x341264));

    public static final RegistryObject<Effect> HERB_HARMING = MOB_EFFECTS.register("herb_harming",
            () -> new HerbHarmEffect(EffectType.HARMFUL, 0x341264));

}
