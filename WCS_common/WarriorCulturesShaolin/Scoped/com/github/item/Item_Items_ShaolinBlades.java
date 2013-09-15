package WarriorCulturesShaolin.Scoped.com.github.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_Items_ShaolinBlades extends Super_Item
{
	/** List of blade types. */
    public static final String[] bladeTypes = new String[] {"Butterfly", "Dao", "Cresent", "Hook", "Polearm", "RisingSun", "Shear", "Machete", "Sword"};
    public static final String[] field_94595_b = new String[] {"Butterfly", "Dao", "Cresent", "Hook", "Polearm", "RisingSun", "Shear", "Machete", "Sword"};
    @SideOnly(Side.CLIENT)
    private Icon[] field_94594_d;
    
	public Item_Items_ShaolinBlades(int par1)
	{
		super(par1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
    @SideOnly(Side.CLIENT)

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, bladeTypes.length);
        return this.field_94594_d[j];
    }
	
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, bladeTypes.length);
        return super.getUnlocalizedName() + bladeTypes[i] + "Blade";
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < bladeTypes.length; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon)
    {
        this.field_94594_d = new Icon[field_94595_b.length];

        for (int i = 0; i < field_94595_b.length; ++i)
        {
            this.field_94594_d[i] = icon.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.func_111208_A() + field_94595_b[i] + "Blade")));
        }
    }
    
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
