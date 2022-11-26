package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.data.loot.EntityLootTables;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.EntityHasProperty;
import net.minecraft.loot.functions.LootingEnchantBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.loot.functions.Smelt;

public class ModEntityLootTables extends EntityLootTables {

    protected void addTables() {

        this.add(EntityTypesInit.SNSLION.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                        .add(ItemLootEntry.lootTableItem(ItemInit.CANDYFLOSS.get())
                                .apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F)))
                                .apply(Smelt.smelted()
                                        .when(EntityHasProperty
                                                .hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                                .apply(LootingEnchantBonus.lootingMultiplier(RandomValueRange.between(0.0F, 1.0F))))));

        this.add(EntityTypesInit.SNSSHEEP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantRange.exactly(1))
                        .add(ItemLootEntry.lootTableItem(ItemInit.CANDYFLOSS.get())
                                .apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F)))
                                .apply(Smelt.smelted()
                                        .when(EntityHasProperty
                                                .hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                                .apply(LootingEnchantBonus.lootingMultiplier(RandomValueRange
                                        .between(0.0F, 1.0F))))));

        this.add(EntityTypesInit.SNSPRETZELFLY.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantRange.exactly(1))
                        .add(ItemLootEntry.lootTableItem(ItemInit.PRETZEL.get())
                                .apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F)))
                                .apply(Smelt.smelted()
                                        .when(EntityHasProperty
                                                .hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                                .apply(LootingEnchantBonus.lootingMultiplier(RandomValueRange
                                        .between(0.0F, 1.0F))))));

    }

}
