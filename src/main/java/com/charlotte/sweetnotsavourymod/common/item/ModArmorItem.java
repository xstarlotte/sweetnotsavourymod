package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.common.effects.ModEffects;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;
import java.util.function.Supplier;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, Supplier<MobEffectInstance[]>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, Supplier<MobEffectInstance[]>>())
                    .put(ModArmorMaterials.RASPBERRY_CANDY,
                            () -> new MobEffectInstance[] {
                                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 1),
                                    new MobEffectInstance(ModEffects.POISON_RESISTANCE.get(), 200, 1)}).build();



    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, Supplier<MobEffectInstance[]>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance[] mapStatusEffect = entry.getValue().get();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance[] mapStatusEffect) {
        boolean hasPlayerEffect = true;

        for (MobEffectInstance instance : mapStatusEffect) {
            hasPlayerEffect = player.hasEffect(instance.getEffect());
        }

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {

            applyMultipleEffects(player, mapStatusEffect);

            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //}
        }
    }

    private void applyMultipleEffects(Player player, MobEffectInstance[] mapStatusEffect) {
        for (MobEffectInstance instance : mapStatusEffect) {
            player.addEffect(new MobEffectInstance(instance.getEffect(),
                    instance.getDuration(), instance.getAmplifier()));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material
                && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
