package com.yurisuika.sap.core;

import com.yurisuika.sap.core.other.SapData;
import com.yurisuika.sap.core.registry.SapBlocks;
import com.yurisuika.sap.core.registry.SapFeatures;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
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
    	
    	REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);
    	REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);
    	REGISTRY_HELPER.getDeferredEntityRegister().register(modEventBus);
    	REGISTRY_HELPER.getDeferredTileEntityRegister().register(modEventBus);
    	REGISTRY_HELPER.getDeferredSoundRegister().register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        
        modEventBus.addListener(this::setupCommon);
    	DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
        	modEventBus.addListener(this::setupClient);
        	modEventBus.addListener(this::registerItemColors);
        });
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	DeferredWorkQueue.runLater(() -> {
    		REGISTRY_HELPER.processSpawnEggDispenseBehaviors();
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
    
    @OnlyIn(Dist.CLIENT)
	private void registerItemColors(ColorHandlerEvent.Item event) {
    	REGISTRY_HELPER.processSpawnEggColors(event);
	}
}