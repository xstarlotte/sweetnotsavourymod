package com.charlotte.sweetnotsavourymod.common.material;

import java.util.function.Supplier;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum IceCreamToolMaterial implements Tier {
	
	STRAWBERRYICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get())),
	ORANGEICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get())),
	VANILLAICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get())),
	BLUEBERRYICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get())),
	LEMONICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get())),
	RASPBERRYICECREAMSWORD(4, 4000, 15f, 10f, 20, () -> Ingredient.of(ItemInit.SPRINKLES.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	IceCreamToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}
	
	
	
	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public int getEnchantability() {
		return this.enchantability;
	}
	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getMaxUses() {
		return this.maxUses;
	}
	@Override
	public Ingredient getRepairMaterial() {
		return this.getRepairMaterial();
	}

}
