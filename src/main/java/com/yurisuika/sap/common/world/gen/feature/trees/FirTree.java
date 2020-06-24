package com.yurisuika.sap.common.world.gen.feature.trees;

import java.util.Random;

import javax.annotation.Nullable;

import com.yurisuika.sap.common.world.biome.SapBiomeFeatures;
import com.yurisuika.sap.core.registry.SapFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class FirTree extends Tree {
	@Nullable
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
		return SapFeatures.WILLOW_TREE.withConfiguration(SapBiomeFeatures.WILLOW_TREE_CONFIG);
	}
}