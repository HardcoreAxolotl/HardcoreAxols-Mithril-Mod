package axolotlplayground.mithril.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent MITHRIL_CARROT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.5F)
            .build();
    public static final FoodComponent MITHRIL_APPLE = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(1.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0), 1.0F)     // 5s Regeneration I
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1.0F)      // 1min Absorption II
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1.0F)      // 1min Resistance I
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1.0F) // 1min Fire Resistance
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1.0F)        // 1min Strength II
            .alwaysEdible()
            .build();

    public static final FoodComponent ENCHANTED_MITHRIL_APPLE = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 3), 1.0F) // 10s Regeneration IV
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 3), 1.0F)    // 30s Absorption IV
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 2), 1.0F)    // 20s Resistance III
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 4), 1.0F)      // 20s Strength V
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 2), 1.0F)         // 20s Speed III
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 1.0F)  // 20s Night Vision
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 2), 1.0F)         // 20s Haste III
            .alwaysEdible()
            .build();
}
