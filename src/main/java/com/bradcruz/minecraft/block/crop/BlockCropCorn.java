package com.bradcruz.minecraft.block.crop;

import com.bradcruz.minecraft.ModItems;
import com.bradcruz.minecraft.WitchMod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {

    private static final String name = "crop_corn";

    public BlockCropCorn() {
        setUnlocalizedName(WitchMod.modId + "." + name);
        setRegistryName(name);
        setCreativeTab(WitchMod.creativeTab);
    }

    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }



}