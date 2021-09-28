package com.yourname.mythos;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.registries.DeferredRegister;
// The value here should match an entry in the META-INF/mods.toml file
@Mod("mythos")
public class MythosMod
{
    public static final String MODID = "mythos";
    
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MythosMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // pre-initialization
    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Loading Mythos...");
    }

    // code to dispatch IMC to another mod
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    // code to receive and process InterModComms from other mods
    private void processIMC(final InterModProcessEvent event)
    {
        /*LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));*/
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    /*@SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        //LOGGER.info("HELLO from server starting");
    }*/

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    /*@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            // LOGGER.info("HELLO from Register Block");
        }
    }*/
}
