package net.adam.dungeonmod.block;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.custom.ArtifactTransmuterBlock;

import net.adam.dungeonmod.block.entity.ModSignTypes;
import net.adam.dungeonmod.item.ModItemGroup;

import net.adam.dungeonmod.world.feature.tree.EchoSaplingGenerator;
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

    //**WOOD**//

    public static final Block ECHO_LOG = registerBlock("echo_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_WOOD = registerBlock("echo_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block STRIPPED_ECHO_LOG = registerBlock("stripped_echo_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block STRIPPED_ECHO_WOOD = registerBlock("stripped_echo_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_PLANKS = registerBlock("echo_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_LEAVES = registerBlock("echo_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.DUNGEON);

    public static final Block ECHO_SAPLING = registerBlock("echo_sapling",
            new SaplingBlock(new EchoSaplingGenerator(),FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.DUNGEON);

    public static final Block ECHO_DOOR = registerBlock("echo_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_TRAPDOOR = registerBlock("echo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_STAIRS = registerBlock("echo_stairs",
            new StairsBlock(ModBlocks.ECHO_PLANKS.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.OAK_STAIRS).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_SLAB = registerBlock("echo_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_WALL= registerBlock("echo_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_FENCE = registerBlock("echo_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_FENCE_GATE = registerBlock("echo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_BUTTON = registerBlock("echo_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision().strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_PRESSURE_PLATE = registerBlock("echo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2f)), ModItemGroup.DUNGEON);

    public static final Block ECHO_WALL_SIGN_BLOCK = registerBlockWithoutItem("echo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN).strength(2f),ModSignTypes.ECHO));

    public static final Block ECHO_SIGN_BLOCK = registerBlockWithoutItem("echo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN).strength(2f),ModSignTypes.ECHO));




    //**Block Entity**//
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
