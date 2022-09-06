package net.adam.dungeonmod.recipe;

import net.adam.dungeonmod.DungeonMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(DungeonMod.MOD_ID, ArtifactTransmuterRecipe.Serializer.ID),
                ArtifactTransmuterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(DungeonMod.MOD_ID, ArtifactTransmuterRecipe.Type.ID),
                ArtifactTransmuterRecipe.Type.INSTANCE);
    }
}
