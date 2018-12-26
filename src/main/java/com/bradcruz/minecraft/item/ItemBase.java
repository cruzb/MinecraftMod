package com.bradcruz.minecraft.item;

import com.bradcruz.minecraft.WitchMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;

        setUnlocalizedName(WitchMod.modId + "." + name);
        setRegistryName(name);
        setCreativeTab(WitchMod.creativeTab);
    }

    public void registerItemModel() {
        WitchMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}