package com.yurisuika.sap.common.block;

import com.minecraftabnormals.abnormals_core.core.util.item.ItemStackUtil;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class BranchBlock extends SixWayBlock implements IWaterLoggable {

    public static final BooleanProperty WATERLOGGED;
    private final Supplier<Block> block;

    public BranchBlock(Supplier<Block> strippedBlock, Properties builder) {
        super(0.25F, builder);
        this.block = strippedBlock;
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
        FluidState fluidstate = context.getWorld().getFluidState(context.getPos());
        return this.makeConnections(context.getWorld(), context.getPos()).with(WATERLOGGED, fluidstate.getFluid() == Fluids.WATER);
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
        return this.getDefaultState()
                .with(DOWN, flag || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM)
                .with(UP, flag1)
                .with(NORTH, flag2)
                .with(EAST, flag3)
                .with(SOUTH, flag4)
                .with(WEST, flag5);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing == Direction.DOWN && stateIn.isValidPosition(worldIn, currentPos)) {
            Block block = facingState.getBlock();
            boolean flag = block.isIn(BlockTags.LOGS) || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM;
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

    public FluidState getFluidState(BlockState state) {
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
    //    entityIn.setMotionMultiplier(state, new Vec3d(0.9D, 0.9D, 0.9D));
    //}

    //public boolean isLadder(BlockState state, IWorldReader world, BlockPos pos, LivingEntity entity) {
    //    return true;
    //}

    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }


    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if (player.getHeldItem(hand).getItem() instanceof AxeItem) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.setBlockState(pos, this.block.get().getDefaultState()
                    .with(NORTH, state.get(NORTH))
                    .with(EAST, state.get(EAST))
                    .with(SOUTH, state.get(SOUTH))
                    .with(WEST, state.get(WEST))
                    .with(UP, state.get(UP))
                    .with(DOWN, state.get(DOWN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)));

            return ActionResultType.SUCCESS;
        } else {
            return ActionResultType.PASS;
        }
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if(ItemStackUtil.isInGroup(this.asItem(), group)) {
            int targetIndex = ItemStackUtil.findIndexOfItem(Items.COAL_ORE, items);
            if(targetIndex != -1) {
                items.add(targetIndex + 1, new ItemStack(this));
            } else {
                super.fillItemGroup(group, items);
            }
        }
    }
}
