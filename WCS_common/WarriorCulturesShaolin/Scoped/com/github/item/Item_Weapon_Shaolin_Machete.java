package WarriorCulturesShaolin.Scoped.com.github.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

public class Item_Weapon_Shaolin_Machete extends Super_Item_Sword
{
	
	public Item_Weapon_Shaolin_Machete(int par1, EnumToolMaterial enumToolMaterial)
	{
		super(par1, enumToolMaterial);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_MACHETE_NAME);
	}
	
}
