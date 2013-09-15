package WarriorCulturesShaolin.Scoped.com.github.core.handler;

import WarriorCulturesShaolin.Scoped.com.github.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void recipesInit()
	{
		/**
		 * Makes i recipes when declaring one.
		 * 
		 */
		for(int i = 0;i < 4;i++)
		{
			/**
			 * Shaped Recipes.
			 */
			/*GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Blades, 1, i),
			"SSS",
			"SDS",
			"SSS",
			Character.valueOf('D'), new ItemStack(ModItems.Shaolin_BambooShaft));*/
			
		}
		
	/**
	 * Shaped Recipes.
	 */
		/**
		 * Items
		 */
			/**
			 * Cloth Red
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					"SSS",
					"SDS",
					"SSS",
					Character.valueOf('S'), new ItemStack(Item.silk),
					Character.valueOf('D'), new ItemStack(Item.dyePowder, 1, 1));
			/**
			 * Cloth Orange
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cloths, 1, 1),
					"SSS",
					"SDS",
					"SSS",
					Character.valueOf('S'), new ItemStack(Item.silk),
					Character.valueOf('D'), new ItemStack(Item.dyePowder, 1, 14));
			/**
			 * Cloth White
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cloths, 1, 2),
					"SSS",
					"SDS",
					"SSS",
					Character.valueOf('S'), new ItemStack(Item.silk),
					Character.valueOf('D'), new ItemStack(Item.dyePowder, 1, 15));
			/**
			 * Cloth Yellow
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cloths, 1, 3),
					"SSS",
					"SDS",
					"SSS",
					Character.valueOf('S'), new ItemStack(Item.silk),
					Character.valueOf('D'), new ItemStack(Item.dyePowder, 1, 11));
		/**
		 * Weapons
		 */
			/**
			 * Spear
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Spear, 1, 0),
					"  H",
					" SC",
					"S  ",
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_BambooShaft),
					Character.valueOf('C'), new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Tips, 1, 0));
			/**
			 * Wax Spear
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Spear, 1, 1),
					"  H",
					" SC",
					"S  ",
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_Sticks, 1, 0),
					Character.valueOf('C'), new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Tips, 1, 0));
			/**
			 * MasterStaff
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_MasterStaff, 1, 0),
					"  H",
					" S ",
					"S  ",
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_WeaponHeads, 1, 0),
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_BambooShaft));
			/**
			 * Wax MasterStaff
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_MasterStaff, 1, 1),
					"  H",
					" S ",
					"S  ",
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_WeaponHeads, 1, 0),
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_Sticks, 1, 0));
			/**
			 * RopeDart
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_RopeDart, 1, 0),
					"SST",
					"SSD",
					"SSS",
					Character.valueOf('D'), new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					Character.valueOf('S'), new ItemStack(Item.silk),
					Character.valueOf('T'), new ItemStack(ModItems.Shaolin_Tips, 1, 0));
			/**
			 * Cresent
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cresent, 1, 0),
					"  H",
					" S ",
					"S  ",
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Blades, 1, 2),
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_BambooShaft));
			/**
			 * Wax Cresent
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Cresent, 1, 1),
					"  H",
					" S ",
					"S  ",
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Blades, 1, 2),
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_Sticks, 1, 0));
			/**
			 * Polearm
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Polearm, 1, 0),
					"  H",
					" SC",
					"S  ",
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_BambooShaft),
					Character.valueOf('C'), new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Blades, 1, 4));
			/**
			 * Wax Polearm
			 */
			GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Polearm, 1, 1),
					"  H",
					" SC",
					"S  ",
					Character.valueOf('S'), new ItemStack(ModItems.Shaolin_Sticks, 1, 0),
					Character.valueOf('C'), new ItemStack(ModItems.Shaolin_Cloths, 1, 0),
					Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Blades, 1, 4));
			/**
			 * Tools
			 */
				/**
				 * Shovel
				 */
				GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Shovel, 1, 0),
						"  H",
						" S ",
						"SB ",
						Character.valueOf('S'), new ItemStack(ModItems.Shaolin_BambooShaft),
						Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Tips, 1, 1),
						Character.valueOf('B'), new ItemStack(ModItems.Shaolin_Tips, 1, 2));
				/**
				 * Wax Shovel
				 */
				GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Shovel, 1, 1),
						"  H",
						" S ",
						"SB ",
						Character.valueOf('S'), new ItemStack(ModItems.Shaolin_Sticks, 1, 0),
						Character.valueOf('H'), new ItemStack(ModItems.Shaolin_Tips, 1, 1),
						Character.valueOf('B'), new ItemStack(ModItems.Shaolin_Tips, 1, 2));
		
		/**
		 * Shapeless Recipes.
		 */
			/**
			 * Weapons
			 */
				/**
				 * Butterfly
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Butterfly, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 0), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Dao
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Dao, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 1), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Wax Dao
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Dao, 1, 1), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 1), new ItemStack(ModItems.Shaolin_Sticks, 1, 0)
						});
				/**
				 * Hook
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Hook, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 4), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * RisingSun
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_RisingSun, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 5), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Wax RisingSun
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_RisingSun, 1, 1), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 5), new ItemStack(ModItems.Shaolin_Sticks, 1, 0)
						});
				/**
				 * Shear
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Shear, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 6), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Machete
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Machete, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 7), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Sword
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Sword, 1, 0), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 8), new ItemStack(ModItems.Shaolin_BambooShaft)
						});
				/**
				 * Wax Sword
				 */
				GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Sword, 1, 1), new Object[]
						{
							new ItemStack(ModItems.Shaolin_Blades, 1, 8), new ItemStack(ModItems.Shaolin_Sticks, 1, 0)
						});
		
	}
}
