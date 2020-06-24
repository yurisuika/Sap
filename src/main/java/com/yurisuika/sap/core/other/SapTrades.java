package com.yurisuika.sap.core.other;

import com.yurisuika.sap.core.Sap;
import com.yurisuika.sap.core.registry.SapBlocks;
import com.yurisuika.sap.core.registry.SapItems;
import com.teamabnormals.abnormals_core.core.utils.TradeUtils;

import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Sap.MODID)
public class SapTrades {
	
	@SubscribeEvent
	public static void onWandererTradesEvent(WandererTradesEvent event) {
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.ASH_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.ASPEN_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.DARK_ASH_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.FIR_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.PINE_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.REDWOOD_SAPLING.get(), 5, 1, 8, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SapBlocks.WILLOW_SAPLING.get(), 5, 1, 8, 1));
	}

}
