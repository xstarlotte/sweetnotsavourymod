package com.charlotte.sweetnotsavourymod.common.registry_group;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class SNSFuelType {
	private final ResourceLocation id;
	private final RegistryObject<FType> type;
	private final RegistryObject<FSerializer> serializer;
	
	public SNSFuelType(String name) {
		id = SweetNotSavouryMod.loc(name);
		type = SNSReg.RECIPE_TYPES.register(name, FType::new);
		serializer = SNSReg.RECIPE_SERIALIZERS.register(name, FSerializer::new);
	}
	
	public ResourceLocation getId() {
		return id;
	}
	
	public FType getType() {
		return type.get();
	}
	
	public FSerializer getSerializer() {
		return serializer.get();
	}
	
	public int getValue(MinecraftServer server, ItemStack stack) {
		return server.getRecipeManager()
				.getAllRecipesFor(getType())
				.stream()
				.filter(recipe -> recipe.matches(stack))
				.mapToInt(FRecipe::getValue)
				.findFirst()
				.orElse(-1);
	}
	
	public class FRecipe implements Recipe<Container> {
		private final ResourceLocation id;
		private final Ingredient item;
		private final int value;
		
		public FRecipe(ResourceLocation id, Ingredient item, int value) {
			this.id = id;
			this.item = item;
			this.value = value;
		}
		
		public Ingredient getItem() {
			return item;
		}
		
		public int getValue() {
			return value;
		}
		
		public boolean matches(ItemStack stack) {
			return item.test(stack);
		}
		
		@Override public boolean matches(Container cont, Level level) { return false; }
		@Override public ItemStack assemble(Container cont) { return ItemStack.EMPTY; }
		@Override public boolean canCraftInDimensions(int w, int h) { return false; }
		@Override public ItemStack getResultItem() { return ItemStack.EMPTY; }
		@Override public NonNullList<Ingredient> getIngredients() { return NonNullList.withSize(1, item); }
		@Override public ResourceLocation getId() { return id; }
		@Override public RecipeSerializer<?> getSerializer() { return serializer.get(); }
		@Override public RecipeType<?> getType() { return type.get(); }
	}
	
	public class FType implements RecipeType<FRecipe> {
		@Override
		public String toString() {
			return serializer.toString();
		}
	}
	
	public class FSerializer implements RecipeSerializer<FRecipe> {
		@Override
		public FRecipe fromJson(ResourceLocation id, JsonObject json) {
			if (!json.has("item"))
				throw new JsonSyntaxException("Missing item");
			if (!json.has("value"))
				throw new JsonSyntaxException("Missing value");
			Ingredient item = Ingredient.fromJson(json.get("item"));
			int value = json.get("value").getAsInt();
			return new FRecipe(id, item, value);
		}
		
		@Override
		public FRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
			return new FRecipe(id, Ingredient.fromNetwork(buf), buf.readVarInt());
		}
		
		@Override
		public void toNetwork(FriendlyByteBuf buf, FRecipe recipe) {
			recipe.item.toNetwork(buf);
			buf.writeVarInt(recipe.value);
		}
	}
}
