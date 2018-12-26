package com.bradcruz.minecraft.client;

import com.bradcruz.minecraft.ModItems;
import com.bradcruz.minecraft.WitchMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeWitchModTab extends CreativeTabs {

    public CreativeWitchModTab() {
        super(WitchMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }

    @Override
    public boolean hasSearchBar() {
        return false;
    }

}
