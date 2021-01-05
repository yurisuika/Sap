package com.yurisuika.sap.common.block;

import com.minecraftabnormals.abnormals_core.common.blocks.wood.AbnormalsLeavesBlock;

public class SapLeavesBlock extends AbnormalsLeavesBlock
{
    private final int color;

    public SapLeavesBlock(Properties properties, int colorIn)
    {
        super(properties);
        this.color = colorIn;
    }

}