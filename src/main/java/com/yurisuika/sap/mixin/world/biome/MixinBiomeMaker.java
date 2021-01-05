package com.yurisuika.sap.mixin.world.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BiomeMaker.class)
public class MixinBiomeMaker {

    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }

    /**
     * @author
     * Sap
     * @reason
     * Dark Forest Color
     */
    @Overwrite()
    public static Biome makeDarkForestBiome(float depth, float scale, boolean isHillsVariant) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
        net.minecraft.world.biome.BiomeGenerationSettings.Builder biomegenerationsettings$builder = (new net.minecraft.world.biome.BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);
        biomegenerationsettings$builder.withStructure(StructureFeatures.MANSION);
        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, isHillsVariant ? Features.DARK_FOREST_VEGETATION_RED : Features.DARK_FOREST_VEGETATION_BROWN);
        DefaultBiomeFeatures.withAllForestFlowerGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDefaultFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withForestGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);
        return (new net.minecraft.world.biome.Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale).temperature(0.7F).downfall(0.8F).setEffects((new net.minecraft.world.biome.BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(getSkyColorWithTemperatureModifier(0.7F)).withGrassColorModifier(BiomeAmbience.GrassColorModifier.NONE).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(mobspawninfo$builder.copy()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

    /**
     * @author
     * Sap
     * @reason
     * Swamp Color
     */
    @Overwrite()
    public static Biome makeGenericSwampBiome(float depth, float scale, boolean isHillsVariant) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
        mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 1, 1, 1));
        net.minecraft.world.biome.BiomeGenerationSettings.Builder biomegenerationsettings$builder = (new net.minecraft.world.biome.BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244189_u);
        if (!isHillsVariant) {
            biomegenerationsettings$builder.withStructure(StructureFeatures.SWAMP_HUT);
        }

        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_SWAMP);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        if (!isHillsVariant) {
            DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
        }

        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSwampVegetation(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSwampSugarcaneAndPumpkin(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        if (isHillsVariant) {
            DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
        } else {
            biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_SWAMP);
        }

        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);
        return (new net.minecraft.world.biome.Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.SWAMP).depth(depth).scale(scale).temperature(0.8F).downfall(0.9F).setEffects((new net.minecraft.world.biome.BiomeAmbience.Builder()).setWaterColor(6388580).setWaterFogColor(2302743).setFogColor(12638463).withSkyColor(getSkyColorWithTemperatureModifier(0.8F)).withFoliageColor(6710843).withGrassColor(8223310).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(mobspawninfo$builder.copy()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

}
