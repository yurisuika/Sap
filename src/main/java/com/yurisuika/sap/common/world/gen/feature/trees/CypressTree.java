package com.yurisuika.sap.common.world.gen.feature.trees;

import java.util.Random;

import javax.annotation.Nullable;

import com.yurisuika.sap.common.world.biome.SapBiomeFeatures;
import com.yurisuika.sap.core.registry.SapFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;

public class CypressTree extends Tree {
	@Nullable
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
		return SapFeatures.CYPRESS_TREE.get().withConfiguration(SapBiomeFeatures.CYPRESS_TREE_CONFIG);
	}
}