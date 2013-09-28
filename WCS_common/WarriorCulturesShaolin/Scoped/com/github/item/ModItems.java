package WarriorCulturesShaolin.Scoped.com.github.item;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.ItemIDs;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

public class ModItems
{
	/**
	 * Shaolin: Items
	 */
	public static Item Shaolin_Blades;
	public static Item Shaolin_Cloths;
	public static Item Shaolin_Tips;
	public static Item Shaolin_WeaponHeads;
	public static Item Shaolin_IronRing;
	
	public static Item Shaolin_BambooShaft;
	public static Item Shaolin_Sticks;
	
	public static Item Door_CherrySlider;
	public static Item Door_BambooSlider;
	
	/**
	 * Shaolin: Tools
	 */
	public static Item Shaolin_Shovel;
	public static Item Shaolin_Shear;
	public static Item Shaolin_CarryTorch;
	
	/**
	 * Shaolin: Armor
	 */
	public static Item Shaolin_Monk_RattanHatShield;
	public static Item Shaolin_Monk_Robes;
	public static Item Shaolin_Monk_Shoes;
	public static Item Shaolin_Monk_Pants;
	public static Item Shaolin_Student_Pants;
	public static Item Shaolin_Student_Robes;
	public static Item Shaolin_Student_HeadBand;
	public static Item Shaolin_Student_Shoes;
	
	/**
	 * Shaolin: Weapons
	 */
	public static Item Shaolin_Dao;
	public static Item Shaolin_Machete;
	public static Item Shaolin_Butterfly;
	public static Item Shaolin_RisingSun;
	public static Item Shaolin_RopeDart;
	public static Item Shaolin_Hook;
	public static Item Shaolin_Sword;
	
	/**
	 * Shaolin: Spears and Staffs
	 */
	public static Item Shaolin_Spear;
	public static Item Shaolin_Polearm;
	public static Item Shaolin_MasterStaff;
	public static Item Shaolin_Cresent;
	
	public static void ItemInit()
	{
		
		/**
		 * Weapons
		 */
		Shaolin_Dao = new Item_Weapon_Shaolin_Dao(ItemIDs.ITEM_SHAOLIN_DAO_ID,  WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Sword = new Item_Weapon_Shaolin_Sword(ItemIDs.ITEM_SHAOLIN_SWORD_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Hook = new Item_Weapon_Shaolin_HookBlade(ItemIDs.ITEM_SHAOLIN_HOOKBLADE_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Machete = new Item_Weapon_Shaolin_Machete(ItemIDs.ITEM_SHAOLIN_MACHETE_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_Butterfly = new Item_Weapon_Shaolin_Butterfly(ItemIDs.ITEM_SHAOLIN_BUTTERFLY_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_RisingSun = new Item_Weapon_Shaolin_RisingSun(ItemIDs.ITEM_SHAOLIN_RISINGSUN_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Spear = new Item_Weapon_Shaolin_Spear(ItemIDs.ITEM_SHAOLIN_SPEAR_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Polearm = new Item_Weapon_Shaolin_Polearm(ItemIDs.ITEM_SHAOLIN_POLEARM_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_MasterStaff = new Item_Weapon_Shaolin_MasterStaff(ItemIDs.ITEM_SHAOLIN_MASTERSTAFF_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Cresent = new Item_Weapon_Shaolin_Cresent(ItemIDs.ITEM_SHAOLIN_HALBERD_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_RopeDart = new Item_Weapon_Shaolin_RopeDart(ItemIDs.ITEM_SHAOLIN_ROPEDART_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		
		/**
		 * Tools
		 */
		Shaolin_Shovel = new Item_Tool_Shaolin_Shovel(ItemIDs.ITEM_SHAOLIN_SHOVEL_ID, WarriorCultures_Shaolin.ShaolinTools).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Shear = new Item_Tool_Shaolin_Shear(ItemIDs.ITEM_SHAOLIN_SHEAR_ID, WarriorCultures_Shaolin.ShaolinTools);
		Shaolin_CarryTorch = new Item_Tool_Shaolin_CarryTorch(ItemIDs.ITEM_SHAOLIN_CARRYTORCH_ID);
		
		/**
		 * Items
		 */
		Shaolin_Blades = new Item_Items_ShaolinBlades(ItemIDs.ITEM_SHAOLIN_BLADES_ID).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_Cloths = new Item_Items_ShaolinCloth(ItemIDs.ITEM_SHAOLIN_CLOTHS_ID).setUnlocalizedName("Cloth").func_111206_d("Cloth");
		Shaolin_Tips = new Item_Items_ShaolinTips(ItemIDs.ITEM_SHAOLIN_TIPS_ID).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_WeaponHeads = new Item_Items_ShaolinWeaponHeads(ItemIDs.ITEM_SHAOLIN_WEAPONHEADS_ID).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		Shaolin_IronRing = new Item_Shaolin_IronRing(ItemIDs.ITEM_SHAOLIN_IRONRING_ID);
		Shaolin_BambooShaft = new Item_Shaolin_BambooShaft(ItemIDs.ITEM_SHAOLIN_BAMBOOSHAFT_ID);
		Shaolin_Sticks = new Item_Shaolin_Sticks(ItemIDs.ITEM_SHAOLIN_STICKS_ID).setUnlocalizedName("Shaolin").func_111206_d("Shaolin");
		
		Door_CherrySlider = new Item_Items_Door(ItemIDs.ITEM_DOOR_CHERRYWOOD_ID, Material.wood, "CherryWood").setUnlocalizedName(Strings.ITEM_DOOR_CHERRY_NAME);
		Door_BambooSlider = new Item_Items_Door(ItemIDs.ITEM_DOOR_BAMBOO_ID, Material.wood, "Bamboo").setUnlocalizedName(Strings.ITEM_DOOR_BAMBOO_NAME);
		
		/**
		 * Armor
		 */
		Shaolin_Student_Pants = new Item_Shaolin_Student_Legs(ItemIDs.ITEM_SHAOLIN_STUDENT_LEGS_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 2);
		Shaolin_Student_Robes = new Item_Shaolin_Student_Robes(ItemIDs.ITEM_SHAOLIN_STUDENT_ROBE_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 1);
		Shaolin_Student_HeadBand = new Item_Shaolin_Student_HeadBand(ItemIDs.ITEM_SHAOLIN_STUDENT_HEADBAND_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 0);
		Shaolin_Student_Shoes = new Item_Shaolin_Student_Shoes(ItemIDs.ITEM_SHAOLIN_STUDENT_SHOES_ID,  WarriorCultures_Shaolin.ShaolinCloth, 1, 3);
	};
}
