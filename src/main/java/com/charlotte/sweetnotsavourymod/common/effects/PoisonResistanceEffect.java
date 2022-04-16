package com.charlotte.sweetnotsavourymod.common.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class PoisonResistanceEffect extends MobEffect {
    public PoisonResistanceEffect(MobEffectCategory p_19451_, int p_19452_) {
        super(MobEffectCategory.BENEFICIAL, 0x341264);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {

            boolean hasPoison = pLivingEntity.hasEffect(MobEffects.POISON);

            if (hasPoison) {
                pLivingEntity.removeEffect(MobEffects.POISON);
            }

        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
