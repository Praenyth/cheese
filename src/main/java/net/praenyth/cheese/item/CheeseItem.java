package net.praenyth.cheese.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.praenyth.cheese.Cheese;
import net.praenyth.cheese.CheeseFoodComponent;

public class CheeseItem {

    public static Item CHEESE = registerItem("cheese", new Item(
            new FabricItemSettings()
                    .maxCount(16)
                    .rarity(Rarity.EPIC)
                    .food(CheeseFoodComponent.CHEESE)
                    .group(ItemGroup.FOOD)
            )
    );

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cheese.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cheese.LOGGER.info("Cheese item!!!!");
    }
}
