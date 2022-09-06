package net.adam.dungeonmod.enchantment;

import net.adam.dungeonmod.DungeonMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantment {
    private static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    public static final Enchantment DUNGEON_CHAMPION = ModEnchantment.register("dungeon_champion_season",  new DungeonEnchant(Enchantment.Rarity.RARE, ALL_ARMOR));
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(DungeonMod.MOD_ID, name), enchantment);

    }

    public static void registerModEnchantment() {
        DungeonMod.LOGGER.debug("Registering ModEnchantment for " + DungeonMod.MOD_ID);
    }


}

