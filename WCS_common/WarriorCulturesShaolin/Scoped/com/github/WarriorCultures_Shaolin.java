package WarriorCulturesShaolin.Scoped.com.github;

import java.io.File;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import WarriorCulturesShaolin.Scoped.com.github.block.ModBlocks;
import WarriorCulturesShaolin.Scoped.com.github.core.handler.ConfigurationHandler;
import WarriorCulturesShaolin.Scoped.com.github.core.handler.LocalizationHandler;
import WarriorCulturesShaolin.Scoped.com.github.core.handler.ModRecipes;
import WarriorCulturesShaolin.Scoped.com.github.core.handler.soundEventHandler;
import WarriorCulturesShaolin.Scoped.com.github.core.proxy.CommonProxy;
import WarriorCulturesShaolin.Scoped.com.github.creativeTab.TabWCS;
import WarriorCulturesShaolin.Scoped.com.github.item.ModItems;
import WarriorCulturesShaolin.Scoped.com.github.lib.BlockRegistry;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

	@Mod(
		modid = Reference.MOD_ID ,
		name = Reference.MOD_NAME,
		version = Reference.VERSION)
	
	@NetworkMod(
		channels = (Reference.CHANNEL_NAME),
		serverSideRequired = false,
		clientSideRequired = true)

public class WarriorCultures_Shaolin
{
	
	@SidedProxy(
		clientSide = Reference.CLIENT_PROXY_LOCATION,
		serverSide = Reference.COMMON_PROXY_LOCATION)
	
	public static CommonProxy proxy;
	
    /**EnumTool*/
    public static EnumToolMaterial ShaolinTools = EnumHelper.addToolMaterial("ShaolinWeapon", 34, 123, 4.0F, 2.0F, 12);
    public static EnumArmorMaterial ShaolinCloth = EnumHelper.addArmorMaterial("ShaolinCloth", 35, new int[] {1, 1, 1, 1}, 25);
    
    /**
     * CreativeTab
     */
	public static CreativeTabs TabWCS = new TabWCS(CreativeTabs.getNextID(), Strings.TAB_WCS_NAME);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		LocalizationHandler.loadLanguages();
		
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsoluteFile() + File.separator + Reference.MOD_ID + File.separator + Reference.MOD_ID + ".cfg"));
		
		ModBlocks.BlocksInit();
		
		BlockRegistry.gameRegistry();
		
		ModItems.ItemInit();
		
		ModRecipes.recipesInit();
	}
	
	@Init
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
        Item.itemsList[ModBlocks.CherryPlanksSingleSlab.blockID] = (new ItemSlab(ModBlocks.CherryPlanksSingleSlab.blockID - 256, (BlockHalfSlab)ModBlocks.CherryPlanksSingleSlab, (BlockHalfSlab)ModBlocks.CherryPlanksDoubleSlab, false)).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLECHERRYWOOD_NAME);
        Item.itemsList[ModBlocks.BambooSingleSlab.blockID] = (new ItemSlab(ModBlocks.BambooSingleSlab.blockID - 256, (BlockHalfSlab)ModBlocks.BambooSingleSlab, (BlockHalfSlab)ModBlocks.BambooDoubleSlab, false)).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLEBAMBOO_NAME);
        Item.itemsList[ModBlocks.ThatchSingleSlab.blockID] = (new ItemSlab(ModBlocks.ThatchSingleSlab.blockID - 256, (BlockHalfSlab)ModBlocks.ThatchSingleSlab, (BlockHalfSlab)ModBlocks.ThatchDoubleSlab, false)).setUnlocalizedName(Strings.BLOCKHALFSLAB_SINGLETHATCH_NAME);
	
        MinecraftForge.EVENT_BUS.register(new soundEventHandler());
	}
}
