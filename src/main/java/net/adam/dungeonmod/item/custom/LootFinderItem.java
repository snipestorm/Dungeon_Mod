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

public class LootFinderItem extends Item {
    public LootFinderItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("The Higher Your Loot Finder Rank,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("The More Coins You Will Find.").formatted(Formatting.GOLD));
            super.appendTooltip(stack, world, tooltip, context);
        } else tooltip.add(Text.literal("Coins Will Generate Inside Barrels,").formatted(Formatting.AQUA));
        tooltip.add(Text.literal("Press Shift For More Info.").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
