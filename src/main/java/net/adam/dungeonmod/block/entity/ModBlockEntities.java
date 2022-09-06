package net.adam.dungeonmod.block.entity;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<ArtifactTransmuterBlockEntity> ARTIFACT_TRANSMUTER;

    public static void registerBlockEntities() {
        ARTIFACT_TRANSMUTER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(DungeonMod.MOD_ID, "artifact_transmuter"),
                FabricBlockEntityTypeBuilder.create(ArtifactTransmuterBlockEntity::new,
                        ModBlocks.ARTIFACT_TRANSMUTER).build(null));

    }
}
