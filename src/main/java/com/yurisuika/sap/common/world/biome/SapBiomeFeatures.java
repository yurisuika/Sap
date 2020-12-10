package com.yurisuika.sap.common.world.biome;

import java.util.List;

import com.yurisuika.sap.core.registry.SapBlocks;
import com.yurisuika.sap.core.registry.SapFeatures;
import com.google.common.collect.ImmutableList;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.SeaGrassConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.TwoFeatureChoiceConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.HeightWithChanceConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraftforge.fml.ModList;

public class SapBiomeFeatures {
	public static BlockState ALDER_LOG = SapBlocks.ALDER_LOG.get().getDefaultState();
	public static BlockState ALDER_LEAVES = SapBlocks.ALDER_LEAVES.get().getDefaultState();

	public static BlockState ALMOND_LOG = SapBlocks.ALMOND_LOG.get().getDefaultState();
	public static BlockState ALMOND_LEAVES = SapBlocks.ALMOND_LEAVES.get().getDefaultState();

	public static BlockState APPLE_LOG = SapBlocks.APPLE_LOG.get().getDefaultState();
	public static BlockState APPLE_LEAVES = SapBlocks.APPLE_LEAVES.get().getDefaultState();

	public static BlockState APRICOT_LOG = SapBlocks.APRICOT_LOG.get().getDefaultState();
	public static BlockState APRICOT_LEAVES = SapBlocks.APRICOT_LEAVES.get().getDefaultState();

	public static BlockState ASH_LOG = SapBlocks.ASH_LOG.get().getDefaultState();
	public static BlockState ASH_LEAVES = SapBlocks.ASH_LEAVES.get().getDefaultState();

	public static BlockState ASPEN_LOG = SapBlocks.ASPEN_LOG.get().getDefaultState();
	public static BlockState ASPEN_LEAVES = SapBlocks.ASPEN_LEAVES.get().getDefaultState();

	public static BlockState AVOCADO_LOG = SapBlocks.AVOCADO_LOG.get().getDefaultState();
	public static BlockState AVOCADO_LEAVES = SapBlocks.AVOCADO_LEAVES.get().getDefaultState();

	public static BlockState BALSA_LOG = SapBlocks.BALSA_LOG.get().getDefaultState();
	public static BlockState BALSA_LEAVES = SapBlocks.BALSA_LEAVES.get().getDefaultState();

	public static BlockState BAY_LOG = SapBlocks.BAY_LOG.get().getDefaultState();
	public static BlockState BAY_LEAVES = SapBlocks.BAY_LEAVES.get().getDefaultState();

	public static BlockState BEECH_LOG = SapBlocks.BEECH_LOG.get().getDefaultState();
	public static BlockState BEECH_LEAVES = SapBlocks.BEECH_LEAVES.get().getDefaultState();

	public static BlockState BLACKWOOD_LOG = SapBlocks.BLACKWOOD_LOG.get().getDefaultState();
	public static BlockState BLACKWOOD_LEAVES = SapBlocks.BLACKWOOD_LEAVES.get().getDefaultState();

	public static BlockState CEDAR_LOG = SapBlocks.CEDAR_LOG.get().getDefaultState();
	public static BlockState CEDAR_LEAVES = SapBlocks.CEDAR_LEAVES.get().getDefaultState();

	public static BlockState CHERRY_LOG = SapBlocks.CHERRY_LOG.get().getDefaultState();
	public static BlockState CHERRY_LEAVES = SapBlocks.CHERRY_LEAVES.get().getDefaultState();

	public static BlockState CHESTNUT_LOG = SapBlocks.CHESTNUT_LOG.get().getDefaultState();
	public static BlockState CHESTNUT_LEAVES = SapBlocks.CHESTNUT_LEAVES.get().getDefaultState();

	public static BlockState CINNAMON_LOG = SapBlocks.CINNAMON_LOG.get().getDefaultState();
	public static BlockState CINNAMON_LEAVES = SapBlocks.CINNAMON_LEAVES.get().getDefaultState();

	public static BlockState CLOVE_LOG = SapBlocks.CLOVE_LOG.get().getDefaultState();
	public static BlockState CLOVE_LEAVES = SapBlocks.CLOVE_LEAVES.get().getDefaultState();

	public static BlockState COTTONWOOD_LOG = SapBlocks.COTTONWOOD_LOG.get().getDefaultState();
	public static BlockState COTTONWOOD_LEAVES = SapBlocks.COTTONWOOD_LEAVES.get().getDefaultState();

	public static BlockState CYPRESS_LOG = SapBlocks.CYPRESS_LOG.get().getDefaultState();
	public static BlockState CYPRESS_LEAVES = SapBlocks.CYPRESS_LEAVES.get().getDefaultState();

	public static BlockState ELM_LOG = SapBlocks.ELM_LOG.get().getDefaultState();
	public static BlockState ELM_LEAVES = SapBlocks.ELM_LEAVES.get().getDefaultState();

	public static BlockState FIR_LOG = SapBlocks.FIR_LOG.get().getDefaultState();
	public static BlockState FIR_LEAVES = SapBlocks.FIR_LEAVES.get().getDefaultState();

	public static BlockState FIG_LOG = SapBlocks.FIG_LOG.get().getDefaultState();
	public static BlockState FIG_LEAVES = SapBlocks.FIG_LEAVES.get().getDefaultState();

	public static BlockState GINKGO_LOG = SapBlocks.GINKGO_LOG.get().getDefaultState();
	public static BlockState GINKGO_LEAVES = SapBlocks.GINKGO_LEAVES.get().getDefaultState();

	public static BlockState GUM_LOG = SapBlocks.GUM_LOG.get().getDefaultState();
	public static BlockState GUM_LEAVES = SapBlocks.GUM_LEAVES.get().getDefaultState();

	public static BlockState HAWTHORN_LOG = SapBlocks.HAWTHORN_LOG.get().getDefaultState();
	public static BlockState HAWTHORN_LEAVES = SapBlocks.HAWTHORN_LEAVES.get().getDefaultState();

	public static BlockState HAZEL_LOG = SapBlocks.HAZEL_LOG.get().getDefaultState();
	public static BlockState HAZEL_LEAVES = SapBlocks.HAZEL_LEAVES.get().getDefaultState();

	public static BlockState HEMLOCK_LOG = SapBlocks.HEMLOCK_LOG.get().getDefaultState();
	public static BlockState HEMLOCK_LEAVES = SapBlocks.HEMLOCK_LEAVES.get().getDefaultState();

	public static BlockState HICKORY_LOG = SapBlocks.HICKORY_LOG.get().getDefaultState();
	public static BlockState HICKORY_LEAVES = SapBlocks.HICKORY_LEAVES.get().getDefaultState();

	public static BlockState HORNBEAM_LOG = SapBlocks.HORNBEAM_LOG.get().getDefaultState();
	public static BlockState HORNBEAM_LEAVES = SapBlocks.HORNBEAM_LEAVES.get().getDefaultState();

	public static BlockState JUNIPER_LOG = SapBlocks.JUNIPER_LOG.get().getDefaultState();
	public static BlockState JUNIPER_LEAVES = SapBlocks.JUNIPER_LEAVES.get().getDefaultState();

	public static BlockState LARCH_LOG = SapBlocks.LARCH_LOG.get().getDefaultState();
	public static BlockState LARCH_LEAVES = SapBlocks.LARCH_LEAVES.get().getDefaultState();

	public static BlockState LAUREL_LOG = SapBlocks.LAUREL_LOG.get().getDefaultState();
	public static BlockState LAUREL_LEAVES = SapBlocks.LAUREL_LEAVES.get().getDefaultState();

	public static BlockState LEMON_LOG = SapBlocks.LEMON_LOG.get().getDefaultState();
	public static BlockState LEMON_LEAVES = SapBlocks.LEMON_LEAVES.get().getDefaultState();

	public static BlockState LIME_LOG = SapBlocks.LIME_LOG.get().getDefaultState();
	public static BlockState LIME_LEAVES = SapBlocks.LIME_LEAVES.get().getDefaultState();

	public static BlockState LINDEN_LOG = SapBlocks.LINDEN_LOG.get().getDefaultState();
	public static BlockState LINDEN_LEAVES = SapBlocks.LINDEN_LEAVES.get().getDefaultState();

	public static BlockState LOCUST_LOG = SapBlocks.LOCUST_LOG.get().getDefaultState();
	public static BlockState LOCUST_LEAVES = SapBlocks.LOCUST_LEAVES.get().getDefaultState();

	public static BlockState MACADAMIA_LOG = SapBlocks.MACADAMIA_LOG.get().getDefaultState();
	public static BlockState MACADAMIA_LEAVES = SapBlocks.MACADAMIA_LEAVES.get().getDefaultState();

	public static BlockState MAHOGANY_LOG = SapBlocks.MAHOGANY_LOG.get().getDefaultState();
	public static BlockState MAHOGANY_LEAVES = SapBlocks.MAHOGANY_LEAVES.get().getDefaultState();

	public static BlockState MANGO_LOG = SapBlocks.MANGO_LOG.get().getDefaultState();
	public static BlockState MANGO_LEAVES = SapBlocks.MANGO_LEAVES.get().getDefaultState();

	public static BlockState MAPLE_LOG = SapBlocks.MAPLE_LOG.get().getDefaultState();
	public static BlockState MAPLE_LEAVES = SapBlocks.MAPLE_LEAVES.get().getDefaultState();

	public static BlockState MESQUITE_LOG = SapBlocks.MESQUITE_LOG.get().getDefaultState();
	public static BlockState MESQUITE_LEAVES = SapBlocks.MESQUITE_LEAVES.get().getDefaultState();

	public static BlockState MULBERRY_LOG = SapBlocks.MULBERRY_LOG.get().getDefaultState();
	public static BlockState MULBERRY_LEAVES = SapBlocks.MULBERRY_LEAVES.get().getDefaultState();

	public static BlockState OLIVE_LOG = SapBlocks.OLIVE_LOG.get().getDefaultState();
	public static BlockState OLIVE_LEAVES = SapBlocks.OLIVE_LEAVES.get().getDefaultState();

	public static BlockState ORANGE_LOG = SapBlocks.ORANGE_LOG.get().getDefaultState();
	public static BlockState ORANGE_LEAVES = SapBlocks.ORANGE_LEAVES.get().getDefaultState();

	public static BlockState PEACH_LOG = SapBlocks.PEACH_LOG.get().getDefaultState();
	public static BlockState PEACH_LEAVES = SapBlocks.PEACH_LEAVES.get().getDefaultState();

	public static BlockState PEAR_LOG = SapBlocks.PEAR_LOG.get().getDefaultState();
	public static BlockState PEAR_LEAVES = SapBlocks.PEAR_LEAVES.get().getDefaultState();

	public static BlockState PECAN_LOG = SapBlocks.PECAN_LOG.get().getDefaultState();
	public static BlockState PECAN_LEAVES = SapBlocks.PECAN_LEAVES.get().getDefaultState();

	public static BlockState PINE_LOG = SapBlocks.PINE_LOG.get().getDefaultState();
	public static BlockState PINE_LEAVES = SapBlocks.PINE_LEAVES.get().getDefaultState();

	public static BlockState PLUM_LOG = SapBlocks.PLUM_LOG.get().getDefaultState();
	public static BlockState PLUM_LEAVES = SapBlocks.PLUM_LEAVES.get().getDefaultState();

	public static BlockState POPLAR_LOG = SapBlocks.POPLAR_LOG.get().getDefaultState();
	public static BlockState POPLAR_LEAVES = SapBlocks.POPLAR_LEAVES.get().getDefaultState();

	public static BlockState REDWOOD_LOG = SapBlocks.REDWOOD_LOG.get().getDefaultState();
	public static BlockState REDWOOD_LEAVES = SapBlocks.REDWOOD_LEAVES.get().getDefaultState();

	public static BlockState ROSEWOOD_LOG = SapBlocks.ROSEWOOD_LOG.get().getDefaultState();
	public static BlockState ROSEWOOD_LEAVES = SapBlocks.ROSEWOOD_LEAVES.get().getDefaultState();

	public static BlockState SASSAFRAS_LOG = SapBlocks.SASSAFRAS_LOG.get().getDefaultState();
	public static BlockState SASSAFRAS_LEAVES = SapBlocks.SASSAFRAS_LEAVES.get().getDefaultState();

	public static BlockState SYCAMORE_LOG = SapBlocks.SYCAMORE_LOG.get().getDefaultState();
	public static BlockState SYCAMORE_LEAVES = SapBlocks.SYCAMORE_LEAVES.get().getDefaultState();

	public static BlockState TEAK_LOG = SapBlocks.TEAK_LOG.get().getDefaultState();
	public static BlockState TEAK_LEAVES = SapBlocks.TEAK_LEAVES.get().getDefaultState();

	public static BlockState WALNUT_LOG = SapBlocks.WALNUT_LOG.get().getDefaultState();
	public static BlockState WALNUT_LEAVES = SapBlocks.WALNUT_LEAVES.get().getDefaultState();

	public static BlockState WILLOW_LOG = SapBlocks.WILLOW_LOG.get().getDefaultState();
	public static BlockState WILLOW_LEAVES = SapBlocks.WILLOW_LEAVES.get().getDefaultState();

	public static BlockState YEW_LOG = SapBlocks.YEW_LOG.get().getDefaultState();
	public static BlockState YEW_LEAVES = SapBlocks.YEW_LEAVES.get().getDefaultState();

	public static final TreeFeatureConfig ALDER_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ALDER_LOG),
					new SimpleBlockStateProvider(ALDER_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ALDER_SAPLING.get()).build();

	public static final TreeFeatureConfig ALMOND_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ALMOND_LOG),
					new SimpleBlockStateProvider(ALMOND_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ALMOND_SAPLING.get()).build();

	public static final TreeFeatureConfig APPLE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(APPLE_LOG),
					new SimpleBlockStateProvider(APPLE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.APPLE_SAPLING.get()).build();

	public static final TreeFeatureConfig APRICOT_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(APRICOT_LOG),
					new SimpleBlockStateProvider(APRICOT_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.APRICOT_SAPLING.get()).build();

	public static final TreeFeatureConfig ASH_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ASH_LOG),
					new SimpleBlockStateProvider(ASH_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ASH_SAPLING.get()).build();

	public static final TreeFeatureConfig ASPEN_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ASPEN_LOG),
					new SimpleBlockStateProvider(ASPEN_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ASPEN_SAPLING.get()).build();

	public static final TreeFeatureConfig AVOCADO_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(AVOCADO_LOG),
					new SimpleBlockStateProvider(AVOCADO_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.AVOCADO_SAPLING.get()).build();

	public static final TreeFeatureConfig BALSA_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BALSA_LOG),
					new SimpleBlockStateProvider(BALSA_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.BALSA_SAPLING.get()).build();

	public static final TreeFeatureConfig BAY_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BAY_LOG),
					new SimpleBlockStateProvider(BAY_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.BAY_SAPLING.get()).build();

	public static final TreeFeatureConfig BEECH_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BEECH_LOG),
					new SimpleBlockStateProvider(BEECH_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.BEECH_SAPLING.get()).build();

	public static final TreeFeatureConfig BLACKWOOD_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BLACKWOOD_LOG),
					new SimpleBlockStateProvider(BLACKWOOD_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.BLACKWOOD_SAPLING.get()).build();

	public static final TreeFeatureConfig CEDAR_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CEDAR_LOG),
					new SimpleBlockStateProvider(CEDAR_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CEDAR_SAPLING.get()).build();

	public static final TreeFeatureConfig CINNAMON_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CINNAMON_LOG),
					new SimpleBlockStateProvider(CINNAMON_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CINNAMON_SAPLING.get()).build();

	public static final TreeFeatureConfig CHERRY_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CHERRY_LOG),
					new SimpleBlockStateProvider(CHERRY_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CHERRY_SAPLING.get()).build();

	public static final TreeFeatureConfig CHESTNUT_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CHESTNUT_LOG),
					new SimpleBlockStateProvider(CHESTNUT_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CHESTNUT_SAPLING.get()).build();

	public static final TreeFeatureConfig CLOVE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CLOVE_LOG),
					new SimpleBlockStateProvider(CLOVE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CLOVE_SAPLING.get()).build();

	public static final TreeFeatureConfig COTTONWOOD_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(COTTONWOOD_LOG),
					new SimpleBlockStateProvider(COTTONWOOD_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.COTTONWOOD_SAPLING.get()).build();

	public static final TreeFeatureConfig CYPRESS_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CYPRESS_LOG),
					new SimpleBlockStateProvider(CYPRESS_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.CYPRESS_SAPLING.get()).build();

	public static final TreeFeatureConfig ELM_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ELM_LOG),
					new SimpleBlockStateProvider(ELM_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ELM_SAPLING.get()).build();

	public static final TreeFeatureConfig FIG_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(FIG_LOG),
					new SimpleBlockStateProvider(FIG_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.FIG_SAPLING.get()).build();

	public static final TreeFeatureConfig FIR_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(FIR_LOG),
					new SimpleBlockStateProvider(FIR_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.FIR_SAPLING.get()).build();

	public static final TreeFeatureConfig GINKGO_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(GINKGO_LOG),
					new SimpleBlockStateProvider(GINKGO_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.GINKGO_SAPLING.get()).build();

	public static final TreeFeatureConfig GUM_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(GUM_LOG),
					new SimpleBlockStateProvider(GUM_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.GUM_SAPLING.get()).build();

	public static final TreeFeatureConfig HAZEL_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HAZEL_LOG),
					new SimpleBlockStateProvider(HAZEL_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.HAZEL_SAPLING.get()).build();

	public static final TreeFeatureConfig HAWTHORN_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HAWTHORN_LOG),
					new SimpleBlockStateProvider(HAWTHORN_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.HAWTHORN_SAPLING.get()).build();

	public static final TreeFeatureConfig HEMLOCK_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HEMLOCK_LOG),
					new SimpleBlockStateProvider(HEMLOCK_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.HEMLOCK_SAPLING.get()).build();

	public static final TreeFeatureConfig HICKORY_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HICKORY_LOG),
					new SimpleBlockStateProvider(HICKORY_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.HICKORY_SAPLING.get()).build();

	public static final TreeFeatureConfig HORNBEAM_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HORNBEAM_LOG),
					new SimpleBlockStateProvider(HORNBEAM_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.HORNBEAM_SAPLING.get()).build();

	public static final TreeFeatureConfig JUNIPER_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(JUNIPER_LOG),
					new SimpleBlockStateProvider(JUNIPER_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.JUNIPER_SAPLING.get()).build();

	public static final TreeFeatureConfig LARCH_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LARCH_LOG),
					new SimpleBlockStateProvider(LARCH_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LARCH_SAPLING.get()).build();

	public static final TreeFeatureConfig LAUREL_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LAUREL_LOG),
					new SimpleBlockStateProvider(LAUREL_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LAUREL_SAPLING.get()).build();

	public static final TreeFeatureConfig LEMON_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LEMON_LOG),
					new SimpleBlockStateProvider(LEMON_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LEMON_SAPLING.get()).build();

	public static final TreeFeatureConfig LIME_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LIME_LOG),
					new SimpleBlockStateProvider(LIME_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LIME_SAPLING.get()).build();

	public static final TreeFeatureConfig LINDEN_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LINDEN_LOG),
					new SimpleBlockStateProvider(LINDEN_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LINDEN_SAPLING.get()).build();

	public static final TreeFeatureConfig LOCUST_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LOCUST_LOG),
					new SimpleBlockStateProvider(LOCUST_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.LOCUST_SAPLING.get()).build();

	public static final TreeFeatureConfig MACADAMIA_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MACADAMIA_LOG),
					new SimpleBlockStateProvider(MACADAMIA_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MACADAMIA_SAPLING.get()).build();

	public static final TreeFeatureConfig MAHOGANY_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MAHOGANY_LOG),
					new SimpleBlockStateProvider(MAHOGANY_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MAHOGANY_SAPLING.get()).build();

	public static final TreeFeatureConfig MANGO_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MANGO_LOG),
					new SimpleBlockStateProvider(MANGO_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MANGO_SAPLING.get()).build();

	public static final TreeFeatureConfig MAPLE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MAPLE_LOG),
					new SimpleBlockStateProvider(MAPLE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MAPLE_SAPLING.get()).build();

	public static final TreeFeatureConfig MESQUITE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MESQUITE_LOG),
					new SimpleBlockStateProvider(MESQUITE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MESQUITE_SAPLING.get()).build();

	public static final TreeFeatureConfig MULBERRY_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MULBERRY_LOG),
					new SimpleBlockStateProvider(MULBERRY_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.MULBERRY_SAPLING.get()).build();

	public static final TreeFeatureConfig OLIVE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(OLIVE_LOG),
					new SimpleBlockStateProvider(OLIVE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.OLIVE_SAPLING.get()).build();

	public static final TreeFeatureConfig ORANGE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ORANGE_LOG),
					new SimpleBlockStateProvider(ORANGE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ORANGE_SAPLING.get()).build();

	public static final TreeFeatureConfig PEACH_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PEACH_LOG),
					new SimpleBlockStateProvider(PEACH_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.PEACH_SAPLING.get()).build();

	public static final TreeFeatureConfig PEAR_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PEAR_LOG),
					new SimpleBlockStateProvider(PEAR_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.PEAR_SAPLING.get()).build();

	public static final TreeFeatureConfig PECAN_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PECAN_LOG),
					new SimpleBlockStateProvider(PECAN_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.PECAN_SAPLING.get()).build();

	public static final TreeFeatureConfig PINE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PINE_LOG),
					new SimpleBlockStateProvider(PINE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.PINE_SAPLING.get()).build();

	public static final TreeFeatureConfig PLUM_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PLUM_LOG),
					new SimpleBlockStateProvider(PLUM_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.PLUM_SAPLING.get()).build();

	public static final TreeFeatureConfig POPLAR_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(POPLAR_LOG),
					new SimpleBlockStateProvider(POPLAR_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.POPLAR_SAPLING.get()).build();

	public static final TreeFeatureConfig REDWOOD_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(REDWOOD_LOG),
					new SimpleBlockStateProvider(REDWOOD_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.REDWOOD_SAPLING.get()).build();

	public static final TreeFeatureConfig ROSEWOOD_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ROSEWOOD_LOG),
					new SimpleBlockStateProvider(ROSEWOOD_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.ROSEWOOD_SAPLING.get()).build();

	public static final TreeFeatureConfig SASSAFRAS_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(SASSAFRAS_LOG),
					new SimpleBlockStateProvider(SASSAFRAS_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.SASSAFRAS_SAPLING.get()).build();

	public static final TreeFeatureConfig SYCAMORE_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(SYCAMORE_LOG),
					new SimpleBlockStateProvider(SYCAMORE_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.SYCAMORE_SAPLING.get()).build();

	public static final TreeFeatureConfig TEAK_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(TEAK_LOG),
					new SimpleBlockStateProvider(TEAK_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.TEAK_SAPLING.get()).build();

	public static final TreeFeatureConfig WALNUT_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(WALNUT_LOG),
					new SimpleBlockStateProvider(WALNUT_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.WALNUT_SAPLING.get()).build();

	public static final TreeFeatureConfig WILLOW_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(WILLOW_LOG),
					new SimpleBlockStateProvider(WILLOW_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.WILLOW_SAPLING.get()).build();

	public static final TreeFeatureConfig YEW_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(YEW_LOG),
					new SimpleBlockStateProvider(YEW_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.YEW_SAPLING.get()).build();

}
