package net.adam.dungeonmod;

import net.adam.dungeonmod.block.ModBlocks;
import net.adam.dungeonmod.block.entity.ModBlockEntities;
import net.adam.dungeonmod.enchantment.ModEnchantment;
import net.adam.dungeonmod.item.ModItems;
import net.adam.dungeonmod.recipe.ModRecipes;
import net.adam.dungeonmod.screen.ModScreenHandlers;
import net.adam.dungeonmod.util.ModLootTableModifiers;
import net.adam.dungeonmod.world.dimension.ModDimensions;
import net.adam.dungeonmod.world.feature.ModConfiguredFeatures;
import net.adam.dungeonmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonMod implements ModInitializer {
	public static final String MOD_ID = "dungeonmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generatedOres();
		ModLootTableModifiers.modifyLootTables();
		ModEnchantment.registerModEnchantment();
		ModDimensions.register();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
	}
}
