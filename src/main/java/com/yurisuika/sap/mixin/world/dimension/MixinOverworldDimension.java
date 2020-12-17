package com.yurisuika.sap.mixin.world.dimension;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.dimension.OverworldDimension;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OverworldDimension.class)
public class MixinOverworldDimension {

    /**
     * @author
     * Sap
     * @reason
     * Fog Color
     */
    //@Overwrite()
    //@OnlyIn(Dist.CLIENT)
    //public Vec3d getFogColor(float celestialAngle, float partialTicks) {
    //    float f = MathHelper.cos(celestialAngle * 6.2831855F) * 2.0F + 0.5F;
    //    f = MathHelper.clamp(f, 0.0F, 1.0F);
    //    float f1 = 0.78823529F;
    //    float f2 = 0.83921568F;
    //    float f3 = 0.87843137F;
    //    f1 *= f * 0.94F + 0.06F;
    //    f2 *= f * 0.94F + 0.06F;
    //    f3 *= f * 0.91F + 0.09F;
    //    return new Vec3d((double)f1, (double)f2, (double)f3);
    //}

}
