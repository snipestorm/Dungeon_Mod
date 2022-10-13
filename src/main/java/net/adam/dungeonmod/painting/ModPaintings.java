package net.adam.dungeonmod.painting;

import net.adam.dungeonmod.DungeonMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant SAM = registerPainting("sam", new PaintingVariant(32, 48));
    public static final PaintingVariant RAVAGER_RUN = registerPainting("ravager_run", new PaintingVariant(48, 64));
    public static final PaintingVariant DUNGEON_MASTER = registerPainting("dungeon_master", new PaintingVariant(48, 64));
    public static final PaintingVariant DUNGEON_EXPLORE = registerPainting("dungeon_explore", new PaintingVariant(48, 64));
    public static final PaintingVariant THE_DUNGEON = registerPainting("the_dungeon", new PaintingVariant(64, 64));
    public static final PaintingVariant RULES = registerPainting("rules", new PaintingVariant(64, 48));
    public static final PaintingVariant WARDEN = registerPainting("warden", new PaintingVariant(64, 48));
    public static final PaintingVariant DARK = registerPainting("dark", new PaintingVariant(32, 64));
    public static final PaintingVariant HARRISON = registerPainting("harrison", new PaintingVariant(48, 48));
    public static final PaintingVariant ADAM = registerPainting("adam", new PaintingVariant(64, 32));
    public static final PaintingVariant CHAMP1 = registerPainting("champ1", new PaintingVariant(64, 64));
    public static final PaintingVariant CHAMP2 = registerPainting("champ2", new PaintingVariant(64, 64));
    public static final PaintingVariant TREE = registerPainting("tree", new PaintingVariant(64, 64));
    public static final PaintingVariant DECKED_OUT = registerPainting("decked_out", new PaintingVariant(64, 64));
    public static final PaintingVariant CARDS = registerPainting("cards", new PaintingVariant(48, 64));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(DungeonMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        DungeonMod.LOGGER.debug("Registering Paintings for" + DungeonMod.MOD_ID);
    }
}
