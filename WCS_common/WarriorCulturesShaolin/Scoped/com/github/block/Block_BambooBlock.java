package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Block_BambooBlock extends Super_Block_Log
{
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	
	public Block_BambooBlock(int id)
	{
		super(id, Material.wood);
		this.setUnlocalizedName(Strings.BLOCK_BAMBOOBLOCK_NAME);
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
		iconSide = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "BambooBlock_vertical"));
		iconTop = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "BambooBlock_top"));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
