package net.adam.dungeonmod.item;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.block.ModBlocks;
import net.adam.dungeonmod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //**Items**//
    public static final Item DUNGEON_CRYSTAL = registerItem("dungeon_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item CRYSTAL = registerItem("crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));
    public static final Item ANCIENT_TOME = registerItem("ancient_tome",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item SKILL = registerItem("skill",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));
    public static final Item DUNGEON_COIN = registerItem("dungeon_coin",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item LOOT_BOX_KEY = registerItem("loot_box_key",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item LEGENDARY_LOOT_BOX_KEY = registerItem("legendary_loot_box_key",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item MYTHICAL_LOOT_BOX_KEY = registerItem("mythical_loot_box_key",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));
    public static final Item ANCIENT_NETHERITE_INGOT = registerItem("ancient_netherite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));

    public static final Item CRYSTAL_INGOT = registerItem("crystal_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item DUNGEON_CHAMPION_CERTIFICATE = registerItem("dungeon_champion_certificate",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON)));


    //**Misc Items**//

    public static final Item ECHO_SIGN = registerItem("echo_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.DUNGEON).maxCount(16),
                    ModBlocks.ECHO_SIGN_BLOCK, ModBlocks.ECHO_WALL_SIGN_BLOCK));

    //**Achievements**//

    public static final Item VOID_COMPASS = registerItem("void_compass",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item CHALLENGE_COMPASS = registerItem("challenge_compass",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));
    public static final Item SHOP = registerItem("shop",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item CARDS = registerItem("cards",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item DUNGEON_COIN_SALE = registerItem("dungeon_coin_sale",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item T1_UPGRADE = registerItem("t1_upgrade",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item T2_UPGRADE = registerItem("t2_upgrade",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item T3_UPGRADE = registerItem("t3_upgrade",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));

    public static final Item T4_UPGRADE = registerItem("t4_upgrade",
            new Item(new FabricItemSettings().group(ModItemGroup.DUNGEON_ADVANCEMENTS)));



    //*Tools*//
    public static final Item ANCIENT_NETHERITE_PICKAXE = registerItem("ancient_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ANCIENT_NETHERITE, 1,-2.8f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));
    public static final Item ANCIENT_NETHERITE_AXE = registerItem("ancient_netherite_axe",
            new ModAxeItem(ModToolMaterials.ANCIENT_NETHERITE, 6,-2.8f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));
    public static final Item ANCIENT_NETHERITE_SHOVEL = registerItem("ancient_netherite_shovel",
            new ShovelItem(ModToolMaterials.ANCIENT_NETHERITE, 2,-3f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));
    public static final Item ANCIENT_NETHERITE_SWORD = registerItem("ancient_netherite_sword",
            new SwordItem(ModToolMaterials.ANCIENT_NETHERITE, 4,-2.2f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));

    public static final Item ANCIENT_NETHERITE_HOE = registerItem("ancient_netherite_hoe",
            new ModHoeItem(ModToolMaterials.ANCIENT_NETHERITE, -5,1f,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON).fireproof()));

//*Armor*//

    public static final Item ANCIENT_NETHERITE_HELMET = registerItem("dungeon_champions_helmet",
            new ArmorItem(ModArmorMaterials.ANCIENT_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON).fireproof()));

    public static final Item ANCIENT_NETHERITE_CHESTPLATE = registerItem("dungeon_champions_chestplate",
            new ArmorItem(ModArmorMaterials.ANCIENT_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON).fireproof()));

    public static final Item ANCIENT_NETHERITE_LEGGINGS = registerItem("dungeon_champions_leggings",
            new ArmorItem(ModArmorMaterials.ANCIENT_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON).fireproof()));

    public static final Item ANCIENT_NETHERITE_BOOTS = registerItem("dungeon_champions_boots",
            new ArmorItem(ModArmorMaterials.ANCIENT_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON).fireproof()));



    public static final Item ANCIENT_DESCENT_BOOTS = registerItem("ancient_descent_boots",
            new ArmorItem(ModArmorMaterials.ANCIENT_DESCENT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item ANCIENT_DESCENT_LEGGINGS = registerItem("ancient_descent_leggings",
            new ArmorItem(ModArmorMaterials.ANCIENT_DESCENT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item ANCIENT_DESCENT_CHESTPLATE = registerItem("ancient_descent_chestplate",
            new ArmorItem(ModArmorMaterials.ANCIENT_DESCENT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    public static final Item ANCIENT_DESCENT_HELMET = registerItem("ancient_descent_helmet",
            new ArmorItem(ModArmorMaterials.ANCIENT_DESCENT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DUNGEON)));

    //*Artifacts*//

    //**Mythical**//
    public static final Item MYTHICAL_ARTIFACT_RUNIC_HAMMER = registerItem("mythical_runic_hammer",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_PLANETARY_CATALYST = registerItem("mythical_planetary_catalyst",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_SCARAB_TALISMAN = registerItem("mythical_scarab_talisman",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));
    public static final Item MYTHICAL_ARTIFACT_GOLDEN_GAUNTLET = registerItem("mythical_golden_gauntlet",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_WARDENS_AXE = registerItem("mythical_wardens_axe",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_STAFF_COIN = registerItem("mythical_staff_coins",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_STAFF_SKILL = registerItem("mythical_staff_skill",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_STAFF_ANCIENTS = registerItem("mythical_staff_ancients",
            new MythicalArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item MYTHICAL_ARTIFACT_TECHNOBLADES_AMULET = registerItem("mythical_technoblades_amulet",
            new TechnoArtifact(new FabricItemSettings().group(ModItemGroup.DUNGEON_ARTIFACTS)));

//**Pickaxe Set**//
    public static final Item COMMON_PICKAXE = registerItem("common_pickaxe",
            new PickaxeArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_PICKAXE = registerItem("rare_pickaxe",
            new PickaxeArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_PICKAXE = registerItem("legendary_pickaxe",
            new PickaxeArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_PICKAXE = registerItem("exotic_pickaxe",
            new PickaxeArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Sword Set**//

    public static final Item COMMON_SWORD = registerItem("common_sword",
            new SwordArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_SWORD = registerItem("rare_sword",
            new SwordArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_SWORD = registerItem("legendary_sword",
            new SwordArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_SWORD = registerItem("exotic_sword",
            new SwordArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Dragon Egg Set**//

    public static final Item COMMON_DRAGON_EGG = registerItem("common_dragon_egg",
            new DragonEggArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_DRAGON_EGG = registerItem("rare_dragon_egg",
            new DragonEggArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_DRAGON_EGG = registerItem("legendary_dragon_egg",
            new DragonEggArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_DRAGON_EGG = registerItem("exotic_dragon_egg",
            new DragonEggArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Demon Set**//

    public static final Item COMMON_DEMON = registerItem("common_demon",
            new DemonArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_DEMON = registerItem("rare_demon",
            new DemonArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_DEMON = registerItem("legendary_demon",
            new DemonArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_DEMON = registerItem("exotic_demon",
            new DemonArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Warden Set**//

    public static final Item COMMON_WARDEN = registerItem("common_warden",
            new WardenArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_WARDEN = registerItem("rare_warden",
            new WardenArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_WARDEN = registerItem("legendary_warden",
            new WardenArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_WARDEN = registerItem("exotic_warden",
            new WardenArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Magic Set**//

    public static final Item COMMON_MAGIC = registerItem("common_magic",
            new MagicArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_MAGIC = registerItem("rare_magic",
            new MagicArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_MAGIC = registerItem("legendary_magic",
            new MagicArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_MAGIC = registerItem("exotic_magic",
            new MagicArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Astral Set**//

    public static final Item COMMON_ASTRAL = registerItem("common_astral",
            new AstralArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_ASTRAL = registerItem("rare_astral",
            new AstralArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_ASTRAL = registerItem("legendary_astral",
            new AstralArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_ASTRAL = registerItem("exotic_astral",
            new AstralArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Void Set**//

    public static final Item COMMON_VOID = registerItem("common_void",
            new VoidArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_VOID = registerItem("rare_void",
            new VoidArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_VOID = registerItem("legendary_void",
            new VoidArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_VOID = registerItem("exotic_void",
            new VoidArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Mystic Set**//

    public static final Item COMMON_MYSTIC = registerItem("common_mystic",
            new MysticArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_MYSTIC = registerItem("rare_mystic",
            new MysticArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_MYSTIC = registerItem("legendary_mystic",
            new MysticArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_MYSTIC = registerItem("exotic_mystic",
            new MysticArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Rune Set**//

    public static final Item COMMON_RUNE = registerItem("common_rune",
            new RuneArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_RUNE = registerItem("rare_rune",
            new RuneArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_RUNE = registerItem("legendary_rune",
            new RuneArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_RUNE = registerItem("exotic_rune",
            new RuneArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Essence Set**//

    public static final Item COMMON_ESSENCE = registerItem("common_essence",
            new EssenceArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_ESSENCE = registerItem("rare_essence",
            new EssenceArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_ESSENCE = registerItem("legendary_essence",
            new EssenceArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_ESSENCE = registerItem("exotic_essence",
            new EssenceArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    //**Gem Set**//

    public static final Item COMMON_GEM = registerItem("common_gem",
            new GemArtifact(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item RARE_GEM = registerItem("rare_gem",
            new GemArtifact(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item LEGENDARY_GEM = registerItem("legendary_gem",
            new GemArtifact(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.DUNGEON_ARTIFACTS)));

    public static final Item EXOTIC_GEM = registerItem("exotic_gem",
            new GemArtifact(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DUNGEON_ARTIFACTS)));


    //**Cards**//

    public static final Item STEALTH_1 = registerItem("stealth_1",
            new StealthItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item STEALTH_2 = registerItem("stealth_2",
            new StealthItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item STEALTH_3 = registerItem("stealth_3",
            new StealthItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item STEALTH_4 = registerItem("stealth_4",
            new StealthItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item RESISTANCE_1 = registerItem("resistance_1",
            new ResistanceItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item RESISTANCE_2 = registerItem("resistance_2",
            new ResistanceItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item RESISTANCE_3 = registerItem("resistance_3",
            new ResistanceItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item RESISTANCE_4= registerItem("resistance_4",
            new ResistanceItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item SPEED_1 = registerItem("speed_1",
            new SpeedItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SPEED_2 = registerItem("speed_2",
            new SpeedItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SPEED_3 = registerItem("speed_3",
            new SpeedItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SPEED_4 = registerItem("speed_4",
            new SpeedItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item LOOT_FINDER_1 = registerItem("loot_finder_1",
            new LootFinderItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item LOOT_FINDER_2 = registerItem("loot_finder_2",
            new LootFinderItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item LOOT_FINDER_3 = registerItem("loot_finder_3",
            new LootFinderItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item LOOT_FINDER_4 = registerItem("loot_finder_4",
            new LootFinderItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item SOUL_SEEKER_1 = registerItem("soul_seeker_1",
            new SoulSeekerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SOUL_SEEKER_2 = registerItem("soul_seeker_2",
            new SoulSeekerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SOUL_SEEKER_3 = registerItem("soul_seeker_3",
            new SoulSeekerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SOUL_SEEKER_4 = registerItem("soul_seeker_4",
            new SoulSeekerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item SCULK_WALKER_1 = registerItem("sculk_walker_1",
            new SculkWalkerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SCULK_WALKER_2 = registerItem("sculk_walker_2",
            new SculkWalkerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SCULK_WALKER_3 = registerItem("sculk_walker_3",
            new SculkWalkerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SCULK_WALKER_4 = registerItem("sculk_walker_4",
            new SculkWalkerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item SKILLER_1 = registerItem("skiller_1",
            new SkillerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SKILLER_2 = registerItem("skiller_2",
            new SkillerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SKILLER_3 = registerItem("skiller_3",
            new SkillerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item SKILLER_4 = registerItem("skiller_4",
            new SkillerItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item BEAST_SENSE_1 = registerItem("beast_sense_1",
            new BeastSenseItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item BEAST_SENSE_2 = registerItem("beast_sense_2",
            new BeastSenseItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item BEAST_SENSE_3 = registerItem("beast_sense_3",
            new BeastSenseItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item BEAST_SENSE_4 = registerItem("beast_sense_4",
            new BeastSenseItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item EQUILIBRIUM_1 = registerItem("equilibrium_1",
            new EquilibriumItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item EQUILIBRIUM_2 = registerItem("equilibrium_2",
            new EquilibriumItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item EQUILIBRIUM_3 = registerItem("equilibrium_3",
            new EquilibriumItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));
    public static final Item EQUILIBRIUM_4 = registerItem("equilibrium_4",
            new EquilibriumItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));

    public static final Item DIMENSIONALIST = registerItem("dimensionalist",
            new DimensionalistItem(new FabricItemSettings().group(ModItemGroup.DUNGEON_CARDS)));




//*Call*//
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DungeonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DungeonMod.LOGGER.debug("Registering Mod items for" + DungeonMod.MOD_ID);
    }
}
