package net.adam.dungeonmod;

import net.adam.dungeonmod.block.ModBlocks;
import net.adam.dungeonmod.screen.ArtifactTransmuterScreen;
import net.adam.dungeonmod.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class DungeonModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ARTIFACT_TRANSMUTER_SCREEN_HANDLER, ArtifactTransmuterScreen::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_DOOR,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_TRAPDOOR,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_SAPLING,RenderLayer.getCutout());



    }
}
