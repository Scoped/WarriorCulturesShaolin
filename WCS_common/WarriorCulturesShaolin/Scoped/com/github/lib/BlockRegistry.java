package WarriorCulturesShaolin.Scoped.com.github.lib;

import WarriorCulturesShaolin.Scoped.com.github.TileEntities.TE_BambooFence;
import WarriorCulturesShaolin.Scoped.com.github.block.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry
{

	public static void gameRegistry()
	{
		
		/**
		 * Block Registration
		 */
		GameRegistry.registerBlock(ModBlocks.BambooBlock, Strings.BLOCK_BAMBOOBLOCK_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryWoodPlanks, Strings.BLOCK_PLANKS_CHERRYWOOD_NAME);
		GameRegistry.registerBlock(ModBlocks.BambooSingleSlab, Strings.BLOCKHALFSLAB_SINGLEBAMBOO_NAME);
		GameRegistry.registerBlock(ModBlocks.BambooDoubleSlab, Strings.BLOCKHALFSLAB_DOUBLEBAMBOO_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryPlanksSingleSlab, Strings.BLOCKHALFSLAB_SINGLECHERRYWOOD_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryPlanksDoubleSlab, Strings.BLOCKHALFSLAB_DOUBLECHERRYWOOD_NAME);
		GameRegistry.registerBlock(ModBlocks.ThatchSingleSlab, Strings.BLOCKHALFSLAB_SINGLETHATCH_NAME);
		GameRegistry.registerBlock(ModBlocks.ThatchDoubleSlab, Strings.BLOCKHALFSLAB_DOUBLETHATCH_NAME);
		GameRegistry.registerBlock(ModBlocks.BambooPaperWall, Strings.BLOCK_PANE_BAMBOOPAPERWALL_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryPaperWall, Strings.BLOCK_PANE_CHERRYPAPERWALL_NAME);
		GameRegistry.registerBlock(ModBlocks.ThatchBlock, Strings.BLOCK_THATCHBLOCK_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryWoodLog, Strings.BLOCK_CHERRYWOODLOG_NAME);
		GameRegistry.registerBlock(ModBlocks.WaxWoodLog, Strings.BLOCK_WAXWOODLOG_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryBlossoms, Strings.BLOCK_LEAVES_CHERRYBLOSSOMS_NAME);
		GameRegistry.registerBlock(ModBlocks.CherryWoodStairs, Strings.BLOCK_STAIRS_CHERRYWOOD_NAME);
		GameRegistry.registerBlock(ModBlocks.BambooWoodStairs, Strings.BLOCK_STAIRS_BAMBOOWOOD_NAME);
		GameRegistry.registerBlock(ModBlocks.ThatchStairs, Strings.BLOCK_STAIRS_THATCH_NAME);
		GameRegistry.registerBlock(ModBlocks.BambooFence, Strings.BLOCK_FENCE_BAMBOO_NAME);
		
		/**
		 * TileEntity Registration
		 */
        GameRegistry.registerTileEntity(TE_BambooFence.class, "BambooFenceTE");
		
	}

}
