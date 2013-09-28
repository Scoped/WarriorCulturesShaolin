package WarriorCulturesShaolin.Scoped.com.github.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_CherryWoodLogBlock extends Super_Block_Log
{
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	
	public Block_CherryWoodLogBlock(int id)
	{
		super(id, Material.wood);
		this.setHardness(2.0F);
		this.setStepSound(soundWoodFootstep);
		this.setUnlocalizedName(Strings.BLOCK_CHERRYWOODLOG_NAME);
	}
	
    @Override
    
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
    
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
	
	@SideOnly(Side.CLIENT)
	
	public Icon func_111048_c(int i)
	{
		i = 0;
		return this.iconSide;
	}
	
	@SideOnly(Side.CLIENT)
	
	protected Icon func_111049_d(int i)
	{
		i = 0;
		return this.iconTop;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister icon)
	{
		iconSide = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "CherryWoodLog_Side"));
		iconTop = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "CherryWoodLog_Top"));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
