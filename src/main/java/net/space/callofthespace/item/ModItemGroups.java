package net.space.callofthespace.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.space.callofthespace.CallOfTheSpace;

public class ModItemGroups {

    public static void registerItemGroup() {
        CallOfTheSpace.LOGGER.info("Registering Item Groups for " + CallOfTheSpace.MOD_ID);
    }
}
