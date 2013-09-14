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
	public static Block WCSGlassBlock;
	public static Block WCSGlassPane;
	
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
		WCSGlassBlock = new Block_GlassBlock(BlockIDs.BLOCK_GLASSBLOCK_ID, Material.glass, false);
		ThatchBlock = new Block_ThatchBlock(BlockIDs.BLOCK_THATCHBLOCK_ID);
		
	}
}
