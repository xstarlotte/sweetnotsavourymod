package com.charlotte.sweetnotsavourymod.common.recipe;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class CakeBakerRecipe implements IRecipe<Inventory> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public CakeBakerRecipe(ResourceLocation id, ItemStack output,
                           NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(Inventory pContainer, World pLevel) {
        int numberOfItems = 5;
        boolean hasFiveFirstSlot = numberOfItems <= pContainer.getItem(0).getCount();
        boolean hasFiveThirdSlot = numberOfItems <= pContainer.getItem(2).getCount();

        if(recipeItems.get(0).test(pContainer.getItem(1)) && hasFiveFirstSlot) {
            return recipeItems.get(1).test(pContainer.getItem(2)) && hasFiveThirdSlot;
        }

        return false;
    }

    @Override
    public ItemStack assemble(Inventory pContainer) {
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
    public IRecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public IRecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements IRecipeType<CakeBakerRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "cake_baking";
    }

    public static class Serializer implements IRecipeSerializer<CakeBakerRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(SweetNotSavouryMod.MOD_ID,"cake_baking");

        @Override
        public CakeBakerRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json, "output"));

            JsonArray ingredients = JSONUtils.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new CakeBakerRecipe(id, output, inputs);
        }

        @Override
        public CakeBakerRecipe fromNetwork(ResourceLocation id, PacketBuffer buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new CakeBakerRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(PacketBuffer buf, CakeBakerRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @Override
        public IRecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<IRecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(IRecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }
}
