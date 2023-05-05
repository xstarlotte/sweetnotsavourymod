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

public class IceCreamMachineRecipe implements Recipe<SimpleContainer> {

    public static final RecipeType<IceCreamMachineRecipe> TYPE = new RecipeType<>() {
        @Override
        public String toString() {
            return Serializer.ID.toString();
        }
    };

    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public IceCreamMachineRecipe(ResourceLocation id, ItemStack output,
                               NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, net.minecraft.world.level.Level pLevel) {
        int numberOfItems = 5;
        boolean hasFiveFirstSlot = numberOfItems <= pContainer.getItem(0).getCount();
        boolean hasFiveThirdSlot = numberOfItems <= pContainer.getItem(2).getCount();

        if(recipeItems.get(0).test(pContainer.getItem(1)) && hasFiveFirstSlot) {
            return recipeItems.get(1).test(pContainer.getItem(2)) && hasFiveThirdSlot;
        }

        return false;
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
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializerInit.ICE_CREAM_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return TYPE;
    }

    public static class Serializer implements RecipeSerializer<IceCreamMachineRecipe> {
        public static final ResourceLocation ID = new ResourceLocation(SweetNotSavouryMod.MOD_ID,"ice_creaming");

        @Override
        public IceCreamMachineRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new IceCreamMachineRecipe(id, output, inputs);
        }

        @Override
        public IceCreamMachineRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new IceCreamMachineRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, IceCreamMachineRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }
    }
}
