package axolotlplayground.mithril.util;

import axolotlplayground.mithril.Mithril;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = creativeTag("needs_mithril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = creativeTag("incorrect_for_mithril_tool");


        private static TagKey<Block> creativeTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Mithril.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> creativeTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Mithril.MOD_ID, name));
        }
    }
}
