package WarriorCulturesShaolin.Scoped.com.github.block;

import java.util.Random;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHalfSlab_BambooSlabs extends BlockHalfSlab
{
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide2;
	
    private String iconTopString = "BambooBlock_vertical";
    private String iconSideString = "BambooBlock_top";
    private String iconSide2String = "BambooBlock_horizontal";
	
	@SideOnly(Side.CLIENT)
	public Icon topIcon(int i)
	{
		return this.iconTop;
	}
    
	@SideOnly(Side.CLIENT)
	public Icon sideIcon(int i)
	{
		return this.iconSide;
	}
	
	@SideOnly(Side.CLIENT)
	public Icon sideIcon2(int i)
	{
		return this.iconSide2;
	}
	
	public BlockHalfSlab_BambooSlabs(int par1, boolean par2, Material par3Material)
	{
		super(par1, par2, par3Material);
		this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		useNeighborBrightness[this.blockID] = true;
	}
    
    @SideOnly(Side.CLIENT)
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int metadata)
    {
        if (side == 0)
        {
            return this.iconSide;
        }
        else if (side == 1)
        {
            return this.iconSide;
        }
        else if (side == 2)
        {
            return this.iconTop;
        }
        else if (side == 3)
        {
            return this.iconTop;
        }
        else if (side == 4)
        {
            return this.iconSide2;
        }
        else if (side == 5)
        {
            return this.iconSide2;
        }
        else
        {
        	return this.iconTop;
        }
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister iconRegister)
	{
		this.iconSide = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), this.iconTopString));
		this.iconTop = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), this.iconSideString));
		this.iconSide2 = iconRegister.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), this.iconSide2String));
	}
	
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
	public int damageDropped(int meta)
	{
		  return meta;
	}
	
    @SideOnly(Side.CLIENT)
    
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID == ModBlocks.BambooDoubleSlab.blockID ? ModBlocks.BambooSingleSlab.blockID : ModBlocks.BambooSingleSlab.blockID;
    }
    
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.BambooSingleSlab.blockID;
	}
	
	@Override
	public String getFullSlabName(int i)
	{
		return "Bamboo Slab";
	}
}
