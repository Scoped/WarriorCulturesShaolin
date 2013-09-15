package WarriorCulturesShaolin.Scoped.com.github.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemShears;
import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;

public class Item_Tool_Shaolin_Shear extends ItemShears
{

	public Item_Tool_Shaolin_Shear(int par1, EnumToolMaterial enumToolMaterial)
	{
		super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(250);
        this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		this.setUnlocalizedName(Strings.ITEM_SHAOLIN_SHEAR_NAME);
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
