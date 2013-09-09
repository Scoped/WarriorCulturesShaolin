package WarriorCulturesShaolin.Scoped.com.github.block;

import cpw.mods.fml.common.registry.GameRegistry;
import WarriorCulturesShaolin.Scoped.com.github.item.Item_Block_MetaOres;
import WarriorCulturesShaolin.Scoped.com.github.lib.BlockIDs;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;


public class ModBlocks
{
	public static Block BambooBlock;
	public static Block CherryWoodPlanks;
	
	public static Block MetaOreBlocks;
	
	public static Block Ore1;
	public static Block Ore2;
	public static Block Ore3;
	
	public static void BlocksInit()
	{
		BambooBlock = new Block_BambooBlock(BlockIDs.BLOCK_BAMBOOBLOCK_ID);
		
		CherryWoodPlanks = new Block_CherryWoodPlanks(BlockIDs.BLOCK_PLANKS_CHERRYWOOD_ID);
		
		MetaOreBlocks = new Block_Meta_OreBlocks(BlockIDs.BLOCK_META_OREBLOCKS_ID);
		
		Ore1 = new Block_Ore_Ore1(BlockIDs.BLOCK_ORE_ORE1_ID);
		Ore2 = new Block_Ore_Ore2(BlockIDs.BLOCK_ORE_ORE2_ID);
		Ore3 = new Block_Ore_Ore3(BlockIDs.BLOCK_ORE_ORE3_ID);
		
		/**
		 * Block GameRegistry
		 */
		GameRegistry.registerBlock(BambooBlock, Strings.BLOCK_BAMBOOBLOCK_NAME);
		
		GameRegistry.registerBlock(CherryWoodPlanks, Strings.BLOCK_PLANKS_CHERRYWOOD_NAME);
		
		GameRegistry.registerBlock(MetaOreBlocks, Item_Block_MetaOres.class, Strings.BLOCK_META_ORE_METAORES_NAME);
		
		GameRegistry.registerBlock(Ore1, Strings.BLOCK_ORE_ORE1_NAME);
		GameRegistry.registerBlock(Ore2, Strings.BLOCK_ORE_ORE2_NAME);
		GameRegistry.registerBlock(Ore3, Strings.BLOCK_ORE_ORE3_NAME);
	}
}
