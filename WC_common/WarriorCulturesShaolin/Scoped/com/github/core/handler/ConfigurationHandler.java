package WarriorCulturesShaolin.Scoped.com.github.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import WarriorCulturesShaolin.Scoped.com.github.lib.BlockIDs;
import WarriorCulturesShaolin.Scoped.com.github.lib.ItemIDs;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler
{
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		try
		{
			config.load();
			
			/**
			 * Block Configuration
			 */
			BlockIDs.BLOCK_BAMBOOBLOCK_ID = config.getBlock(Strings.BLOCK_BAMBOOBLOCK_NAME, BlockIDs.BLOCK_BAMBOOBLOCK_ID_DEFAULT).getInt(BlockIDs.BLOCK_BAMBOOBLOCK_ID_DEFAULT);
			BlockIDs.BLOCK_PLANKS_CHERRYWOOD_ID = config.getBlock(Strings.BLOCK_PLANKS_CHERRYWOOD_NAME, BlockIDs.BLOCK_PLANKS_CHERRYWOOD_ID_DEFAULT).getInt(BlockIDs.BLOCK_PLANKS_CHERRYWOOD_ID_DEFAULT);
			
			BlockIDs.BLOCK_META_OREBLOCKS_ID = config.getBlock(Strings.BLOCK_META_ORE_METAORES_NAME, BlockIDs.BLOCK_META_OREBLOCKS_ID_DEFAULT).getInt(BlockIDs.BLOCK_META_OREBLOCKS_ID_DEFAULT);
			
			BlockIDs.BLOCK_ORE_ORE1_ID = config.getBlock(Strings.BLOCK_ORE_ORE1_NAME, BlockIDs.BLOCK_ORE_ORE1_ID_DEFAULT).getInt(BlockIDs.BLOCK_ORE_ORE1_ID_DEFAULT);
			BlockIDs.BLOCK_ORE_ORE2_ID = config.getBlock(Strings.BLOCK_ORE_ORE2_NAME, BlockIDs.BLOCK_ORE_ORE2_ID_DEFAULT).getInt(BlockIDs.BLOCK_ORE_ORE2_ID_DEFAULT);
			BlockIDs.BLOCK_ORE_ORE3_ID = config.getBlock(Strings.BLOCK_ORE_ORE3_NAME, BlockIDs.BLOCK_ORE_ORE3_ID_DEFAULT).getInt(BlockIDs.BLOCK_ORE_ORE3_ID_DEFAULT);
			
			/**
			 * Item Configuration
			 */
			ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_SHAOLIN_LEGS_ID = config.getItem(Strings.ITEM_SHAOLIN_STUDENT_LEGS_NAME, ItemIDs.ITEM_SHAOLIN_STUDENT_LEGS_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_STUDENT_LEGS_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_ROBE_ID = config.getItem(Strings.ITEM_SHAOLIN_STUDENT_ROBE_NAME, ItemIDs.ITEM_SHAOLIN_STUDENT_ROBE_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_STUDENT_ROBE_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_HEADBAND_ID = config.getItem(Strings.ITEM_SHAOLIN_STUDENT_HEADBAND_NAME, ItemIDs.ITEM_SHAOLIN_STUDENT_HEADBAND_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_STUDENT_HEADBAND_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_SHOES_ID = config.getItem(Strings.ITEM_SHAOLIN_STUDENT_SHOES_NAME, ItemIDs.ITEM_SHAOLIN_STUDENT_SHOES_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_STUDENT_SHOES_ID_DEFAULT);
			/*
			ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_KNIFE_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_SABRE_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_RISINGSUN_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_SHAOLIN_HALBERD_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_SHAOLIN_SHOVEL_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_SHAOLIN_SHEARS_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_MONK_RATTANHATSHIELD_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_ROBES_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_SHOES_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_PANTS_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_MONK_ROPEDART_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_HOOKBLADE_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_SWORD_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_MASTERSTAFF_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			
			ItemIDs.ITEM_MONK_SPEAR_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			ItemIDs.ITEM_MONK_POLEARM_ID = config.getItem(Strings.ITEM_SHAOLIN_BROADSWORD_NAME, ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT).getInt(ItemIDs.ITEM_SHAOLIN_BROADSWORD_ID_DEFAULT);
			*/
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the cofig file!");
		}
		finally
		{
			config.save();
		}
	}
}