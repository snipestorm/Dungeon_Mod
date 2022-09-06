package net.adam.dungeonmod.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class ArtifactTransmuterRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    private final ItemStack output2;
    private final DefaultedList<Ingredient> recipeItems;



    public ArtifactTransmuterRecipe(Identifier id, ItemStack output, ItemStack output2, DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.output2 = output2;
        this.recipeItems = recipeItems;

    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) {
            return false;
        }

        return recipeItems.get(0).test(inventory.getStack(0));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return output.copy();
    }

    public ItemStack getOutput2() {

        return output2.copy();
    }
    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ArtifactTransmuterRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "artifact_transmuting";
    }

    public static class Serializer implements RecipeSerializer<ArtifactTransmuterRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "artifact_transmuting";
        // this is the name given in the json file

        @Override
        public ArtifactTransmuterRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));
            ItemStack output2 = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output2"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(1, Ingredient.EMPTY);


            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new ArtifactTransmuterRecipe(id, output, output2, inputs);
        }

        @Override
        public ArtifactTransmuterRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            ItemStack output2 = buf.readItemStack();

            return new ArtifactTransmuterRecipe(id, output, output2, inputs);
        }

        @Override
        public void write(PacketByteBuf buf, ArtifactTransmuterRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput());
        }
    }
}