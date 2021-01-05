package com.yurisuika.sap.common.block;

import com.minecraftabnormals.abnormals_core.core.util.BlockUtil;
import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class SapLogBlock extends RotatedPillarBlock {
    private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> {
        return Items.DARK_OAK_LOG;
    });
    private final Supplier<Block> block;

    public SapLogBlock(Supplier<Block> strippedBlock, Properties properties) {
        super(properties);
        this.block = strippedBlock;
    }

    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        ItemStack stack = player.getHeldItem(hand);
        if (stack.getItem() instanceof AxeItem) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isRemote) {
                world.setBlockState(pos, BlockUtil.transferAllBlockStates(state, ((Block)this.block.get()).getDefaultState()));
                stack.damageItem(1, player, (playerIn) -> {
                    playerIn.sendBreakAnimation(hand);
                });
            }

            return ActionResultType.SUCCESS;
        } else {
            return ActionResultType.PASS;
        }
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        FILLER.fillItem(this.asItem(), group, items);
    }
}
