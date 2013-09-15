package WarriorCulturesShaolin.Scoped.com.github.item;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;

public class Item_Shaolin_Student_Robes extends Super_Item_Cloth
{

	public Item_Shaolin_Student_Robes(int par1, EnumArmorMaterial enumArmorMaterial, int i, int j)
	{
		super(par1, enumArmorMaterial, i, j);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_ROBE_NAME);
	}

}
