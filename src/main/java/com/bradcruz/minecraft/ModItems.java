package com.bradcruz.minecraft;

import com.bradcruz.minecraft.item.crop.ItemCorn;
import com.bradcruz.minecraft.item.ore.ItemOre;
import com.bradcruz.minecraft.item.crop.ItemSeedsCorn;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    //ores
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");//.setCreativeTab(CreativeTabs.MATERIALS);

    //crops
    public static ItemSeedsCorn cornSeed = new ItemSeedsCorn();
    public static ItemCorn corn = new ItemCorn();//.setCreativeTab(CreativeTabs.FOOD);


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                //ores
                ingotCopper,

                //crops
                cornSeed,
                corn
        );
    }

    public static void registerModels() {
        //ores
        ingotCopper.registerItemModel();

        //crops
        cornSeed.registerItemModel();
        corn.registerItemModel();
    }

}