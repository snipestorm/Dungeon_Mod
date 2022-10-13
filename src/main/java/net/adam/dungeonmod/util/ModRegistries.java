package net.adam.dungeonmod.util;

import net.adam.dungeonmod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

    public class ModRegistries {
        public static void registerModStuffs() {
            registerStrippables();
            registerFlammableBlock();
        }

        private static void registerStrippables() {
            StrippableBlockRegistry.register(ModBlocks.ECHO_LOG, ModBlocks.STRIPPED_ECHO_LOG);
            StrippableBlockRegistry.register(ModBlocks.ECHO_WOOD, ModBlocks.STRIPPED_ECHO_WOOD);
        }

        private static void registerFlammableBlock() {
            FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

            instance.add(ModBlocks.ECHO_LOG, 5, 5);
            instance.add(ModBlocks.STRIPPED_ECHO_LOG, 5, 5);
            instance.add(ModBlocks.ECHO_WOOD, 5, 5);
            instance.add(ModBlocks.STRIPPED_ECHO_WOOD, 5, 5);
            instance.add(ModBlocks.ECHO_PLANKS, 5, 20);
            instance.add(ModBlocks.ECHO_LEAVES, 30, 60);
        }

    }

