package com.yurisuika.sap.core.other;

import com.yurisuika.sap.core.Sap;
import com.yurisuika.sap.core.registry.SapBlocks;
import com.yurisuika.sap.core.registry.SapItems;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil;

import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.Item;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Sap.MODID)
public class SapTrades {
	
	@SubscribeEvent
	public static void onWandererTradesEvent(WandererTradesEvent event) {
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ALDER_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ALMOND_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.APPLE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.APRICOT_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ASH_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ASPEN_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.AVOCADO_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.BALSA_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.BAY_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.BEECH_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.BLACKWOOD_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CEDAR_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CHERRY_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CHESTNUT_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CINNAMON_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CLOVE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.COTTONWOOD_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.CYPRESS_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ELM_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.FIG_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.FIR_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.GINKGO_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.GUM_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.HAWTHORN_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.HAZEL_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.HEMLOCK_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.HICKORY_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.HORNBEAM_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.JUNIPER_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LARCH_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LAUREL_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LEMON_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LIME_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LINDEN_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.LOCUST_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MACADAMIA_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MAHOGANY_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MANGO_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MAPLE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MESQUITE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.MULBERRY_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.OLIVE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ORANGE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.PEACH_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.PEAR_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.PECAN_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.PINE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.PLUM_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.POPLAR_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.REDWOOD_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.ROSEWOOD_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.SASSAFRAS_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.SYCAMORE_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.TEAK_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.WALNUT_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.WILLOW_SAPLING.get()), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtil.AbnormalsTrade(Item.getItemFromBlock(SapBlocks.YEW_SAPLING.get()), 5, 1, 8, 1));
	}

}
