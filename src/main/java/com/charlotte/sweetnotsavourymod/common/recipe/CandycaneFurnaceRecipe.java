package com.charlotte.sweetnotsavourymod.common.recipe;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.RecipeSerializerInit;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

import javax.annotation.Nullable;

public class CandycaneFurnaceRecipe implements Recipe<SimpleContainer> {

    public static final RecipeType<CandycaneFurnaceRecipe> TYPE = new RecipeType<>() {
        @Override
        public String toString() {
            return Serializer.ID.toString();
        }
    };

    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public CandycaneFurnaceRecipe(ResourceLocation id, ItemStack output,
                                  NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, net.minecraft.world.level.Level pLevel) {
            return recipeItems.get(0).test(pContainer.getItem(1));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializerInit.CANDYCANE_SMELTING_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return TYPE;
    }

    public static class Serializer implements RecipeSerializer<CandycaneFurnaceRecipe> {
        public static final ResourceLocation ID = new ResourceLocation(SweetNotSavouryMod.MOD_ID,"candycane_smelting");

        @Override
        public CandycaneFurnaceRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new CandycaneFurnaceRecipe(id, output, inputs);
        }

        @Override
        public CandycaneFurnaceRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new CandycaneFurnaceRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, CandycaneFurnaceRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }
    }
}
