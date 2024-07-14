package net.space.callofthespace;

import net.fabricmc.api.ModInitializer;

import net.space.callofthespace.item.ModItemGroups;
import net.space.callofthespace.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallOfTheSpace implements ModInitializer {
	public static final String MOD_ID =	 "call-of-the-space";
	public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}