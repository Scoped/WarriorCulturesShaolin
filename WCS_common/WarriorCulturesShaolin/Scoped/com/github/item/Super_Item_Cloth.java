package WarriorCulturesShaolin.Scoped.com.github.item;

import WarriorCulturesShaolin.Scoped.com.github.WarriorCultures_Shaolin;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;
import WarriorCulturesShaolin.Scoped.com.github.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;

public class Super_Item_Cloth extends ItemArmor implements ISpecialArmor
{
	
	public Super_Item_Cloth(int id, EnumArmorMaterial enumArmorMaterial, int i, int j)
	{
		super(id, enumArmorMaterial, i, j);
		this.setCreativeTab(WarriorCultures_Shaolin.TabWCS);
		this.setUnlocalizedName(Strings.CORE_ITEM_NAME);
	}
	
	public int priority = 0;
	public int absorbtionRatio = 0;
	public int absorbtionMax = 0;
	public int slotNumber = 0;
	
	/**
	 * 
	 * @param customPriority
	 * @return
	 */
	public int setPriority(int customPriority)
	{
		return priority = customPriority;
	}
	
	/**
	 * 
	 * @param customAbsorbtionRatio
	 * @return
	 */
	public int setAbsorbtionRatio(int customAbsorbtionRatio)
	{
		return absorbtionRatio = customAbsorbtionRatio;
	}
	
	/**
	 * 
	 * @param customAbsorbtionMax
	 * @return
	 */
	public int setAbsorbtionMax(int customAbsorbtionMax)
	{
		return absorbtionMax = customAbsorbtionMax;
	}
	
	/**
	 * 
	 * @param customSlotNumber
	 * @return
	 */
	public int setSlotNumber(int customSlotNumber)
	{
		return slotNumber = customSlotNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSlotNumber()
	{
		return slotNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAbsorbtionMax()
	{
		return absorbtionMax;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAbsorbtionRatio()
	{
		return absorbtionRatio;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPriority()
	{
		return priority;
	}
	
	@Override
	
	/**
	 * First number is Priority,
	 * Second number is AbsorbRatio,
	 * Third number is AbsorbMax
	 */
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
	{
		return new ArmorProperties(this.getPriority(), this.getAbsorbtionRatio(), this.getAbsorbtionMax());
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
	{
		return this.getSlotNumber();
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
	{
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	
	public void registerIcons(IconRegister register)
	{
		itemIcon = register.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
