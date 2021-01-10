package com.yurisuika.sap.mixin.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DarkForestBiome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DarkForestBiome.class)
public class MixinDarkForestBiome extends Biome {
    protected MixinDarkForestBiome(Builder biomeBuilder) {
        super(biomeBuilder);
    }

    /**
     * @author
     * Sap
     * @reason
     * Swamp Grass Color
     */
    @Overwrite()
    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(double posX, double posZ) {
        int i = super.getGrassColor(posX, posZ);
        return i;
    }

}