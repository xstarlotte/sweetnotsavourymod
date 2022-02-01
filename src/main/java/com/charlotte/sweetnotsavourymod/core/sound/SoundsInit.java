package com.charlotte.sweetnotsavourymod.core.sound;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundsInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            SweetNotSavouryMod.MOD_ID);
    }
}
