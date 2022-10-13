package net.adam.dungeonmod.block.entity;

import net.adam.dungeonmod.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType ECHO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("echo"));
}
