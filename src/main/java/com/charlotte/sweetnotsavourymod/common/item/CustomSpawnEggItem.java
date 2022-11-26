package com.charlotte.sweetnotsavourymod.common.item;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomSpawnEggItem extends ForgeSpawnEggItem {

	protected static final List<CustomSpawnEggItem> EGGS_TO_ADD = new ArrayList<>();
	protected static DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {
		@Override
		public ItemStack execute(IBlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			EntityType<?> eType = ((ForgeSpawnEggItem)stack.getItem()).getType(stack.getTag());

			eType.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.SPAWN_EGG,
					direction != Direction.UP, false);
			stack.shrink(1);
			return stack;
		}


	};

	private final Lazy<? extends EntityType<?>> lazyEntity;

	public CustomSpawnEggItem(final RegistryObject<? extends EntityType<?>> entity, final int primaryColor, final int secondaryColor, final Item.Properties properties) {
		super(entity, primaryColor, secondaryColor, properties);
		this.lazyEntity = Lazy.of(entity);
		EGGS_TO_ADD.add(this);

	}

	public static void initSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "BY_ID");

		for (final SpawnEggItem item : EGGS_TO_ADD) {
			EGGS.put(item.getType(null), item);
			//DispenserBlock.(item, behavior);
		}

		EGGS_TO_ADD.clear();

	}

	@Override
	public EntityType<?> getType(@Nullable CompoundNBT p_43229_) {
		return this.lazyEntity.get();
	}
}
