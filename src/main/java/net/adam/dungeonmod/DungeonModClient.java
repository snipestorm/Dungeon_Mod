package net.adam.dungeonmod;
import net.adam.dungeonmod.screen.ArtifactTransmuterScreen;
import net.adam.dungeonmod.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class DungeonModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ARTIFACT_TRANSMUTER_SCREEN_HANDLER, ArtifactTransmuterScreen::new);


    }
}
