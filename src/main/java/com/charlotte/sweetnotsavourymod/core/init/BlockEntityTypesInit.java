package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("ConstantConditions")
public class BlockEntityTypesInit{
    public static void loadClass() {}
    
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = SNSReg.BLOCK_ENTITY_TYPES;
//beds
    public static final RegistryObject<BlockEntityType<BlackberryIceCreamBedBlockEntity>> SNS_BLACKBERRY_BED_ENTITY_TYPE
            = BLOCK_ENTITY_TYPE.register("sns_bed_entity", () -> BlockEntityType.Builder.of(BlackberryIceCreamBedBlockEntity::new,
                    BlockInit.BLACKBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<StrawberryIceCreamBedBlockEntity>> SNS_STRAWBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_strawberrybed_entity", () -> BlockEntityType.Builder.of(StrawberryIceCreamBedBlockEntity::new,
                    BlockInit.STRAWBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<RaspberryIceCreamBedBlockEntity>> SNS_RASPBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_raspberrybed_entity", () -> BlockEntityType.Builder.of(RaspberryIceCreamBedBlockEntity::new,
                    BlockInit.RASPBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueberryIceCreamBedBlockEntity>> SNS_BLUEBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blueberrybed_entity", () -> BlockEntityType.Builder.of(BlueberryIceCreamBedBlockEntity::new,
                    BlockInit.BLUEBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<LemonIceCreamBedBlockEntity>> SNS_LEMON_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_lemonbed_entity", () -> BlockEntityType.Builder.of(LemonIceCreamBedBlockEntity::new,
                    BlockInit.LEMONICECREAMBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeIceCreamBedBlockEntity>> SNS_ORANGE_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_orangebed_entity", () -> BlockEntityType.Builder.of(OrangeIceCreamBedBlockEntity::new,
                    BlockInit.ORANGEICECREAMBED.get()).build(null));





    public static final RegistryObject<BlockEntityType<WaffleBedBlockEntity>> SNS_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_wafflebed_entity", () -> BlockEntityType.Builder.of(WaffleBedBlockEntity::new,
                    BlockInit.VANILLAWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<StrawberryWaffleBedBlockEntity>> SNS_STRAWBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_strawberry_wafflebed_entity", () -> BlockEntityType.Builder.of(StrawberryWaffleBedBlockEntity::new,
                    BlockInit.STRAWBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<RaspberryWaffleBedBlockEntity>> SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_raspberry_wafflebed_entity", () -> BlockEntityType.Builder.of(RaspberryWaffleBedBlockEntity::new,
                    BlockInit.RASPBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueberryWaffleBedBlockEntity>> SNS_BLUEBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blueberry_wafflebed_entity", () -> BlockEntityType.Builder.of(BlueberryWaffleBedBlockEntity::new,
                    BlockInit.BLUEBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlackberryWaffleBedBlockEntity>> SNS_BLACKBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blackberry_wafflebed_entity", () -> BlockEntityType.Builder.of(BlackberryWaffleBedBlockEntity::new,
                    BlockInit.BLACKBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<LemonWaffleBedBlockEntity>> SNS_LEMON_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_lemon_wafflebed_entity", () -> BlockEntityType.Builder.of(LemonWaffleBedBlockEntity::new,
                    BlockInit.LEMONWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeWaffleBedBlockEntity>> SNS_ORANGE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_orange_wafflebed_entity", () -> BlockEntityType.Builder.of(OrangeWaffleBedBlockEntity::new,
                    BlockInit.ORANGEWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChocolateWaffleBedBlockEntity>> SNS_CHOCOLATE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_chocolate_wafflebed_entity", () -> BlockEntityType.Builder.of(ChocolateWaffleBedBlockEntity::new,
                    BlockInit.CHOCOLATEWAFFLEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<ToffeeWaffleBedBlockEntity>> SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_toffee_wafflebed_entity", () -> BlockEntityType.Builder.of(ToffeeWaffleBedBlockEntity::new,
                    BlockInit.TOFFEEWAFFLEBED.get()).build(null));
}
