package net.adam.dungeonmod.fluid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.adam.dungeonmod.DungeonMod;
import net.adam.dungeonmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_SOUL_LAVA;
    public static FlowableFluid FLOWING_SOUL_LAVA;
    public static Block SOUL_LAVA_BLOCK;
    public static Item SOUL_LAVA_BUCKET;

    public static void register() {
        STILL_SOUL_LAVA = Registry.register(Registry.FLUID,
                new Identifier(DungeonMod.MOD_ID, "soul_lava"), new SoulLavaFluid.Still());
        FLOWING_SOUL_LAVA = Registry.register(Registry.FLUID,
                new Identifier(DungeonMod.MOD_ID, "flowing_soul_lava"), new SoulLavaFluid.Flowing());

        SOUL_LAVA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(DungeonMod.MOD_ID, "soul_lava_block"),
                new FluidBlock(ModFluids.STILL_SOUL_LAVA, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SOUL_LAVA_BUCKET = Registry.register(Registry.ITEM, new Identifier(DungeonMod.MOD_ID, "soul_lava_bucket"),
                new BucketItem(ModFluids.STILL_SOUL_LAVA, new FabricItemSettings().group(ModItemGroup.DUNGEON).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}