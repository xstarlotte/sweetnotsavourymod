package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public class ModTiers implements IItemTier {

    public static final ModTiers CANDY_CANE = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.CANDY_CANE.get()));

    public static final ModTiers STRAWBERRY_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.STRAWBERRYCANDY.get()));

    public static final ModTiers RASPBERRY_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.RASPBERRYCANDY.get()));

    public static final ModTiers BLUEBERRY_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.BLUEBERRYCANDY.get()));

    public static final ModTiers BLACKBERRY_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.BLACKBERRYCANDY.get()));

    public static final ModTiers ORANGE_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.ORANGECANDY.get()));

    public static final ModTiers LEMON_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.LEMONCANDY.get()));

    public static final ModTiers LIME_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.LIMECANDY.get()));

    public static final ModTiers MANGO_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.MANGOCANDY.get()));

    public static final ModTiers PEACH_CANDY = new ModTiers(5, 2064, 10f, 7f, 64,
            () -> Ingredient.of(ItemInit.PEACHCANDY.get()));
    
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;
    
    
    private ModTiers(int pLevel, int pUses, float pSpeed, float pDamage, int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
        this.level = pLevel;
        this.uses = pUses;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = new LazyValue<>(pRepairIngredient);
    }
    
    public int getUses() {
        return this.uses;
    }
    
    public float getSpeed() {
        return this.speed;
    }
    
    public float getAttackDamageBonus() {
        return this.damage;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
    
}
