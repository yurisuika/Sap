package com.yurisuika.sap.mixin.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SwampBiome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SwampBiome.class)
public class MixinSwampBiome extends Biome {
    protected MixinSwampBiome(Builder biomeBuilder) {
        super(biomeBuilder);
    }

    /**
     * @author
     * Sap
     * @reason
     * Swamp Grass Color
     */
    @OnlyIn(Dist.CLIENT)
    @Overwrite()
    public int getGrassColor(double posX, double posZ) {
        double d0 = INFO_NOISE.noiseAt(posX * 0.0225D, posZ * 0.0225D, false);
        return d0 < -0.1D ? 8091470 : 8223310;
    }

    /**
     * @author
     * Sap
     * @reason
     * Swamp Foliage Color
     */
    @OnlyIn(Dist.CLIENT)
    @Overwrite()
    public int getFoliageColor() {
        return 6710843;
    }

}
