package com.bradcruz.minecraft.item.crop;

import com.bradcruz.minecraft.ModBlocks;
import com.bradcruz.minecraft.WitchMod;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsCorn extends ItemSeeds /*implements ItemModelProvider */{

    private static final String name = "corn_seed";

    public ItemSeedsCorn() {
        //crop block, soil block
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName(WitchMod.modId + "." + name);
        setRegistryName(name);
        setCreativeTab(WitchMod.creativeTab);
    }

    public void registerItemModel() {
        WitchMod.proxy.registerItemRenderer(this, 0, name);
    }

}