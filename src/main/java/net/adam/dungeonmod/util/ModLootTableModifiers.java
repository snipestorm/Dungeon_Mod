package net.adam.dungeonmod.util;

import net.adam.dungeonmod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
        private static final Identifier END_TREASURE_CHEST_ID
                = new Identifier("minecraft", "chests/end_city_treasure");

        public static void modifyLootTables() {
            LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

                if(END_TREASURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.08f)) // Drops 8% of the time
                            .with(ItemEntry.builder(ModItems.ANCIENT_NETHERITE_INGOT.asItem()))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(END_TREASURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.02f)) // Drops 2% of the time
                            .with(ItemEntry.builder(ModItems.ANCIENT_NETHERITE_PICKAXE.asItem()))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(END_TREASURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.03f)) // Drops 3% of the time
                            .with(ItemEntry.builder(ModItems.ANCIENT_NETHERITE_SHOVEL.asItem()))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(END_TREASURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.03f)) // Drops 3% of the time
                            .with(ItemEntry.builder(ModItems.ANCIENT_NETHERITE_SWORD.asItem()))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(END_TREASURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.02f)) // Drops 2% of the time
                            .with(ItemEntry.builder(ModItems.ANCIENT_NETHERITE_AXE.asItem()))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            });
        }
}





