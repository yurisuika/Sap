package com.yurisuika.sap.common.block;

import com.yurisuika.sap.core.registry.SapBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;

import java.util.Iterator;
import java.util.Random;


public class TwigBlock extends SixWayBlock implements IWaterLoggable {

    public static final BooleanProperty WATERLOGGED;

    public TwigBlock(Properties builder) {
        super(0.125F, builder);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateContainer.getBaseState())
                .with(NORTH, false))
                .with(EAST, false))
                .with(SOUTH, false))
                .with(WEST, false))
                .with(UP, false))
                .with(DOWN, false))
                .with(WATERLOGGED, false));
    }


    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.makeConnections(context.getWorld(), context.getPos());
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
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.getDefaultState()
                .with(DOWN, flag || flag6 || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM))
                .with(UP, flag1 || flag7 || block1 == Blocks.DIRT || block1 == Blocks.COARSE_DIRT || block1 == Blocks.GRASS_BLOCK || block1 == Blocks.PODZOL || block1 == Blocks.MYCELIUM))
                .with(NORTH, flag2 || flag8 || block2 == Blocks.DIRT || block2 == Blocks.COARSE_DIRT || block2 == Blocks.GRASS_BLOCK || block2 == Blocks.PODZOL || block2 == Blocks.MYCELIUM))
                .with(EAST, flag3 || flag9 || block3 == Blocks.DIRT || block3 == Blocks.COARSE_DIRT || block3 == Blocks.GRASS_BLOCK || block3 == Blocks.PODZOL || block3 == Blocks.MYCELIUM))
                .with(SOUTH, flag4 || flag10 || block4 == Blocks.DIRT || block4 == Blocks.COARSE_DIRT || block4 == Blocks.GRASS_BLOCK || block4 == Blocks.PODZOL || block4 == Blocks.MYCELIUM))
                .with(WEST, flag5 || flag11 || block5 == Blocks.DIRT || block5 == Blocks.COARSE_DIRT || block5 == Blocks.GRASS_BLOCK || block5 == Blocks.PODZOL || block5 == Blocks.MYCELIUM);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if ((Boolean)stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        } else if (!stateIn.isValidPosition(worldIn, currentPos)) {
            worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
            // ResourceLocation fence_gates = new ResourceLocation("forge", "fence_gates");
            // ResourceLocation fences = new ResourceLocation("forge", "fences");
            Block block = facingState.getBlock();
            boolean flag = block.isIn(BlockTags.LOGS) || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.PODZOL || block == Blocks.MYCELIUM || block.isIn(BlockTags.LEAVES)/* || block.isIn(BlockTags.getCollection().getOrCreate(fence_gates)) || block.isIn(BlockTags.getCollection().getOrCreate(fences))*/;
            return (BlockState)stateIn.with((IProperty)FACING_TO_PROPERTY_MAP.get(facing), flag);
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    //public BlockState rotate(BlockState state, Rotation rot) {
    //    return state.with(FACING, rot.rotate(state.get(FACING)));
    //}

    //public BlockState mirror(BlockState state, Mirror mirrorIn) {
    //    return state.with(FACING, mirrorIn.mirror(state.get(FACING)));
    //}

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (!state.isValidPosition(worldIn, pos)) {
            worldIn.destroyBlock(pos, true);
        }

    }

    public IFluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }


    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new IProperty[]{NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED});
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
