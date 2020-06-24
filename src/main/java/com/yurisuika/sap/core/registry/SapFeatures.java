package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.common.world.gen.feature.*;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "sap", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SapFeatures {

	public static final Feature<TreeFeatureConfig> ASH_TREE 	    = new AshTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ASPEN_TREE 	    = new AspenTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> DARK_ASH_TREE    = new DarkAshTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> FIR_TREE         = new FirTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PINE_TREE 	    = new PineTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> REDWOOD_TREE     = new RedwoodTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> WILLOW_TREE 	    = new WillowTreeFeature(TreeFeatureConfig::func_227338_a_);

    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().registerAll(
                ASH_TREE.setRegistryName("ash_tree"),
                ASPEN_TREE.setRegistryName("aspen_tree"),
                DARK_ASH_TREE.setRegistryName("dark_ash_tree"),
                FIR_TREE.setRegistryName("fir_tree"),
                PINE_TREE.setRegistryName("pine_tree"),
                REDWOOD_TREE.setRegistryName("redwood_tree"),
                WILLOW_TREE.setRegistryName("willow_tree")
        );
    }
	
}