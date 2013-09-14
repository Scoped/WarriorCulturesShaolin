package WarriorCulturesShaolin.Scoped.com.github.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

public class Item_Tool_Shaolin_Shovel extends Super_Item_Spade
{
    /** an array of the blocks this spade is effective against */
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};
	
	public Item_Tool_Shaolin_Shovel(int par1, EnumToolMaterial enumToolMaterial)
	{
		super(par1, 1.0F, enumToolMaterial, blocksEffectiveAgainst);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_SHOVEL_NAME);
	}
}
