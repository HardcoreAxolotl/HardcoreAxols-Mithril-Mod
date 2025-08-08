package axolotlplayground.mithril.item;

import axolotlplayground.mithril.Mithril;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new Item.Settings()));
    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mithril.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Mithril.LOGGER.info("Registering Mod Items for " + Mithril.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MITHRIL_INGOT);
            entries.add(RAW_MITHRIL);
            entries.add(MITHRIL_NUGGET);
        });
    }
}
