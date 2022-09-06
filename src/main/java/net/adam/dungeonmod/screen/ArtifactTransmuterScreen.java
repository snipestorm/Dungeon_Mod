package net.adam.dungeonmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.adam.dungeonmod.DungeonMod;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ArtifactTransmuterScreen extends HandledScreen<ArtifactTransmuterScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(DungeonMod.MOD_ID, "textures/gui/artifact_transmuter_gui.png");
    public static final int[] BUBBLE_PROGRESS = new int[]{176, 182, 187, 192, 196, 200, 203};

    public ArtifactTransmuterScreen(ArtifactTransmuterScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (this.width - this.backgroundWidth) / 2;
        int y = (this.height- this.backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, this.backgroundWidth, this.backgroundHeight);

        if (handler.isCrafting()) {
            int m = (this.handler).getTransmuteTime();
              int n = BUBBLE_PROGRESS[m / 2 % 7];
                if (m > 0) {
                    drawTexture(matrices, x + 75, y + 50, 176, 0 , m, 10);


                }
            }
        }
    }

