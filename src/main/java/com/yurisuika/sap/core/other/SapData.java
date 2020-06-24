package com.yurisuika.sap.core.other;

import java.util.Arrays;

import com.yurisuika.sap.core.registry.SapBlocks;
import com.yurisuika.sap.core.registry.SapItems;
import com.teamabnormals.abnormals_core.core.utils.DataUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;

public class SapData {
	public static void registerCompostables() {
		//Leaves
		DataUtils.registerCompostable(0.30F,SapBlocks.ASH_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.ASPEN_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.DARK_ASH_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.FIR_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.PINE_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.REDWOOD_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.WILLOW_LEAVES.get());

		//Saplings
		DataUtils.registerCompostable(0.30F,SapBlocks.ASH_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.ASPEN_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.DARK_ASH_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.FIR_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.PINE_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.REDWOOD_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SapBlocks.WILLOW_SAPLING.get());
	}
	
	public static void registerFlammables() {
		//Leaves
		DataUtils.registerFlammable(SapBlocks.ASH_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.ASPEN_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.FIR_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.PINE_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SapBlocks.WILLOW_LEAVES.get(), 30, 60);

		//Logs
		DataUtils.registerFlammable(SapBlocks.ASH_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.ASPEN_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.FIR_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.PINE_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.WILLOW_LOG.get(), 5, 5);

		//Woods
		DataUtils.registerFlammable(SapBlocks.ASH_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.ASPEN_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.FIR_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.PINE_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.WILLOW_WOOD.get(), 5, 5);

		//Stripped Logs
		DataUtils.registerFlammable(SapBlocks.STRIPPED_ASH_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_ASPEN_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_DARK_ASH_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_FIR_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_PINE_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_REDWOOD_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_WILLOW_LOG.get(), 5, 5);

		//Stripped Woods
		DataUtils.registerFlammable(SapBlocks.STRIPPED_ASH_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_ASPEN_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_DARK_ASH_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_FIR_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_PINE_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_REDWOOD_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SapBlocks.STRIPPED_WILLOW_WOOD.get(), 5, 5);

		//Planks
		DataUtils.registerFlammable(SapBlocks.ASH_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.ASPEN_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.FIR_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.PINE_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.WILLOW_PLANKS.get(), 5, 20);

		//Slabs
		DataUtils.registerFlammable(SapBlocks.ASH_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.ASPEN_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.FIR_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.PINE_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.WILLOW_SLAB.get(), 5, 20);

		//Stairs
		DataUtils.registerFlammable(SapBlocks.ASH_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.ASPEN_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.FIR_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.PINE_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.WILLOW_STAIRS.get(), 5, 20);

		//Fences
		DataUtils.registerFlammable(SapBlocks.ASH_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.ASPEN_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.FIR_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.PINE_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.WILLOW_FENCE.get(), 5, 20);

		//Fence Gates
		DataUtils.registerFlammable(SapBlocks.ASH_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.ASPEN_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.DARK_ASH_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.FIR_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.PINE_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.REDWOOD_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SapBlocks.WILLOW_FENCE_GATE.get(), 5, 20);

	}
	
	public static void setRenderLayers() {
		//Doors
		RenderTypeLookup.setRenderLayer(SapBlocks.ASH_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.ASPEN_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.DARK_ASH_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.FIR_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.PINE_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.REDWOOD_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.WILLOW_DOOR.get(), RenderType.getTranslucent());

		//Trapdoors
		RenderTypeLookup.setRenderLayer(SapBlocks.ASH_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.ASPEN_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.DARK_ASH_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.FIR_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.PINE_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.REDWOOD_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.WILLOW_TRAPDOOR.get(), RenderType.getTranslucent());

		//Saplings
		RenderTypeLookup.setRenderLayer(SapBlocks.ASH_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.ASPEN_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.DARK_ASH_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.FIR_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.PINE_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.REDWOOD_SAPLING.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SapBlocks.WILLOW_SAPLING.get(), RenderType.getCutoutMipped());

		//Leaves
		RenderTypeLookup.setRenderLayer(SapBlocks.ASH_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.ASPEN_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.DARK_ASH_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.FIR_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.PINE_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.REDWOOD_LEAVES.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(SapBlocks.WILLOW_LEAVES.get(), RenderType.getTranslucent());

		//Saplings
		RenderTypeLookup.setRenderLayer(SapBlocks.ASH_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.ASPEN_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.DARK_ASH_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.FIR_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.PINE_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.REDWOOD_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.WILLOW_SAPLING.get(), RenderType.getCutout());

		//Potted Saplings
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_ASH_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_ASPEN_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_DARK_ASH_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_FIR_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_PINE_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_REDWOOD_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SapBlocks.POTTED_WILLOW_SAPLING.get(), RenderType.getCutout());
	}
	
	public static void registerBlockColors() {
        BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        DataUtils.registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.get(0.5D, 1.0D), Arrays.asList(
        		SapBlocks.ASH_LEAVES, SapBlocks.ASPEN_LEAVES, SapBlocks.DARK_ASH_LEAVES, SapBlocks.FIR_LEAVES, SapBlocks.PINE_LEAVES, SapBlocks.REDWOOD_LEAVES, SapBlocks.WILLOW_LEAVES));

        ItemColors itemColors = Minecraft.getInstance().getItemColors();
        DataUtils.registerBlockItemColor(itemColors, (color, items) -> FoliageColors.get(0.5D, 1.0D), Arrays.asList(
				SapBlocks.ASH_LEAVES, SapBlocks.ASPEN_LEAVES, SapBlocks.DARK_ASH_LEAVES, SapBlocks.FIR_LEAVES, SapBlocks.PINE_LEAVES, SapBlocks.REDWOOD_LEAVES, SapBlocks.WILLOW_LEAVES));
    }
}
