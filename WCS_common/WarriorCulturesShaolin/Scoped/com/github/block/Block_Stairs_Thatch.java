package WarriorCulturesShaolin.Scoped.com.github.block;

import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Stairs_Thatch extends BlockStairs
{
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	/** The block that is used as model for the stair. */
    private final Block modelBlock;
    private final int modelBlockMetadata;
    
	protected Block_Stairs_Thatch(int id, Block block, int par3)
	{
		super(id, block, par3);
        this.modelBlock = block;
        this.modelBlockMetadata = par3;
        this.setHardness(block.blockHardness);
        this.setResistance(block.blockResistance / 3.0F);
        this.setStepSound(block.stepSound);
        this.setLightOpacity(1);
        this.setUnlocalizedName(Strings.BLOCK_STAIRS_THATCH_NAME);
        this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
	}
	
	@SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int metadata)
    {
        int k = metadata & 12;
        int l = metadata & 3;
        return k == 0 && (side == 1 || side == 0) ? this.func_111049_d(l) :
        	(k == 4 && (side == 5 || side == 4) ? this.func_111049_d(l) :
        		(k == 8 && (side == 2 || side == 3) ? this.func_111049_d(l) :
        			this.func_111048_c(l)));
    }

	@SideOnly(Side.CLIENT)
	
	public Icon func_111048_c(int i)
	{
		i = 0;
		return this.iconTop;
	}
	
	@SideOnly(Side.CLIENT)
	
	protected Icon func_111049_d(int i)
	{
		i = 0;
		return this.iconSide;
	}
    
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister register)
    {
    	iconSide = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_top"));
    	iconTop = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "ThatchBlock_vertical"));
    }
}
