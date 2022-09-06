package net.adam.dungeonmod.util;

import net.adam.dungeonmod.DungeonMod;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public  class ModTags {

    public static class Blocks {
        public static final TagKey<Block> RITUAL_FIRE_BASE_BLOCKS = createTag("ritual_fire_base_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(DungeonMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }
}
