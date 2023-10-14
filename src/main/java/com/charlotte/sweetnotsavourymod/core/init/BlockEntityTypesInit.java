package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.candycane.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.machines.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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

    public static final RegistryObject<BlockEntityType<CandycaneBedBlockEntity>> SNS_CANDY_CANE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_canebed_entity", () -> BlockEntityType.Builder.of(CandycaneBedBlockEntity::new,
                    BlockInit.CANDYCANEBED.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneBrickBedBlockEntity>> SNS_CANDY_CANE_BRICK_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_cane_brick_bed_entity", () -> BlockEntityType.Builder.of(CandycaneBrickBedBlockEntity::new,
                    BlockInit.CANDYCANE_BRICK_BED.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneYellowBrickBedBlockEntity>> SNS_CANDY_CANE_YELLOWBRICK_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_cane_yellowbrick_bed_entity", () -> BlockEntityType.Builder.of(CandycaneYellowBrickBedBlockEntity::new,
                    BlockInit.CANDYCANE_YELLOWBRICK_BED.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneGreenBrickBedBlockEntity>> SNS_CANDY_CANE_GREENBRICK_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_cane_greenbrick_bed_entity", () -> BlockEntityType.Builder.of(CandycaneGreenBrickBedBlockEntity::new,
                    BlockInit.CANDYCANE_GREENBRICK_BED.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneBlueBrickBedBlockEntity>> SNS_CANDY_CANE_BLUEBRICK_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_cane_bluebrick_bed_entity", () -> BlockEntityType.Builder.of(CandycaneBlueBrickBedBlockEntity::new,
                    BlockInit.CANDYCANE_BLUEBRICK_BED.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneLightBlueBrickBedBlockEntity>> SNS_CANDY_CANE_LIGHTBLUEBRICK_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_candy_cane_lightbluebrick_bed_entity", () -> BlockEntityType.Builder.of(CandycaneLightBlueBrickBedBlockEntity::new,
                    BlockInit.CANDYCANE_LIGHTBLUEBRICK_BED.get()).build(null));

//icecreammachine
    public static final RegistryObject<BlockEntityType<IceCreamMachineBlockEntity>> ICE_CREAM_MACHINE = BLOCK_ENTITY_TYPE
        .register("ice_cream_machine", () -> BlockEntityType.Builder.of(IceCreamMachineBlockEntity::new,
                BlockInit.ICE_CREAM_MACHINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BananaBakerBlockEntity>> BANANA_BAKER = BLOCK_ENTITY_TYPE
            .register("banana_baker", () -> BlockEntityType.Builder.of(BananaBakerBlockEntity::new,
                    BlockInit.BANANA_BAKER.get()).build(null));

    public static final RegistryObject<BlockEntityType<JamPresserBlockEntity>> JAM_PRESSER = BLOCK_ENTITY_TYPE
            .register("jam_presser", () -> BlockEntityType.Builder.of(JamPresserBlockEntity::new,
                    BlockInit.JAM_PRESSER.get()).build(null));

    public static final RegistryObject<BlockEntityType<WaffleConeMachineBlockEntity>> WAFFLE_CONE_MACHINE = BLOCK_ENTITY_TYPE
            .register("waffle_cone_machine", () -> BlockEntityType.Builder.of(WaffleConeMachineBlockEntity::new,
                    BlockInit.WAFFLE_CONE_MACHINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CakeBakerBlockEntity>> CAKE_BAKER = BLOCK_ENTITY_TYPE
            .register("cake_baker", () -> BlockEntityType.Builder.of(CakeBakerBlockEntity::new,
                    BlockInit.CAKE_BAKER.get()).build(null));

    public static final RegistryObject<BlockEntityType<TeddyBearPrinterBlockEntity>> TEDDY_BEAR_PRINTER = BLOCK_ENTITY_TYPE
            .register("teddy_bear_printer", () -> BlockEntityType.Builder.of(TeddyBearPrinterBlockEntity::new,
                    BlockInit.TEDDY_BEAR_PRINTER.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandyflossCrystalizerBlockEntity>> CANDYFLOSS_CRYSTALIZER = BLOCK_ENTITY_TYPE
            .register("candyfloss_crystalizer", () -> BlockEntityType.Builder.of(CandyflossCrystalizerBlockEntity::new,
                    BlockInit.CANDYFLOSS_CRYSTALIZER.get()).build(null));

    public static final RegistryObject<BlockEntityType<CandycaneFurnaceBlockEntity>> CANDYCANE_FURNACE = BLOCK_ENTITY_TYPE
            .register("candycane_furnace", () -> BlockEntityType.Builder.of(CandycaneFurnaceBlockEntity::new,
                    BlockInit.CANDYCANE_FURNACE.get()).build(null));
}
