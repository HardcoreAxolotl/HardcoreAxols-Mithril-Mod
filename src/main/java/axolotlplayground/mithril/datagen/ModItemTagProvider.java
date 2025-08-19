package axolotlplayground.mithril.datagen;

import axolotlplayground.mithril.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Tools
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.MITHRIL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.MITHRIL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.MITHRIL_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.MITHRIL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.MITHRIL_HOE);

        // Armor
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.MITHRIL_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.MITHRIL_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.MITHRIL_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.MITHRIL_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModItems.MITHRIL_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModItems.MITHRIL_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModItems.MITHRIL_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModItems.MITHRIL_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.MITHRIL_HELMET);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.MITHRIL_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.MITHRIL_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.MITHRIL_BOOTS);
    }
}
