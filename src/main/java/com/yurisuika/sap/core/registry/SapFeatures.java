package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.common.world.gen.feature.*;

import com.yurisuika.sap.core.Sap;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "sap", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SapFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Sap.MODID);

    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ALDER_TREE 		  = FEATURES.register("alder_tree", () -> new AlderTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ALMOND_TREE 	      = FEATURES.register("almond_tree", () -> new AlmondTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> APPLE_TREE 		  = FEATURES.register("apple_tree", () -> new AppleTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> APRICOT_TREE 	  = FEATURES.register("apricot_tree", () -> new ApricotTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ASH_TREE 		  = FEATURES.register("ash_tree", () -> new AshTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ASPEN_TREE 		  = FEATURES.register("aspen_tree", () -> new AspenTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> AVOCADO_TREE 	  = FEATURES.register("avocado_tree", () -> new AvocadoTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> BALSA_TREE 		  = FEATURES.register("balsa_tree", () -> new BalsaTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> BAY_TREE 		  = FEATURES.register("bay_tree", () -> new BayTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> BEECH_TREE 		  = FEATURES.register("beech_tree", () -> new BeechTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> BLACKWOOD_TREE 	  = FEATURES.register("blackwood_tree", () -> new BlackwoodTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CEDAR_TREE 		  = FEATURES.register("cedar_tree", () -> new CedarTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CHERRY_TREE 		  = FEATURES.register("cherry_tree", () -> new CherryTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CHESTNUT_TREE 	  = FEATURES.register("chestnut_tree", () -> new ChestnutTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CINNAMON_TREE 	  = FEATURES.register("cinnamon_tree", () -> new CinnamonTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CLOVE_TREE 		  = FEATURES.register("clove_tree", () -> new CloveTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> COTTONWOOD_TREE    = FEATURES.register("cottonwood_tree", () -> new CottonwoodTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CYPRESS_TREE   	  = FEATURES.register("cypress_tree", () -> new CypressTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ELM_TREE 	   	  = FEATURES.register("elm_tree", () -> new ElmTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> FIG_TREE 		  = FEATURES.register("fig_tree", () -> new FigTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> FIR_TREE 	   	  = FEATURES.register("fir_tree", () -> new FirTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> GINKGO_TREE 		  = FEATURES.register("ginkgo_tree", () -> new GinkgoTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> GUM_TREE 		  = FEATURES.register("hum_tree", () -> new GumTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HAZEL_TREE 	   	  = FEATURES.register("hazel_tree", () -> new HazelTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HAWTHORN_TREE 	  = FEATURES.register("hawthorn_tree", () -> new HawthornTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HEMLOCK_TREE   	  = FEATURES.register("hemlock_tree", () -> new HemlockTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HICKORY_TREE   	  = FEATURES.register("hickory_tree", () -> new HickoryTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HORNBEAM_TREE  	  = FEATURES.register("hornbeam_tree", () -> new HornbeamTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> JUNIPER_TREE 	  = FEATURES.register("juniper_tree", () -> new JuniperTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LARCH_TREE 	   	  = FEATURES.register("larch_tree", () -> new LarchTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LAUREL_TREE 	   	  = FEATURES.register("laurel_tree", () -> new LaurelTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LEMON_TREE 		  = FEATURES.register("lemon_tree", () -> new LemonTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LIME_TREE 		  = FEATURES.register("lime_tree", () -> new LimeTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LINDEN_TREE 		  = FEATURES.register("linden_tree", () -> new LindenTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LOCUST_TREE 		  = FEATURES.register("locust_tree", () -> new LocustTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MACADAMIA_TREE     = FEATURES.register("macadamia_tree", () -> new MacadamiaTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MAHOGANY_TREE 	  = FEATURES.register("mahogany_tree", () -> new MahoganyTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MANGO_TREE 	      = FEATURES.register("mango_tree", () -> new MangoTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MAPLE_TREE 		  = FEATURES.register("maple_tree", () -> new MapleTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MESQUITE_TREE 	  = FEATURES.register("mesquite_tree", () -> new MesquiteTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> MULBERRY_TREE 	  = FEATURES.register("mulberry_tree", () -> new MulberryTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> OLIVE_TREE 		  = FEATURES.register("olive_tree", () -> new OliveTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ORANGE_TREE 		  = FEATURES.register("orange_tree", () -> new OrangeTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PEACH_TREE 		  = FEATURES.register("peach_tree", () -> new PeachTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PEAR_TREE 		  = FEATURES.register("pear_tree", () -> new PearTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PECAN_TREE 		  = FEATURES.register("pecan_tree", () -> new PecanTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PINE_TREE 	      = FEATURES.register("pine_tree", () -> new PineTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PLUM_TREE 		  = FEATURES.register("plum_tree", () -> new PlumTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> POPLAR_TREE 		  = FEATURES.register("poplar_tree", () -> new PoplarTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> REDWOOD_TREE 	  = FEATURES.register("redwood_tree", () -> new RedwoodTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> ROSEWOOD_TREE 	  = FEATURES.register("rosewood_tree", () -> new RosewoodTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> SASSAFRAS_TREE 	  = FEATURES.register("sassafras_tree", () -> new SassafrasTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> SYCAMORE_TREE 	  = FEATURES.register("sycamore_tree", () -> new SycamoreTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> TEAK_TREE 		  = FEATURES.register("teak_tree", () -> new TeakTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> WALNUT_TREE 		  = FEATURES.register("walnut_tree", () -> new WalnutTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> WILLOW_TREE 		  = FEATURES.register("willow_tree", () -> new WillowTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> YEW_TREE 		  = FEATURES.register("yew_tree", () -> new YewTreeFeature(BaseTreeFeatureConfig.CODEC));

}