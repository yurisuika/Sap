package com.yurisuika.sap.mixin.client.gui.screen;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.client.gui.screen.WorldLoadProgressScreen;
import net.minecraft.util.Util;
import net.minecraft.world.chunk.ChunkStatus;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorldLoadProgressScreen.class)
public class MixinWorldLoadProgressScreen {

    @Shadow
    @Final
    /**
     * @author
     * Sap
     * @reason
     * Loading Screen Colors
     */
    private static final Object2IntMap COLORS = (Object2IntMap) Util.make(new Object2IntOpenHashMap(), (p_213039_0_) -> {
        p_213039_0_.defaultReturnValue(1250067);
        p_213039_0_.put(ChunkStatus.EMPTY, 315860);
        p_213039_0_.put(ChunkStatus.STRUCTURE_STARTS, 1381653);
        p_213039_0_.put(ChunkStatus.STRUCTURE_REFERENCES, 1447446);
        p_213039_0_.put(ChunkStatus.BIOMES, 1513239);
        p_213039_0_.put(ChunkStatus.NOISE, 1579032);
        p_213039_0_.put(ChunkStatus.SURFACE, 1644825);
        p_213039_0_.put(ChunkStatus.CARVERS, 1710618);
        p_213039_0_.put(ChunkStatus.LIQUID_CARVERS, 1776411);
        p_213039_0_.put(ChunkStatus.FEATURES, 1842204);
        p_213039_0_.put(ChunkStatus.LIGHT, 1907997);
        p_213039_0_.put(ChunkStatus.SPAWN, 1973790);
        p_213039_0_.put(ChunkStatus.HEIGHTMAPS, 2039583);
        p_213039_0_.put(ChunkStatus.FULL, 2105376);
    });

}
