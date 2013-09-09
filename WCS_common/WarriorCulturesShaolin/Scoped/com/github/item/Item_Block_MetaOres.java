package WarriorCulturesShaolin.Scoped.com.github.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Item_Block_MetaOres extends ItemBlock
{

	public Item_Block_MetaOres(int id)
	{
		super(id);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
	public int getMetadata(int meta)
	{
		return meta;
	}
	
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name = "";
		
		switch(itemStack.getItemDamage())
		{
		case 0: {name = "Ore0"; break;}
		case 1: {name = "Ore1"; break;}
		case 2: {name = "Ore2"; break;}
		}
		return this.getUnlocalizedName() + name;
	}
}
