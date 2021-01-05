package com.yurisuika.sap.mixin.world.biome;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Biome.class)
public class MixinBiome {

    @Final
    private float temperature;
    private int waterColor;
    private int waterFogColor;

    /**
     * @author
     * Sap
     * @reason
     * Swamp Grass Color
     */
    //@Overwrite()
    //private int calculateSkyColor() {
    //    float f = this.temperature;
    //    f /= 3.0F;
    //    f = MathHelper.clamp(f, -1.0F, 1.0F);
    //    return MathHelper.hsvToRGB(0.5805F - f * 0.05F, 0.2F + f * 0.1F, 0.89F);
    //}

    /**
     * @author
     * Sap
     * @reason
     * Water Color
     */
    @OnlyIn(Dist.CLIENT)
    @Overwrite()
    public final int getWaterColor() {
        return 16777215;
    }

    /**
     * @author
     * Sap
     * @reason
     * Water Fog Color
     */
    @OnlyIn(Dist.CLIENT)
    @Overwrite()
    public final int getWaterFogColor() {
        return 9609378;
    }
}
