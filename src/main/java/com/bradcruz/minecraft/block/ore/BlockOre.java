package com.bradcruz.minecraft.block.ore;

import com.bradcruz.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase {

    private String oreName;

    public BlockOre(String name, String oreName) {
        super(Material.ROCK, name);
        this.oreName = oreName;

        setHardness(3f); //stone = 1.5f
        setResistance(5f); //stone = 10f
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}