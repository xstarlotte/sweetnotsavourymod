package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.mojang.serialization.Codec;
import net.minecraft.commands.synchronization.ArgumentTypeInfo;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.stats.StatType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.schedule.Activity;
import net.minecraft.world.entity.schedule.Schedule;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.StructureModifier;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.holdersets.HolderSetType;

public final class SNSReg {
	private SNSReg() {}
	
	private static <V> DeferredRegister<V> registerReg(DeferredRegister<V> deferred) {
		deferred.register(FMLJavaModLoadingContext.get().getModEventBus());
		return deferred;
	}
	
	public static <V> DeferredRegister<V> createReg(IForgeRegistry<V> forge) {
		return registerReg(DeferredRegister.create(forge, SweetNotSavouryMod.MOD_ID));
	}
	
	public static <V> DeferredRegister<V> createReg(ResourceKey<Registry<V>> key) {
		return registerReg(DeferredRegister.create(key, SweetNotSavouryMod.MOD_ID));
	}
	
	public static final DeferredRegister<Block> BLOCKS = createReg(ForgeRegistries.BLOCKS);
	public static final DeferredRegister<Fluid> FLUIDS = createReg(ForgeRegistries.FLUIDS);
	public static final DeferredRegister<Item> ITEMS = createReg(ForgeRegistries.ITEMS);
	public static final DeferredRegister<MobEffect> MOB_EFFECTS = createReg(ForgeRegistries.MOB_EFFECTS);
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = createReg(ForgeRegistries.SOUND_EVENTS);
	public static final DeferredRegister<Potion> POTIONS = createReg(ForgeRegistries.POTIONS);
	public static final DeferredRegister<Enchantment> ENCHANTMENTS = createReg(ForgeRegistries.ENCHANTMENTS);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = createReg(ForgeRegistries.ENTITY_TYPES);
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = createReg(ForgeRegistries.BLOCK_ENTITY_TYPES);
	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = createReg(ForgeRegistries.PARTICLE_TYPES);
	public static final DeferredRegister<MenuType<?>> MENU_TYPES = createReg(ForgeRegistries.MENU_TYPES);
	public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = createReg(ForgeRegistries.PAINTING_VARIANTS);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = createReg(ForgeRegistries.RECIPE_TYPES);
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = createReg(ForgeRegistries.RECIPE_SERIALIZERS);
	public static final DeferredRegister<Attribute> ATTRIBUTES = createReg(ForgeRegistries.ATTRIBUTES);
	public static final DeferredRegister<StatType<?>> STAT_TYPES = createReg(ForgeRegistries.STAT_TYPES);
	public static final DeferredRegister<ArgumentTypeInfo<?, ?>> COMMAND_ARGUMENT_TYPES = createReg(ForgeRegistries.COMMAND_ARGUMENT_TYPES);
	
	// Villages
	public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = createReg(ForgeRegistries.VILLAGER_PROFESSIONS);
	public static final DeferredRegister<PoiType> POI_TYPES = createReg(ForgeRegistries.POI_TYPES);
	public static final DeferredRegister<MemoryModuleType<?>> MEMORY_MODULE_TYPES = createReg(ForgeRegistries.MEMORY_MODULE_TYPES);
	public static final DeferredRegister<SensorType<?>> SENSOR_TYPES = createReg(ForgeRegistries.SENSOR_TYPES);
	public static final DeferredRegister<Schedule> SCHEDULES = createReg(ForgeRegistries.SCHEDULES);
	public static final DeferredRegister<Activity> ACTIVITIES = createReg(ForgeRegistries.ACTIVITIES);
	
	// Worldgen
	public static final DeferredRegister<WorldCarver<?>> WORLD_CARVERS = createReg(ForgeRegistries.WORLD_CARVERS);
	public static final DeferredRegister<Feature<?>> FEATURES = createReg(ForgeRegistries.FEATURES);
	public static final DeferredRegister<ChunkStatus> CHUNK_STATUS = createReg(ForgeRegistries.CHUNK_STATUS);
	public static final DeferredRegister<BlockStateProviderType<?>> BLOCK_STATE_PROVIDER_TYPES = createReg(ForgeRegistries.BLOCK_STATE_PROVIDER_TYPES);
	public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = createReg(ForgeRegistries.FOLIAGE_PLACER_TYPES);
	public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR_TYPES = createReg(ForgeRegistries.TREE_DECORATOR_TYPES);
	
	// Dynamic/Data driven.
	public static final DeferredRegister<Biome> BIOMES = createReg(ForgeRegistries.BIOMES);
	
	// Custom forge registries
	public static final DeferredRegister<EntityDataSerializer<?>> ENTITY_DATA_SERIALIZERS = createReg(ForgeRegistries.Keys.ENTITY_DATA_SERIALIZERS);
	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIER_SERIALIZERS = createReg(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS);
	public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = createReg(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS);
	public static final DeferredRegister<Codec<? extends StructureModifier>> STRUCTURE_MODIFIER_SERIALIZERS = createReg(ForgeRegistries.Keys.STRUCTURE_MODIFIER_SERIALIZERS);
	public static final DeferredRegister<FluidType> FLUID_TYPES = createReg(ForgeRegistries.Keys.FLUID_TYPES);
	public static final DeferredRegister<HolderSetType> HOLDER_SET_TYPES = createReg(ForgeRegistries.Keys.HOLDER_SET_TYPES);
	
	// Custom forge datapack registries
	public static final DeferredRegister<BiomeModifier> BIOME_MODIFIERS = createReg(ForgeRegistries.Keys.BIOME_MODIFIERS);
	public static final DeferredRegister<StructureModifier> STRUCTURE_MODIFIERS = createReg(ForgeRegistries.Keys.STRUCTURE_MODIFIERS);
}
