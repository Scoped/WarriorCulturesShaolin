package WarriorCulturesShaolin.Scoped.com.github.item;

import net.minecraft.item.EnumArmorMaterial;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

public class Item_Shaolin_Student_Legs extends Super_Item_Cloth
{

	public Item_Shaolin_Student_Legs(int par1, EnumArmorMaterial enumArmorMaterial, int i, int j)
	{
		super(par1, enumArmorMaterial, i, j);
		this.setPriority(2);
		this.setAbsorbtionMax(4);
		this.setAbsorbtionRatio(8);
		this.setSlotNumber(2);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_STUDENT_LEGS_NAME);
	}
	
}
