package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_Meta_OreBlocks extends Super_Block_Meta
{

	public Block_Meta_OreBlocks(int id)
	{
		super(id, Material.rock);
		this.setNumberOfBlocks(3);
		this.setUnlocalizedName(Strings.BLOCK_META_ORE_METAORES_NAME);
	}

}
