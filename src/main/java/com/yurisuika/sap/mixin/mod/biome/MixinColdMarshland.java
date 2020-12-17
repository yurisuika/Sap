package com.yurisuika.sap.mixin.mod.biome;

import net.minecraft.world.biome.Biome;
import com.terraforged.mod.biome.ColdMarshland;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ColdMarshland.class)
public class MixinColdMarshland extends Biome {
    protected MixinColdMarshland(Builder biomeBuilder) {
        super(biomeBuilder);
    }

    /**
     * @author
     * Sap
     * @reason
     * Cold Marshland Grass Color
     */
    @OnlyIn(Dist.CLIENT)
    @Overwrite()
    public int getGrassColor(double posX, double posZ) {
        double d0 = INFO_NOISE.noiseAt(posX * 0.0225D, posZ * 0.0225D, false);
        return d0 < -0.1D ? 8091470 : 8223310;
    }

}
