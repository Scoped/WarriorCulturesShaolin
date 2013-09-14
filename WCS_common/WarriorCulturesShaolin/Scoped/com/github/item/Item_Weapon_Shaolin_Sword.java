package WarriorCulturesShaolin.Scoped.com.github.item;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Item_Weapon_Shaolin_Sword extends Super_Item_Sword
{
	
	public Item_Weapon_Shaolin_Sword(int par1, EnumToolMaterial enumToolMaterial)
	{
		super(par1, enumToolMaterial);
		this.setUnlocalizedName(Strings.ITEM_MONK_SWORD_NAME);
	}
	
}
