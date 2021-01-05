package com.yurisuika.sap.common.block;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsPressurePlateBlock;
import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class SapWoodPressurePlateBlock extends AbnormalsPressurePlateBlock {
    private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> {
        return Items.DARK_OAK_PRESSURE_PLATE;
    });

    public SapWoodPressurePlateBlock(Sensitivity sensitivityIn, Properties propertiesIn) {
        super(sensitivityIn, propertiesIn);
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        FILLER.fillItem(this.asItem(), group, items);
    }
}
