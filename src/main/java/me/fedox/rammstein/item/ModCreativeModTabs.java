package me.fedox.rammstein.item;

import me.fedox.rammstein.RammsteinMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RammsteinMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("rammstein_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SONNE_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.rammstein_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SONNE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DEUTSCHLAND_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DONAUKINDER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DUHAST_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ICHWILL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.AUSLAENDER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.FEUERFREI_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MEINHERZBRENNT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MUTTER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ENGEL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.LINKS_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ROSENROT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.RADIO_MUSIC_DISC.get());
                        pOutput.accept(ModItems.OHNEDICH_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MOSKAU_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DIAMANT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.REISEREISE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.KEINELUST_MUSIC_DISC.get());
                        pOutput.accept(ModItems.AMERIKA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ICHTUDIRWEH_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ADIEU_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ARMEEDERTRISTEN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ZEIT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SCHWARZ_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GIFTIG_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ZICKZACK_MUSIC_DISC.get());
                        pOutput.accept(ModItems.OK_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MEINETRAENEN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ANGST_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DICKETITTEN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.LUEGEN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.KLAVIER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BERND_MUSIC_DISC.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
