package WarriorCulturesShaolin.Scoped.com.github.item;

import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.ItemIDs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class WCSItems
{
	/**
	 * Shaolin Student: Armor
	 */
	public static Item Shaolin_Student_Pants;
	public static Item Shaolin_Student_Robes;
	public static Item Shaolin_Student_HeadBand;
	public static Item Shaolin_Student_Shoes;
	
	/**
	 * Shaolin Student: Weapons
	 */
	public static Item Shaolin_BroadSword;
	public static Item Shaolin_Knife;
	public static Item Shaolin_Sabre;
	public static Item Shaolin_RisingSun;
	
	/**
	 * Shaolin Student: Spears(Top)
	 */
	public static Item Shaolin_Halberd;
	
	/**
	 * Shaolin Student: Tools
	 */
	public static Item Shaolin_Shovel;
	public static Item Shaolin_Shears;
	
	/**
	 * Shaolin Monk: Armor
	 */
	public static Item Shaolin_Monk_RattanHatShield;
	public static Item Shaolin_Monk_Robes;
	public static Item Shaolin_Monk_Shoes;
	public static Item Shaolin_Monk_Pants;
	
	/**
	 * Shaolin Monk: Weapons
	 */
	public static Item Shaolin_RopeDart;
	public static Item Shaolin_HookBlade;
	public static Item Shaolin_Sword;
	public static Item Shaolin_MasterStaff;
	
	/**
	 * Shaolin Monk: Spears(Top)
	 */
	public static Item Shaolin_Spear;
	public static Item Shaolin_PoleArm;
	
	public static void ItemInit()
	{
		
		Shaolin_BroadSword = new Item_Weapon_Shaolin_BroadSword(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID,  WarriorCultures_Shaolin.ShaolinTools);
		
		Shaolin_Student_Pants = new Item_Shaolin_Student_Legs(ItemIDs.ITEM_SHAOLIN_LEGS_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 2);
		Shaolin_Student_Robes = new Item_Shaolin_Student_Robes(ItemIDs.ITEM_SHAOLIN_ROBE_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 1);
		Shaolin_Student_HeadBand = new Item_Shaolin_Student_HeadBand(ItemIDs.ITEM_SHAOLIN_HEADBAND_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 0);
		Shaolin_Student_Shoes = new Item_Shaolin_Student_Shoes(ItemIDs.ITEM_SHAOLIN_SHOES_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 3);
	};
}
