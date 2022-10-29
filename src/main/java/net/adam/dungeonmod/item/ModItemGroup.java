package net.adam.dungeonmod.item;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DUNGEON = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon"),() -> new ItemStack(ModItems.DUNGEON_CRYSTAL));

    public static final ItemGroup DUNGEON_ORES = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon_ores"),() -> new ItemStack(ModBlocks.DEEPSLATE_CRYSTAL_ORE));

    public static final ItemGroup DUNGEON_SCULK = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon_sculk"),() -> new ItemStack(ModBlocks.SCULK_STONE));

    public static final ItemGroup DUNGEON_CARDS = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon_cards"),() -> new ItemStack(ModItems.DIMENSIONALIST));

    public static final ItemGroup DUNGEON_ARTIFACTS = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon_artifacts"),() -> new ItemStack(ModItems.MYTHICAL_ARTIFACT_GOLDEN_GAUNTLET));

    public static final ItemGroup DUNGEON_ADVANCEMENTS = FabricItemGroupBuilder.build(
            new Identifier(DungeonMod.MOD_ID,"dungeon_advancements"),() -> new ItemStack(ModItems.SHOP));

}
