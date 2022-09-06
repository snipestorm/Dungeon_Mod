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

public class SoulSeekerItem extends Item {
    public SoulSeekerItem(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Punch Out The Soul Flames,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("To Increase Your Card Rewards.").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("More Ranks Of Soul Seeker,").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("Means More Flames To Punch Out.").formatted(Formatting.GOLD));
            super.appendTooltip(stack, world, tooltip, context);
        } else tooltip.add(Text.literal("Soul Flames Will Light In The Dungeon,").formatted(Formatting.AQUA));
                tooltip.add(Text.literal("Press Shift For More Info.").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
