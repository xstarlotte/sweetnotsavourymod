package com.charlotte.sweetnotsavourymod.common.registry_group;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.machineblocks.SNSMachine;
import com.charlotte.sweetnotsavourymod.common.blockentities.machines.SNSTickedMachineBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class SNSMachineType {
	private final ResourceLocation id;
	private final SlotPos input;
	private final SlotPos output;
	private final @Nullable FuelDefinition fuel;
	
//	public final RegistryObject<BlockItem> item;
//	public final RegistryObject<? extends SNSMachine<?>> block;
//	public final RegistryObject<? extends BlockEntityType<? extends SNSTickedMachineBlockEntity>> machine;
	public final RegistryObject<MRecipeType> type;
	public final RegistryObject<MRecipeSerializer> serializer;

	public SNSMachineType(String name, SlotPos input, SlotPos output, @Nullable FuelDefinition fuel) {
		this.id = SweetNotSavouryMod.loc(name);
		this.input = input;
		this.output = output;
		this.fuel = fuel;
		
		type = SNSReg.RECIPE_TYPES.register(name, MRecipeType::new);
		serializer = SNSReg.RECIPE_SERIALIZERS.register(name, MRecipeSerializer::new);
	}
	
	public record FuelDefinition(SlotPos position, SNSFuelType type) {}
	public record TickingDefinition(SlotPos position, int speedMultiplier) {}
	
	public class MContainer implements Container {
		private ItemStack slotIn = ItemStack.EMPTY;
		private ItemStack slotOut = ItemStack.EMPTY;
		private ItemStack slotFuel = ItemStack.EMPTY;
		@Override
		public int getContainerSize() {
			return fuel == null ? 2 : 3;
		}
		
		@Override
		public boolean isEmpty() {
			return slotIn.isEmpty() && slotOut.isEmpty() && slotFuel.isEmpty();
		}
		
		@Override
		public ItemStack getItem(int slot) {
			return slot == 0 ? slotIn : slot == 1 ? slotOut : slot == 2 ? slotFuel : ItemStack.EMPTY;
		}
		
		@Override
		public ItemStack removeItem(int pSlot, int pAmount) {
			return null;
		}
		
		@Override
		public ItemStack removeItemNoUpdate(int pSlot) {
			return null;
		}
		
		@Override
		public void setItem(int slot, ItemStack stack) {
		
		}
		
		@Override
		public void setChanged() {
		
		}
		
		@Override
		public boolean stillValid(Player player) {
			return false;
		}
		
		@Override
		public void clearContent() {
		
		}
	}
	
	public class MRecipe implements Recipe<Container> {
		private final ResourceLocation id;
		private final Ingredient ingredient;
		private final ItemStack result;
		private final int time;
		private final int fuel;
		
		public MRecipe(ResourceLocation id, Ingredient ingredient, ItemStack result, int time, int fuel) {
			this.id = id;
			this.ingredient = ingredient;
			this.result = result;
			this.time = time < 0 ? -1 : time;
			this.fuel = Math.max(fuel, 0);
		}
		
		public Ingredient getIngredient() {
			return ingredient;
		}
		
		public int getTime() {
			return time;
		}
		
		public int getFuel() {
			return fuel;
		}
		
		public boolean matches(ItemStack stack) {
			return ingredient.test(stack);
		}
		
		@Override
		public boolean matches(Container cont, Level level) {
			return cont.getContainerSize() >= 1 && matches(cont.getItem(0));
		}
		
		@Override
		public ItemStack assemble(Container cont) {
			return cont.getContainerSize() >= 1 && matches(cont.getItem(0)) ? result : ItemStack.EMPTY;
		}
		
		@Override
		public boolean canCraftInDimensions(int w, int h) {
			return w > 0 && h > 0;
		}
		
		@Override
		public ItemStack getResultItem() {
			return result;
		}
		
		@Override
		public NonNullList<Ingredient> getIngredients() {
			return NonNullList.withSize(1, ingredient);
		}
		
		@Override
		public ResourceLocation getId() {
			return id;
		}
		
		@Override
		public RecipeSerializer<?> getSerializer() {
			return serializer.get();
		}
		
		@Override
		public RecipeType<?> getType() {
			return type.get();
		}
	}
	
	public class MRecipeType implements RecipeType<MRecipe> {
		@Override
		public String toString() {
			return id.toString();
		}
	}
	
	public class MRecipeSerializer implements RecipeSerializer<MRecipe> {
		@Override
		public MRecipe fromJson(ResourceLocation id, JsonObject json) {
			if (!json.has("ingredient"))
				throw new JsonSyntaxException("Missing ingredient");
			if (!json.has("result"))
				throw new JsonSyntaxException("Missing result");
			Ingredient item = Ingredient.fromJson(json.get("ingredient"));
			ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
			int time = GsonHelper.getAsInt(json, "time", -1);
			int fuel = GsonHelper.getAsInt(json, "fuel", 0);
			return new MRecipe(id, item, result, time, fuel);
		}
		
		@Override
		public MRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
			return new MRecipe(id, Ingredient.fromNetwork(buf), buf.readItem(), buf.readVarInt() - 1, buf.readVarInt());
		}
		
		@Override
		public void toNetwork(FriendlyByteBuf buf, MRecipe recipe) {
			recipe.ingredient.toNetwork(buf);
			buf.writeItem(recipe.result);
			buf.writeVarInt(recipe.time + 1);
			buf.writeVarInt(recipe.fuel);
		}
	}
}
