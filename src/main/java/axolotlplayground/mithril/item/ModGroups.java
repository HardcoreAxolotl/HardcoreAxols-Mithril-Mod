package axolotlplayground.mithril.item;

import axolotlplayground.mithril.Mithril;
import axolotlplayground.mithril.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroups {
    public static ItemGroup Mithril_Mod = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mithril.MOD_ID, "mithril"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MITHRIL_INGOT))
                    .displayName(Text.translatable("itemgroup.mithril.mithril"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.RAW_MITHRIL_BLOCK);

                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.MITHRIL_NUGGET);
                        entries.add(ModItems.MITHRIL_TEMPLATE);

                        entries.add(ModItems.MITHRIL_CARROT);
                        entries.add(ModItems.MITHRIL_APPLE);
                        entries.add(ModItems.ENCHANTED_MITHRIL_APPLE);

                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_HOE);

                    }).build());

    public static void registerItemGroups() {
        Mithril.LOGGER.info("Registering Mod Item Groups for " + Mithril.MOD_ID);
    }
}
