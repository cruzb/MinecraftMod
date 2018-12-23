package com.bradcruz.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase {

    public BlockOre(String name) {
        super(Material.ROCK, name);

        setHardness(3f); //stone = 1.5f
        setResistance(5f); //stone = 10f
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}