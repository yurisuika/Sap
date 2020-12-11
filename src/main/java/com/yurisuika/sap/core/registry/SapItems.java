package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.core.Sap;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = "sap", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SapItems {
	public static final RegistryHelper HELPER = Sap.REGISTRY_HELPER;

	public static final RegistryObject<Item> YEW_BOAT 			= HELPER.createBoatItem("yew", SapBlocks.YEW_PLANKS);
	public static final RegistryObject<Item> WILLOW_BOAT 		= HELPER.createBoatItem("willow", SapBlocks.WILLOW_PLANKS);
	public static final RegistryObject<Item> WALNUT_BOAT 		= HELPER.createBoatItem("walnut", SapBlocks.WALNUT_PLANKS);
	public static final RegistryObject<Item> TEAK_BOAT 			= HELPER.createBoatItem("teak", SapBlocks.TEAK_PLANKS);
	public static final RegistryObject<Item> SYCAMORE_BOAT 		= HELPER.createBoatItem("sycamore", SapBlocks.SYCAMORE_PLANKS);
	public static final RegistryObject<Item> SASSAFRAS_BOAT 	= HELPER.createBoatItem("sassafras", SapBlocks.SASSAFRAS_PLANKS);
	public static final RegistryObject<Item> ROSEWOOD_BOAT 		= HELPER.createBoatItem("rosewood", SapBlocks.ROSEWOOD_PLANKS);
	public static final RegistryObject<Item> REDWOOD_BOAT 		= HELPER.createBoatItem("redwood", SapBlocks.REDWOOD_PLANKS);
	public static final RegistryObject<Item> POPLAR_BOAT 		= HELPER.createBoatItem("poplar", SapBlocks.POPLAR_PLANKS);
	public static final RegistryObject<Item> PLUM_BOAT 			= HELPER.createBoatItem("plum", SapBlocks.PLUM_PLANKS);
	public static final RegistryObject<Item> PINE_BOAT 			= HELPER.createBoatItem("pine", SapBlocks.PINE_PLANKS);
	public static final RegistryObject<Item> PECAN_BOAT 		= HELPER.createBoatItem("pecan", SapBlocks.PECAN_PLANKS);
	public static final RegistryObject<Item> PEAR_BOAT 			= HELPER.createBoatItem("pear", SapBlocks.PEAR_PLANKS);
	public static final RegistryObject<Item> PEACH_BOAT 		= HELPER.createBoatItem("peach", SapBlocks.PEACH_PLANKS);
	public static final RegistryObject<Item> ORANGE_BOAT 		= HELPER.createBoatItem("orange", SapBlocks.ORANGE_PLANKS);
	public static final RegistryObject<Item> OLIVE_BOAT 		= HELPER.createBoatItem("olive", SapBlocks.OLIVE_PLANKS);
	public static final RegistryObject<Item> MULBERRY_BOAT 		= HELPER.createBoatItem("mulberry", SapBlocks.MULBERRY_PLANKS);
	public static final RegistryObject<Item> MESQUITE_BOAT 		= HELPER.createBoatItem("mesquite", SapBlocks.MESQUITE_PLANKS);
	public static final RegistryObject<Item> MAPLE_BOAT 		= HELPER.createBoatItem("maple", SapBlocks.MAPLE_PLANKS);
	public static final RegistryObject<Item> MANGO_BOAT		 	= HELPER.createBoatItem("mango", SapBlocks.MANGO_PLANKS);
	public static final RegistryObject<Item> MAHOGANY_BOAT 		= HELPER.createBoatItem("mahogany", SapBlocks.MAHOGANY_PLANKS);
	public static final RegistryObject<Item> MACADAMIA_BOAT 	= HELPER.createBoatItem("macadamia", SapBlocks.MACADAMIA_PLANKS);
	public static final RegistryObject<Item> LOCUST_BOAT 		= HELPER.createBoatItem("locust", SapBlocks.LOCUST_PLANKS);
	public static final RegistryObject<Item> LINDEN_BOAT 		= HELPER.createBoatItem("linden", SapBlocks.LINDEN_PLANKS);
	public static final RegistryObject<Item> LIME_BOAT 			= HELPER.createBoatItem("lime", SapBlocks.LIME_PLANKS);
	public static final RegistryObject<Item> LEMON_BOAT 		= HELPER.createBoatItem("lemon", SapBlocks.LEMON_PLANKS);
	public static final RegistryObject<Item> LAUREL_BOAT 		= HELPER.createBoatItem("laurel", SapBlocks.LAUREL_PLANKS);
	public static final RegistryObject<Item> LARCH_BOAT 		= HELPER.createBoatItem("larch", SapBlocks.LARCH_PLANKS);
	public static final RegistryObject<Item> JUNIPER_BOAT 		= HELPER.createBoatItem("juniper", SapBlocks.JUNIPER_PLANKS);
	public static final RegistryObject<Item> HORNBEAM_BOAT 		= HELPER.createBoatItem("hornbeam", SapBlocks.HORNBEAM_PLANKS);
	public static final RegistryObject<Item> HICKORY_BOAT 		= HELPER.createBoatItem("hickory", SapBlocks.HICKORY_PLANKS);
	public static final RegistryObject<Item> HEMLOCK_BOAT 		= HELPER.createBoatItem("hemlock", SapBlocks.HEMLOCK_PLANKS);
	public static final RegistryObject<Item> HAZEL_BOAT 		= HELPER.createBoatItem("hazel", SapBlocks.HAZEL_PLANKS);
	public static final RegistryObject<Item> HAWTHORN_BOAT 		= HELPER.createBoatItem("hawthorn", SapBlocks.HAWTHORN_PLANKS);
	public static final RegistryObject<Item> GUM_BOAT 			= HELPER.createBoatItem("gum", SapBlocks.GUM_PLANKS);
	public static final RegistryObject<Item> GINKGO_BOAT 		= HELPER.createBoatItem("ginkgo", SapBlocks.GINKGO_PLANKS);
	public static final RegistryObject<Item> FIR_BOAT 			= HELPER.createBoatItem("fig", SapBlocks.FIG_PLANKS);
	public static final RegistryObject<Item> FIG_BOAT 			= HELPER.createBoatItem("fir", SapBlocks.FIR_PLANKS);
	public static final RegistryObject<Item> ELM_BOAT 			= HELPER.createBoatItem("elm", SapBlocks.ELM_PLANKS);
	public static final RegistryObject<Item> CYPRESS_BOAT 		= HELPER.createBoatItem("cypress", SapBlocks.CYPRESS_PLANKS);
	public static final RegistryObject<Item> COTTONWOOD_BOAT 	= HELPER.createBoatItem("cottonwood", SapBlocks.COTTONWOOD_PLANKS);
	public static final RegistryObject<Item> CLOVE_BOAT 		= HELPER.createBoatItem("clove", SapBlocks.CLOVE_PLANKS);
	public static final RegistryObject<Item> CHESTNUT_BOAT 		= HELPER.createBoatItem("chestnut", SapBlocks.CHESTNUT_PLANKS);
	public static final RegistryObject<Item> CINNAMON_BOAT 		= HELPER.createBoatItem("cinnamon", SapBlocks.CINNAMON_PLANKS);
	public static final RegistryObject<Item> CHERRY_BOAT 		= HELPER.createBoatItem("cherry", SapBlocks.CHERRY_PLANKS);
	public static final RegistryObject<Item> CEDAR_BOAT 		= HELPER.createBoatItem("cedar", SapBlocks.CEDAR_PLANKS);
	public static final RegistryObject<Item> BLACKWOOD_BOAT 	= HELPER.createBoatItem("blackwood", SapBlocks.BLACKWOOD_PLANKS);
	public static final RegistryObject<Item> BEECH_BOAT 		= HELPER.createBoatItem("beech", SapBlocks.BEECH_PLANKS);
	public static final RegistryObject<Item> BAY_BOAT 			= HELPER.createBoatItem("bay", SapBlocks.BAY_PLANKS);
	public static final RegistryObject<Item> BALSA_BOAT 		= HELPER.createBoatItem("balsa", SapBlocks.BALSA_PLANKS);
	public static final RegistryObject<Item> AVOCADO_BOAT 		= HELPER.createBoatItem("avocado", SapBlocks.AVOCADO_PLANKS);
	public static final RegistryObject<Item> ASPEN_BOAT 		= HELPER.createBoatItem("aspen", SapBlocks.ASPEN_PLANKS);
	public static final RegistryObject<Item> ASH_BOAT 			= HELPER.createBoatItem("ash", SapBlocks.ASH_PLANKS);
	public static final RegistryObject<Item> APRICOT_BOAT 		= HELPER.createBoatItem("apricot", SapBlocks.APRICOT_PLANKS);
	public static final RegistryObject<Item> APPLE_BOAT 		= HELPER.createBoatItem("apple", SapBlocks.APPLE_PLANKS);
	public static final RegistryObject<Item> ALMOND_BOAT 		= HELPER.createBoatItem("almond", SapBlocks.ALMOND_PLANKS);
	public static final RegistryObject<Item> ALDER_BOAT 		= HELPER.createBoatItem("alder", SapBlocks.ALDER_PLANKS);

}
