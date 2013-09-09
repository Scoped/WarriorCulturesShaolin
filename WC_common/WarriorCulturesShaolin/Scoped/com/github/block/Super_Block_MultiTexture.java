package WarriorCulturesShaolin.Scoped.com.github.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Super_Block_MultiTexture extends Block
{
	
	@SideOnly(Side.CLIENT)
	public static Icon icon1;
	@SideOnly(Side.CLIENT)
	public static Icon icon3;
	@SideOnly(Side.CLIENT)
	public static Icon icon2;
	
    private String IconBlock1;
    private String IconBlock2;
    private String IconBlock3;
    
    public Block setBlock1(String block1)
    {
    	this.IconBlock1 = block1;
    	return this;
    }
    
    public Block setBlock2(String block2)
    {
    	this.IconBlock2 = block2;
    	return this;
    }
    
    public Block setBlock3(String block3)
    {
    	this.IconBlock3 = block3;
    	return this;
    }
    
	public String getIconBlock1()
	{
		return this.IconBlock1;
	}

	public String getIconBlock2()
	{
		return this.IconBlock2;
	}
	
	public String getIconBlock3()
	{
		return this.IconBlock3;
	}
    
	public Super_Block_MultiTexture (int id, Material material)
	{
		super(id, material);
		//this.setResistance(0.0F);
		//this.setHardness(0.0F);
		//this.setStepSound(soundStoneFootstep);
		//this.setLightValue(0.0F);
		//this.slipperiness = 0.0F;
		this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		this.setUnlocalizedName(Strings.CORE_BLOCK_NAME);
	}
	
    /**
     * Called when the block is placed in the world.
     */
	/*
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }
	*/
    @Override
    @SideOnly(Side.CLIENT)
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int metadata)
    {
    	if(side == 0) /** 0 = bottom, 1 = top, 2 = east, 3 = west, 4 = north, and 5 = south */
    	{
    		return icon1;
    	}
    	if(side == 1)
    	{
    		return icon1;
    	}
    	if(side == 2)
    	{
    		return icon2;
    	}
    	if(side == 3)
    	{
    		return icon2;
    	}
    	if(side == 4)
    	{
    		return icon1;
    	}
    	if(side == 5)
    	{
    		return icon1;
    	}
    	else
    	{
    		return icon2; /** Returns icon1 if all of the above is false */
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
		icon1 = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getIconBlock1())));
		icon2 = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getIconBlock2())));
		icon3 = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getIconBlock3())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
