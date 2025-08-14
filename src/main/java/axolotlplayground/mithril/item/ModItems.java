package axolotlplayground.mithril.item;

import axolotlplayground.mithril.Mithril;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Mithril Ore
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new Item.Settings()));
    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget", new Item(new Item.Settings()));

    // Mithril Food
    public static final Item MITHRIL_CARROT = registerItem("mithril_carrot", new Item(new Item.Settings().food(ModFoodComponents.MITHRIL_CARROT)));
    public static final Item MITHRIL_APPLE = registerItem("mithril_apple", new Item(new Item.Settings().food(ModFoodComponents.MITHRIL_APPLE)));
    public static final Item ENCHANTED_MITHRIL_APPLE = registerItem("enchanted_mithril_apple", new EnchantedItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_MITHRIL_APPLE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mithril.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mithril.LOGGER.info("Registering Mod Items for " + Mithril.MOD_ID);
    }
}
