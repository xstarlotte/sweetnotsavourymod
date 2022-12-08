package com.charlotte.sweetnotsavourymod.core.sound;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class SoundsInit {
    public static void loadClass() {}
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = SNSReg.SOUND_EVENTS;

    public static RegistryObject<SoundEvent> CHIPTRONICAL = registerSoundEvents("chiptronical");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(SweetNotSavouryMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    }
