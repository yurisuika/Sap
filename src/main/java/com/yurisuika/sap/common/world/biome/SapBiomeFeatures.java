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
	public static BlockState ASH_LOG = SapBlocks.ASH_LOG.get().getDefaultState();
	public static BlockState ASH_LEAVES = SapBlocks.ASH_LEAVES.get().getDefaultState();

	public static BlockState ASPEN_LOG = SapBlocks.ASPEN_LOG.get().getDefaultState();
	public static BlockState ASPEN_LEAVES = SapBlocks.ASPEN_LEAVES.get().getDefaultState();

	public static BlockState DARK_ASH_LOG = SapBlocks.DARK_ASH_LOG.get().getDefaultState();
	public static BlockState DARK_ASH_LEAVES = SapBlocks.DARK_ASH_LEAVES.get().getDefaultState();

	public static BlockState FIR_LOG = SapBlocks.FIR_LOG.get().getDefaultState();
	public static BlockState FIR_LEAVES = SapBlocks.FIR_LEAVES.get().getDefaultState();

	public static BlockState PINE_LOG = SapBlocks.PINE_LOG.get().getDefaultState();
	public static BlockState PINE_LEAVES = SapBlocks.PINE_LEAVES.get().getDefaultState();

	public static BlockState REDWOOD_LOG = SapBlocks.REDWOOD_LOG.get().getDefaultState();
	public static BlockState REDWOOD_LEAVES = SapBlocks.REDWOOD_LEAVES.get().getDefaultState();

	public static BlockState WILLOW_LOG = SapBlocks.WILLOW_LOG.get().getDefaultState();
	public static BlockState WILLOW_LEAVES = SapBlocks.WILLOW_LEAVES.get().getDefaultState();
	
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

	public static final TreeFeatureConfig DARK_ASH_TREE_CONFIG = (
			new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(DARK_ASH_LOG),
					new SimpleBlockStateProvider(DARK_ASH_LEAVES),
					new BlobFoliagePlacer(3, 0)))
			.baseHeight(5)
			.heightRandA(3)
			.foliageHeight(3)
			.maxWaterDepth(1)
			.setSapling((net.minecraftforge.common.IPlantable)SapBlocks.DARK_ASH_SAPLING.get()).build();

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

}
