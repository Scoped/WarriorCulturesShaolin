package WarriorCulturesShaolin.Scoped.com.github.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Block_ThatchBlock extends Super_Block_Log
{
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	
	public Block_ThatchBlock(int id)
	{
		super(id, Material.grass);
		this.setUnlocalizedName(Strings.BLOCK_THATCHBLOCK_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	
	public Icon func_111048_c(int i)
	{
		return this.iconSide;
	}
	
	@SideOnly(Side.CLIENT)
	
	protected Icon func_111049_d(int i)
	{
		return this.iconTop;
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
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister icon)
	{
		iconSide = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_vertical"));
		iconTop = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_top"));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
