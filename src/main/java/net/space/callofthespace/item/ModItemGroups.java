package net.space.callofthespace.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.space.callofthespace.CallOfTheSpace;
import net.space.callofthespace.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CALL_OF_THE_SPACE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CallOfTheSpace.MOD_ID, "callofthespace"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.callofthespace"))
                    .icon(() -> new ItemStack(ModBlocks.MERCURY_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MERCURY_BLOCK);




                    }).build());

    public static void registerItemGroup() {
        CallOfTheSpace.LOGGER.info("Registering Item Groups for " + CallOfTheSpace.MOD_ID);
    }
}
