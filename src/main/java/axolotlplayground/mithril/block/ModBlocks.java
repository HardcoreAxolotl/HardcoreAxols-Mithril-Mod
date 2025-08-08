package axolotlplayground.mithril.block;

import axolotlplayground.mithril.Mithril;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block", new Block(AbstractBlock.Settings.create()
            .strength(70f, 2400)
            .requiresTool()
            .sounds(BlockSoundGroup.NETHERITE)
    ));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore", new Block(AbstractBlock.Settings.create()
            .strength(40f, 1800)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));
    public static final Block RAW_MITHRIL_BlOCK = registerBlock("raw_mithril_block", new Block(AbstractBlock.Settings.create()
            .strength(70f, 2400)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Mithril.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Mithril.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Mithril.LOGGER.info("Registering Mod Blocks for " + Mithril.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MITHRIL_BLOCK);
            entries.add(MITHRIL_ORE);
            entries.add(RAW_MITHRIL_BlOCK);
        });
    }

}
