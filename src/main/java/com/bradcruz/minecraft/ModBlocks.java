package com.bradcruz.minecraft;

import com.bradcruz.minecraft.block.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.MATERIALS);

    //register block itself with block registry
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper
        );
    }

    //create and register itemBlock with item registry
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock()
        );
    }

    //register item model
    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
    }

}