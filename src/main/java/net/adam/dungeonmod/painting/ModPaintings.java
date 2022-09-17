package net.adam.dungeonmod.painting;

import net.adam.dungeonmod.DungeonMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant SAM = registerPainting("sam", new PaintingVariant(32, 48));
    public static final PaintingVariant RAVAGER_RUN = registerPainting("ravager_run", new PaintingVariant(48, 64));
    public static final PaintingVariant THE_DUNGEON = registerPainting("the_dungeon", new PaintingVariant(64, 64));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(DungeonMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        DungeonMod.LOGGER.debug("Registering Paintings for" + DungeonMod.MOD_ID);
    }
}
