package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
 /*  -references

  LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),
    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    });
*/

    RASPBERRY_CANDY("raspberry_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.RASPBERRYCANDY.get())),

    STRAWBERRY_CANDY("strawberry_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.STRAWBERRYCANDY.get())),

    BLUEBERRY_CANDY("blueberry_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.BLUEBERRYCANDY.get())),

    BLACKBERRY_CANDY("blackberry_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.BLACKBERRYCANDY.get())),

    ORANGE_CANDY("orange_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.ORANGECANDY.get())),

    LEMON_CANDY("lemon_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.LEMONCANDY.get())),

    LIME_CANDY("lime_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.LIMECANDY.get())),

    PEACH_CANDY("peach_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.PEACHCANDY.get())),

    MANGO_CANDY("mango_candy", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.MANGOCANDY.get())),

    VANILLA_ICE_CREAM("vanilla_ice_cream", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(ItemInit.VANILLAICECREAM.get()));


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return SweetNotSavouryMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
