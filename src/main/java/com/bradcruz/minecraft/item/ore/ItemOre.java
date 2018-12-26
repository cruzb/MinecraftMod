package com.bradcruz.minecraft.item.ore;

import com.bradcruz.minecraft.item.ItemBase;
import net.minecraftforge.oredict.OreDictionary;

//for use with forge's ore dictionary
public class ItemOre extends ItemBase {

    private String oreName;

    public ItemOre(String name, String oreName) {
        super(name);

        this.oreName = oreName;
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

}
