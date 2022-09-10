package net.adam.dungeonmod;
import net.adam.dungeonmod.fluid.ModFluids;
import net.adam.dungeonmod.screen.ArtifactTransmuterScreen;
import net.adam.dungeonmod.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class DungeonModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ARTIFACT_TRANSMUTER_SCREEN_HANDLER, ArtifactTransmuterScreen::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOUL_LAVA, ModFluids.FLOWING_SOUL_LAVA,
                new SimpleFluidRenderHandler(
                        new Identifier("dungeonmod:block/soul_lava_still"),
                        new Identifier("dungeonmod:block/soul_lava_flow")

                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SOUL_LAVA, ModFluids.FLOWING_SOUL_LAVA);



    }
}
