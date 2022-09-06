package net.adam.dungeonmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class DungeonEnchant
extends Enchantment {
    protected DungeonEnchant(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight,EnchantmentTarget.ARMOR, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return level;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level);
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }
   }
