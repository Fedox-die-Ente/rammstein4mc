package me.fedox.rammstein.datagen;

import me.fedox.rammstein.RammsteinMod;
import me.fedox.rammstein.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, RammsteinMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.SONNE_MUSIC_DISC.get())
                .add(ModItems.DEUTSCHLAND_MUSIC_DISC.get())
                .add(ModItems.DONAUKINDER_MUSIC_DISC.get())
                .add(ModItems.DUHAST_MUSIC_DISC.get())
                .add(ModItems.ICHWILL_MUSIC_DISC.get())
                .add(ModItems.AUSLAENDER_MUSIC_DISC.get())
                .add(ModItems.FEUERFREI_MUSIC_DISC.get())
                .add(ModItems.MEINHERZBRENNT_MUSIC_DISC.get())
                .add(ModItems.MUTTER_MUSIC_DISC.get())
                .add(ModItems.ENGEL_MUSIC_DISC.get())
                .add(ModItems.LINKS_MUSIC_DISC.get())
                .add(ModItems.ROSENROT_MUSIC_DISC.get())
                .add(ModItems.RADIO_MUSIC_DISC.get())
                .add(ModItems.OHNEDICH_MUSIC_DISC.get())
                .add(ModItems.MOSKAU_MUSIC_DISC.get())
                .add(ModItems.DIAMANT_MUSIC_DISC.get())
                .add(ModItems.REISEREISE_MUSIC_DISC.get())
                .add(ModItems.KEINELUST_MUSIC_DISC.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.SONNE_MUSIC_DISC.get())
                .add(ModItems.DEUTSCHLAND_MUSIC_DISC.get())
                .add(ModItems.DONAUKINDER_MUSIC_DISC.get())
                .add(ModItems.DUHAST_MUSIC_DISC.get())
                .add(ModItems.ICHWILL_MUSIC_DISC.get())
                .add(ModItems.AUSLAENDER_MUSIC_DISC.get())
                .add(ModItems.FEUERFREI_MUSIC_DISC.get())
                .add(ModItems.MEINHERZBRENNT_MUSIC_DISC.get())
                .add(ModItems.MUTTER_MUSIC_DISC.get())
                .add(ModItems.ENGEL_MUSIC_DISC.get())
                .add(ModItems.LINKS_MUSIC_DISC.get())
                .add(ModItems.ROSENROT_MUSIC_DISC.get())
                .add(ModItems.RADIO_MUSIC_DISC.get())
                .add(ModItems.OHNEDICH_MUSIC_DISC.get())
                .add(ModItems.MOSKAU_MUSIC_DISC.get())
                .add(ModItems.DIAMANT_MUSIC_DISC.get())
                .add(ModItems.REISEREISE_MUSIC_DISC.get())
                .add(ModItems.KEINELUST_MUSIC_DISC.get());
    }
}
