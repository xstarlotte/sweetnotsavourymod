package com.charlotte.sweetnotsavourymod.common.registry_group;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.server.ServerLifecycleHooks;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Optional;
import java.util.Set;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSMachineType {
	/*
	 * TODO
	 *  - Display fuel value
	 *  - Display crafting process
	 *  - Fix rendering issue
	 *  - Setup all recipes
	 *  - Add multiple inputs
	 */
	private final ResourceLocation id;
	private final String name;
	private final int inventoryY;
	private final SlotPos input;
	private final SlotPos output;
	private final @Nullable FuelDefinition fuel;
	private final boolean quick;
	
	public final RegistryObject<BlockItem> item;
	public final RegistryObject<MBlock> block;
	public final RegistryObject<BlockEntityType<MBlockEntity>> blockEntityType;
	public final RegistryObject<MenuType<MMenu>> menuType;
	
	public final RegistryObject<MRecipeType> recipeType;
	public final RegistryObject<MRecipeSerializer> recipeSerializer;
	
	/**
	 * Creates a machine which *doesn't* use fuel, and each item takes time to craft.
	 */
	public SNSMachineType(String name, int inventoryY, SlotPos input, SlotPos output) {
		this(name, inventoryY, input, output, null, false);
	}
	
	/**
	 * Creates a machine which *doesn't* use fuel, and you can craft quickly
	 */
	public SNSMachineType(String name, int inventoryY, SlotPos input, SlotPos output, boolean quick) {
		this(name, inventoryY, input, output, null, quick);
	}
	
	/**
	 * Creates a machine which *does* use fuel, and each item takes time to craft.
	 */
	public SNSMachineType(String name, int inventoryY, SlotPos input, SlotPos output, @Nullable FuelDefinition fuel) {
		this(name, inventoryY, input, output, fuel, false);
	}

	private SNSMachineType(String name, int inventoryY, SlotPos input, SlotPos output, @Nullable FuelDefinition fuel, boolean quick) {
		this.id = SweetNotSavouryMod.loc(name);
		this.name = name;
		this.inventoryY = inventoryY;
		this.input = input;
		this.output = output;
		this.fuel = fuel;
		this.quick = quick;
		
		
		item = SNSReg.ITEMS.register(name, ()->new BlockItem(
				getBlock(),
				new Item.Properties().tab(SweetNotSavouryModItemGroup.SNSMODMACHINES)
		));
		block = SNSReg.BLOCKS.register(name, ()->new MBlock(
				BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
						.strength(0.6f,1200f)
						.sound(SoundType.NETHER_BRICKS)
		));
		menuType = SNSReg.MENU_TYPES.register(name, ()->new MenuType<>(MMenu::new));
		//noinspection ConstantConditions
		blockEntityType = SNSReg.BLOCK_ENTITY_TYPES.register(name, ()->new BlockEntityType<>(
				MBlockEntity::new,
				Set.of(getBlock()),
				null
		));
		
		recipeType = SNSReg.RECIPE_TYPES.register(name, MRecipeType::new);
		recipeSerializer = SNSReg.RECIPE_SERIALIZERS.register(name, MRecipeSerializer::new);
	}
	
	public BlockItem getItem() {
		return item.get();
	}
	
	public MBlock getBlock() {
		return block.get();
	}
	
	public BlockEntityType<MBlockEntity> getBlockEntityType() {
		return blockEntityType.get();
	}
	
	public MenuType<MMenu> getMenuType() {
		return menuType.get();
	}
	
	public MRecipeType getRecipeType() {
		return recipeType.get();
	}
	
	public MRecipeSerializer getRecipeSerializer() {
		return recipeSerializer.get();
	}
	
	public void clientRegister() {
		MenuScreens.register(getMenuType(), MScreen::new);
	}
	
	public record FuelDefinition(SlotPos position, SNSFuelType type) {}
	public record TickingDefinition(SlotPos position, int speedMultiplier) {}
	
	
	public class MRecipe implements Recipe<Container> {
		private final ResourceLocation id;
		private final Ingredient ingredient;
		private final ItemStack result;
		private final int time;
		
		public MRecipe(ResourceLocation id, Ingredient ingredient, ItemStack result, int time) {
			this.id = id;
			this.ingredient = ingredient;
			this.result = result;
			this.time = quick || time < 0 ? -1 : time;
		}
		
		public Ingredient getIngredient() {
			return ingredient;
		}
		
		public int getTime() {
			return time;
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
			return getRecipeSerializer();
		}
		
		@Override
		public RecipeType<?> getType() {
			return getRecipeType();
		}
	}
	
	public class MRecipeType implements RecipeType<MRecipe> {
		@Override
		public String toString() {
			return id.toString();
		}
		
		public Optional<MRecipe> getRecipe(ItemStack inputItem) {
			return ServerLifecycleHooks.getCurrentServer()
					.getRecipeManager()
					.getAllRecipesFor(this)
					.stream()
					.filter(recipe->recipe.ingredient.test(inputItem))
					.findAny();
		}
	}
	
	public class MRecipeSerializer implements RecipeSerializer<MRecipe> {
		@Override
		public MRecipe fromJson(ResourceLocation id, JsonObject json) {
			if (!json.has("ingredient"))
				throw new JsonSyntaxException("Missing ingredient");
			if (!json.has("output"))
				throw new JsonSyntaxException("Missing output");
			Ingredient item = Ingredient.fromJson(json.get("ingredient"));
			ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
			int time = GsonHelper.getAsInt(json, "time", -1);
			return new MRecipe(id, item, result, time);
		}
		
		@Override
		public MRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
			return new MRecipe(id, Ingredient.fromNetwork(buf), buf.readItem(), quick ? -1 : buf.readVarInt() - 1);
		}
		
		@Override
		public void toNetwork(FriendlyByteBuf buf, MRecipe recipe) {
			recipe.ingredient.toNetwork(buf);
			buf.writeItem(recipe.result);
			if (!quick)
				buf.writeVarInt(recipe.time + 1);
		}
	}
	
	
	
	public class MBlock extends BaseEntityBlock {
		public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
		
		protected MBlock(Properties pProperties) {
			super(pProperties);
		}
		
		@Nullable
		@Override
		public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
			return new MBlockEntity(pos, state);
		}
		
		@Nullable
		@Override
		public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
			if (quick)
				return null;
			return createTickerHelper(blockEntityType, getBlockEntityType(), (a,b,c,entity)->entity.tick(a,b,c));
		}
		
		@SuppressWarnings("deprecation")
		@Override
		public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
			if (level.isClientSide)
				return InteractionResult.SUCCESS;
			if (level.getBlockEntity(pos) instanceof MenuProvider menuProvider)
				player.openMenu(menuProvider);
			return InteractionResult.CONSUME;
		}
		
		@SuppressWarnings("deprecation")
		@Override
		public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean pIsMoving) {
			if(state.is(newState.getBlock()))
				return;
			if (level.getBlockEntity(pos) instanceof Container container)
				Containers.dropContents(level, pos, container);
		}
	}
	
	public class MBlockEntity extends BlockEntity implements MenuProvider, Container {
		private ItemStack inputSlot = ItemStack.EMPTY;
		private ItemStack outputSlot = ItemStack.EMPTY;
		private ItemStack fuelSlot = ItemStack.EMPTY;
		private boolean simulatedOutput = true;
		private int process = 0;
		private int remainingFuel = 0;
		
		protected MBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
			super(type, pos, state);
		}
		
		public MBlockEntity(BlockPos pos, BlockState state) {
			this(getBlockEntityType(), pos, state);
		}
		
		@Override
		public Component getDisplayName() {
			return getBlock().getName();
		}
		
		@Override
		protected void saveAdditional(CompoundTag tag) {
			CompoundTag savedInput = new CompoundTag();
			CompoundTag savedOutput = new CompoundTag();
			CompoundTag savedFuel = new CompoundTag();
			inputSlot.save(savedInput);
			outputSlot.save(savedOutput);
			fuelSlot.save(savedFuel);
			tag.put("input", savedInput);
			tag.put("output", savedOutput);
			tag.put("fuel", savedFuel);
			tag.putBoolean("simulatedOutput", simulatedOutput);
			tag.putInt("process", process);
			tag.putInt("remainingFuel", remainingFuel);
		}
		
		@Override
		public void load(CompoundTag tag) {
			inputSlot = ItemStack.of(tag.getCompound("input"));
			outputSlot = ItemStack.of(tag.getCompound("output"));
			fuelSlot = ItemStack.of(tag.getCompound("fuel"));
			simulatedOutput = tag.getBoolean("simulatedOutput");
			process = tag.getInt("process");
			remainingFuel = tag.getInt("remainingFuel");
		}
		
		@Nullable
		@Override
		public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
			return new MMenu(containerId, playerInventory, this, false);
		}
		
		public void tick(Level level, BlockPos blockPos, BlockState state) {
			if (level.isClientSide)
				return;
			Optional<MRecipe> recipeOpt = getRecipeType().getRecipe(inputSlot);
			if (recipeOpt.isEmpty()) {
				process = 0;
				setChanged();
				return;
			}
			MRecipe recipe = recipeOpt.get();
			if (!canStack(outputSlot, recipe.getResultItem())) {
				process = 0;
				setChanged();
				return;
			}
			if (fuel != null) {
				consumeFuelIfNeeded();
				if (remainingFuel <= 0)
					return;
				remainingFuel--;
				setChanged();
			}
			process++;
			if (process >= recipe.getTime()) {
				process = 0;
				inputSlot.shrink(1);
				if (outputSlot.isEmpty())
					outputSlot = recipe.getResultItem().copy();
				else
					outputSlot.grow(recipe.getResultItem().getCount());
				setChanged();
			}
		}
		
		private boolean canStack(ItemStack stack0, ItemStack stack1) {
			if (stack0.isEmpty() || stack1.isEmpty())
				return true;
			if (!stack0.sameItem(stack1))
				return false;
			return stack0.getCount() + stack1.getCount() <= 64;
		}
		
		private void consumeFuelIfNeeded() {
			if (fuel == null || remainingFuel > 0 || fuelSlot.isEmpty())
				return;
			Optional<SNSFuelType.FRecipe> fuelRecipe = fuel.type.getFuel(ServerLifecycleHooks.getCurrentServer(), fuelSlot);
			if (fuelRecipe.isEmpty())
				return;
			remainingFuel = fuelRecipe.get().getValue();
			ItemStack result = fuelRecipe.get().getResult();
			if (result.isEmpty())
				fuelSlot.shrink(1);
			else
				fuelSlot = result.copy();
			setChanged();
		}
		
		@Override
		public int getContainerSize() {
			return quick ? 1 : fuel == null ? 2 : 3;
		}
		
		@Override
		public boolean isEmpty() {
			return inputSlot.isEmpty() && outputSlot.isEmpty() && fuelSlot.isEmpty();
		}
		
		@Override
		public ItemStack getItem(int slot) {
			return switch (slot) {
				case 0 -> inputSlot;
				case 1 -> outputSlot;
				case 2 -> fuelSlot;
				default -> ItemStack.EMPTY;
			};
		}
		
		@Override
		public ItemStack removeItem(int slot, int amount) {
			ItemStack slotItem = getItem(slot);
			if (slot == 0)
				process = 0;
			setChanged();
			return slotItem.isEmpty() || amount <= 0 ? ItemStack.EMPTY : slotItem.split(amount);
		}
		
		@Override
		public ItemStack removeItemNoUpdate(int slot) {
			return removeItem(slot, 64);
		}
		
		@Override
		public void setItem(int slot, ItemStack stack) {
			switch (slot) {
				case 0 -> {
					if (!inputSlot.isEmpty() && (stack.isEmpty() || !inputSlot.sameItem(stack)))
						process = 0;
					inputSlot = stack;
				}
				case 1 -> outputSlot = stack;
				case 2 -> fuelSlot = stack;
				default -> throw new IndexOutOfBoundsException();
			}
			setChanged();
		}
		
		@Override
		public boolean stillValid(Player pPlayer) {
			if (level == null)
				return false;
			if (level.getBlockEntity(worldPosition) != this)
				return false;
			return pPlayer.distanceToSqr(
					worldPosition.getX() + 0.5,
					worldPosition.getY() + 0.5,
					worldPosition.getZ() + 0.5
			) <= 64;
		}
		
		@Override
		public void clearContent() {
			inputSlot = ItemStack.EMPTY;
			outputSlot = ItemStack.EMPTY;
			fuelSlot = ItemStack.EMPTY;
			process = 0;
			remainingFuel = 0;
			setChanged();
		}
	}
	
	public class MMenu extends AbstractContainerMenu {
		private final Container machineContainer;
		private final ResultContainer resultContainer = new ResultContainer();
		
		protected MMenu(@Nullable MenuType<?> menuType, int containerId, Inventory playerInventory, Container machineContainer, boolean clientSide) {
			super(menuType, containerId);
			
			//Player inventory
			for(int i = 0; i < 3; ++i)
				for(int j = 0; j < 9; ++j)
					this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18 + inventoryY));
			for(int k = 0; k < 9; ++k)
				this.addSlot(new Slot(playerInventory, k, 8 + k * 18, 142 + inventoryY));
			
			//Machine slots:
			
			Slot inputSlot = new MInputSlot(machineContainer, 0, input.x(), input.y(), clientSide);
			addSlot(inputSlot);
			
			addSlot(quick ?
					new MResultSlotQuick(inputSlot, resultContainer, 0, output.x(), output.y()) :
					new MResultSlotSlow(machineContainer, 1, output.x(), output.y())
			);
			
			if (fuel != null)
				addSlot(new MFuelSlot(machineContainer, 2, fuel.position.x(), fuel.position.y(), clientSide));
			
			this.machineContainer = machineContainer;
		}
		
		public MMenu(int containerId, Inventory playerInventory, Container container, boolean clientSide) {
			this(getMenuType(), containerId, playerInventory, container, clientSide);
		}
		
		public MMenu(int containerId, Inventory playerInventory) {
			this(containerId, playerInventory, new SimpleContainer(fuel == null ? 2 : 3), true);
		}
		
		@Override
		public void slotsChanged(Container changedContainer) {
			if (!quick)
				return;
			Optional<MRecipe> recipeOpt = getRecipeType().getRecipe(machineContainer.getItem(0));
			resultContainer.setItem(
					0,
					recipeOpt.isEmpty() ?
							ItemStack.EMPTY :
							recipeOpt.get().getResultItem().copy()
			);
		}
		
		@Override
		public ItemStack quickMoveStack(Player player, int index) {
			Slot slot = this.slots.get(index);
			if (!slot.hasItem())
				return ItemStack.EMPTY;
			
			boolean takesFromQuick = index == 37 && quick;
			
			ItemStack slotItem = slot.getItem();
			ItemStack slotItemCopy = slotItem.copy();
			if (takesFromQuick) {
				if (!this.moveItemStackTo(slotItem, 0, 36, true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(slotItem, slotItemCopy);
			} else if (36 <= index){
				if (!this.moveItemStackTo(slotItem, 0, 36, false))
					return ItemStack.EMPTY;
			} else {
				if (!this.moveItemStackTo(slotItem, 36, 37, false) &&
						fuel != null &&
						this.moveItemStackTo(slotItem, 38, 39, false)
				) {
					if (index < 27) {
						if (!this.moveItemStackTo(slotItem, 27, 36, false))
							return ItemStack.EMPTY;
					} else {
						if (!this.moveItemStackTo(slotItem, 0, 27, false))
							return ItemStack.EMPTY;
					}
				}
			}
			
			if (slotItem.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			
			if (slotItem.getCount() == slotItemCopy.getCount())
				return ItemStack.EMPTY;
			
			slot.onTake(player, slotItem);
			if (takesFromQuick)
				player.drop(slotItem, false);
			
			return slotItemCopy;
		}
		
		@Override
		public boolean stillValid(Player player) {
			return machineContainer.stillValid(player);
		}
	}
	
	
	
	
	
	
	private final class MInputSlot extends Slot {
		private final boolean clientSide;
		
		public MInputSlot(Container container, int slotIndex, int x, int y, boolean clientSide) {
			super(container, slotIndex, x, y);
			this.clientSide = clientSide;
		}
		
		public boolean mayPlace(ItemStack stack) {
			return clientSide || getRecipeType().getRecipe(stack).isPresent();
		}
	}
	
	private static final class MResultSlotQuick extends Slot {
		private final Slot craftSlot;
		
		public MResultSlotQuick(Slot craftSlot, Container pContainer, int slotIndex, int x, int y) {
			super(pContainer, slotIndex, x, y);
			this.craftSlot = craftSlot;
		}
		
		public boolean mayPlace(ItemStack pStack) {
			return false;
		}
		
		public void onTake(Player player, ItemStack stack) {
			ItemStack item = craftSlot.getItem().copy();
			item.shrink(1);
			craftSlot.set(item);
			super.onTake(player, stack);
		}
	}
	
	private static final class MResultSlotSlow extends Slot {
		public MResultSlotSlow(Container container, int slotIndex, int x, int y) {
			super(container, slotIndex, x, y);
		}
		
		public boolean mayPlace(ItemStack stack) {
			return false;
		}
	}
	
	private final class MFuelSlot extends Slot {
		private final boolean clientSide;
		
		public MFuelSlot(Container container, int slotIndex, int x, int y, boolean clientSide) {
			super(container, slotIndex, x, y);
			this.clientSide = clientSide;
		}
		
		public boolean mayPlace(ItemStack stack) {
			if (fuel == null)
				return false;
			if (clientSide)
				return true;
			return fuel.type.getFuel(ServerLifecycleHooks.getCurrentServer(), stack).isPresent();
		}
	}
	
	private final class MScreen extends AbstractContainerScreen<MMenu> {
		private final ResourceLocation TEXTURE = SweetNotSavouryMod.loc("textures/gui/machine/" + name + ".png");
		public MScreen(MMenu menu, Inventory playerInventory, Component title) {
			super(menu, playerInventory, title);
		}
		
		@Override
		protected void renderBg(PoseStack poseStack, float partialTick, int mx, int my) {
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.setShaderTexture(0, TEXTURE);
			
			this.blit(poseStack, leftPos, topPos, 0, 0, imageWidth, imageHeight);
		}
	}
}
