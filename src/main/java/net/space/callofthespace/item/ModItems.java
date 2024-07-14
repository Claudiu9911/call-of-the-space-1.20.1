package net.space.callofthespace.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.space.callofthespace.CallOfTheSpace;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CallOfTheSpace.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CallOfTheSpace.LOGGER.info("Registering Mod Items for " + CallOfTheSpace.MOD_ID);
    }

}
