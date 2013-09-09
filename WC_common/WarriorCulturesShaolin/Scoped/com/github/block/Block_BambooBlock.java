package WarriorCulturesShaolin.Scoped.com.github.block;

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

public class Block_BambooBlock extends Super_Block_MultiTexture
{
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	public Block_BambooBlock(int id)
	{
		super(id, Material.wood);
		this.setBlock1("BambooBlock_horizontal");
		this.setBlock2("BambooBlock_poles");
		this.setBlock3("BambooBlock_vertical");
		this.setUnlocalizedName(Strings.BLOCK_BAMBOOBLOCK_NAME);
	}
}
