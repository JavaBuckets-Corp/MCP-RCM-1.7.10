package javabuckets.mods.rcm.items.weaponry;

import java.util.List;

import com.google.common.collect.Multimap;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemSword extends net.minecraft.item.ItemSword
{
	private double weaponDamage;
	private double defaultWeaponDamage = 4D;
	public double strengthBonus = RCM.instance.skillHandler.getLevel(SkillReference.str) * 125 / (double)100;
	
	public ItemSword(String unlocalizedName, Item.ToolMaterial toolMaterial) 
	{
		super(toolMaterial);
		this.setUnlocalizedName(unlocalizedName);
		this.weaponDamage = defaultWeaponDamage + (double)toolMaterial.getDamageVsEntity();
		this.setCreativeTab(ModCreativeTabs.rcmMelee);
	}
	
	/*public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
    {
    	String s = "" + this.weaponDamage;
    	
    	if (this.weaponDamage < 10F) 
    	{
    		par3List.add(EnumChatFormatting.BLUE + "+" + s + " Weapon Damage"); 
    	}   	
    	else 
    	{ 
    		par3List.add(EnumChatFormatting.BLUE + "+" + s + " Weapon Damage"); 
    	}
    	
    	par3List.add(EnumChatFormatting.BLUE + "+" + this.strengthBonus + " Strength Bonus Damage");
    }*/

	@Override
	public Multimap getItemAttributeModifiers() 
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", this.weaponDamage + this.strengthBonus, 0));
		return multimap;
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegistry) 
	{
		itemIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
