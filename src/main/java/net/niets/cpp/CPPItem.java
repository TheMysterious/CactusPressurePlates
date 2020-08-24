package net.niets.cpp;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CPPItem extends BlockItem {

    public CPPItem(Block block) {
        super(block, new Item.Properties().group(ItemGroup.REDSTONE));
    }

}
