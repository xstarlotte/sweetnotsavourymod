package com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems;

import com.charlotte.sweetnotsavourymod.common.effects.ModEffects;
import com.charlotte.sweetnotsavourymod.common.item.ModArmorMaterials;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.Map;
import java.util.function.Supplier;

public class RaspberryCandyArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    private static final Map<IArmorMaterial, Supplier<EffectInstance[]>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<IArmorMaterial, Supplier<EffectInstance[]>>())
                    .put(ModArmorMaterials.RASPBERRY_CANDY,
                            () -> new EffectInstance[] {
                                    new EffectInstance(Effects.FIRE_RESISTANCE, 200, 1),
                                    new EffectInstance(ModEffects.POISON_RESISTANCE.get(), 200, 1)}).build();



    public RaspberryCandyArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<RaspberryCandyArmorItem>(this, "controller",
                20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<IArmorMaterial, Supplier<EffectInstance[]>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            IArmorMaterial mapArmorMaterial = entry.getKey();
            EffectInstance[] mapStatusEffect = entry.getValue().get();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, IArmorMaterial mapArmorMaterial,
                                            EffectInstance[] mapStatusEffect) {
        boolean hasPlayerEffect = true;

        for (EffectInstance instance : mapStatusEffect) {
            hasPlayerEffect = player.hasEffect(instance.getEffect());
        }

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {

            applyMultipleEffects(player, mapStatusEffect);

            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //    player.inventory.hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //}
        }
    }

    private void applyMultipleEffects(PlayerEntity player, EffectInstance[] mapStatusEffect) {
        for (EffectInstance instance : mapStatusEffect) {
            player.addEffect(new EffectInstance(instance.getEffect(),
                    instance.getDuration(), instance.getAmplifier()));
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.inventory.getArmor(0);
        ItemStack leggings = player.inventory.getArmor(1);
        ItemStack breastplate = player.inventory.getArmor(2);
        ItemStack helmet = player.inventory.getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(IArmorMaterial material, PlayerEntity player) {
        for (ItemStack armorStack: player.inventory.armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.inventory.getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.inventory.getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.inventory.getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.inventory.getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material
                && leggings.getMaterial() == material && boots.getMaterial() == material;
    }

}

