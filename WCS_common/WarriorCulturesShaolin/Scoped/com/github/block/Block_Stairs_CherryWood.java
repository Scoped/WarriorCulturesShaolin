package WarriorCulturesShaolin.Scoped.com.github.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Stairs_CherryWood extends BlockStairs
{
	/** The block that is used as model for the stair. */
    private final Block modelBlock;
    private final int modelBlockMetadata;
	
	protected Block_Stairs_CherryWood(int par1, Block par2Block, int par3)
	{
		super(par1, par2Block, par3);
        this.modelBlock = par2Block;
        this.modelBlockMetadata = par3;
        this.setHardness(par2Block.blockHardness);
        this.setResistance(par2Block.blockResistance / 3.0F);
        this.setStepSound(par2Block.stepSound);
        this.setLightOpacity(1);
        this.setUnlocalizedName(Strings.BLOCK_STAIRS_CHERRYWOOD_NAME);
        this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
	}
    
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return this.modelBlock.getIcon(par1, this.modelBlockMetadata);
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
    	
    }
}
