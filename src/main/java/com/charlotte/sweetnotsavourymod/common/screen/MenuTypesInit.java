package com.charlotte.sweetnotsavourymod.common.screen;
import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenu;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuTemplate;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.concurrent.atomic.AtomicReference;

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

    public static final RegistryObject<SNSChestMenuType> STRAWBERRY_CHEST =
            registerChestMenu(new SNSChestMenuTemplate("strawberry_chest", 176, 222,
                    44, 23,   62, 23,   80, 23,   98,  23,   116,  23,
                              62, 41,   80, 41,   98,  41,
                              62, 59,   80, 59,   98,  59,
                              62, 77,   80, 77,   98,  77,
                                        80, 95
            ));

    public static final RegistryObject<SNSChestMenuType> WAFFLE_CHEST =
            registerChestMenu(new SNSChestMenuTemplate("waffle_chest", 176, 169,
                    8, 18,   26, 18,   44, 18,   62, 18,   80, 18,   98, 18,   116, 18,   134, 18,   152, 18,
                    8, 36,   26, 36,   44, 36,   62, 36,   80, 36,   98, 36,   116, 36,   134, 36,   152, 36,
                    8, 54,   26, 54,   44, 54,   62, 54,   80, 54,   98, 54,   116, 54,   134, 54,   152, 54
            ));

    public static final RegistryObject<SNSChestMenuType> WAFFLE_CHEST_2 =
            registerChestMenu(new SNSChestMenuTemplate("waffle_chest_2", 176, 223,
                    8,  18,   26,  18,   44,  18,   62,  18,   80,  18,   98,  18,   116,  18,   134,  18,   152,  18,
                    8,  36,   26,  36,   44,  36,   62,  36,   80,  36,   98,  36,   116,  36,   134,  36,   152,  36,
                    8,  54,   26,  54,   44,  54,   62,  54,   80,  54,   98,  54,   116,  54,   134,  54,   152,  54,
                    8,  72,   26,  72,   44,  72,   62,  72,   80,  72,   98,  72,   116,  72,   134,  72,   152,  72,
                    8,  90,   26,  90,   44,  90,   62,  90,   80,  90,   98,  90,   116,  90,   134,  90,   152,  90,
                    8, 108,   26, 108,   44, 108,   62, 108,   80, 108,   98, 108,   116, 108,   134, 108,   152, 108
            ));


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    private static RegistryObject<SNSChestMenuType> registerChestMenu(SNSChestMenuTemplate template) {
        return MENUS.register(template.id, ()->{
            AtomicReference<SNSChestMenuType> atomic = new AtomicReference<>();
            SNSChestMenuType type = new SNSChestMenuType(
                    (id, inventory) -> new SNSChestMenu(atomic.get(), id, template, inventory, null),
                    template
            );
            atomic.set(type);
            return type;
        });
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
