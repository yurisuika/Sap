package com.yurisuika.sap.core.registry;

import com.yurisuika.sap.core.Sap;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import com.yurisuika.sap.core.other.SapFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

	public static final RegistryObject SAP		 				= HELPER.createItem("sap", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));

	//ACACIA
	//ALDER
	public static final RegistryObject ALMONDS					= HELPER.createItem("almonds", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ALMONDS)));
	public static final RegistryObject ROASTED_ALMONDS			= HELPER.createItem("roasted_almonds", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_ALMONDS)));
	public static final RegistryObject APRICOT					= HELPER.createItem("apricot", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.APRICOT)));
	public static final RegistryObject ASH_BERRIES				= HELPER.createItem("ash_berries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ASH_BERRIES)));
	//ASPEN
	public static final RegistryObject AVOCADO					= HELPER.createItem("avocado", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.AVOCADO)));
	//BALSA
	//BANYAN
	//BAY
	public static final RegistryObject BEECHNUTS				= HELPER.createItem("beechnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.BEECHNUTS)));
	public static final RegistryObject ROASTED_BEECHNUTS		= HELPER.createItem("roasted_beechnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_BEECHNUTS)));
	//BIRCH
	//BLACKWOOD
	//CEDAR
	public static final RegistryObject CHERRIES					= HELPER.createItem("cherries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.CHERRIES)));
	public static final RegistryObject CHESTNUTS				= HELPER.createItem("chestnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.CHESTNUTS)));
	public static final RegistryObject ROASTED_CHESTNUTS		= HELPER.createItem("roasted_chestnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_CHESTNUTS)));
	public static final RegistryObject CINNAMON					= HELPER.createItem("cinnamon", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
	public static final RegistryObject CLOVES					= HELPER.createItem("cloves", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
	//COTTONWOOD
	//CYPRESS
	//EBONY
	//ELM
	public static final RegistryObject FIG						= HELPER.createItem("fig", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.FIG)));
	//FIR
	//GINKGO
	//GUM
	public static final RegistryObject HAWTHORN_BERRIES			= HELPER.createItem("hawthorn_berries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.HAWTHORN_BERRIES)));
	public static final RegistryObject HAZELNUTS				= HELPER.createItem("hazelnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.HAZELNUTS)));
	public static final RegistryObject ROASTED_HAZELNUTS		= HELPER.createItem("roasted_hazelnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_HAZELNUTS)));
	//HEMLOCK
	public static final RegistryObject HICKORY_NUTS				= HELPER.createItem("hickory_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.HICKORY_NUTS)));
	public static final RegistryObject ROASTED_HICKORY_NUTS		= HELPER.createItem("roasted_hickory_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_HICKORY_NUTS)));
	//HORNBEAM
	public static final RegistryObject JUNIPER_BERRIES			= HELPER.createItem("juniper_berries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.JUNIPER_BERRIES)));
	//LARCH
	//LAUREL
	public static final RegistryObject LEMON					= HELPER.createItem("lemon", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.LEMON)));
	public static final RegistryObject LIME						= HELPER.createItem("lime", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.LIME)));
	//LINDEN
	//LOCUST
	public static final RegistryObject MACADAMIA_NUTS			= HELPER.createItem("macadamia_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.MACADAMIA_NUTS)));
	public static final RegistryObject ROASTED_MACADAMIA_NUTS	= HELPER.createItem("roasted_macadamia_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_MACADAMIA_NUTS)));
	//MAHOGANY
	public static final RegistryObject MANGO					= HELPER.createItem("mango", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.MANGO)));
	//MAPLE
	//MESQUITE
	public static final RegistryObject MULBERRIES				= HELPER.createItem("mulberries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.MULBERRIES)));
	public static final RegistryObject ACORNS					= HELPER.createItem("acorns", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ACORNS)));
	public static final RegistryObject ROASTED_ACORNS			= HELPER.createItem("roasted_acorns", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_ACORNS)));
	public static final RegistryObject OLIVES					= HELPER.createItem("olives", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.OLIVES)));
	public static final RegistryObject ORANGE					= HELPER.createItem("orange", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ORANGE)));
	public static final RegistryObject PEACH					= HELPER.createItem("peach", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.PEACH)));
	public static final RegistryObject PEAR						= HELPER.createItem("pear", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.PEAR)));
	public static final RegistryObject PECANS					= HELPER.createItem("pecans", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.PECANS)));
	public static final RegistryObject ROASTED_PECANS			= HELPER.createItem("roasted_pecans", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_PECANS)));
	public static final RegistryObject PINE_NUTS				= HELPER.createItem("pine_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.PINE_NUTS)));
	public static final RegistryObject ROASTED_PINE_NUTS		= HELPER.createItem("roasted_pine_nuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_PINE_NUTS)));
	public static final RegistryObject PLUM						= HELPER.createItem("plum", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.PLUM)));
	//POPLAR
	//REDWOOD
	//ROSEWOOD
	//SASSAFRAS
	//SPRUCE
	//SYCAMORE
	//TEAK
	public static final RegistryObject WALNUTS					= HELPER.createItem("walnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.WALNUTS)));
	public static final RegistryObject ROASTED_WALNUTS			= HELPER.createItem("roasted_walnuts", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(SapFoods.ROASTED_WALNUTS)));
	//WILLOW
	//YEW

}
