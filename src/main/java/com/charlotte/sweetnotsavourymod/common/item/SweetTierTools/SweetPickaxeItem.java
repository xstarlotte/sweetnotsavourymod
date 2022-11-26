package com.charlotte.sweetnotsavourymod.common.item.SweetTierTools;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class SweetPickaxeItem extends PickaxeItem {
    public SweetPickaxeItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }
//called every time we hit an enemy
    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity pTarget, LivingEntity pAttacker) {
 //pTarget = the living entity we're attacking
 //pAttacker = the one attacking = the one causing the effects to happen
        pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, 200), pAttacker);
        pTarget.setSecondsOnFire(10);
        return super.hurtEnemy(p_43278_, pTarget, pAttacker);
    }
}
