package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.common.world.gen.feature.*;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "sap", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SapFeatures {

    public static final Feature<TreeFeatureConfig> ALDER_TREE 		  = new AlderTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ALMOND_TREE 	      = new AlmondTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> APPLE_TREE 		  = new AppleTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> APRICOT_TREE 	  = new ApricotTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ASH_TREE 		  = new AshTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ASPEN_TREE 		  = new AspenTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> AVOCADO_TREE 	  = new AvocadoTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> BALSA_TREE 		  = new BalsaTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> BAY_TREE 		  = new BayTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> BEECH_TREE 		  = new BeechTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> BLACKWOOD_TREE 	  = new BlackwoodTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CEDAR_TREE 		  = new CedarTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CHERRY_TREE 		  = new CherryTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CHESTNUT_TREE 	  = new ChestnutTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CINNAMON_TREE 	  = new CinnamonTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CLOVE_TREE 		  = new CloveTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> COTTONWOOD_TREE    = new CottonwoodTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> CYPRESS_TREE   	  = new CypressTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ELM_TREE 	   	  = new ElmTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> FIG_TREE 		  = new FigTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> FIR_TREE 	   	  = new FirTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> GINKGO_TREE 		  = new GinkgoTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> GUM_TREE 		  = new GumTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> HAZEL_TREE 	   	  = new HazelTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> HAWTHORN_TREE 	  = new HawthornTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> HEMLOCK_TREE   	  = new HemlockTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> HICKORY_TREE   	  = new HickoryTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> HORNBEAM_TREE  	  = new HornbeamTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> JUNIPER_TREE 	  = new JuniperTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LARCH_TREE 	   	  = new LarchTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LAUREL_TREE 	   	  = new LaurelTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LEMON_TREE 		  = new LemonTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LIME_TREE 		  = new LimeTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LINDEN_TREE 		  = new LindenTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> LOCUST_TREE 		  = new LocustTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MACADAMIA_TREE     = new MacadamiaTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MAHOGANY_TREE 	  = new MahoganyTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MANGO_TREE 	      = new MangoTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MAPLE_TREE 		  = new MapleTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MESQUITE_TREE 	  = new MesquiteTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> MULBERRY_TREE 	  = new MulberryTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> OLIVE_TREE 		  = new OliveTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ORANGE_TREE 		  = new OrangeTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PEACH_TREE 		  = new PeachTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PEAR_TREE 		  = new PearTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PECAN_TREE 		  = new PecanTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PINE_TREE 	      = new PineTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> PLUM_TREE 		  = new PlumTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> POPLAR_TREE 		  = new PoplarTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> REDWOOD_TREE 	  = new RedwoodTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> ROSEWOOD_TREE 	  = new RosewoodTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> SASSAFRAS_TREE 	  = new SassafrasTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> SYCAMORE_TREE 	  = new SycamoreTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> TEAK_TREE 		  = new TeakTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> WALNUT_TREE 		  = new WalnutTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> WILLOW_TREE 		  = new WillowTreeFeature(TreeFeatureConfig::func_227338_a_);
    public static final Feature<TreeFeatureConfig> YEW_TREE 		  = new YewTreeFeature(TreeFeatureConfig::func_227338_a_);

    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().registerAll(
                ALDER_TREE.setRegistryName("alder_tree"),
                ALMOND_TREE.setRegistryName("almond_tree"),
                APPLE_TREE.setRegistryName("apple_tree"),
                APRICOT_TREE.setRegistryName("apricot_tree"),
                ASH_TREE.setRegistryName("ash_tree"),
                ASPEN_TREE.setRegistryName("aspen_tree"),
                AVOCADO_TREE.setRegistryName("avocado_tree"),
                BALSA_TREE.setRegistryName("balsa_tree"),
                BAY_TREE.setRegistryName("bay_tree"),
                BEECH_TREE.setRegistryName("beech_tree"),
                BLACKWOOD_TREE.setRegistryName("blackwood_tree"),
                CEDAR_TREE.setRegistryName("cedar_tree"),
                CHERRY_TREE.setRegistryName("cherry_tree"),
                CHESTNUT_TREE.setRegistryName("chestnut_tree"),
                CINNAMON_TREE.setRegistryName("cinnamon_tree"),
                CLOVE_TREE.setRegistryName("clove_tree"),
                COTTONWOOD_TREE.setRegistryName("cottonwood_tree"),
                CYPRESS_TREE.setRegistryName("cypress_tree"),
                ELM_TREE.setRegistryName("elm_tree"),
                FIR_TREE.setRegistryName("fir_tree"),
                FIG_TREE.setRegistryName("fig_tree"),
                GINKGO_TREE.setRegistryName("ginkgo_tree"),
                GUM_TREE.setRegistryName("gum_tree"),
                HAZEL_TREE.setRegistryName("hazel_tree"),
                HAWTHORN_TREE.setRegistryName("hawthorn_tree"),
                HEMLOCK_TREE.setRegistryName("hemlock_tree"),
                HICKORY_TREE.setRegistryName("hickory_tree"),
                HORNBEAM_TREE.setRegistryName("hornbeam_tree"),
                JUNIPER_TREE.setRegistryName("juniper_tree"),
                LARCH_TREE.setRegistryName("larch_tree"),
                LAUREL_TREE.setRegistryName("laurel_tree"),
                LEMON_TREE.setRegistryName("lemon_tree"),
                LIME_TREE.setRegistryName("lime_tree"),
                LINDEN_TREE.setRegistryName("linden_tree"),
                LOCUST_TREE.setRegistryName("locust_tree"),
                MACADAMIA_TREE.setRegistryName("macadamia_tree"),
                MAHOGANY_TREE.setRegistryName("mahogany_tree"),
                MANGO_TREE.setRegistryName("mango_tree"),
                MAPLE_TREE.setRegistryName("maple_tree"),
                MESQUITE_TREE.setRegistryName("mesquite_tree"),
                MULBERRY_TREE.setRegistryName("mulberry_tree"),
                OLIVE_TREE.setRegistryName("olive_tree"),
                ORANGE_TREE.setRegistryName("orange_tree"),
                PEACH_TREE.setRegistryName("peach_tree"),
                PEAR_TREE.setRegistryName("pear_tree"),
                PECAN_TREE.setRegistryName("pecan_tree"),
                PINE_TREE.setRegistryName("pine_tree"),
                PLUM_TREE.setRegistryName("plum_tree"),
                POPLAR_TREE.setRegistryName("poplar_tree"),
                REDWOOD_TREE.setRegistryName("redwood_tree"),
                ROSEWOOD_TREE.setRegistryName("rosewood_tree"),
                SASSAFRAS_TREE.setRegistryName("sassafras_tree"),
                SYCAMORE_TREE.setRegistryName("sycamore_tree"),
                TEAK_TREE.setRegistryName("teak_tree"),
                WALNUT_TREE.setRegistryName("walnut_tree"),
                WILLOW_TREE.setRegistryName("willow_tree"),
                YEW_TREE.setRegistryName("yew_tree")
        );
    }
	
}