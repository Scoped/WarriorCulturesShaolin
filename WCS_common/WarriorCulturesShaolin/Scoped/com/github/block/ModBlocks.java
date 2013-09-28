package WarriorCulturesShaolin.Scoped.com.github.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import WarriorCulturesShaolin.Scoped.com.github.lib.BlockIDs;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;


public class ModBlocks
{
	public static Block BambooBlock;
	public static Block CherryWoodPlanks;
	public static Block ThatchBlock;
	public static Block BambooPaperWall;
	public static Block CherryPaperWall;
	public static Block CherryWoodLog;
	public static Block WaxWoodLog;
	public static Block CherryWoodStairs;
	public static Block BambooWoodStairs;
	public static Block ThatchStairs;
	
	public static Block CherryPaperDoor;
	public static Block BambooPaperDoor;
	
	public static Block_Leaves_CherryBlossoms CherryBlossoms;
	
	public static BlockHalfSlab CherryPlanksSingleSlab;
	public static BlockHalfSlab CherryPlanksDoubleSlab;
	public static BlockHalfSlab BambooSingleSlab;
	public static BlockHalfSlab BambooDoubleSlab;
	public static BlockHalfSlab ThatchSingleSlab;
	public static BlockHalfSlab ThatchDoubleSlab;
	
	public static void BlocksInit()
	{
		BambooBlock = new Block_BambooBlock(BlockIDs.BLOCK_BAMBOOBLOCK_ID);
		CherryWoodPlanks = new Block_CherryWoodPlanks(BlockIDs.BLOCK_PLANKS_CHERRYWOOD_ID);
		CherryPlanksSingleSlab = (BlockHalfSlab) new BlockHalfSlab_CherryPlanksSlab(BlockIDs.BLOCKHALFSLAB_CHERRYPLANKSSINGLESLAB_ID, false, Material.wood).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLECHERRYWOOD_NAME).setStepSound(Block.soundWoodFootstep);
		CherryPlanksDoubleSlab = (BlockHalfSlab)new BlockHalfSlab_CherryPlanksSlab(BlockIDs.BLOCKHALFSLAB_CHERRYPLANKSDOUBLESLAB_ID, true, Material.wood).setUnlocalizedName(Strings.BLOCKHALFSLAB_DOUBLECHERRYWOOD_NAME).setStepSound(Block.soundWoodFootstep);
		BambooSingleSlab = (BlockHalfSlab)new BlockHalfSlab_BambooSlabs(BlockIDs.BLOCKHALFSLAB_BAMBOOSINGLESLAB_ID, false, Material.wood).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLEBAMBOO_NAME).setStepSound(Block.soundWoodFootstep);
		BambooDoubleSlab = (BlockHalfSlab)new BlockHalfSlab_BambooSlabs(BlockIDs.BLOCKHALFSLAB_BAMBOODOUBLESLAB_ID, true, Material.wood).setUnlocalizedName(Strings.BLOCKHALFSLAB_DOUBLEBAMBOO_NAME).setStepSound(Block.soundWoodFootstep);
		ThatchSingleSlab = (BlockHalfSlab)new BlockHalfSlab_ThatchSlabs(BlockIDs.BLOCKHALFSLAB_THATCHSINGLESLAB_ID, false, Material.grass).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLETHATCH_NAME).setStepSound(Block.soundGrassFootstep);
		ThatchDoubleSlab = (BlockHalfSlab)new BlockHalfSlab_ThatchSlabs(BlockIDs.BLOCKHALFSLAB_THATCHDOUBLESLAB_ID, true, Material.grass).setUnlocalizedName(Strings.BLOCKHALFSLAB_DOUBLETHATCH_NAME).setStepSound(Block.soundGrassFootstep);
		BambooPaperWall = new BlockPane_BambooPaperWall(BlockIDs.BLOCK_PANE_BAMBOOPAPERWALL_ID, "BambooPaperWall", "BambooBlock_horizontal", Material.cactus, false);
		CherryPaperWall = new BlockPane_CherryPaperWall(BlockIDs.BLOCK_PANE_CHERRYPAPERWALL_ID, "CherryPaperWall", "CherryWoodPlanks", Material.cactus, false);
		ThatchBlock = new Block_ThatchBlock(BlockIDs.BLOCK_THATCHBLOCK_ID);
		CherryWoodLog = new Block_CherryWoodLogBlock(BlockIDs.BLOCK_CHERRYWOODLOG_ID);
		WaxWoodLog = new Block_WaxWoodLogBlock(BlockIDs.BLOCK_WAXWOODLOG_ID);
		CherryBlossoms = (Block_Leaves_CherryBlossoms)new Block_Leaves_CherryBlossoms(BlockIDs.BLOCK_LEAVES_CHERRYBLOSSOMS_ID).func_111022_d("Blossoms");
		CherryWoodStairs = new Block_Stairs_CherryWood(BlockIDs.BLOCK_STAIRS_CHERRYWOOD_ID, CherryWoodPlanks, 0);
		BambooWoodStairs = new Block_Stairs_Bamboo(BlockIDs.BLOCK_STAIRS_BAMBOOWOOD_ID, BambooBlock, 0);
		ThatchStairs = new Block_Stairs_Thatch(BlockIDs.BLOCK_STAIRS_THATCH_ID, ThatchBlock, 0);
		
		CherryPaperDoor = new Block_Door_CherryPaper(BlockIDs.BLOCK_DOOR_CHERRYPAPER_ID, Material.wood, "CherryWood").setUnlocalizedName(Strings.BLOCK_DOOR_CHERRYPAPER_NAME).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).func_111022_d("CherryPaperWall");
		BambooPaperDoor = new Block_Door_BambooPaper(BlockIDs.BLOCK_DOOR_BAMBOOPAPER_ID, Material.wood, "Bamboo").setUnlocalizedName(Strings.BLOCK_DOOR_BAMBOOPAPER_NAME).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).func_111022_d("BambooPaperWall");
		
	}
}
