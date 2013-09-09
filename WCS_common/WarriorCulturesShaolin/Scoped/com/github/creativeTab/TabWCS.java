package WarriorCulturesShaolin.Scoped.com.github.creativeTab;

import WarriorCulturesShaolin.Scoped.com.github.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabWCS extends CreativeTabs
{
	public TabWCS(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ModBlocks.BambooBlock);
	}
}
