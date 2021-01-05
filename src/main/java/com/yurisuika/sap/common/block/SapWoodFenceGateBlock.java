package com.yurisuika.sap.common.block;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class SapWoodFenceGateBlock extends FenceGateBlock {
    private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> {
        return Items.DARK_OAK_FENCE_GATE;
    });

    public SapWoodFenceGateBlock(Properties properties) {
        super(properties);
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        FILLER.fillItem(this.asItem(), group, items);
    }
}
