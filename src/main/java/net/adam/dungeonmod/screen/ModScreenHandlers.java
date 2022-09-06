package net.adam.dungeonmod.screen;

import net.adam.dungeonmod.DungeonMod;

import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandlers {
    public static ScreenHandlerType<ArtifactTransmuterScreenHandler> ARTIFACT_TRANSMUTER_SCREEN_HANDLER =
            new ScreenHandlerType<>(ArtifactTransmuterScreenHandler::new);

    public static void registerAllScreenHandlers() {
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(DungeonMod.MOD_ID),
                ARTIFACT_TRANSMUTER_SCREEN_HANDLER);
    }
}