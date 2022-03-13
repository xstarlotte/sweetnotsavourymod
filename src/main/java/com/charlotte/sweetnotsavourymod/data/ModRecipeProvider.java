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

        //candy-cane

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE.get())
                .define('S', ItemInit.CANDYCANESUGAR.get())
                .pattern("  S")
                .pattern(" S ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_AXE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_HOE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_SHOVEL.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_PICKAXE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_SWORD.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        //armour

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_HELMET.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_LEGGINGS.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_BOOTS.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);


 //sugar-stick

        ShapedRecipeBuilder.shaped(Items.PAPER, 6)
                .define('S', ItemInit.CANDY_CANE.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

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

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRYCANDYBLOCK.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
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

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRYLOLLIPOP.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLACKBERRYCANDY.get(),
                                ItemInit.SUGARSTICK.get()).build()))
                .save(pFinishedRecipeConsumer);

    //Currency

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

        //windows

        ShapedRecipeBuilder.shaped(BlockInit.CANDYCANEWINDOW.get())
                .define('S', BlockInit.CANDYCANEBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.CANDYCANEBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYCANEWINDOW2.get())
                .define('S', BlockInit.CANDYCANEBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.CANDYCANEBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_WINDOW.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.STRAWBERRYCANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_WINDOW.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.RASPBERRYCANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_WINDOW.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.BLUEBERRYCANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_WINDOW.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.BLACKBERRYCANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_WINDOW.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.LEMONCANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_WINDOW.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ORANGECANDYBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFERWOODWINDOW.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.SUGARWRAPPER.get())
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.WAFERWOODBLOCK.get(),
                                ItemInit.SUGARWRAPPER.get()).build()))
                .save(pFinishedRecipeConsumer);

        //DOORS

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_DOOR.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.STRAWBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_DOOR.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.RASPBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_DOOR.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.BLUEBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_DOOR.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.BLACKBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_DOOR.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ORANGECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_DOOR.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.LEMONCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_DOOR.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.CHOCOLATE.get())
                .pattern("AS")
                .pattern("AS")
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.WAFERWOODBLOCK.get(),
                                ItemInit.CHOCOLATE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_PLANK_DOOR.get())
                .define('S', BlockInit.WAFERWOODPLANKS.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.WAFERWOODPLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get())
                .define('S', BlockInit.WAFERWOODPLANKS.get())
                .define('A', ItemInit.CHOCOLATE.get())
                .pattern("AS")
                .pattern("AS")
                .pattern("AS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.WAFERWOODPLANKS.get(),
                                ItemInit.CHOCOLATE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.FROSTING_DOOR.get())
                .define('S', BlockInit.FROSTINGBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.FROSTINGBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get())
                .define('S', BlockInit.ROTTENMOULDYCANDYCANEBRICKS.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ROTTENMOULDYCANDYCANEBRICKS.get()).build()))
                .save(pFinishedRecipeConsumer);



 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
