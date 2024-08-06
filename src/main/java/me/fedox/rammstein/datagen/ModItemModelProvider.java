package me.fedox.rammstein.datagen;

import me.fedox.rammstein.RammsteinMod;
import me.fedox.rammstein.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RammsteinMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.SONNE_MUSIC_DISC);
        simpleItem(ModItems.DEUTSCHLAND_MUSIC_DISC);
        simpleItem(ModItems.DONAUKINDER_MUSIC_DISC);
        simpleItem(ModItems.DUHAST_MUSIC_DISC);
        simpleItem(ModItems.ICHWILL_MUSIC_DISC);
        simpleItem(ModItems.AUSLAENDER_MUSIC_DISC);
        simpleItem(ModItems.FEUERFREI_MUSIC_DISC);
        simpleItem(ModItems.MEINHERZBRENNT_MUSIC_DISC);
        simpleItem(ModItems.MUTTER_MUSIC_DISC);
        simpleItem(ModItems.ENGEL_MUSIC_DISC);
        simpleItem(ModItems.LINKS_MUSIC_DISC);
        simpleItem(ModItems.ROSENROT_MUSIC_DISC);
        simpleItem(ModItems.RADIO_MUSIC_DISC);
        simpleItem(ModItems.OHNEDICH_MUSIC_DISC);
        simpleItem(ModItems.MOSKAU_MUSIC_DISC);
        simpleItem(ModItems.DIAMANT_MUSIC_DISC);
        simpleItem(ModItems.REISEREISE_MUSIC_DISC);
        simpleItem(ModItems.KEINELUST_MUSIC_DISC);
        simpleItem(ModItems.AMERIKA_MUSIC_DISC);
        simpleItem(ModItems.ICHTUDIRWEH_MUSIC_DISC);
        simpleItem(ModItems.ADIEU_MUSIC_DISC);
        simpleItem(ModItems.ARMEEDERTRISTEN_MUSIC_DISC);
        simpleItem(ModItems.ZEIT_MUSIC_DISC);
        simpleItem(ModItems.SCHWARZ_MUSIC_DISC);
        simpleItem(ModItems.GIFTIG_MUSIC_DISC);
        simpleItem(ModItems.ZICKZACK_MUSIC_DISC);
        simpleItem(ModItems.OK_MUSIC_DISC);
        simpleItem(ModItems.MEINETRAENEN_MUSIC_DISC);
        simpleItem(ModItems.ANGST_MUSIC_DISC);
        simpleItem(ModItems.DICKETITTEN_MUSIC_DISC);
        simpleItem(ModItems.LUEGEN_MUSIC_DISC);
        simpleItem(ModItems.KLAVIER_MUSIC_DISC);
        simpleItem(ModItems.BERND_MUSIC_DISC);

    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RammsteinMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
