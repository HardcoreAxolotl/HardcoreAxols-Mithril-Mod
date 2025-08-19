package axolotlplayground.mithril.item;

import axolotlplayground.mithril.Mithril;
import axolotlplayground.mithril.item.ModArmorMaterials;
import net.minecraft.item.*;
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

    // mithril items
    public static final Item MITHRIL_TEMPLATE = registerItem("mithril_template", new Item(new Item.Settings()));

    // Mithril Tools
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 3, -2.4f))));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new PickaxeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 1, -2.8f))));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 1.5f, -3.0f))));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new AxeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 6, -3.2f))));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new HoeItem(ModToolMaterials.MITHRIL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MITHRIL, 0, -3f))));

    // Mithril Armor
    public static final Item MITHRIL_HELMET = registerItem(
            "mithril_helmet",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(46)))
    );
    public static final Item MITHRIL_CHESTPLATE = registerItem(
            "mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(46)))
    );
    public static final Item MITHRIL_LEGGINGS = registerItem(
            "mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(46)))
    );
    public static final Item MITHRIL_BOOTS = registerItem(
            "mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(46)))
    );

    // register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mithril.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mithril.LOGGER.info("Registering Mod Items for " + Mithril.MOD_ID);
    }
}
