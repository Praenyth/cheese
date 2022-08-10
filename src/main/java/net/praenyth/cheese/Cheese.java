package net.praenyth.cheese;

import net.fabricmc.api.ModInitializer;
import net.praenyth.cheese.item.CheeseItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cheese implements ModInitializer {
    public static final String MOD_ID = "praecheese";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        CheeseItem.registerModItems();
    }
}
