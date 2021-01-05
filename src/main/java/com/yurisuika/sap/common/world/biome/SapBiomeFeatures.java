package com.yurisuika.sap.common.world.biome;

import java.util.List;

import com.yurisuika.sap.core.registry.SapBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

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

	public static final BaseTreeFeatureConfig ALDER_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ALDER_LOG),
					new SimpleBlockStateProvider(ALDER_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ALMOND_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ALMOND_LOG),
					new SimpleBlockStateProvider(ALMOND_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig APPLE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(APPLE_LOG),
					new SimpleBlockStateProvider(APPLE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig APRICOT_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(APRICOT_LOG),
					new SimpleBlockStateProvider(APRICOT_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ASH_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ASH_LOG),
					new SimpleBlockStateProvider(ASH_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ASPEN_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ASPEN_LOG),
					new SimpleBlockStateProvider(ASPEN_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig AVOCADO_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(AVOCADO_LOG),
					new SimpleBlockStateProvider(AVOCADO_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig BALSA_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BALSA_LOG),
					new SimpleBlockStateProvider(BALSA_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig BAY_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BAY_LOG),
					new SimpleBlockStateProvider(BAY_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig BEECH_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BEECH_LOG),
					new SimpleBlockStateProvider(BEECH_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig BLACKWOOD_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BLACKWOOD_LOG),
					new SimpleBlockStateProvider(BLACKWOOD_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CEDAR_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CEDAR_LOG),
					new SimpleBlockStateProvider(CEDAR_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CINNAMON_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CINNAMON_LOG),
					new SimpleBlockStateProvider(CINNAMON_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CHERRY_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CHERRY_LOG),
					new SimpleBlockStateProvider(CHERRY_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CHESTNUT_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CHESTNUT_LOG),
					new SimpleBlockStateProvider(CHESTNUT_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CLOVE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CLOVE_LOG),
					new SimpleBlockStateProvider(CLOVE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig COTTONWOOD_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(COTTONWOOD_LOG),
					new SimpleBlockStateProvider(COTTONWOOD_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig CYPRESS_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(CYPRESS_LOG),
					new SimpleBlockStateProvider(CYPRESS_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ELM_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ELM_LOG),
					new SimpleBlockStateProvider(ELM_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig FIG_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(FIG_LOG),
					new SimpleBlockStateProvider(FIG_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig FIR_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(FIR_LOG),
					new SimpleBlockStateProvider(FIR_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig GINKGO_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(GINKGO_LOG),
					new SimpleBlockStateProvider(GINKGO_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig GUM_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(GUM_LOG),
					new SimpleBlockStateProvider(GUM_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig HAZEL_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HAZEL_LOG),
					new SimpleBlockStateProvider(HAZEL_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig HAWTHORN_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HAWTHORN_LOG),
					new SimpleBlockStateProvider(HAWTHORN_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig HEMLOCK_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HEMLOCK_LOG),
					new SimpleBlockStateProvider(HEMLOCK_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig HICKORY_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HICKORY_LOG),
					new SimpleBlockStateProvider(HICKORY_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig HORNBEAM_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(HORNBEAM_LOG),
					new SimpleBlockStateProvider(HORNBEAM_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig JUNIPER_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(JUNIPER_LOG),
					new SimpleBlockStateProvider(JUNIPER_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LARCH_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LARCH_LOG),
					new SimpleBlockStateProvider(LARCH_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LAUREL_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LAUREL_LOG),
					new SimpleBlockStateProvider(LAUREL_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LEMON_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LEMON_LOG),
					new SimpleBlockStateProvider(LEMON_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LIME_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LIME_LOG),
					new SimpleBlockStateProvider(LIME_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LINDEN_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LINDEN_LOG),
					new SimpleBlockStateProvider(LINDEN_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig LOCUST_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(LOCUST_LOG),
					new SimpleBlockStateProvider(LOCUST_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MACADAMIA_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MACADAMIA_LOG),
					new SimpleBlockStateProvider(MACADAMIA_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MAHOGANY_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MAHOGANY_LOG),
					new SimpleBlockStateProvider(MAHOGANY_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MANGO_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MANGO_LOG),
					new SimpleBlockStateProvider(MANGO_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MAPLE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MAPLE_LOG),
					new SimpleBlockStateProvider(MAPLE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MESQUITE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MESQUITE_LOG),
					new SimpleBlockStateProvider(MESQUITE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig MULBERRY_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(MULBERRY_LOG),
					new SimpleBlockStateProvider(MULBERRY_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig OLIVE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(OLIVE_LOG),
					new SimpleBlockStateProvider(OLIVE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ORANGE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ORANGE_LOG),
					new SimpleBlockStateProvider(ORANGE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig PEACH_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PEACH_LOG),
					new SimpleBlockStateProvider(PEACH_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig PEAR_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PEAR_LOG),
					new SimpleBlockStateProvider(PEAR_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig PECAN_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PECAN_LOG),
					new SimpleBlockStateProvider(PECAN_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig PINE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PINE_LOG),
					new SimpleBlockStateProvider(PINE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig PLUM_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(PLUM_LOG),
					new SimpleBlockStateProvider(PLUM_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig POPLAR_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(POPLAR_LOG),
					new SimpleBlockStateProvider(POPLAR_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig REDWOOD_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(REDWOOD_LOG),
					new SimpleBlockStateProvider(REDWOOD_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig ROSEWOOD_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(ROSEWOOD_LOG),
					new SimpleBlockStateProvider(ROSEWOOD_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig SASSAFRAS_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(SASSAFRAS_LOG),
					new SimpleBlockStateProvider(SASSAFRAS_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig SYCAMORE_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(SYCAMORE_LOG),
					new SimpleBlockStateProvider(SYCAMORE_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig TEAK_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(TEAK_LOG),
					new SimpleBlockStateProvider(TEAK_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig WALNUT_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(WALNUT_LOG),
					new SimpleBlockStateProvider(WALNUT_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig WILLOW_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(WILLOW_LOG),
					new SimpleBlockStateProvider(WILLOW_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

	public static final BaseTreeFeatureConfig YEW_TREE_CONFIG = (
			new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(YEW_LOG),
					new SimpleBlockStateProvider(YEW_LEAVES),
					new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
					new StraightTrunkPlacer(0, 0, 0),
					new TwoLayerFeature(0, 0, 0))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

}
