package WarriorCulturesShaolin.Scoped.com.github.block;

import java.util.Random;

import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Super_Block_Ores extends Block
{

		public Super_Block_Ores(int id, Material material)
		{
			super(id, material);
			this.setResistance(10.0F);
			this.setHardness(5.0F);
			//this.setBurnProperties(id, 4, 8);
			//this.setLightValue(0.0F);
			this.setStepSound(soundStoneFootstep);
			//this.setCreativeTab(WarriorCulturesShaolin.TabWCS);
			this.setUnlocalizedName(Strings.CORE_BLOCK_NAME);
		}
		
	    /**
	     * Returns the ID of the items to drop on destruction.
	     */
	    public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return this.blockID;
	    }
	    
	    /**
	     * Returns the quantity of items to drop on block destruction.
	     */
	    public int quantityDropped(Random par1Random)
	    {
	        return this.blockID;
	    }
	    
	    /**
	     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
	     */
	    public int quantityDroppedWithBonus(int par1, Random par2Random)
	    {
	        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
	        {
	            int j = par2Random.nextInt(par1 + 2) - 1;

	            if (j < 0)
	            {
	                j = 0;
	            }

	            return this.quantityDropped(par2Random) * (j + 1);
	        }
	        else
	        {
	            return this.quantityDropped(par2Random);
	        }
	    }
		
		@Override
		@SideOnly(Side.CLIENT)
		
	    /**
	     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	     * is the only chance you get to register icons.
	     */
		
		public void registerIcons(IconRegister register)
		{
			blockIcon = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		}
		
		protected String getUnwrappedUnlocalizedName(String unlocalizedName)
		{
			return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
		}

}
