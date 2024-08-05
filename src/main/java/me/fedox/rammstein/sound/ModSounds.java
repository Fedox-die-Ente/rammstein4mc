package me.fedox.rammstein.sound;

import me.fedox.rammstein.RammsteinMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RammsteinMod.MOD_ID);


    public static final RegistryObject<SoundEvent> SONNE = registerSoundEvents("sonne");

    public static final RegistryObject<SoundEvent> DEUTSCHLAND = registerSoundEvents("deutschland");

    public static final RegistryObject<SoundEvent> DONAUKINDER = registerSoundEvents("donaukinder");

    public static final RegistryObject<SoundEvent> DUHAST = registerSoundEvents("duhast");

    public static final RegistryObject<SoundEvent> ICHWILL = registerSoundEvents("ichwill");

    public static final RegistryObject<SoundEvent> AUSLAENDER = registerSoundEvents("auslaender");

    public static final RegistryObject<SoundEvent> FEUERFREI = registerSoundEvents("feuerfrei");

    public static final RegistryObject<SoundEvent> MEINHERZBRENNT = registerSoundEvents("meinherzbrennt");

    public static final RegistryObject<SoundEvent> MUTTER = registerSoundEvents("mutter");

    public static final RegistryObject<SoundEvent> ENGEL = registerSoundEvents("engel");

    public static final RegistryObject<SoundEvent> LINKS = registerSoundEvents("links");

    public static final RegistryObject<SoundEvent> ROSENROT = registerSoundEvents("rosenrot");

    public static final RegistryObject<SoundEvent> RADIO = registerSoundEvents("radio");

    public static final RegistryObject<SoundEvent> OHNEDICH = registerSoundEvents("ohnedich");

    public static final RegistryObject<SoundEvent> MOSKAU = registerSoundEvents("moskau");

    public static final RegistryObject<SoundEvent> DIAMANT = registerSoundEvents("diamant");

    public static final RegistryObject<SoundEvent> REISEREISE = registerSoundEvents("reisereise");

    public static final RegistryObject<SoundEvent> KEINELUST = registerSoundEvents("keinelust");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(RammsteinMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
