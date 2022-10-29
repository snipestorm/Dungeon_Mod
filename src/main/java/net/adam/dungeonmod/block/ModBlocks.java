package net.adam.dungeonmod.block;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.custom.AncientLampBlock;
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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block CRYSTAL_BLOCK = registerBlock("crystal_block",
    new Block(FabricBlockSettings.of(Material.METAL).strength(4f,4f).requiresTool()), ModItemGroup.DUNGEON);

    public static final Block ANCIENT_NETHERITE_BLOCK = registerBlock("ancient_netherite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f,8f).requiresTool()), ModItemGroup.DUNGEON);

    public static final Block SCULK_STONE = registerBlock("sculk_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block COBBLED_SCULK_STONE = registerBlock("cobbled_sculk_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block POLISHED_SCULK_STONE = registerBlock("polished_sculk_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_BRICKS = registerBlock("sculk_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block INFESTED_SCULK = registerBlock("infested_sculk",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_SCULK);

    public static final Block ECHO_SOIL = registerBlock("echo_soil",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON);

    public static final Block SCULK_GLEAM = registerBlock("sculk_gleam",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15)), ModItemGroup.DUNGEON);



    public static final Block SCULK_STONE_STAIRS = registerBlock("sculk_stone_stairs",
            new StairsBlock(ModBlocks.SCULK_STONE.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_SLAB = registerBlock("sculk_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_WALL= registerBlock("sculk_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_BRICK_STAIRS = registerBlock("sculk_stone_brick_stairs",
            new StairsBlock(ModBlocks.SCULK_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_BRICK_SLAB = registerBlock("sculk_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block SCULK_STONE_BRICK_WALL= registerBlock("sculk_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block COBBLED_SCULK_STONE_STAIRS = registerBlock("cobbled_sculk_stone_stairs",
            new StairsBlock(ModBlocks.COBBLED_SCULK_STONE.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block COBBLED_SCULK_STONE_SLAB = registerBlock("cobbled_sculk_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block COBBLED_SCULK_STONE_WALL= registerBlock("cobbled_sculk_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block POLISHED_SCULK_STONE_STAIRS = registerBlock("polished_sculk_stone_stairs",
            new StairsBlock(ModBlocks.POLISHED_SCULK_STONE.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block POLISHED_SCULK_STONE_SLAB = registerBlock("polished_sculk_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    public static final Block POLISHED_SCULK_STONE_WALL= registerBlock("polished_sculk_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(1.5f,6f).requiresTool()), ModItemGroup.DUNGEON_SCULK);

    //**ORES**//

    public static final Block CRYSTAL_ORE = registerBlock("crystal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f,3f).requiresTool()), ModItemGroup.DUNGEON_ORES);
    public static final Block DEEPSLATE_CRYSTAL_ORE = registerBlock("deepslate_crystal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f,3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_CRYSTAL_ORE = registerBlock("sculk_stone_crystal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_COAL_ORE = registerBlock("sculk_stone_coal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_COPPER_ORE = registerBlock("sculk_stone_copper_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_DIAMOND_ORE = registerBlock("sculk_stone_diamond_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_EMERALD_ORE = registerBlock("sculk_stone_emerald_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_GOLD_ORE = registerBlock("sculk_stone_gold_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_IRON_ORE = registerBlock("sculk_stone_iron_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_LAPIS_ORE = registerBlock("sculk_stone_lapis_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);

    public static final Block SCULK_STONE_REDSTONE_ORE = registerBlock("sculk_stone_redstone_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f,6f).requiresTool().sounds(BlockSoundGroup.SCULK)), ModItemGroup.DUNGEON_ORES);





    //**Door**//

    public static final Block DOOR_TL = registerBlock("door_tl",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_TM = registerBlock("door_tm",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_TR = registerBlock("door_tr",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_ML = registerBlock("door_ml",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_M = registerBlock("door_m",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_MR = registerBlock("door_mr",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_BL = registerBlock("door_bl",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_BM = registerBlock("door_bm",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);

    public static final Block DOOR_BR = registerBlock("door_br",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.DUNGEON);


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

    public static final Block POTTED_ECHO_SAPLING = registerBlockWithoutItem("potted_echo_sapling",
            new FlowerPotBlock(ModBlocks.ECHO_SAPLING,FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

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


    public static final Block ANCIENT_LAMP = registerBlock("ancient_lamp",
            new AncientLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(state -> state.get(AncientLampBlock.LIT) ? 10 : 0).strength(0.3F).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DUNGEON);

    public static final Block RED_LAMP = registerBlock("red_lamp",
            new AncientLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(state -> state.get(AncientLampBlock.LIT) ? 15 : 0).strength(0.3F).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DUNGEON);

    public static final Block BLUE_LAMP = registerBlock("blue_lamp",
            new AncientLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(state -> state.get(AncientLampBlock.LIT) ? 15 : 0).strength(0.3F).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DUNGEON);








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
