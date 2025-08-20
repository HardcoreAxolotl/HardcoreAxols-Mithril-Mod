package axolotlplayground.mithril.world;

import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOrePlacement {

    // Helper: wraps placement modifiers into a list
    private static List<PlacementModifier> modifiers(PlacementModifier count, PlacementModifier heightModifier) {
        return List.of(count, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    // For "count" based ores (e.g. spawn N times per chunk)
    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    // For "rarity" based ores (e.g. spawn once every N chunks on avg)
    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
