package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.GeneralInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

public class BlockInitLootTables extends BlockLoot {

    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
    private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
    private static final LootItemCondition.Builder HAS_NO_SILK_TOUCH = HAS_SILK_TOUCH.invert();
    private static final LootItemCondition.Builder HAS_SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));
    private static final LootItemCondition.Builder HAS_SHEARS_OR_SILK_TOUCH = HAS_SHEARS.or(HAS_SILK_TOUCH);
    private static final LootItemCondition.Builder HAS_NO_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_OR_SILK_TOUCH.invert();

    protected static LootTable.Builder createShearsDispatchTable(Block pBlock, LootPoolEntryContainer.Builder<?> pAlternativeEntryBuilder) {
        return createSelfDropDispatchTable(pBlock, HAS_SHEARS, pAlternativeEntryBuilder);
    }

    protected static LootTable.Builder createSilkTouchOrShearsDispatchTable(Block pBlock, LootPoolEntryContainer.Builder<?> pAlternativeEntryBuilder) {
        return createSelfDropDispatchTable(pBlock, HAS_SHEARS_OR_SILK_TOUCH, pAlternativeEntryBuilder);
    }

    protected static LootTable.Builder createOakLeavesDrops(Block pOakLeavesBlock, Block pSaplingBlock, float... pChances) {
        return createLeavesDrops(pOakLeavesBlock, pSaplingBlock, pChances).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH).add(applyExplosionCondition(pOakLeavesBlock, LootItem.lootTableItem(ItemInit.SPRINKLES.get())).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
    }

    protected static LootTable.Builder createCropDrops(Block pCropBlock, Item pGrownCropItem, Item pSeedsItem, LootItemCondition.Builder pDropGrownCropCondition) {
        return applyExplosionDecay(pCropBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pGrownCropItem).when(pDropGrownCropCondition).otherwise(LootItem.lootTableItem(pSeedsItem)))).withPool(LootPool.lootPool().when(pDropGrownCropCondition).add(LootItem.lootTableItem(pSeedsItem).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));
    }

    @Override
    protected void addTables() {

        this.dropSelf(BlockInit.APPLEGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.COLAGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.LIMEGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.CHERRYGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.PEACHGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.MANGOGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.PINEAPPLEGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.STRAWBERRYGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.RASPBERRYGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.BLACKBERRYGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.BLUEBERRYGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.ORANGEGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.LEMONGUMMYBEARTEDDY.get());
        this.dropSelf(BlockInit.POISONBERRYATTACKERTEDDY.get());
        this.dropSelf(BlockInit.POISONBERRYARCHERTEDDY.get());
        this.dropSelf(BlockInit.POISONBERRYDEFENDERTEDDY.get());
        this.dropSelf(BlockInit.POISONBERRYHEALERTEDDY.get());

        this.dropSelf(BlockInit.STRAWBERRYICECREAMBED.get());
        this.dropSelf(BlockInit.RASPBERRYICECREAMBED.get());
        this.dropSelf(BlockInit.BLUEBERRYICECREAMBED.get());
        this.dropSelf(BlockInit.BLACKBERRYICECREAMBED.get());
        this.dropSelf(BlockInit.LEMONICECREAMBED.get());
        this.dropSelf(BlockInit.ORANGEICECREAMBED.get());
        this.dropSelf(BlockInit.STRAWBERRYWAFFLEBED.get());
        this.dropSelf(BlockInit.RASPBERRYWAFFLEBED.get());
        this.dropSelf(BlockInit.BLACKBERRYWAFFLEBED.get());
        this.dropSelf(BlockInit.BLUEBERRYWAFFLEBED.get());
        this.dropSelf(BlockInit.LEMONWAFFLEBED.get());
        this.dropSelf(BlockInit.ORANGEWAFFLEBED.get());
        this.dropSelf(BlockInit.CHOCOLATEWAFFLEBED.get());
        this.dropSelf(BlockInit.TOFFEEWAFFLEBED.get());
        this.dropSelf(BlockInit.VANILLAWAFFLEBED.get());





        this.dropSelf(BlockInit.STRAWBERRYLAMP.get());
        this.dropSelf(BlockInit.RASPBERRYLAMP.get());
        this.dropSelf(BlockInit.BLACKBERRYLAMP.get());
        this.dropSelf(BlockInit.BLUEBERRYLAMP.get());
        this.dropSelf(BlockInit.LEMONLAMP.get());
        this.dropSelf(BlockInit.ORANGELAMP.get());
        this.dropSelf(BlockInit.STRAWBERRYLOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.RASPBERRYLOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.BLACKBERRYLOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.BLUEBERRYLOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.LEMONLOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.ORANGELOLLIPOPLAMP.get());
        this.dropSelf(BlockInit.STRAWBERRYICECREAMLAMP.get());
        this.dropSelf(BlockInit.RASPBERRYICECREAMLAMP.get());
        this.dropSelf(BlockInit.BLACKBERRYICECREAMLAMP.get());
        this.dropSelf(BlockInit.BLUEBERRYICECREAMLAMP.get());
        this.dropSelf(BlockInit.ORANGEICECREAMLAMP.get());
        this.dropSelf(BlockInit.LEMONICECREAMLAMP.get());
        this.dropSelf(BlockInit.VANILLAICECREAMLAMP.get());
        this.dropSelf(BlockInit.CHOCOLATEICECREAMLAMP.get());
        this.dropSelf(BlockInit.TOFFEEICECREAMLAMP.get());
        this.dropSelf(BlockInit.POISONBERRYLANTERN.get());
        this.dropSelf(BlockInit.CANDYCANE_LAMP.get());

        this.dropSelf(BlockInit.BANANA_CROP.get());
        this.dropSelf(BlockInit.VANILLA_CROP.get());
        this.dropSelf(BlockInit.MINT_CROP.get());
        this.dropSelf(BlockInit.PEACH_CROP.get());
        this.dropSelf(BlockInit.PINEAPPLE_CROP.get());
        this.dropSelf(BlockInit.ORANGE_CROP.get());
        this.dropSelf(BlockInit.MANGO_CROP.get());
        this.dropSelf(BlockInit.BLACKBERRY_CROP.get());
        this.dropSelf(BlockInit.STRAWBERRY_CROP.get());
        this.dropSelf(BlockInit.BLUEBERRY_CROP.get());
        this.dropSelf(BlockInit.RASPBERRY_CROP.get());
        this.dropSelf(BlockInit.LIME_CROP.get());
        this.dropSelf(BlockInit.LEMON_CROP.get());
        this.dropSelf(BlockInit.CARROT_CROP.get());


        this.dropSelf(BlockInit.ICECREAMTREESAPLING.get());
        this.dropSelf(BlockInit.CHOCOLATEICECREAMTREESAPLING.get());
        this.dropSelf(BlockInit.RAINBOWCANDYBUSH.get());
        this.dropSelf(BlockInit.STRAWBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.RASPBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.BLACKBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.BLUEBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.LEMONCONEFLOWER.get());
        this.dropSelf(BlockInit.ORANGECONEFLOWER.get());
        this.dropSelf(BlockInit.VANILLACONEFLOWER.get());
        this.dropSelf(BlockInit.CHOCOLATECONEFLOWER.get());
        this.dropSelf(BlockInit.TOFFEECONEFLOWER.get());
        this.dropSelf(BlockInit.STRAWBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.RASPBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.BLACKBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.BLUEBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.LEMONFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.ORANGEFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.FROSTINGFLOWER.get());
        this.dropSelf(BlockInit.FROSTINGGRASS.get());
        this.dropSelf(BlockInit.CANDYCANEBUSH.get());
        this.dropSelf(BlockInit.CANDY_CANE_FLOWER.get());
        this.dropSelf(BlockInit.CANDY_CANE_FLOWER_2.get());
        this.dropSelf(BlockInit.CANDY_CANE_FLOWER_3.get());
        this.dropSelf(BlockInit.CANDY_CANE_FLOWER_4.get());
        this.dropSelf(BlockInit.CANDY_CANE_GRASS.get());
        this.dropSelf(BlockInit.CANDY_CANE_GRASS_LONG.get());
        this.dropSelf(BlockInit.CHOCOLATECINERARIA.get());
        this.dropSelf(BlockInit.TOFFEETULIP.get());
        this.dropSelf(BlockInit.POISONBERRYPLANT.get());

        this.dropSelf(BlockInit.POTTED_STRAWBERRYCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_RASPBERRYCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_BLACKBERRYCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_BLUEBERRYCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_LEMONCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_ORANGECANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_RAINBOWCANDYBUSH.get());
        this.dropSelf(BlockInit.POTTED_STRAWBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_RASPBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_BLACKBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_BLUEBERRYCONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_LEMONCONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_ORANGECONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_VANILLACONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_CHOCOLATECONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_TOFFEECONEFLOWER.get());
        this.dropSelf(BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_RASPBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_LEMONFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_ORANGEFROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_FROSTINGFLOWER.get());
        this.dropSelf(BlockInit.POTTED_CANDYCANEBUSH.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_FLOWER.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_FLOWER_2.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_FLOWER_3.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_FLOWER_4.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_GRASS.get());
        this.dropSelf(BlockInit.POTTED_CANDY_CANE_GRASS_LONG.get());
        this.dropSelf(BlockInit.POTTED_CHOCOLATECINERARIA.get());
        this.dropSelf(BlockInit.POTTED_TOFFEETULIP.get());
        this.dropSelf(BlockInit.POTTED_POISONBERRYPLANT.get());

        this.dropSelf(BlockInit.WAFERWOODBLOCK.get());
        this.dropSelf(BlockInit.CHOCOLATEWAFERWOODBLOCK.get());
        this.dropSelf(BlockInit.WAFERWOODPLANKS.get());
        this.dropSelf(BlockInit.STRIPPEDWAFERWOODBLOCK.get());
        this.dropSelf(BlockInit.CANDYCANEBLOCK.get());
        this.dropSelf(BlockInit.CANDYCANEBRICKS.get());
        this.dropSelf(BlockInit.ROTTENMOULDYCANDYCANEBLOCK.get());
        this.dropSelf(BlockInit.ROTTENMOULDYCANDYCANEBRICKS.get());
        this.dropSelf(BlockInit.ROTTENMOULDYCANDYCANEBARS.get());
        this.dropSelf(BlockInit.ROTTENMOULDYCANDYCANECHAINS.get());
        this.dropSelf(BlockInit.ROTTENMOULDYCANDYCANE_WALL.get());

        this.dropSelf(BlockInit.STRAWBERRYCANDYBLOCK.get());
        this.dropSelf(BlockInit.RASPBERRYCANDYBLOCK.get());
        this.dropSelf(BlockInit.BLACKBERRYCANDYBLOCK.get());
        this.dropSelf(BlockInit.BLUEBERRYCANDYBLOCK.get());
        this.dropSelf(BlockInit.LEMONCANDYBLOCK.get());
        this.dropSelf(BlockInit.ORANGECANDYBLOCK.get());
        this.dropSelf(BlockInit.LIMECANDYBLOCK.get());
        this.dropSelf(BlockInit.PEACHCANDYBLOCK.get());
        this.dropSelf(BlockInit.MANGOCANDYBLOCK.get());

        this.dropSelf(BlockInit.TOOTHPASTE_BLOCK.get());

        this.dropSelf(BlockInit.STRAWBERRYFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.RASPBERRYFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.BLACKBERRYFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.BLUEBERRYFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.ORANGEFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.LEMONFROSTINGBLOCK.get());
        this.dropSelf(BlockInit.FROSTINGBLOCK.get());
        this.dropSelf(BlockInit.RAINBOWFROSTINGGRASSBLOCK.get());
        this.dropSelf(BlockInit.RAINBOWFROSTINGLEAVES.get());
        this.dropSelf(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get());
        this.dropSelf(BlockInit.CHOCOLATECHIPCOOKIEBLOCK.get());
        this.dropSelf(BlockInit.WHITECHOCOLATECHIPCOOKIEBLOCK.get());
        this.dropSelf(BlockInit.RAINBOWCOOKIEBLOCK.get());
        this.dropSelf(BlockInit.POPCORNBLOCK.get());
        this.dropSelf(BlockInit.CANDYFLOSSBLOCK.get());
        this.dropSelf(BlockInit.STRAWBERRYSORBETBLOCK.get());
        this.dropSelf(BlockInit.RASPBERRYSORBETBLOCK.get());
        this.dropSelf(BlockInit.BLACKBERRYSORBETBLOCK.get());
        this.dropSelf(BlockInit.BLUEBERRYSORBETBLOCK.get());
        this.dropSelf(BlockInit.LEMONSORBETBLOCK.get());
        this.dropSelf(BlockInit.ORANGESORBETBLOCK.get());
        this.dropSelf(BlockInit.PEACHMANGOSORBETBLOCK.get());
        this.dropSelf(BlockInit.RASPBERRYICINGBLOCK.get());
        this.dropSelf(BlockInit.MELTINGCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGBLACKBERRYCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGORANGECHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGLEMONCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGSTRAWBERRYCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGRASPBERRYCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.MELTINGBLUEBERRYCHOCOLATEBLOCK.get());
        this.dropSelf(BlockInit.HARDENEDBANANABRICKS.get());
        this.dropSelf(BlockInit.HARDENEDBANANASTONE.get());
        this.dropSelf(BlockInit.HARDENEDBANANAPLANKS.get());
        this.dropSelf(BlockInit.SMOOTHHARDENEDBANANASTONE.get());
        this.dropSelf(BlockInit.POISONBERRYLEAVES.get());
        this.dropSelf(BlockInit.POISONGRASSBLOCK.get());
        this.dropSelf(BlockInit.POISONBERRYWOODPLANKS.get());
        this.dropSelf(BlockInit.FLOWERINGPOISONBERRYLEAVES.get());
        this.dropSelf(BlockInit.OVERGROWNPOISONBERRYWOODPLANKS.get());

        this.dropSelf(BlockInit.WAFERWOODWINDOW.get());
        this.dropSelf(BlockInit.CANDYCANEWINDOW.get());
        this.dropSelf(BlockInit.CANDYCANEWINDOW2.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.BLACKBERRY_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.LEMON_CANDY_WINDOW.get());
        this.dropSelf(BlockInit.POISONBERRYWOODWINDOW.get());
        this.dropSelf(BlockInit.POISONOAKWINDOW.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.LEMON_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.PEACH_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.MANGO_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.CANDYFLOSS_STAIRS.get());
        this.dropSelf(BlockInit.LIME_CANDY_STAIRS.get());
        this.dropSelf(BlockInit.WAFER_WOOD_STAIRS.get());
        this.dropSelf(BlockInit.HARDENED_BANANA_STAIRS.get());
        this.dropSelf(BlockInit.CANDYCANEBRICK_STAIRS.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_WALL.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_WALL.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_WALL.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_WALL.get());
        this.dropSelf(BlockInit.LEMON_CANDY_WALL.get());
        this.dropSelf(BlockInit.LIME_CANDY_WALL.get());
        this.dropSelf(BlockInit.MANGO_CANDY_WALL.get());
        this.dropSelf(BlockInit.PEACH_CANDY_WALL.get());
        this.dropSelf(BlockInit.CANDYFLOSS_WALL.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_WALL.get());
        this.dropSelf(BlockInit.WAFER_WOOD_WALL.get());
        this.dropSelf(BlockInit.HARDENED_BANANA_WALL.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_FENCE.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_FENCE.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_FENCE.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_FENCE.get());
        this.dropSelf(BlockInit.LEMON_CANDY_FENCE.get());
        this.dropSelf(BlockInit.LIME_CANDY_FENCE.get());
        this.dropSelf(BlockInit.MANGO_CANDY_FENCE.get());
        this.dropSelf(BlockInit.PEACH_CANDY_FENCE.get());
        this.dropSelf(BlockInit.CANDYFLOSS_FENCE.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_FENCE.get());
        this.dropSelf(BlockInit.WAFER_WOOD_FENCE.get());
        this.dropSelf(BlockInit.HARDENED_BANANA_FENCE.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.LEMON_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.LIME_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.MANGO_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.PEACH_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.CANDYFLOSS_FENCE_GATE.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_FENCE_GATE.get());
        this.dropSelf(BlockInit.WAFER_WOOD_FENCE_GATE.get());
        this.dropSelf(BlockInit.HARDENED_BANANA_FENCE_GATE.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_SLAB.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_SLAB.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_SLAB.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_SLAB.get());
        this.dropSelf(BlockInit.LEMON_CANDY_SLAB.get());
        this.dropSelf(BlockInit.LIME_CANDY_SLAB.get());
        this.dropSelf(BlockInit.MANGO_CANDY_SLAB.get());
        this.dropSelf(BlockInit.PEACH_CANDY_SLAB.get());
        this.dropSelf(BlockInit.CANDYFLOSS_SLAB.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_SLAB.get());
        this.dropSelf(BlockInit.WAFER_WOOD_SLAB.get());
        this.dropSelf(BlockInit.HARDENED_BANANA_SLAB.get());

        this.dropSelf(BlockInit.BLACKBERRY_CANDY_DOOR.get());
        this.dropSelf(BlockInit.STRAWBERRY_CANDY_DOOR.get());
        this.dropSelf(BlockInit.BLUEBERRY_CANDY_DOOR.get());
        this.dropSelf(BlockInit.RASPBERRY_CANDY_DOOR.get());
        this.dropSelf(BlockInit.LEMON_CANDY_DOOR.get());
        this.dropSelf(BlockInit.ORANGE_CANDY_DOOR.get());
        this.dropSelf(BlockInit.LIME_CANDY_DOOR.get());
        this.dropSelf(BlockInit.MANGO_CANDY_DOOR.get());
        this.dropSelf(BlockInit.PEACH_CANDY_DOOR.get());
        this.dropSelf(BlockInit.PINEAPPLE_CANDY_DOOR.get());
        this.dropSelf(BlockInit.CANDYFLOSS_DOOR.get());
        this.dropSelf(BlockInit.WAFER_WOOD_DOOR.get());
        this.dropSelf(BlockInit.WAFER_PLANK_DOOR.get());
        this.dropSelf(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get());
        this.dropSelf(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get());
        this.dropSelf(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get());
        this.dropSelf(BlockInit.FROSTING_DOOR.get());
        this.dropSelf(BlockInit.TOOTHPASTE_DOOR.get());
        this.dropSelf(BlockInit.CANDYCANE_DOOR.get());

        this.dropSelf(BlockInit.POISONOAKMINIDOOR.get());
        this.dropSelf(BlockInit.POISONOAKDRAWERS.get());
        this.dropSelf(BlockInit.POISONOAKSTOVE.get());
        this.dropSelf(BlockInit.POISONOAKTELEVISION.get());
        this.dropSelf(BlockInit.POISONBERRYLEAVESCHAIR.get());
        this.dropSelf(BlockInit.POISONBERRYWOODWARDROBE.get());
        this.dropSelf(BlockInit.POISONBERRYWOODBED.get());

        this.dropSelf(GeneralInit.MACHINE_ICE_CREAM_MACHINE.getBlock());
        this.dropSelf(GeneralInit.MACHINE_BANANA_BAKER.getBlock());
        this.dropSelf(GeneralInit.MACHINE_JAM_PRESSER.getBlock());
        this.dropSelf(GeneralInit.MACHINE_WAFFLE_CONE_MACHINE.getBlock());
        this.dropSelf(GeneralInit.MACHINE_CAKE_BAKER.getBlock());
        this.dropSelf(GeneralInit.MACHINE_CANDYCANE_FURNACE.getBlock());
        this.dropSelf(GeneralInit.MACHINE_CANDYFLOSS_CRYSTALLIZER.getBlock());
        this.dropSelf(GeneralInit.MACHINE_TEDDY_BEAR_PRINTER.getBlock());
        this.dropSelf(BlockInit.PURE_HERB_BLOCK.get());







        this.dropPottedContents(BlockInit.POTTED_STRAWBERRYCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_RASPBERRYCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_BLACKBERRYCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_BLUEBERRYCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_LEMONCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_LIMECANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_MANGOCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_PEACHCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_ORANGECANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_RAINBOWCANDYBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_STRAWBERRYCONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_RASPBERRYCONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_BLACKBERRYCONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_BLUEBERRYCONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_LEMONCONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_ORANGECONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_VANILLACONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_CHOCOLATECONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_TOFFEECONEFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_RASPBERRYFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_LEMONFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_ORANGEFROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_FROSTINGFLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_CANDYCANEBUSH.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_FLOWER.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_FLOWER_2.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_FLOWER_3.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_FLOWER_4.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_GRASS.get());
        this.dropPottedContents(BlockInit.POTTED_CANDY_CANE_GRASS_LONG.get());
        this.dropPottedContents(BlockInit.POTTED_CHOCOLATECINERARIA.get());
        this.dropPottedContents(BlockInit.POTTED_TOFFEETULIP.get());
        this.dropPottedContents(BlockInit.POTTED_POISONBERRYPLANT.get());


        this.add(BlockInit.STRAWBERRYCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.STRAWBERRYCANDYBUSH.get());
        });
        this.add(BlockInit.RASPBERRYCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.RASPBERRYCANDYBUSH.get());
        });
        this.add(BlockInit.BLUEBERRYCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.BLUEBERRYCANDYBUSH.get());
        });
        this.add(BlockInit.BLACKBERRYCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.BLACKBERRYCANDYBUSH.get());
        });
        this.add(BlockInit.ORANGECANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.ORANGECANDYBUSH.get());
        });
        this.add(BlockInit.LEMONCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.LEMONCANDYBUSH.get());
        });
        this.add(BlockInit.LIMECANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.LIMECANDYBUSH.get());
        });
        this.add(BlockInit.MANGOCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.MANGOCANDYBUSH.get());
        });
        this.add(BlockInit.PEACHCANDYBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.PEACHCANDYBUSH.get());
        });

        this.add(BlockInit.CHOCOLATECINERARIA.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.CHOCOLATECINERARIA.get());
        });

        this.add(BlockInit.TOFFEETULIP.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.TOFFEETULIP.get());
        });

        this.add(BlockInit.CANDYCANEBUSH.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.CANDYCANEBUSH.get());
        });

        this.add(BlockInit.CANDY_CANE_SUGAR_CANE.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, BlockInit.CANDY_CANE_SUGAR_CANE.get());
        });


        this.add(BlockInit.STRAWBERRYCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.STRAWBERRYCANDY.get());
        });
        this.add(BlockInit.RASPBERRYCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.RASPBERRYCANDY.get());
        });
        this.add(BlockInit.BLACKBERRYCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.BLACKBERRYCANDY.get());
        });
        this.add(BlockInit.BLUEBERRYCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.BLUEBERRYCANDY.get());
        });
        this.add(BlockInit.ORANGECANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.ORANGECANDY.get());
        });
        this.add(BlockInit.LEMONCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.LEMONCANDY.get());
        });

        this.add(BlockInit.LIMECANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.LIMECANDY.get());
        });

        this.add(BlockInit.MANGOCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.MANGOCANDY.get());
        });

        this.add(BlockInit.PEACHCANDYBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.PEACHCANDY.get());
        });

        this.add(BlockInit.CHOCOLATECINERARIA.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.CHOCOLATE.get());
        });

        this.add(BlockInit.TOFFEETULIP.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.TOFFEE.get());
        });

        this.add(BlockInit.CANDYCANEBUSH.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.CANDYCANESUGAR.get());
        });

        this.add(BlockInit.CANDY_CANE_SUGAR_CANE.get(), (p_124078_) -> {
            return createOreDrop(p_124078_, ItemInit.CANDYCANESUGAR.get());
        });

        this.add(BlockInit.RAINBOWFROSTINGLEAVES.get(), (p_124104_) -> {
            return createOakLeavesDrops(p_124104_, BlockInit.ICECREAMTREESAPLING.get(),
                    NORMAL_LEAVES_SAPLING_CHANCES);
        });

        this.add(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get(), (p_124104_) -> {
            return createOakLeavesDrops(p_124104_, BlockInit.ICECREAMTREESAPLING.get(),
                    NORMAL_LEAVES_SAPLING_CHANCES);
        });

        //crops

        LootItemCondition.Builder lootitemcondition$banana = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.BANANA_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.BANANA_CROP.get(), createCropDrops(BlockInit.BANANA_CROP.get(), ItemInit.SWEETBANANA.get(),
                ItemInit.SWEETBANANA.get(),
                lootitemcondition$banana));

        LootItemCondition.Builder lootitemcondition$strawberry = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.STRAWBERRY_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.STRAWBERRY_CROP.get(), createCropDrops(BlockInit.STRAWBERRY_CROP.get(), ItemInit.SWEETSTRAWBERRY.get(),
                ItemInit.SWEETSTRAWBERRY.get(),
                lootitemcondition$strawberry));

        LootItemCondition.Builder lootitemcondition$raspberry = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.RASPBERRY_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.RASPBERRY_CROP.get(), createCropDrops(BlockInit.RASPBERRY_CROP.get(), ItemInit.SWEETRASPBERRY.get(),
                ItemInit.SWEETRASPBERRY.get(),
                lootitemcondition$raspberry));

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.BLACKBERRY_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.BLACKBERRY_CROP.get(), createCropDrops(BlockInit.BLACKBERRY_CROP.get(), ItemInit.SWEETBLACKBERRY.get(),
                ItemInit.SWEETBLACKBERRY.get(),
                lootitemcondition$builder));

        LootItemCondition.Builder lootitemcondition$blueberry = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.BLUEBERRY_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.BLUEBERRY_CROP.get(), createCropDrops(BlockInit.BLUEBERRY_CROP.get(), ItemInit.SWEETBLUEBERRY.get(),
                ItemInit.SWEETBLUEBERRY.get(),
                lootitemcondition$blueberry));

        LootItemCondition.Builder lootitemcondition$lemon = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.LEMON_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.LEMON_CROP.get(), createCropDrops(BlockInit.LEMON_CROP.get(), ItemInit.SWEETLEMON.get(),
                ItemInit.SWEETLEMON.get(),
                lootitemcondition$lemon));

        LootItemCondition.Builder lootitemcondition$orange = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.ORANGE_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.ORANGE_CROP.get(), createCropDrops(BlockInit.ORANGE_CROP.get(), ItemInit.SWEETORANGE.get(),
                ItemInit.SWEETORANGE.get(),
                lootitemcondition$orange));

        LootItemCondition.Builder lootitemcondition$lime = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.LIME_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.LIME_CROP.get(), createCropDrops(BlockInit.LIME_CROP.get(), ItemInit.SWEETLIME.get(),
                ItemInit.SWEETLIME.get(),
                lootitemcondition$lime));

        LootItemCondition.Builder lootitemcondition$peach = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.PEACH_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.PEACH_CROP.get(), createCropDrops(BlockInit.PEACH_CROP.get(), ItemInit.SWEETPEACH.get(),
                ItemInit.SWEETPEACH.get(),
                lootitemcondition$peach));

        LootItemCondition.Builder lootitemcondition$mango = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.MANGO_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.MANGO_CROP.get(), createCropDrops(BlockInit.MANGO_CROP.get(), ItemInit.SWEETMANGO.get(),
                ItemInit.SWEETMANGO.get(),
                lootitemcondition$mango));

        LootItemCondition.Builder lootitemcondition$pineapple = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.PINEAPPLE_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.PINEAPPLE_CROP.get(), createCropDrops(BlockInit.PINEAPPLE_CROP.get(), ItemInit.SWEETPINEAPPLE.get(),
                ItemInit.SWEETPINEAPPLE.get(),
                lootitemcondition$pineapple));

        LootItemCondition.Builder lootitemcondition$vanilla = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.VANILLA_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.VANILLA_CROP.get(), createCropDrops(BlockInit.VANILLA_CROP.get(), ItemInit.VANILLA.get(),
                ItemInit.VANILLA.get(),
                lootitemcondition$vanilla));

        LootItemCondition.Builder lootitemcondition$mint = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.MINT_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.MINT_CROP.get(), createCropDrops(BlockInit.MINT_CROP.get(), ItemInit.MINT.get(),
                ItemInit.MINT.get(),
                lootitemcondition$vanilla));

        LootItemCondition.Builder lootitemcondition$carrot = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (BlockInit.CARROT_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BeetrootBlock.AGE, 2));
        this.add(BlockInit.CARROT_CROP.get(), createCropDrops(BlockInit.CARROT_CROP.get(), ItemInit.SWEETCARROT.get(),
                ItemInit.SWEETCARROT.get(),
                lootitemcondition$vanilla));




       //doors

        this.add(BlockInit.STRAWBERRY_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.RASPBERRY_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.BLACKBERRY_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.BLUEBERRY_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.ORANGE_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.LEMON_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.LIME_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.MANGO_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.PEACH_CANDY_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.CANDYFLOSS_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.WAFER_PLANK_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.WAFER_WOOD_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.FROSTING_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.TOOTHPASTE_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.CANDYCANE_DOOR.get(), BlockLoot::createDoorTable);
        this.add(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), BlockLoot::createDoorTable);

        this.add(BlockInit.STRAWBERRY_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.BLACKBERRY_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.RASPBERRY_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.BLUEBERRY_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.ORANGE_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.LEMON_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.LIME_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.MANGO_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.PEACH_CANDY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.CANDYFLOSS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(BlockInit.WAFER_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);

        this.add(BlockInit.STRAWBERRYICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.RASPBERRYICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BLACKBERRYICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BLUEBERRYICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.ORANGEICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.LEMONICECREAMBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });

        this.add(BlockInit.STRAWBERRYWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.RASPBERRYWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BLACKBERRYWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BLUEBERRYWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.ORANGEWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.LEMONWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.VANILLAWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.CHOCOLATEWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.TOFFEEWAFFLEBED.get(), (p_124231_) -> {
            return createSinglePropConditionTable(p_124231_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.CANDYCANE_GRASS_BLOCK.get(), block -> createSingleItemTableWithSilkTouch(block, Blocks.DIRT));
        this.dropSelf(BlockInit.STRAWBERRY_CHEST.get());
        this.dropSelf(BlockInit.WAFER_CHEST.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
