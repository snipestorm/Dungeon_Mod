package net.adam.dungeonmod.mixin;


import net.adam.dungeonmod.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class ModEntityDataSaver implements IEntityDataSaver {
    private NbtCompound persistantData;

    @Override
    public NbtCompound getPersistentData() {
     if(this.persistantData == null) {
         this.persistantData = new NbtCompound();
     }
     return persistantData;
    }


    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable info) {
        if(persistantData != null) {
            nbt.put("dungeonmod.adam_data", persistantData);
        }
    }
    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if (nbt.contains("dungeonmod.adam_data", 10)) {
            persistantData = nbt.getCompound("dungeonmod.adam_data");
        }
    }
}
