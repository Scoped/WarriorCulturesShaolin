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

public class BlockHalfSlab_ThatchSlabs extends BlockHalfSlab
{
	
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide2;
	
    private String iconTopString = "ThatchBlock_vertical";
    private String iconSideString = "ThatchBlock_top";
    private String iconSide2String = "ThatchBlock_horizontal";
	
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
	
	public BlockHalfSlab_ThatchSlabs(int par1, boolean par2, Material par3Material)
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
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)par3 - 0.05D;
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID == ModBlocks.ThatchDoubleSlab.blockID ? ModBlocks.ThatchSingleSlab.blockID : ModBlocks.ThatchSingleSlab.blockID;
    }
    
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.ThatchSingleSlab.blockID;
	}
	
	@Override
	public String getFullSlabName(int i)
	{
		return "Thatch Slab";
	}
}
