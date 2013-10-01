package WarriorCulturesShaolin.Scoped.com.github.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class Block_Stairs_Bamboo extends BlockStairs
{
	@SideOnly(Side.CLIENT)
	public static Icon iconTop;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide;
	@SideOnly(Side.CLIENT)
	public static Icon iconSide2;
	/** The block that is used as model for the stair. */
    private final Block modelBlock;
    private final int modelBlockMetadata;
	
	protected Block_Stairs_Bamboo(int id, Block block, int par3)
	{
		super(id, block, par3);
        this.modelBlock = block;
        this.modelBlockMetadata = par3;
        this.setHardness(block.blockHardness);
        this.setResistance(block.blockResistance / 3.0F);
        this.setStepSound(block.stepSound);
        this.setLightOpacity(1);
        this.setUnlocalizedName(Strings.BLOCK_STAIRS_BAMBOOWOOD_NAME);
        this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
	}
    
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    /**
     * The side the texture is facing:
     * 0 = bottom
	 * 1 = top
	 * 2 = north
	 * 3 = south
	 * 4 = west
	 * 5 = east
	 * 
     * When placing block, metadata:
     * 0 = east
     * 1 = west
     * 2 = south
     * 3 = north
     * 
     * When placing block upside down, metadata:
     * 4 = east
     * 5 = west
     * 6 = south
     * 7 = north
     */
    /**
     * I think for complete customization use metadata = number && (side == number) ? icon
     */
    public Icon getIcon(int side, int metadata)
    {
        return
        		/**Normal. Top and bottom facing textures.*/
        		metadata == 0 && (side == 0 || side == 1) ? this.icon_side() : // Normal. Place facing east.
        			metadata == 1 && (side == 0 || side == 1) ? this.icon_side() : // Normal. Place facing west.
        				metadata == 2 && (side == 0 || side == 1) ? this.icon_side2() : // Normal. Place facing south.
        					metadata == 3 && (side == 0 || side == 1) ? this.icon_side2() : //Normal. Place facing north.
        						/**Normal. North and south facing textures.*/
	        					metadata == 0 && (side == 2 || side == 3) ? this.icon_top() : // Normal. Place facing east.
	        		        		metadata == 1 && (side == 2 || side == 3) ? this.icon_top() : // Normal. Place facing west.
	        		        			metadata == 2 && (side == 2 || side == 3) ? this.icon_side2() : // Normal. Place facing south.
	        		        				metadata == 3 && (side == 2 || side == 3) ? this.icon_side2() : //Normal. Place facing north.
	        		        					/**Normal. West and east facing textures.*/
	        		        					metadata == 0 && (side == 4 || side == 5) ? this.icon_side2() : // Normal. Place facing east.
	        		        		        		metadata == 1 && (side == 4 || side == 5) ? this.icon_side2() : // Normal. Place facing west.
	        		        		        			metadata == 2 && (side == 4 || side == 5) ? this.icon_top() : // Normal. Place facing south.
	        		        		        				metadata == 3 && (side == 4 || side == 5) ? this.icon_top() : //Normal. Place facing north.
	        	/**Upside down. Top and bottom facing textures*/
				metadata == 4 && (side == 0 || side == 1) ? this.icon_side() : // Upside down. Place facing east.
					metadata == 5 && (side == 0 || side == 1) ? this.icon_side() : // Upside down. Place facing west.
						metadata == 6 && (side == 0 || side == 1) ? this.icon_side2() : // Upside down. Place facing south.
							metadata == 7 && (side == 0 || side == 1) ? this.icon_side2() : //Upside down. Place facing north.
        						/**Upside down. North and south facing textures.*/
	        					metadata == 4 && (side == 2 || side == 3) ? this.icon_top() : // Normal. Place facing east.
	        		        		metadata == 5 && (side == 2 || side == 3) ? this.icon_top() : // Normal. Place facing west.
	        		        			metadata == 6 && (side == 2 || side == 3) ? this.icon_side2() : // Normal. Place facing south.
	        		        				metadata == 7 && (side == 2 || side == 3) ? this.icon_side2() : //Normal. Place facing north.
	        		        					/**Upside down. West and east facing textures.*/
	        		        					metadata == 4 && (side == 4 || side == 5) ? this.icon_side2() : // Normal. Place facing east.
	        		        		        		metadata == 5 && (side == 4 || side == 5) ? this.icon_side2() : // Normal. Place facing west.
	        		        		        			metadata == 6 && (side == 4 || side == 5) ? this.icon_top() : // Normal. Place facing south.
	        		        		        				metadata == 7 && (side == 4 || side == 5) ? this.icon_top() : //Normal. Place facing north.
	        					
        					   
        this.icon_top();
    }
    
	@SideOnly(Side.CLIENT)
	
	public Icon icon_top()
	{
		return this.iconTop;
	}
	
	@SideOnly(Side.CLIENT)
	
	public Icon icon_side()
	{
		return this.iconSide;
	}
    
	@SideOnly(Side.CLIENT)
	
	public Icon icon_side2()
	{
		return this.iconSide2;
	}
	
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister register)
    {
    	iconTop = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "BambooBlock_top"));
    	iconSide = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "BambooBlock_vertical"));
    	iconSide2 = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "BambooBlock_horizontal"));
    }
}
