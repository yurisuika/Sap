package com.yurisuika.sap.core.other;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class SapProperties {
    public static final Block.Properties PLANKS = Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final Block.Properties DOORS = Block.Properties.create(Material.WOOD, MaterialColor.WOOD).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD);
    public static final Block.Properties BUTTON = Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final Block.Properties PRESSURE_PLATE = Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final Block.Properties FLOWER_POT = Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F);
    public static final Block.Properties LEAVES = Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).notSolid().tickRandomly().sound(SoundType.PLANT);
    public static final Block.Properties LOG = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
    public static final Block.Properties SAPLING = Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT);
    public static final Block.Properties BRANCH = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(1.0F).sound(SoundType.WOOD).tickRandomly();
    public static final Block.Properties TWIG = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.WOOD).tickRandomly();
}