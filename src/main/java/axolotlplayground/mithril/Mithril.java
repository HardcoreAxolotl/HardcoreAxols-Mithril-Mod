package axolotlplayground.mithril;

import axolotlplayground.mithril.block.ModBlocks;
import axolotlplayground.mithril.group.ModGroups;
import axolotlplayground.mithril.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mithril implements ModInitializer {
    public static final String MOD_ID = "mithril";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Mithril mod initialized.");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModGroups.registerItemGroups();
    }
}
