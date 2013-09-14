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
		 * Makes 16 recipes with declaring one.
		 * Blocks with subblocks set up like so.
		 */
		for(int i = 0;i < 7;i++)
		{
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.MetaMineralBlocks, 1, i), "XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ModBlocks.MetaMineralBlocks, 1, i));
		}
		
		//GameRegistry.addRecipe(new ItemStack(ModItems.Shaolin_Butterfly, 1, 0), "XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(Item.stick, 1, 0));
		/*GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Shaolin_Butterfly), new Object[]
				{
					new ItemStack(Item.diamond), new ItemStack(Block.stone), new ItemStack(Item.dyePowder, 1, 15)
				});*/
	}
}
