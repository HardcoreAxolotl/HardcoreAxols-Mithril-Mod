package axolotlplayground.mithril.datagen;

import axolotlplayground.mithril.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.MITHRIL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.MITHRIL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.MITHRIL_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.MITHRIL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MITHRIL_HOE);
        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE) // HAHA Funny Reason Remove before buiding
                .add(ModItems.MITHRIL_HOE);
    }
}
