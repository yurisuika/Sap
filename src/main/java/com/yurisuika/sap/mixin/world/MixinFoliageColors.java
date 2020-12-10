package com.yurisuika.sap.mixin.world;

import net.minecraft.world.FoliageColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoliageColors.class)
public class MixinFoliageColors {

    /**
     * @author
     * Sap
     * @reason
     * Spruce Color
     */
    @Overwrite()
    public static int getSpruce() {
        return 6977367;
    }

    /**
     * @author
     * Sap
     * @reason
     * Birch Color
     */
    @Overwrite()
    public static int getBirch() {
        return 9082990;
    }

    /**
     * @author
     * Sap
     * @reason
     * Default Color
     */
    @Overwrite()
    public static int getDefault() { return 7700309; }

}
