package net.adam.dungeonmod.world.dimension;

import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> DUNGEON_SHOP_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(DungeonMod.MOD_ID,"dungeon_shop"));
    public static final RegistryKey<DimensionType> DUNGEON_SHOP_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DUNGEON_SHOP_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> DUNGEON_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(DungeonMod.MOD_ID,"dungeon"));
    public static final RegistryKey<DimensionType> DUNGEON_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DUNGEON_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> DUNGEON_DIMENSIONALIST_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(DungeonMod.MOD_ID,"dungeon_dimensionalist"));
    public static final RegistryKey<DimensionType> DUNGEON_DIMENSIONALIST_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DUNGEON_DIMENSIONALIST_DIMENSION_KEY.getValue());


    public static void register() {
        DungeonMod.LOGGER.debug("Registering ModDimensions for" + DungeonMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.GILDED_BLACKSTONE)
                .destDimID(DUNGEON_DIMENSION_KEY.getValue())
                .tintColor(255,215, 0)
                .lightWithItem(ModItems.ANCIENT_TOME)
                .onlyLightInOverworld()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.POLISHED_BLACKSTONE)
                .destDimID(DUNGEON_SHOP_DIMENSION_KEY.getValue())
                .returnDim(DUNGEON_DIMENSION_KEY.getValue(),true)
                .tintColor(0,206, 209)
                .lightWithItem(ModItems.DUNGEON_COIN)
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.GOLD_BLOCK)
                .destDimID(DUNGEON_DIMENSIONALIST_DIMENSION_KEY.getValue())
                .returnDim(DUNGEON_DIMENSION_KEY.getValue(),true)
                .tintColor(220,20, 60)
                .lightWithItem(ModItems.DUNGEON_CRYSTAL)
                .registerPortal();

    }

}
