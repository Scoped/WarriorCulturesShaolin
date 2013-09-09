package WarriorCulturesShaolin.Scoped.com.github.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemShoalinWeapon extends Item
{
	
	public ItemShoalinWeapon(int par1)
	{
		super(par1);
		this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister icon)
	{
		itemIcon = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
	
}
