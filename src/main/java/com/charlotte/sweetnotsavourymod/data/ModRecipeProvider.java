package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe>pFinishedRecipeConsumer) {
 //sugar-stick
        ShapedRecipeBuilder.shaped(ItemInit.SUGARSTICK.get())
                .define('S', ItemInit.CANDYCANESUGAR.get())
                .pattern("S")
                .pattern("S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

  //sugar-wrapper
        ShapedRecipeBuilder.shaped(ItemInit.SUGARWRAPPER.get())
                .define('S', ItemInit.CANDYCANESUGAR.get())
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

  //ice-cream
        ShapedRecipeBuilder.shaped(ItemInit.VANILLAICECREAM.get())
                .define('S', ItemInit.VANILLAICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.VANILLAICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRYICECREAM.get())
                .define('S', ItemInit.STRAWBERRYICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRYICECREAM.get())
                .define('S', ItemInit.RASPBERRYICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRYICECREAM.get())
                .define('S', ItemInit.BLUEBERRYICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMONICECREAM.get())
                .define('S', ItemInit.LEMONICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGEICECREAM.get())
                .define('S', ItemInit.ORANGEICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGEICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

//candy-blocks
        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYCANDYBLOCK.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYCANDYBLOCK.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYCANDYBLOCK.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONCANDYBLOCK.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGECANDYBLOCK.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);
  //lollipops
        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRYLOLLIPOP.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYCANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRYLOLLIPOP.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYCANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRYLOLLIPOP.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYCANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMONLOLLIPOP.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONCANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGELOLLIPOP.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGECANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.WRAPPEDSTRAWBERRYCANDY.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYCANDY.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.WRAPPEDRASPBERRYCANDY.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYCANDY.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.WRAPPEDBLUEBERRYCANDY.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYCANDY.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.WRAPPEDLEMONCANDY.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONCANDY.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.WRAPPEDORANGECANDY.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGECANDY.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
