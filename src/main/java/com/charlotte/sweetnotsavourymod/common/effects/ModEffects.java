package com.charlotte.sweetnotsavourymod.common.effects;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static void loadClass() {}
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = SNSReg.MOB_EFFECTS;

    public static final RegistryObject<MobEffect> POISON_RESISTANCE = MOB_EFFECTS.register("poison_resistance",
            () -> new PoisonResistanceEffect(MobEffectCategory.BENEFICIAL, 0x341264));

    public static final RegistryObject<MobEffect> HERB_HARMING = MOB_EFFECTS.register("herb_harming",
            () -> new HerbHarmEffect(MobEffectCategory.HARMFUL, 0x341264));

}
