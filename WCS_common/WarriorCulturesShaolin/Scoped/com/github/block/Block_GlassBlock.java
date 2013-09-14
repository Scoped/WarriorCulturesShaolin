package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_GlassBlock extends Super_Block_Glass
{

	public Block_GlassBlock(int id, Material material, boolean par3)
	{
		super(id, material, par3);
		this.setUnlocalizedName(Strings.BLOCK_GLASSBLOCK_NAME);
	}
	
}
