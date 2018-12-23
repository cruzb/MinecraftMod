package com.bradcruz.minecraft.block;

import com.bradcruz.minecraft.WitchMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;
    private String registryName;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = WitchMod.modId + "." + name;
        this.registryName = name;

        setUnlocalizedName(this.name);
        setRegistryName(this.name);
    }

    public void registerItemModel(Item itemBlock) {
        WitchMod.proxy.registerItemRenderer(itemBlock, 0, registryName);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}