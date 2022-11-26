package com.charlotte.sweetnotsavourymod.common.item.SweetTierTools;

import com.charlotte.sweetnotsavourymod.common.effects.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HerbSwordItem extends SwordItem {
    public HerbSwordItem(IItemTier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }
//called every time we hit an enemy
    
    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity pTarget, LivingEntity pAttacker) {
 //pTarget = the living entity we're attacking
 //pAttacker = the one attacking = the one causing the effects to happen
        pTarget.addEffect(new EffectInstance(ModEffects.HERB_HARMING.get(), 200));
        pAttacker.addEffect(new EffectInstance(Effects.HEAL, 200));
        return super.hurtEnemy(p_43278_, pTarget, pAttacker);
    }
}
