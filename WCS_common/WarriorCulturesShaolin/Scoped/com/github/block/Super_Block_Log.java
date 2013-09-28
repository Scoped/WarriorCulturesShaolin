package WarriorCulturesShaolin.Scoped.com.github.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
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

public class Super_Block_Log extends BlockRotatedPillar
{
	
	public Super_Block_Log (int id, Material material)
	{
		super(id, material);
		//this.setResistance(0.0F);
		//this.setHardness(0.0F);
		//this.setStepSound(soundStoneFootstep);
		this.setBurnProperties(id, 4, 8);
		this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		this.setUnlocalizedName(Strings.CORE_BLOCK_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
	protected Icon func_111048_c(int i)
	{
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
	protected Icon func_111049_d(int i)
	{
		return null;
	}
}
