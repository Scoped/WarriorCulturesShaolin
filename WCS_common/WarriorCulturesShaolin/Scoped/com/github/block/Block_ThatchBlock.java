package WarriorCulturesShaolin.Scoped.com.github.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class Block_ThatchBlock extends Super_Block_LogTextures
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
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister icon)
	{
		iconSide = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_vertical"));
		iconTop = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_side"));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
