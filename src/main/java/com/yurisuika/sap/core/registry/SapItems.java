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

	public static final RegistryObject<Item> ASH_BOAT 		= HELPER.createBoatItem("ash", SapBlocks.ASH_PLANKS);
	public static final RegistryObject<Item> ASPEN_BOAT 	= HELPER.createBoatItem("aspen", SapBlocks.ASPEN_PLANKS);
	public static final RegistryObject<Item> DARK_ASH_BOAT 	= HELPER.createBoatItem("dark_ash", SapBlocks.DARK_ASH_PLANKS);
	public static final RegistryObject<Item> FIR_BOAT 		= HELPER.createBoatItem("fir", SapBlocks.FIR_PLANKS);
	public static final RegistryObject<Item> PINE_BOAT 		= HELPER.createBoatItem("pine", SapBlocks.PINE_PLANKS);
	public static final RegistryObject<Item> REDWOOD_BOAT 	= HELPER.createBoatItem("redwood", SapBlocks.REDWOOD_PLANKS);
	public static final RegistryObject<Item> WILLOW_BOAT 	= HELPER.createBoatItem("willow", SapBlocks.WILLOW_PLANKS);

}
