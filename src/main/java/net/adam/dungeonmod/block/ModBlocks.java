package net.adam.dungeonmod.block;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.custom.ArtifactTransmuterBlock;
import net.adam.dungeonmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block CRYSTAL_BLOCK = registerBlock("crystal_block",
    new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.DUNGEON);

    public static final Block ANCIENT_NETHERITE_BLOCK = registerBlock("ancient_netherite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool()), ModItemGroup.DUNGEON);
    public static final Block CRYSTAL_ORE = registerBlock("crystal_ore",
    new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.DUNGEON);
    public static final Block DEEPSLATE_CRYSTAL_ORE = registerBlock("deepslate_crystal_ore",
    new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.DUNGEON);

    public static final Block ARTIFACT_TRANSMUTER = registerBlock("artifact_transmuter",
            new ArtifactTransmuterBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(6f).requiresTool().nonOpaque()), ModItemGroup.DUNGEON);








    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DungeonMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(DungeonMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(DungeonMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        DungeonMod.LOGGER.debug("Registering ModBlocks for " + DungeonMod.MOD_ID);
    }
}
