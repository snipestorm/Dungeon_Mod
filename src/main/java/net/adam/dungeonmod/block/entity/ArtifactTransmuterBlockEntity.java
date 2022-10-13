package net.adam.dungeonmod.block.entity;


import net.adam.dungeonmod.recipe.ArtifactTransmuterRecipe;
import net.adam.dungeonmod.screen.ArtifactTransmuterScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ArtifactTransmuterBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 300;


    public ArtifactTransmuterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ARTIFACT_TRANSMUTER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0:
                        return ArtifactTransmuterBlockEntity.this.progress;
                    case 1:
                        return ArtifactTransmuterBlockEntity.this.maxProgress;
                    default:
                        return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        ArtifactTransmuterBlockEntity.this.progress = value;
                        break;
                    case 1:
                        ArtifactTransmuterBlockEntity.this.maxProgress = value;
                        break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    /**
     * Gets the item list of this inventory.
     * Must return the same instance every time it's called.
     *
     * @return the item list
     */
    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("☠ Artifact Transmuter ☠");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ArtifactTransmuterScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("artifact_transmuter.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("artifact_transmuter.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, ArtifactTransmuterBlockEntity entity) {
        if (world.isClient()) {
            return;
        }

        if (hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if (entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }

        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }

    }

    private static void craftItem(ArtifactTransmuterBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<ArtifactTransmuterRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(ArtifactTransmuterRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {
            entity.removeStack(0, 1);

            entity.setStack(1, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(1).getCount() + recipe.get().getOutput().getCount()));

            entity.setStack(2, new ItemStack(recipe.get().getOutput2().getItem(),
                    entity.getStack(2).getCount() + recipe.get().getOutput2().getCount()));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(ArtifactTransmuterBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<ArtifactTransmuterRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(ArtifactTransmuterRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory) && canInsertAmountIntoOutputSlot2(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem())
                && canInsertItemIntoOutputSlot2(inventory, match.get().getOutput2().getItem());

    }


    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(1).getItem() == output || inventory.getStack(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount();
    }

    private static boolean canInsertItemIntoOutputSlot2(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot2(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }



}

