package com.yurisuika.sap.mixin.client.renderer.color;

import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.ForgeHooksClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BlockColors.class)
public class MixinBlockColors {

    /**
     * @author
     * Sap
     * @reason
     * Block Colors
     */
    @Overwrite
    public static BlockColors init() {
        BlockColors blockcolors = new BlockColors();
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getGrassColor(reader, state.get(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? pos.down() : pos) : -1;
        }, Blocks.LARGE_FERN, Blocks.TALL_GRASS);
        blockcolors.addColorState(DoublePlantBlock.HALF, Blocks.LARGE_FERN, Blocks.TALL_GRASS);
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);
        }, Blocks.GRASS_BLOCK, Blocks.FERN, Blocks.GRASS, Blocks.POTTED_FERN);
        blockcolors.register((state, reader, pos, color) -> {
            return FoliageColors.getSpruce();
        }, Blocks.SPRUCE_LEAVES);
        blockcolors.register((state, reader, pos, color) -> {
            return FoliageColors.getBirch();
        }, Blocks.BIRCH_LEAVES);
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getFoliageColor(reader, pos) : FoliageColors.getDefault();
        }, Blocks.OAK_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.ACACIA_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.VINE);
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getWaterColor(reader, pos) : -1;
        }, Blocks.WATER, Blocks.BUBBLE_COLUMN, Blocks.CAULDRON);
        blockcolors.register((state, reader, pos, color) -> {
            return RedstoneWireBlock.getRGBByPower((Integer)state.get(RedstoneWireBlock.POWER));
        }, Blocks.REDSTONE_WIRE);
        blockcolors.addColorState(RedstoneWireBlock.POWER, Blocks.REDSTONE_WIRE);
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : -1;
        }, Blocks.SUGAR_CANE);
        blockcolors.register((state, reader, pos, color) -> {
            return 14731036;
        }, Blocks.ATTACHED_MELON_STEM, Blocks.ATTACHED_PUMPKIN_STEM);
        blockcolors.register((state, reader, pos, color) -> {
            int i = (Integer)state.get(StemBlock.AGE);
            int j = i * 32;
            int k = 255 - i * 8;
            int l = i * 4;
            return j << 16 | k << 8 | l;
        }, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
        blockcolors.addColorState(StemBlock.AGE, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
        blockcolors.register((state, reader, pos, color) -> {
            return reader != null && pos != null ? 6778186 : 6778186;
        }, Blocks.LILY_PAD);
        ForgeHooksClient.onBlockColorsInit(blockcolors);
        return blockcolors;
    }
}
