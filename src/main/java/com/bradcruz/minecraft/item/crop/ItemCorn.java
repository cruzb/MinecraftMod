package com.bradcruz.minecraft.item.crop;

import com.bradcruz.minecraft.WitchMod;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCorn extends ItemFood {

    private static final String name = "corn";
    private static final String oreDictName = "cropCorn";

    private static final int hunger = 3;
    private static final float saturation = 0.6f;
    private static final boolean isWolfFood = false;

    public ItemCorn() {
        super(hunger, saturation, isWolfFood);
        setUnlocalizedName(WitchMod.modId + "." + name);
        setRegistryName(name);
        setCreativeTab(WitchMod.creativeTab);
    }

    public void registerItemModel() {
        WitchMod.proxy.registerItemRenderer(this, 0, name);
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreDictName, this);
    }
}
