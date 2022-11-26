package com.charlotte.sweetnotsavourymod.common.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;

public class PoisonResistanceEffect extends Effect {
    public PoisonResistanceEffect(EffectType p_19451_, int p_19452_) {
        super(EffectType.BENEFICIAL, 0x341264);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {

            boolean hasPoison = pLivingEntity.hasEffect(Effects.POISON);

            if (hasPoison) {
                pLivingEntity.removeEffect(Effects.POISON);
            }

        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
