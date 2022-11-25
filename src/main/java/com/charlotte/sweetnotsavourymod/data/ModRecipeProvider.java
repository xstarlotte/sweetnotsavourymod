package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

  //  public interface RecipeType<T extends Recipe<?>> {
   //     RecipeType<IceCreamMachineRecipe> ICE_CREAMING = register("ice_creaming");

 //       static <T extends Recipe<?>> net.minecraft.world.item.crafting.RecipeType<T> register(final String pIdentifier) {
  //          return Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(pIdentifier), new net.minecraft.world.item.crafting.RecipeType<T>() {
   //             public String toString() {
   //                 return pIdentifier;
  //              }
  //          });
 //       }

   //     default <C extends Container> Optional<T> tryMatch(Recipe<C> pRecipe, Level pLevel, C pContainer) {
  //          return pRecipe.matches(pContainer, pLevel) ? Optional.of((T) pRecipe) : Optional.empty();
  //      }
//    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe>pFinishedRecipeConsumer) {

    //machines

        ShapedRecipeBuilder.shaped(BlockInit.ICE_CREAM_MACHINE.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.CREAMY_MILK_BUCKET.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.CANDYCANESUGAR.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CAKE_BAKER.get())
                .define('S', BlockInit.ORANGE_CANDY_WINDOW.get())
                .define('A', BlockInit.RAINBOWFROSTINGLEAVES.get())
                .define('D', BlockInit.WAFERWOODBLOCK.get())
                .pattern("AAA")
                .pattern("SSS")
                .pattern("DDD")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ORANGE_CANDY_WINDOW.get(),
                                BlockInit.WAFERWOODBLOCK.get(),
                                BlockInit.RAINBOWFROSTINGLEAVES.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.TEDDY_BEAR_PRINTER.get())
                .define('S', BlockInit.STRAWBERRY_CANDY_WINDOW.get())
                .define('D', BlockInit.CANDYCANEBLOCK.get())
                .pattern("DSD")
                .pattern("DSD")
                .pattern("DDD")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.STRAWBERRY_CANDY_WINDOW.get(),
                                BlockInit.CANDYCANEBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_CRYSTALIZER.get())
                .define('S', BlockInit.RASPBERRY_CANDY_WINDOW.get())
                .define('A', ItemInit.CANDYCANESUGAR.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ORANGE_CANDY_WINDOW.get(),
                                BlockInit.WAFERWOODBLOCK.get(),
                                BlockInit.RAINBOWFROSTINGLEAVES.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYCANE_FURNACE.get())
                .define('S', BlockInit.CANDYCANEBLOCK.get())
                .define('A', ItemInit.CANDYCANESUGAR.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.CANDYCANEBLOCK.get(),
                                ItemInit.CANDYCANESUGAR.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BANANA_BAKER.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.SWEETBANANA.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.CANDYCANESUGAR.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.JAM_PRESSER.get())
                .define('S', BlockInit.STRAWBERRY_CANDY_WINDOW.get())
                .define('A', BlockInit.RASPBERRY_CANDY_WINDOW.get())
                .define('D', BlockInit.BLACKBERRY_CANDY_WINDOW.get())
                .define('F', BlockInit.BLUEBERRY_CANDY_WINDOW.get())
                .define('G', ItemInit.CANDYCANESUGAR.get())
                .pattern("AAD")
                .pattern("SGD")
                .pattern("SFF")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.CANDYCANESUGAR.get(),
                                BlockInit.STRAWBERRY_CANDY_WINDOW.get(),
                                BlockInit.RASPBERRY_CANDY_WINDOW.get(),
                                BlockInit.BLACKBERRY_CANDY_WINDOW.get(),
                                BlockInit.BLUEBERRY_CANDY_WINDOW.get()
                                ).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFFLE_CONE_MACHINE.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.CANDYCANESUGAR.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern(" S ")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.CANDYCANESUGAR.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);




   //boats

        ShapedRecipeBuilder.shaped(ItemInit.WAFERWOOD_BOAT.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.WAFERWOODBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.CHOCOLATEWAFERWOOD_BOAT.get())
                .define('S', BlockInit.CHOCOLATEWAFERWOODBLOCK.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.CHOCOLATEWAFERWOODBLOCK.get()))
                .save(pFinishedRecipeConsumer);

    //beds

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETSTRAWBERRY.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETSTRAWBERRY.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRYICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETBLACKBERRY.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETBLACKBERRY.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETBLUEBERRY.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETBLUEBERRY.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETRASPBERRY.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETRASPBERRY.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGEICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETORANGE.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETORANGE.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONICECREAMBED.get())
                .group("icecreambeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.VANILLAICECREAM.get())
                .define('D', ItemInit.SWEETLEMON.get())
                .pattern("DDD")
                .pattern("AAA")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETLEMON.get(),
                                ItemInit.VANILLAICECREAM.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.VANILLAWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.VANILLAICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.VANILLAICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.STRAWBERRYICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.RASPBERRYICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.BLUEBERRYICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRYWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.BLACKBERRYICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLACKBERRYICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGEWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.ORANGEICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGEICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.LEMONICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CHOCOLATEWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.CHOCOLATEICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.CHOCOLATEICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.TOFFEEWAFFLEBED.get())
                .group("wafflebeds")
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('D', ItemInit.TOFFEEICECREAMSCOOP.get())
                .pattern("DDD")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.TOFFEEICECREAMSCOOP.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);


        //lamps

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETSTRAWBERRY.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETSTRAWBERRY.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETRASPBERRY.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETRASPBERRY.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETBLUEBERRY.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETBLUEBERRY.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRYLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETBLACKBERRY.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETBLACKBERRY.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETLEMON.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETLEMON.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGELAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.SWEETORANGE.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SWEETORANGE.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYICECREAMLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.STRAWBERRYICECREAM.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYICECREAM.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYICECREAMLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.RASPBERRYICECREAM.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYICECREAM.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYICECREAMLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.BLUEBERRYICECREAM.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYICECREAM.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONICECREAMLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.LEMONICECREAM.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONICECREAM.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGEICECREAMLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.ORANGEICECREAM.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGEICECREAM.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRYLOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.STRAWBERRYLOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.STRAWBERRYLOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRYLOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.BLUEBERRYLOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLUEBERRYLOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRYLOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.BLACKBERRYLOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.BLACKBERRYLOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRYLOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.RASPBERRYLOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.RASPBERRYLOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGELOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.ORANGELOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.ORANGELOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMONLOLLIPOPLAMP.get())
                .define('S', Blocks.TORCH)
                .define('A', ItemInit.LEMONLOLLIPOP.get())
                .pattern("SA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LEMONLOLLIPOP.get(),
                                Blocks.TORCH).build()))
                .save(pFinishedRecipeConsumer);

    //stairs

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_STAIRS.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.STRAWBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_STAIRS.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.RASPBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_STAIRS.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLACKBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_STAIRS.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLUEBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_STAIRS.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.ORANGECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_STAIRS.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LEMONCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_STAIRS.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LIMECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_STAIRS.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.MANGOCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_STAIRS.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.PEACHCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_STAIRS.get())
                .define('S', BlockInit.CANDYFLOSSBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.CANDYFLOSSBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_STAIRS.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.WAFERWOODBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.HARDENED_BANANA_STAIRS.get())
                .define('S', BlockInit.HARDENEDBANANAPLANKS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.HARDENEDBANANAPLANKS.get()))
                .save(pFinishedRecipeConsumer);

        //fence

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_FENCE.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.STRAWBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_FENCE.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.RASPBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_FENCE.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.BLACKBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_FENCE.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.BLUEBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_FENCE.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.ORANGECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_FENCE.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.LEMONCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_FENCE.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.LIMECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_FENCE.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.MANGOCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_FENCE.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.PEACHCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_FENCE.get())
                .define('S', BlockInit.CANDYFLOSSBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.CANDYFLOSSBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_FENCE.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.HARDENED_BANANA_FENCE.get())
                .define('S', BlockInit.HARDENEDBANANAPLANKS.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SAS")
                .pattern("SAS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.HARDENEDBANANAPLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        //gate

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.STRAWBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.RASPBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.BLACKBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.BLUEBERRYCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.ORANGECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.LEMONCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.LIMECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.MANGOCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_FENCE_GATE.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.PEACHCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_FENCE_GATE.get())
                .define('S', BlockInit.CANDYFLOSSBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.CANDYFLOSSBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_FENCE_GATE.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.WAFERWOODBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.HARDENED_BANANA_FENCE_GATE.get())
                .define('S', BlockInit.HARDENEDBANANAPLANKS.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("ASA")
                .pattern("ASA")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.SUGARSTICK.get(),
                                BlockInit.HARDENEDBANANAPLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        //wall

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_WALL.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.STRAWBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_WALL.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.RASPBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_WALL.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLACKBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_WALL.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLUEBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_WALL.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.ORANGECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_WALL.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LEMONCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_WALL.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LIMECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_WALL.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.MANGOCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_WALL.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.PEACHCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_WALL.get())
                .define('S', BlockInit.CANDYFLOSSBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.CANDYFLOSSBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_WALL.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.WAFERWOODBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.HARDENED_BANANA_WALL.get())
                .define('S', BlockInit.HARDENEDBANANAPLANKS.get())
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.HARDENEDBANANAPLANKS.get()))
                .save(pFinishedRecipeConsumer);

        //slab

        ShapedRecipeBuilder.shaped(BlockInit.STRAWBERRY_CANDY_SLAB.get())
                .define('S', BlockInit.STRAWBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.STRAWBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.RASPBERRY_CANDY_SLAB.get())
                .define('S', BlockInit.RASPBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.RASPBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLACKBERRY_CANDY_SLAB.get())
                .define('S', BlockInit.BLACKBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLACKBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.BLUEBERRY_CANDY_SLAB.get())
                .define('S', BlockInit.BLUEBERRYCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.BLUEBERRYCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ORANGE_CANDY_SLAB.get())
                .define('S', BlockInit.ORANGECANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.ORANGECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LEMON_CANDY_SLAB.get())
                .define('S', BlockInit.LEMONCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LEMONCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_SLAB.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.LIMECANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_SLAB.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.MANGOCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_SLAB.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.PEACHCANDYBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSS_SLAB.get())
                .define('S', BlockInit.CANDYFLOSSBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.CANDYFLOSSBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.WAFER_WOOD_SLAB.get())
                .define('S', BlockInit.WAFERWOODBLOCK.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.WAFERWOODBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.HARDENED_BANANA_SLAB.get())
                .define('S', BlockInit.HARDENEDBANANAPLANKS.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(BlockInit.HARDENEDBANANAPLANKS.get()))
                .save(pFinishedRecipeConsumer);



        //tools

        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE.get())
                .define('S', ItemInit.CANDYCANESUGAR.get())
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);
//AXE
        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_AXE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_AXE.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_AXE.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_AXE.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_AXE.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_AXE.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_AXE.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_AXE.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_AXE.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_AXE.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("AS")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

//HOE
        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_HOE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_HOE.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_HOE.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_HOE.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_HOE.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_HOE.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_HOE.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_HOE.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_HOE.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_HOE.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

//SHOVELS
        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_SHOVEL.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_SHOVEL.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_SHOVEL.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_SHOVEL.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_SHOVEL.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_SHOVEL.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_SHOVEL.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_SHOVEL.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_SHOVEL.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_SHOVEL.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

//PICKAXE
        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_PICKAXE.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_PICKAXE.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_PICKAXE.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_PICKAXE.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_PICKAXE.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_PICKAXE.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_PICKAXE.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_PICKAXE.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_PICKAXE.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_PICKAXE.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

//SWORD
        ShapedRecipeBuilder.shaped(ItemInit.CANDY_CANE_SWORD.get())
                .define('S', ItemInit.CANDY_CANE.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_SWORD.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.STRAWBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_SWORD.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.BLUEBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_SWORD.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.BLACKBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_SWORD.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.RASPBERRYCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_SWORD.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.ORANGECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_SWORD.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.LEMONCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_SWORD.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_SWORD.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_SWORD.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SUGARSTICK.get())
                .define('D', ItemInit.SWEET_ESSENCE.get())
                .pattern("S")
                .pattern("D")
                .pattern("A")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

        //armour

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_HELMET.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.RASPBERRY_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.RASPBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
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

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_HELMET.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_LEGGINGS.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.STRAWBERRY_CANDY_BOOTS.get())
                .define('S', ItemInit.STRAWBERRYCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_HELMET.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_LEGGINGS.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLUEBERRY_CANDY_BOOTS.get())
                .define('S', ItemInit.BLUEBERRYCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_HELMET.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_LEGGINGS.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.BLACKBERRY_CANDY_BOOTS.get())
                .define('S', ItemInit.BLACKBERRYCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_HELMET.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_LEGGINGS.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.ORANGE_CANDY_BOOTS.get())
                .define('S', ItemInit.ORANGECANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_HELMET.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_LEGGINGS.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LEMON_CANDY_BOOTS.get())
                .define('S', ItemInit.LEMONCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_HELMET.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.LIMECANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_LEGGINGS.get())
                .define('S', ItemInit.LIMECANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.LIME_CANDY_BOOTS.get())
                .define('S', ItemInit.LIMECANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_HELMET.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_LEGGINGS.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGO_CANDY_BOOTS.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_HELMET.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("SAS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_CHESTPLATE.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .define('A', ItemInit.SWEET_ESSENCE.get())
                .pattern("S S")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_LEGGINGS.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACH_CANDY_BOOTS.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.VANILLA_ICE_CREAM_HELMET.get())
                .define('S', ItemInit.VANILLAICECREAM.get())
                .pattern("SSS")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.VANILLA_ICE_CREAM_CHESTPLATE.get())
                .define('S', ItemInit.VANILLAICECREAM.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.VANILLA_ICE_CREAM_LEGGINGS.get())
                .define('S', ItemInit.VANILLAICECREAM.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .unlockedBy("has_material", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.VANILLA_ICE_CREAM_BOOTS.get())
                .define('S', ItemInit.VANILLAICECREAM.get())
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

        ShapedRecipeBuilder.shaped(ItemInit.LIMEICECREAM.get())
                .define('S', ItemInit.LIMEICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.LIMEICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.MANGOICECREAM.get())
                .define('S', ItemInit.MANGOICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.MANGOICECREAMSCOOP.get(),
                                ItemInit.WAFFLECONE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ItemInit.PEACHICECREAM.get())
                .define('S', ItemInit.PEACHICECREAMSCOOP.get())
                .define('A', ItemInit.WAFFLECONE.get())
                .pattern("S")
                .pattern("A")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemInit.PEACHICECREAMSCOOP.get(),
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

        ShapedRecipeBuilder.shaped(BlockInit.LIMECANDYBLOCK.get())
                .define('S', ItemInit.LIMECANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.LIMECANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGOCANDYBLOCK.get())
                .define('S', ItemInit.MANGOCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.MANGOCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACHCANDYBLOCK.get())
                .define('S', ItemInit.PEACHCANDY.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.PEACHCANDY.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.CANDYFLOSSBLOCK.get())
                .define('S', ItemInit.CANDYFLOSS.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.CANDYFLOSS.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.TOOTHPASTE_BLOCK.get())
                .define('S', ItemInit.TOOTHPASTE.get())
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", has(ItemInit.TOOTHPASTE.get()))
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

        ShapedRecipeBuilder.shaped(BlockInit.LIME_CANDY_DOOR.get())
                .define('S', BlockInit.LIMECANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.LIMECANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.MANGO_CANDY_DOOR.get())
                .define('S', BlockInit.MANGOCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.MANGOCANDYBLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.PEACH_CANDY_DOOR.get())
                .define('S', BlockInit.PEACHCANDYBLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PEACHCANDYBLOCK.get()).build()))
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
                .define('S', BlockInit.RAINBOWFROSTINGLEAVES.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.RAINBOWFROSTINGLEAVES.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.TOOTHPASTE_DOOR.get())
                .define('S', BlockInit.TOOTHPASTE_BLOCK.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.TOOTHPASTE_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get())
                .define('S', BlockInit.ROTTENMOULDYCANDYCANEBRICKS.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .unlockedBy("has_material", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.ROTTENMOULDYCANDYCANEBRICKS.get()).build()))
                .save(pFinishedRecipeConsumer);

       //Sprinkles

        ShapelessRecipeBuilder.shapeless(ItemInit.SPRINKLES.get(), 4)
                .requires(BlockInit.RAINBOWFROSTINGLEAVES.get())
                .unlockedBy("has_rainbowfrostingleaves", has(BlockInit.RAINBOWFROSTINGLEAVES.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.TOOTHPASTE.get(), 4)
                .requires(BlockInit.TOOTHPASTE_BLOCK.get())
                .unlockedBy("has_toothpaste_block", has(BlockInit.TOOTHPASTE_BLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.ENCHANTED_TOOTHPASTE.get())
                .requires(ItemInit.TOOTHPASTE.get())
                .requires(Items.ENCHANTED_GOLDEN_APPLE)
                .unlockedBy("has_toothpaste", has(ItemInit.TOOTHPASTE.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.MINTIMPERIALS.get(), 2)
                .requires(ItemInit.CANDYCANESUGAR.get())
                .requires(ItemInit.MINT.get())
                .unlockedBy("has_candycanesugar", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.BONBONS.get(), 2)
                .requires(ItemInit.TOFFEE.get())
                .requires(ItemInit.CANDYCANESUGAR.get())
                .unlockedBy("has_toffee", has(ItemInit.TOFFEE.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.COLABOTTLE.get(), 2)
                .requires(ItemInit.BONBONS.get())
                .requires(ItemInit.CANDYCANESUGAR.get())
                .unlockedBy("has_bonbons", has(ItemInit.BONBONS.get()))
                .save(pFinishedRecipeConsumer);

        //Melted Chocolate

        ShapelessRecipeBuilder.shapeless(BlockInit.MELTINGSTRAWBERRYCHOCOLATEBLOCK.get())
                .requires(BlockInit.MELTINGCHOCOLATEBLOCK.get())
                .requires(ItemInit.SWEETSTRAWBERRY.get())
                .unlockedBy("has_meltingchocolateblock", has(BlockInit.MELTINGCHOCOLATEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.MELTINGRASPBERRYCHOCOLATEBLOCK.get())
                .requires(BlockInit.MELTINGCHOCOLATEBLOCK.get())
                .requires(ItemInit.SWEETRASPBERRY.get())
                .unlockedBy("has_meltingchocolateblock", has(BlockInit.MELTINGCHOCOLATEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.MELTINGBLUEBERRYCHOCOLATEBLOCK.get())
                .requires(BlockInit.MELTINGCHOCOLATEBLOCK.get())
                .requires(ItemInit.SWEETBLUEBERRY.get())
                .unlockedBy("has_meltingchocolateblock", has(BlockInit.MELTINGCHOCOLATEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.MELTINGORANGECHOCOLATEBLOCK.get())
                .requires(BlockInit.MELTINGCHOCOLATEBLOCK.get())
                .requires(ItemInit.SWEETORANGE.get())
                .unlockedBy("has_meltingchocolateblock", has(BlockInit.MELTINGCHOCOLATEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.MELTINGLEMONCHOCOLATEBLOCK.get())
                .requires(BlockInit.MELTINGCHOCOLATEBLOCK.get())
                .requires(ItemInit.SWEETLEMON.get())
                .unlockedBy("has_meltingchocolateblock", has(BlockInit.MELTINGCHOCOLATEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        //Random

        ShapelessRecipeBuilder.shapeless(BlockInit.RASPBERRYICINGBLOCK.get())
                .requires(BlockInit.FROSTINGBLOCK.get())
                .requires(ItemInit.SWEETRASPBERRY.get())
                .unlockedBy("has_raspberryicingblock", has(BlockInit.RASPBERRYICINGBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.CANDYCANEBRICKS.get())
                .requires(BlockInit.CANDYCANEBLOCK.get())
                .unlockedBy("has_candycaneblock", has(BlockInit.CANDYCANEBLOCK.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.SWEET_ESSENCE.get())
                .requires(ItemInit.SAVOURY_ESSENCE.get())
                .unlockedBy("has_savoury_essence", has(ItemInit.SAVOURY_ESSENCE.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.CHIPTRONICAL_RECORD.get())
                .requires(ItemInit.CANDYCANESUGAR.get())
                .requires(Items.MUSIC_DISC_CAT)
                .unlockedBy("has_candycanesugar", has(ItemInit.CANDYCANESUGAR.get()))
                .save(pFinishedRecipeConsumer);

        //COOKING

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
