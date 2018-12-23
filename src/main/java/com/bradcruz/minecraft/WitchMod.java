package com.bradcruz.minecraft;

import com.bradcruz.minecraft.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = WitchMod.modId, name = WitchMod.name, version = WitchMod.version)
public class WitchMod {

    public static final String modId = "witchmod";
    public static final String name = "Witches and Warlocks";
    public static final String version = "1.0.0";


    @SidedProxy(clientSide = "com.bradcruz.minecraft.proxy.ClientProxy", serverSide = "com.bradcruz.minecraft.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static WitchMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        ///ITEMS
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }


        ///BLOCKS
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

    }


}

