package com.yurisuika.sap.mixin.common.items;

import com.minecraftabnormals.abnormals_core.common.items.AbnormalsSignItem;
import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(AbnormalsSignItem.class)
public class MixinAbnormalsSignItem {

    private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> {
        return Items.DARK_OAK_SIGN;
    });

}
