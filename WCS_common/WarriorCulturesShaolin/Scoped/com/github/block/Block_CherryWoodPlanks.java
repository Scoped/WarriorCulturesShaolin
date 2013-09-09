package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_CherryWoodPlanks extends Super_Block_Block
{

	public Block_CherryWoodPlanks(int id)
	{
		super(id, Material.wood);
		this.setUnlocalizedName(Strings.BLOCK_PLANKS_CHERRYWOOD_NAME);
		this.setBurnProperties(id, 4, 8);
	}

}
