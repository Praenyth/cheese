package net.praenyth.cheese;

import net.minecraft.item.FoodComponent;

public class CheeseFoodComponent {
    public static FoodComponent CHEESE = new FoodComponent.Builder().hunger(20).saturationModifier(20f).build();
}
