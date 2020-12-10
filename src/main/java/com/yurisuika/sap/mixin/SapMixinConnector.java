package com.yurisuika.sap.mixin;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;
import com.yurisuika.sap.core.Sap;

public class SapMixinConnector implements IMixinConnector {

    @Override
    public void connect() {
        Sap.LOGGER.debug("Sap: Connecting Mixin...");
        Mixins.addConfiguration("sap.mixins.json");
        Sap.isUsingMixin = true;
        Sap.LOGGER.info("Sap: Mixin Connected!");
    }
}