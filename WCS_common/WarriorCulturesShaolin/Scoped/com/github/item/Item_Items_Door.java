package WarriorCulturesShaolin.Scoped.com.github.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.block.ModBlocks;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_Items_Door extends ItemDoor
{
	private String doorType;
	
	public static final String[] doorNames = new String[] {
		"CherryWood",
		"Bamboo"};
	
	public Item_Items_Door(int ID, Material material, String name)
	{
		super(ID, material);
		doorType = name;
        this.maxStackSize = 1;
        this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
	}
	
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else
        {
            ++par5;
            Block block;

            if (this.doorType == this.doorNames[0])
            {
                block = ModBlocks.CherryPaperDoor;
            }
            else
            {
                block = ModBlocks.BambooPaperDoor;
            }

            if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
            {
                if (!block.canPlaceBlockAt(par3World, par4, par5, par6))
                {
                    return false;
                }
                else
                {
                    int i1 = MathHelper.floor_double((double)((par2EntityPlayer.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                    placeDoorBlock(par3World, par4, par5, par6, i1, block);
                    --par1ItemStack.stackSize;
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister icon)
	{
		if (this.doorType == this.doorNames[0])
		{
			itemIcon = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), this.doorNames[0] + "SlidingDoor"));
		}
		else
		{
			itemIcon = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), this.doorNames[1] + "SlidingDoor"));
		}
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
