package net.adam.dungeonmod.world.feature;


import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> CRYSTAL_ORES =List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE =
            ConfiguredFeatures.register("crystal_ore", Feature.ORE, new OreFeatureConfig(CRYSTAL_ORES, 5));


    public static void registerConfiguredFeatures() {
        DungeonMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + DungeonMod.MOD_ID);
    }
}
