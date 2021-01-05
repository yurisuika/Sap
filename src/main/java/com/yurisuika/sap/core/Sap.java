package com.yurisuika.sap.core;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import com.yurisuika.sap.core.other.SapData;
import com.yurisuika.sap.core.registry.SapFeatures;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("deprecation")
@Mod(Sap.MODID)
@Mod.EventBusSubscriber(modid = Sap.MODID)
public class Sap {
	public static final String MODID = "sap";
	public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);
	public static Logger LOGGER = LogManager.getLogger();
	public static boolean isUsingMixin;

    public Sap() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		REGISTRY_HELPER.register(modEventBus);
		SapFeatures.FEATURES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        
        modEventBus.addListener(this::setupCommon);
    	DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
        	modEventBus.addListener(this::setupClient);
        });
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	DeferredWorkQueue.runLater(() -> {
    		SapData.registerCompostables();
    		SapData.registerFlammables();
    	});
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	DeferredWorkQueue.runLater(() -> {
    		SapData.setRenderLayers();
            SapData.registerBlockColors();
    	});
    }
}