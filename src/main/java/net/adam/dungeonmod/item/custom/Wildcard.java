package net.adam.dungeonmod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Wildcard extends Item {

    public Wildcard(Settings settings) {
        super(settings);
    }




    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("This Wildcard Can Replace,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("Any Artifact,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("Of The Same Rarity,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("When Handing In A Set.").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("You Can Only Use,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("One Wildcard Per Set.").formatted(Formatting.GOLD));
            super.appendTooltip(stack, world, tooltip, context);
        } else tooltip.add(Text.literal("Wildcard!,").formatted(Formatting.AQUA));
        tooltip.add(Text.literal("Press Shift For More Info.").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}