package net.adam.dungeonmod.world.feature;


import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> CRYSTAL_ORES =List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE =
            ConfiguredFeatures.register("crystal_ore", Feature.ORE, new OreFeatureConfig(CRYSTAL_ORES, 5));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ECHO_TREE =
            ConfiguredFeatures.register("echo_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ECHO_LOG),
                    new StraightTrunkPlacer(4, 2, 0),
                    BlockStateProvider.of(ModBlocks.ECHO_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LARGE_ECHO_TREE =
            ConfiguredFeatures.register("large_echo_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ECHO_LOG),
                    new LargeOakTrunkPlacer(3, 11, 0),
                    BlockStateProvider.of(ModBlocks.ECHO_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).build());

    public static final RegistryEntry<PlacedFeature> ECHO_CHECKED = PlacedFeatures.register("echo_checked",
            ModConfiguredFeatures.ECHO_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.ECHO_SAPLING)));

    public static final RegistryEntry<PlacedFeature> ECHO_CHECKED_2 = PlacedFeatures.register("echo_checked_2",
            ModConfiguredFeatures.LARGE_ECHO_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.ECHO_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ECHO_SPAWN =
            ConfiguredFeatures.register("echo_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ECHO_CHECKED, 0.5f)),
                            ECHO_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ECHO_SPAWN_2 =
            ConfiguredFeatures.register("echo_spawn_2", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ECHO_CHECKED_2, 0.5f)),
                            ECHO_CHECKED_2));


    public static void registerConfiguredFeatures() {
        DungeonMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + DungeonMod.MOD_ID);
    }
}
