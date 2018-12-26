package com.bradcruz.minecraft;

import com.bradcruz.minecraft.block.crop.BlockCropCorn;
import com.bradcruz.minecraft.block.ore.BlockOre;
import com.bradcruz.minecraft.block.pedestal.BlockPedestal;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockCropCorn cropCorn = new BlockCropCorn();

    public static BlockPedestal pedestal = new BlockPedestal();

    //register block itself with block registry
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                cropCorn,
                pedestal
        );
    }

    //create and register itemBlock with item registry
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                pedestal.createItemBlock()
        );
    }

    //register item model
    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
    }

}