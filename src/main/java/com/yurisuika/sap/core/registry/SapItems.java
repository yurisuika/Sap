package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.core.Sap;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = "sap", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SapItems {
	public static final ItemSubRegistryHelper HELPER = Sap.REGISTRY_HELPER.getItemSubHelper();

	public static final RegistryObject ALDER_BOAT 		= HELPER.createBoatItem("alder", SapBlocks.ALDER_PLANKS);
	public static final RegistryObject ALMOND_BOAT 		= HELPER.createBoatItem("almond", SapBlocks.ALMOND_PLANKS);
	public static final RegistryObject APPLE_BOAT 		= HELPER.createBoatItem("apple", SapBlocks.APPLE_PLANKS);
	public static final RegistryObject APRICOT_BOAT 	= HELPER.createBoatItem("apricot", SapBlocks.APRICOT_PLANKS);
	public static final RegistryObject ASH_BOAT 		= HELPER.createBoatItem("ash", SapBlocks.ASH_PLANKS);
	public static final RegistryObject ASPEN_BOAT 		= HELPER.createBoatItem("aspen", SapBlocks.ASPEN_PLANKS);
	public static final RegistryObject AVOCADO_BOAT 	= HELPER.createBoatItem("avocado", SapBlocks.AVOCADO_PLANKS);
	public static final RegistryObject BALSA_BOAT 		= HELPER.createBoatItem("balsa", SapBlocks.BALSA_PLANKS);
	public static final RegistryObject BAY_BOAT 		= HELPER.createBoatItem("bay", SapBlocks.BAY_PLANKS);
	public static final RegistryObject BEECH_BOAT 		= HELPER.createBoatItem("beech", SapBlocks.BEECH_PLANKS);
	public static final RegistryObject BLACKWOOD_BOAT 	= HELPER.createBoatItem("blackwood", SapBlocks.BLACKWOOD_PLANKS);
	public static final RegistryObject CEDAR_BOAT 		= HELPER.createBoatItem("cedar", SapBlocks.CEDAR_PLANKS);
	public static final RegistryObject CHERRY_BOAT 		= HELPER.createBoatItem("cherry", SapBlocks.CHERRY_PLANKS);
	public static final RegistryObject CINNAMON_BOAT 	= HELPER.createBoatItem("cinnamon", SapBlocks.CINNAMON_PLANKS);
	public static final RegistryObject CHESTNUT_BOAT 	= HELPER.createBoatItem("chestnut", SapBlocks.CHESTNUT_PLANKS);
	public static final RegistryObject CLOVE_BOAT 		= HELPER.createBoatItem("clove", SapBlocks.CLOVE_PLANKS);
	public static final RegistryObject COTTONWOOD_BOAT 	= HELPER.createBoatItem("cottonwood", SapBlocks.COTTONWOOD_PLANKS);
	public static final RegistryObject CYPRESS_BOAT 	= HELPER.createBoatItem("cypress", SapBlocks.CYPRESS_PLANKS);
	public static final RegistryObject ELM_BOAT 		= HELPER.createBoatItem("elm", SapBlocks.ELM_PLANKS);
	public static final RegistryObject FIG_BOAT 		= HELPER.createBoatItem("fir", SapBlocks.FIR_PLANKS);
	public static final RegistryObject FIR_BOAT 		= HELPER.createBoatItem("fig", SapBlocks.FIG_PLANKS);
	public static final RegistryObject GINKGO_BOAT 		= HELPER.createBoatItem("ginkgo", SapBlocks.GINKGO_PLANKS);
	public static final RegistryObject GUM_BOAT 		= HELPER.createBoatItem("gum", SapBlocks.GUM_PLANKS);
	public static final RegistryObject HAWTHORN_BOAT 	= HELPER.createBoatItem("hawthorn", SapBlocks.HAWTHORN_PLANKS);
	public static final RegistryObject HAZEL_BOAT 		= HELPER.createBoatItem("hazel", SapBlocks.HAZEL_PLANKS);
	public static final RegistryObject HEMLOCK_BOAT 	= HELPER.createBoatItem("hemlock", SapBlocks.HEMLOCK_PLANKS);
	public static final RegistryObject HICKORY_BOAT 	= HELPER.createBoatItem("hickory", SapBlocks.HICKORY_PLANKS);
	public static final RegistryObject HORNBEAM_BOAT 	= HELPER.createBoatItem("hornbeam", SapBlocks.HORNBEAM_PLANKS);
	public static final RegistryObject JUNIPER_BOAT 	= HELPER.createBoatItem("juniper", SapBlocks.JUNIPER_PLANKS);
	public static final RegistryObject LARCH_BOAT 		= HELPER.createBoatItem("larch", SapBlocks.LARCH_PLANKS);
	public static final RegistryObject LAUREL_BOAT 		= HELPER.createBoatItem("laurel", SapBlocks.LAUREL_PLANKS);
	public static final RegistryObject LEMON_BOAT 		= HELPER.createBoatItem("lemon", SapBlocks.LEMON_PLANKS);
	public static final RegistryObject LIME_BOAT 		= HELPER.createBoatItem("lime", SapBlocks.LIME_PLANKS);
	public static final RegistryObject LINDEN_BOAT 		= HELPER.createBoatItem("linden", SapBlocks.LINDEN_PLANKS);
	public static final RegistryObject LOCUST_BOAT 		= HELPER.createBoatItem("locust", SapBlocks.LOCUST_PLANKS);
	public static final RegistryObject MACADAMIA_BOAT 	= HELPER.createBoatItem("macadamia", SapBlocks.MACADAMIA_PLANKS);
	public static final RegistryObject MAHOGANY_BOAT 	= HELPER.createBoatItem("mahogany", SapBlocks.MAHOGANY_PLANKS);
	public static final RegistryObject MANGO_BOAT		= HELPER.createBoatItem("mango", SapBlocks.MANGO_PLANKS);
	public static final RegistryObject MAPLE_BOAT 		= HELPER.createBoatItem("maple", SapBlocks.MAPLE_PLANKS);
	public static final RegistryObject MESQUITE_BOAT 	= HELPER.createBoatItem("mesquite", SapBlocks.MESQUITE_PLANKS);
	public static final RegistryObject MULBERRY_BOAT 	= HELPER.createBoatItem("mulberry", SapBlocks.MULBERRY_PLANKS);
	public static final RegistryObject OLIVE_BOAT 		= HELPER.createBoatItem("olive", SapBlocks.OLIVE_PLANKS);
	public static final RegistryObject ORANGE_BOAT 		= HELPER.createBoatItem("orange", SapBlocks.ORANGE_PLANKS);
	public static final RegistryObject PEACH_BOAT 		= HELPER.createBoatItem("peach", SapBlocks.PEACH_PLANKS);
	public static final RegistryObject PEAR_BOAT 		= HELPER.createBoatItem("pear", SapBlocks.PEAR_PLANKS);
	public static final RegistryObject PECAN_BOAT 		= HELPER.createBoatItem("pecan", SapBlocks.PECAN_PLANKS);
	public static final RegistryObject PINE_BOAT 		= HELPER.createBoatItem("pine", SapBlocks.PINE_PLANKS);
	public static final RegistryObject PLUM_BOAT 		= HELPER.createBoatItem("plum", SapBlocks.PLUM_PLANKS);
	public static final RegistryObject POPLAR_BOAT 		= HELPER.createBoatItem("poplar", SapBlocks.POPLAR_PLANKS);
	public static final RegistryObject REDWOOD_BOAT 	= HELPER.createBoatItem("redwood", SapBlocks.REDWOOD_PLANKS);
	public static final RegistryObject ROSEWOOD_BOAT 	= HELPER.createBoatItem("rosewood", SapBlocks.ROSEWOOD_PLANKS);
	public static final RegistryObject SASSAFRAS_BOAT 	= HELPER.createBoatItem("sassafras", SapBlocks.SASSAFRAS_PLANKS);
	public static final RegistryObject SYCAMORE_BOAT 	= HELPER.createBoatItem("sycamore", SapBlocks.SYCAMORE_PLANKS);
	public static final RegistryObject TEAK_BOAT 		= HELPER.createBoatItem("teak", SapBlocks.TEAK_PLANKS);
	public static final RegistryObject WALNUT_BOAT 		= HELPER.createBoatItem("walnut", SapBlocks.WALNUT_PLANKS);
	public static final RegistryObject WILLOW_BOAT 		= HELPER.createBoatItem("willow", SapBlocks.WILLOW_PLANKS);
	public static final RegistryObject YEW_BOAT 		= HELPER.createBoatItem("yew", SapBlocks.YEW_PLANKS);

}
