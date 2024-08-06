package me.fedox.rammstein.item;

import me.fedox.rammstein.RammsteinMod;

import me.fedox.rammstein.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RammsteinMod.MOD_ID);

    public static final RegistryObject<Item> SONNE_MUSIC_DISC = ITEMS.register("sonne_music_disc",
            () -> new RecordItem(6, ModSounds.SONNE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4920));

    public static final RegistryObject<Item> DEUTSCHLAND_MUSIC_DISC = ITEMS.register("deutschland_music_disc",
            () -> new RecordItem(6, ModSounds.DEUTSCHLAND, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6220));

    public static final RegistryObject<Item> DONAUKINDER_MUSIC_DISC = ITEMS.register("donaukinder_music_disc",
            () -> new RecordItem(6, ModSounds.DONAUKINDER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6360));

    public static final RegistryObject<Item> DUHAST_MUSIC_DISC = ITEMS.register("duhast_music_disc",
            () -> new RecordItem(6, ModSounds.DUHAST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4700));

    public static final RegistryObject<Item> ICHWILL_MUSIC_DISC = ITEMS.register("ichwill_music_disc",
            () -> new RecordItem(6, ModSounds.ICHWILL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4380));

    public static final RegistryObject<Item> AUSLAENDER_MUSIC_DISC = ITEMS.register("auslaender_music_disc",
            () -> new RecordItem(6, ModSounds.AUSLAENDER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4640));

    public static final RegistryObject<Item> FEUERFREI_MUSIC_DISC = ITEMS.register("feuerfrei_music_disc",
            () -> new RecordItem(6, ModSounds.FEUERFREI, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3840));

    public static final RegistryObject<Item> MEINHERZBRENNT_MUSIC_DISC = ITEMS.register("meinherzbrennt_music_disc",
            () -> new RecordItem(6, ModSounds.MEINHERZBRENNT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5600));

    public static final RegistryObject<Item> MUTTER_MUSIC_DISC = ITEMS.register("mutter_music_disc",
            () -> new RecordItem(6, ModSounds.MUTTER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5400));

    public static final RegistryObject<Item> ENGEL_MUSIC_DISC = ITEMS.register("engel_music_disc",
            () -> new RecordItem(6, ModSounds.ENGEL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5280));

    public static final RegistryObject<Item> LINKS_MUSIC_DISC = ITEMS.register("links_music_disc",
            () -> new RecordItem(6, ModSounds.LINKS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4340));

    public static final RegistryObject<Item> ROSENROT_MUSIC_DISC = ITEMS.register("rosenrot_music_disc",
            () -> new RecordItem(6, ModSounds.ROSENROT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4660));

    public static final RegistryObject<Item> RADIO_MUSIC_DISC = ITEMS.register("radio_music_disc",
            () -> new RecordItem(6, ModSounds.RADIO, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5540));

    public static final RegistryObject<Item> OHNEDICH_MUSIC_DISC = ITEMS.register("ohnedich_music_disc",
            () -> new RecordItem(6, ModSounds.OHNEDICH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5400));

    public static final RegistryObject<Item> MOSKAU_MUSIC_DISC = ITEMS.register("moskau_music_disc",
            () -> new RecordItem(6, ModSounds.MOSKAU, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5200));

    public static final RegistryObject<Item> DIAMANT_MUSIC_DISC = ITEMS.register("diamant_music_disc",
            () -> new RecordItem(6, ModSounds.DIAMANT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3080));

    public static final RegistryObject<Item> REISEREISE_MUSIC_DISC = ITEMS.register("reisereise_music_disc",
            () -> new RecordItem(6, ModSounds.REISEREISE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5020));

    public static final RegistryObject<Item> KEINELUST_MUSIC_DISC = ITEMS.register("keinelust_music_disc",
            () -> new RecordItem(6, ModSounds.KEINELUST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4440));

    public static final RegistryObject<Item> AMERIKA_MUSIC_DISC = ITEMS.register("amerika_music_disc",
            () -> new RecordItem(6, ModSounds.AMERIKA, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4540));

    public static final RegistryObject<Item> ICHTUDIRWEH_MUSIC_DISC = ITEMS.register("ichtudirweh_music_disc",
            () -> new RecordItem(6, ModSounds.ICHTUDIRWEH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4740));

    public static final RegistryObject<Item> ADIEU_MUSIC_DISC = ITEMS.register("adieu_music_disc",
            () -> new RecordItem(6, ModSounds.ADIEU, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5600));

    public static final RegistryObject<Item> ARMEEDERTRISTEN_MUSIC_DISC = ITEMS.register("armeedertristen_music_disc",
            () -> new RecordItem(6, ModSounds.ARMEEDERTRISTEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4120));

    public static final RegistryObject<Item> ZEIT_MUSIC_DISC = ITEMS.register("zeit_music_disc",
            () -> new RecordItem(6, ModSounds.ZEIT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6420));

    public static final RegistryObject<Item> SCHWARZ_MUSIC_DISC = ITEMS.register("schwarz_music_disc",
            () -> new RecordItem(6, ModSounds.SCHWARZ, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5160));

    public static final RegistryObject<Item> GIFTIG_MUSIC_DISC = ITEMS.register("giftig_music_disc",
            () -> new RecordItem(6, ModSounds.GIFTIG, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3760));

    public static final RegistryObject<Item> ZICKZACK_MUSIC_DISC = ITEMS.register("zickzack_music_disc",
            () -> new RecordItem(6, ModSounds.ZICKZACK, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4900));

    public static final RegistryObject<Item> OK_MUSIC_DISC = ITEMS.register("ok_music_disc",
            () -> new RecordItem(6, ModSounds.OK, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4880));

    public static final RegistryObject<Item> MEINETRAENEN_MUSIC_DISC = ITEMS.register("meinetraenen_music_disc",
            () -> new RecordItem(6, ModSounds.MEINETRAENEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4740));

    public static final RegistryObject<Item> ANGST_MUSIC_DISC = ITEMS.register("angst_music_disc",
            () -> new RecordItem(6, ModSounds.ANGST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4600));

    public static final RegistryObject<Item> DICKETITTEN_MUSIC_DISC = ITEMS.register("dicketitten_music_disc",
            () -> new RecordItem(6, ModSounds.DICKETITTEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4380));

    public static final RegistryObject<Item> LUEGEN_MUSIC_DISC = ITEMS.register("luegen_music_disc",
            () -> new RecordItem(6, ModSounds.LUEGEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4600));

    public static final RegistryObject<Item> KLAVIER_MUSIC_DISC = ITEMS.register("klavier_music_disc",
            () -> new RecordItem(6, ModSounds.KLAVIER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5240));

    public static final RegistryObject<Item> BERND_MUSIC_DISC = ITEMS.register("bernd_music_disc",
            () -> new RecordItem(6, ModSounds.BERND, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6400));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
