package com.yurisuika.sap.common.block;

import com.teamabnormals.abnormals_core.core.utils.ItemStackUtils;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;


public class StrippedTwigBlock extends SixWayBlock implements IWaterLoggable {

    public static final BooleanProperty WATERLOGGED;

    public StrippedTwigBlock(Properties builder) {
        super(0.125F, builder);
        this.setDefaultState(((((((this.stateContainer.getBaseState()
                .with(NORTH, false))
                .with(EAST, false))
                .with(SOUTH, false))
                .with(WEST, false))
                .with(UP, false))
                .with(DOWN, false))
                .with(WATERLOGGED, false));
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
        return this.makeConnections(context.getWorld(), context.getPos()).with(WATERLOGGED, ifluidstate.getFluid() == Fluids.WATER);
    }

    public BlockState makeConnections(IBlockReader blockReader, BlockPos pos) {
        Block block = blockReader.getBlockState(pos.down()).getBlock();
        Block block1 = blockReader.getBlockState(pos.up()).getBlock();
        Block block2 = blockReader.getBlockState(pos.north()).getBlock();
        Block block3 = blockReader.getBlockState(pos.east()).getBlock();
        Block block4 = blockReader.getBlockState(pos.south()).getBlock();
        Block block5 = blockReader.getBlockState(pos.west()).getBlock();
        boolean flag = block.isIn(BlockTags.LOGS);
        boolean flag1 = block1.isIn(BlockTags.LOGS);
        boolean flag2 = block2.isIn(BlockTags.LOGS);
        boolean flag3 = block3.isIn(BlockTags.LOGS);
        boolean flag4 = block4.isIn(BlockTags.LOGS);
        boolean flag5 = block5.isIn(BlockTags.LOGS);
        boolean flag6 = block.isIn(BlockTags.LEAVES);
        boolean flag7 = block1.isIn(BlockTags.LEAVES);
        boolean flag8 = block2.isIn(BlockTags.LEAVES);
        boolean flag9 = block3.isIn(BlockTags.LEAVES);
        boolean flag10 = block4.isIn(BlockTags.LEAVES);
        boolean flag11 = block5.isIn(BlockTags.LEAVES);
        return this.getDefaultState()
                .with(DOWN, flag || flag6 || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM)
                .with(UP, flag1 || flag7)
                .with(NORTH, flag2 || flag8)
                .with(EAST, flag3 || flag9)
                .with(SOUTH, flag4 || flag10)
                .with(WEST, flag5 || flag11);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing == Direction.DOWN && stateIn.isValidPosition(worldIn, currentPos)) {
            Block block = facingState.getBlock();
            boolean flag = block.isIn(BlockTags.LOGS) || block.isIn(BlockTags.LEAVES) || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM;
            return stateIn.with(FACING_TO_PROPERTY_MAP.get(facing), flag);
        }
        else {
            if (stateIn.isValidPosition(worldIn, currentPos)) {
                Block block = facingState.getBlock();
                boolean flag = block.isIn(BlockTags.LOGS);
                return stateIn.with(FACING_TO_PROPERTY_MAP.get(facing), flag);
            }
            else if (!stateIn.isValidPosition(worldIn, currentPos)) {
                worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
                return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
            }
            else if (stateIn.get(WATERLOGGED)) {
                worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
                return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
            }
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (!state.isValidPosition(worldIn, pos)) {
            worldIn.destroyBlock(pos, true);
        }

    }

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }


    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED);
    }

    // public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) { return true; }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }

    //public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
    //    entityIn.setMotionMultiplier(state, new Vec3d(0.8D, 0.8D, 0.8D));
    //}

    //public boolean isLadder(BlockState state, IWorldReader world, BlockPos pos, LivingEntity entity) {
    //    return true;
    //}

    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if(ItemStackUtils.isInGroup(this.asItem(), group)) {
            int targetIndex = ItemStackUtils.findIndexOfItem(Items.STRIPPED_SPRUCE_LOG, items);
            if(targetIndex != -1) {
                items.add(targetIndex - 1, new ItemStack(this));
            } else {
                super.fillItemGroup(group, items);
            }
        }
    }
}
