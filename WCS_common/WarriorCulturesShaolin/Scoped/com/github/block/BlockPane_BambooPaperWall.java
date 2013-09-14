package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.ForgeDirection;

public class BlockPane_BambooPaperWall extends Super_Pane
{

	protected BlockPane_BambooPaperWall(int par1, String texture, String topTexture, Material material, boolean par5)
	{
		super(par1, texture, topTexture, material, par5); // NOTE: Only topTexture is called.
		this.sideTextureIndex = topTexture;
		this.setUnlocalizedName(Strings.BLOCK_PANE_BAMBOOPAPERWALL_NAME);
	}
	
    /**
     * Gets passed in the blockID of the block adjacent and supposed to return true if its allowed to connect to the
     * type of blockID passed in. Args: blockID
     */
    public final boolean canThisPaneConnectToThisBlock(int par1)
    {
        return Block.opaqueCubeLookup[par1] || par1 == this.blockID || par1 == ModBlocks.CherryPaperWall.blockID;
    }
    
    // FORGE START
    public boolean canPaneConnectTo(IBlockAccess access, int x, int y, int z, ForgeDirection dir)
    {
        return canThisPaneConnectToThisBlock(access.getBlockId(x+dir.offsetX, y+dir.offsetY, z+dir.offsetZ)) || access.isBlockSolidOnSide(x+dir.offsetX, y+dir.offsetY, z+dir.offsetZ, dir.getOpposite(), false);
    }
}
