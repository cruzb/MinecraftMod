package com.bradcruz.minecraft;

import com.bradcruz.minecraft.client.CreativeWitchModTab;
import com.bradcruz.minecraft.network.PacketRequestUpdatePedestal;
import com.bradcruz.minecraft.network.PacketUpdatePedestal;
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
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = WitchMod.modId, name = WitchMod.name, version = WitchMod.version)
public class WitchMod {

    public static final String modId = "witchmod";
    public static final String name = "Witches and Warlocks";
    public static final String version = "1.0.0";


    public static final CreativeWitchModTab creativeTab = new CreativeWitchModTab();
   // public static SimpleNetworkWrapper network;


    @SidedProxy(clientSide = "com.bradcruz.minecraft.proxy.ClientProxy", serverSide = "com.bradcruz.minecraft.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static WitchMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());

        //register renderer
        proxy.registerRenderers();

        //register packets -- move elsewhere
       /* network = NetworkRegistry.INSTANCE.newSimpleChannel(modId);
        network.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
        network.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);*/
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
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

