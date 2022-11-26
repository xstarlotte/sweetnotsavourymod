package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.machines.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntityTypesInit{
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister
            .create ( ForgeRegistries.TILE_ENTITIES , SweetNotSavouryMod.MOD_ID );
//beds
    public static final RegistryObject<TileEntityType<BlackberryIceCreamBedBlockEntity>> SNS_BLACKBERRY_BED_ENTITY_TYPE
            = BLOCK_ENTITY_TYPE.register("sns_bed_entity", () -> TileEntityType.Builder.of(BlackberryIceCreamBedBlockEntity::new,
                    BlockInit.BLACKBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<TileEntityType<StrawberryIceCreamBedBlockEntity>> SNS_STRAWBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_strawberrybed_entity", () -> TileEntityType.Builder.of(StrawberryIceCreamBedBlockEntity::new,
                    BlockInit.STRAWBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<TileEntityType<RaspberryIceCreamBedBlockEntity>> SNS_RASPBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_raspberrybed_entity", () -> TileEntityType.Builder.of(RaspberryIceCreamBedBlockEntity::new,
                    BlockInit.RASPBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<TileEntityType<BlueberryIceCreamBedBlockEntity>> SNS_BLUEBERRY_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blueberrybed_entity", () -> TileEntityType.Builder.of(BlueberryIceCreamBedBlockEntity::new,
                    BlockInit.BLUEBERRYICECREAMBED.get()).build(null));

    public static final RegistryObject<TileEntityType<LemonIceCreamBedBlockEntity>> SNS_LEMON_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_lemonbed_entity", () -> TileEntityType.Builder.of(LemonIceCreamBedBlockEntity::new,
                    BlockInit.LEMONICECREAMBED.get()).build(null));

    public static final RegistryObject<TileEntityType<OrangeIceCreamBedBlockEntity>> SNS_ORANGE_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_orangebed_entity", () -> TileEntityType.Builder.of(OrangeIceCreamBedBlockEntity::new,
                    BlockInit.ORANGEICECREAMBED.get()).build(null));





    public static final RegistryObject<TileEntityType<WaffleBedBlockEntity>> SNS_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_wafflebed_entity", () -> TileEntityType.Builder.of(WaffleBedBlockEntity::new,
                    BlockInit.VANILLAWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<StrawberryWaffleBedBlockEntity>> SNS_STRAWBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_strawberry_wafflebed_entity", () -> TileEntityType.Builder.of(StrawberryWaffleBedBlockEntity::new,
                    BlockInit.STRAWBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<RaspberryWaffleBedBlockEntity>> SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_raspberry_wafflebed_entity", () -> TileEntityType.Builder.of(RaspberryWaffleBedBlockEntity::new,
                    BlockInit.RASPBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<BlueberryWaffleBedBlockEntity>> SNS_BLUEBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blueberry_wafflebed_entity", () -> TileEntityType.Builder.of(BlueberryWaffleBedBlockEntity::new,
                    BlockInit.BLUEBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<BlackberryWaffleBedBlockEntity>> SNS_BLACKBERRY_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_blackberry_wafflebed_entity", () -> TileEntityType.Builder.of(BlackberryWaffleBedBlockEntity::new,
                    BlockInit.BLACKBERRYWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<LemonWaffleBedBlockEntity>> SNS_LEMON_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_lemon_wafflebed_entity", () -> TileEntityType.Builder.of(LemonWaffleBedBlockEntity::new,
                    BlockInit.LEMONWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<OrangeWaffleBedBlockEntity>> SNS_ORANGE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_orange_wafflebed_entity", () -> TileEntityType.Builder.of(OrangeWaffleBedBlockEntity::new,
                    BlockInit.ORANGEWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<ChocolateWaffleBedBlockEntity>> SNS_CHOCOLATE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_chocolate_wafflebed_entity", () -> TileEntityType.Builder.of(ChocolateWaffleBedBlockEntity::new,
                    BlockInit.CHOCOLATEWAFFLEBED.get()).build(null));

    public static final RegistryObject<TileEntityType<ToffeeWaffleBedBlockEntity>> SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("sns_toffee_wafflebed_entity", () -> TileEntityType.Builder.of(ToffeeWaffleBedBlockEntity::new,
                    BlockInit.TOFFEEWAFFLEBED.get()).build(null));

//icecreammachine
    public static final RegistryObject<TileEntityType<IceCreamMachineBlockEntity>> ICE_CREAM_MACHINE = BLOCK_ENTITY_TYPE
        .register("ice_cream_machine", () -> TileEntityType.Builder.of(IceCreamMachineBlockEntity::new,
                BlockInit.ICE_CREAM_MACHINE.get()).build(null));

    public static final RegistryObject<TileEntityType<BananaBakerBlockEntity>> BANANA_BAKER = BLOCK_ENTITY_TYPE
            .register("banana_baker", () -> TileEntityType.Builder.of(BananaBakerBlockEntity::new,
                    BlockInit.BANANA_BAKER.get()).build(null));

    public static final RegistryObject<TileEntityType<JamPresserBlockEntity>> JAM_PRESSER = BLOCK_ENTITY_TYPE
            .register("jam_presser", () -> TileEntityType.Builder.of(JamPresserBlockEntity::new,
                    BlockInit.JAM_PRESSER.get()).build(null));

    public static final RegistryObject<TileEntityType<WaffleConeMachineBlockEntity>> WAFFLE_CONE_MACHINE = BLOCK_ENTITY_TYPE
            .register("waffle_cone_machine", () -> TileEntityType.Builder.of(WaffleConeMachineBlockEntity::new,
                    BlockInit.WAFFLE_CONE_MACHINE.get()).build(null));

    public static final RegistryObject<TileEntityType<CakeBakerBlockEntity>> CAKE_BAKER = BLOCK_ENTITY_TYPE
            .register("cake_baker", () -> TileEntityType.Builder.of(CakeBakerBlockEntity::new,
                    BlockInit.CAKE_BAKER.get()).build(null));

    public static final RegistryObject<TileEntityType<TeddyBearPrinterBlockEntity>> TEDDY_BEAR_PRINTER = BLOCK_ENTITY_TYPE
            .register("teddy_bear_printer", () -> TileEntityType.Builder.of(TeddyBearPrinterBlockEntity::new,
                    BlockInit.TEDDY_BEAR_PRINTER.get()).build(null));

    public static final RegistryObject<TileEntityType<CandyflossCrystalizerBlockEntity>> CANDYFLOSS_CRYSTALIZER = BLOCK_ENTITY_TYPE
            .register("candyfloss_crystalizer", () -> TileEntityType.Builder.of(CandyflossCrystalizerBlockEntity::new,
                    BlockInit.CANDYFLOSS_CRYSTALIZER.get()).build(null));

    public static final RegistryObject<TileEntityType<CandycaneFurnaceBlockEntity>> CANDYCANE_FURNACE = BLOCK_ENTITY_TYPE
            .register("candycane_furnace", () -> TileEntityType.Builder.of(CandycaneFurnaceBlockEntity::new,
                    BlockInit.CANDYCANE_FURNACE.get()).build(null));
}
