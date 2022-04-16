package com.charlotte.sweetnotsavourymod.common.effects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;

import javax.annotation.Nullable;

public class HerbHarmEffect extends InstantenousMobEffect {
    public HerbHarmEffect(MobEffectCategory p_19451_, int p_19452_) {
        super(MobEffectCategory.HARMFUL, 0x341264);
    }

    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        if ((this != MobEffects.HEAL || pLivingEntity.isInvertedHealAndHarm()) && (this != MobEffects.HARM || !pLivingEntity.isInvertedHealAndHarm())) {
            if (this == MobEffects.HARM && !pLivingEntity.isInvertedHealAndHarm() || this == MobEffects.HEAL && pLivingEntity.isInvertedHealAndHarm()) {
                int j = (int)(pHealth * (double)(6 << pAmplifier) + 0.5D);
                if (pSource == null) {
                    pLivingEntity.hurt(DamageSource.MAGIC, (float)j);
                } else {
                    pLivingEntity.hurt(DamageSource.indirectMagic(pSource, pIndirectSource), (float)j);
                }
            } else {
                this.applyEffectTick(pLivingEntity, pAmplifier);
            }
        } else {
            int i = (int)(pHealth * (double)(4 << pAmplifier) + 0.5D);
            pLivingEntity.heal((float)i);
        }

    }

    public boolean isInvertedHealAndHarm() {
        if (this.getMobType() == MobType.UNDEAD);
            return false;
    }

    private MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
