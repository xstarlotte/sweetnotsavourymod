package com.charlotte.sweetnotsavourymod.common.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.InstantEffect;
import net.minecraft.util.DamageSource;

import javax.annotation.Nullable;

public class HerbHarmEffect extends InstantEffect {
    public HerbHarmEffect(EffectType p_19451_, int p_19452_) {
        super(EffectType.HARMFUL, 0x341264);
    }

    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        if ((this != Effects.HEAL || pLivingEntity.isInvertedHealAndHarm()) && (this != Effects.HARM || !pLivingEntity.isInvertedHealAndHarm())) {
            if (this == Effects.HARM && !pLivingEntity.isInvertedHealAndHarm() || this == Effects.HEAL && pLivingEntity.isInvertedHealAndHarm()) {
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
    
//    // Possibly an issue
//    public boolean isInvertedHealAndHarm() {
//        if (this.getMobType() == MobType.UNDEAD);
//            return false;
//    }
//
//    private MobType getMobType() {
//        return MobType.UNDEFINED;
//    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
