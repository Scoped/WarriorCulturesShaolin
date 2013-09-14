package WarriorCulturesShaolin.Scoped.com.github.item;

import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.ItemIDs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ModItems
{
	/**
	 * Shaolin: Items
	 */
	public static Item Shaolin_Blades;
	
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
	public static Item Shaolin_Dao;
	public static Item Shaolin_Machete;
	public static Item Shaolin_Butterfly;
	public static Item Shaolin_RisingSun;
	
	/**
	 * Shaolin Student: Spears(Top)
	 */
	public static Item Shaolin_Halberd;
	
	/**
	 * Shaolin Student: Tools
	 */
	public static Item Shaolin_Shovel;
	public static Item Shaolin_Shear;
	
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
		
		/**
		 * Weapons
		 */
		Shaolin_Dao = new Item_Weapon_Shaolin_Dao(ItemIDs.ITEM_SHAOLIN_DAO_ID,  WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Sword = new Item_Weapon_Shaolin_Sword(ItemIDs.ITEM_MONK_SWORD_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_HookBlade = new Item_Weapon_Shaolin_HookBlade(ItemIDs.ITEM_MONK_HOOKBLADE_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Shear = new Item_Tool_Shaolin_Shear(ItemIDs.ITEM_SHAOLIN_SHEARS_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Machete = new Item_Weapon_Shaolin_Machete(ItemIDs.ITEM_SHAOLIN_MACHETE_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Butterfly = new Item_Weapon_Shaolin_Butterfly(ItemIDs.ITEM_SHAOLIN_BUTTERFLY_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_RisingSun = new Item_Weapon_Shaolin_RisingSun(ItemIDs.ITEM_SHAOLIN_RISINGSUN_ID, WarriorCultures_Shaolin.ShaolinTools);
		
		/**
		 * Tools
		 */
		Shaolin_Shovel = new Item_Tool_Shaolin_Shovel(ItemIDs.ITEM_SHAOLIN_SHOVEL_ID, WarriorCultures_Shaolin.ShaolinTools);
		
		/**
		 * Iems
		 */
		Shaolin_Blades = new Item_Items_ShaolinBlades(ItemIDs.ITEM_SHAOLINBLADES_ID).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		
		/**
		 * Armor
		 */
		Shaolin_Student_Pants = new Item_Shaolin_Student_Legs(ItemIDs.ITEM_SHAOLIN_LEGS_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 2);
		Shaolin_Student_Robes = new Item_Shaolin_Student_Robes(ItemIDs.ITEM_SHAOLIN_ROBE_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 1);
		Shaolin_Student_HeadBand = new Item_Shaolin_Student_HeadBand(ItemIDs.ITEM_SHAOLIN_HEADBAND_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 0);
		Shaolin_Student_Shoes = new Item_Shaolin_Student_Shoes(ItemIDs.ITEM_SHAOLIN_SHOES_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 3);
	};
}
