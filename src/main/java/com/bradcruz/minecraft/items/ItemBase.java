package com.bradcruz.minecraft.items;

import com.bradcruz.minecraft.WitchMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    protected String name;
    private String registryName;

    public ItemBase(String name) {
        this.name = WitchMod.modId + "." + name;
        this.registryName = name;

        setUnlocalizedName(this.name);
        setRegistryName(this.name);
    }

    public void registerItemModel() {
        WitchMod.proxy.registerItemRenderer(this, 0, registryName);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}