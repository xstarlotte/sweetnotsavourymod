package com.charlotte.sweetnotsavourymod.common.screen;
import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuTypesInit {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<MenuType<IceCreamMachineMenu>> ICE_CREAM_MACHINE_MENU =
            registerMenuType(IceCreamMachineMenu::new, "ice_cream_machine_menu");

    public static final RegistryObject<MenuType<BananaBakerMenu>> BANANA_BAKER_MENU =
            registerMenuType(BananaBakerMenu::new, "banana_baker_menu");

    public static final RegistryObject<MenuType<JamPresserMenu>> JAM_PRESSER_MENU =
            registerMenuType(JamPresserMenu::new, "jam_presser_menu");

    public static final RegistryObject<MenuType<WaffleConeMachineMenu>> WAFFLE_CONE_MACHINE_MENU =
            registerMenuType(WaffleConeMachineMenu::new, "waffle_cone_machine_menu");

    public static final RegistryObject<MenuType<CakeBakerMenu>> CAKE_BAKER_MENU =
            registerMenuType(CakeBakerMenu::new, "cake_baker_menu");

    public static final RegistryObject<MenuType<CandycaneFurnaceMenu>> CANDYCANE_FURNACE_MENU =
            registerMenuType(CandycaneFurnaceMenu::new, "candycane_furnace_menu");

    public static final RegistryObject<MenuType<TeddyBearPrinterMenu>> TEDDY_BEAR_PRINTER_MENU =
            registerMenuType(TeddyBearPrinterMenu::new, "teddy_bear_printer_menu");

    public static final RegistryObject<MenuType<CandyflossCrystalizerMenu>> CANDYFLOSS_CRYSTALIZER_MENU =
            registerMenuType(CandyflossCrystalizerMenu::new, "candyfloss_crystalizer_menu");


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
