package javabuckets.mods.rcm.items.armory;

import javabuckets.mods.rcm.init.ModArmor;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemRSArmor extends ItemArmor
{
	public ItemRSArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) 
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(ModCreativeTabs.rcmMelee);
	}
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) 
	{
		String path = ":textures/armor/";
		
		if ((itemstack.getItem() == ModArmor.bronzeHelm) || (itemstack.getItem() == ModArmor.bronzePlatebody) || (itemstack.getItem() == ModArmor.bronzeBoots))
		{
			return Reference.MOD_ID + path + "bronzeArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.bronzePlatelegs)
		{
			return Reference.MOD_ID + path + "bronzeArmor_2.png";
		}
		
		if ((itemstack.getItem() == ModArmor.steelHelm) || (itemstack.getItem() == ModArmor.steelPlatebody) || (itemstack.getItem() == ModArmor.steelBoots))
		{
			return Reference.MOD_ID + path + "steelArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.steelPlatelegs)
		{
			return Reference.MOD_ID + path + "steelArmor_2.png";
		}
		
		if ((itemstack.getItem() == ModArmor.mithrilHelm) || (itemstack.getItem() == ModArmor.mithrilPlatebody) || (itemstack.getItem() == ModArmor.mithrilBoots))
		{
			return Reference.MOD_ID + path + "mithrilArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.mithrilPlatelegs)
		{
			return Reference.MOD_ID + path + "mithrilArmor_2.png";
		}
		
		if ((itemstack.getItem() == ModArmor.adamantHelm) || (itemstack.getItem() == ModArmor.adamantPlatebody) || (itemstack.getItem() == ModArmor.adamantBoots))
		{
			return Reference.MOD_ID + path + "adamantArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.adamantPlatelegs)
		{
			return Reference.MOD_ID + path + "adamantArmor_2.png";
		}
		
		if ((itemstack.getItem() == ModArmor.runeHelm) || (itemstack.getItem() == ModArmor.runePlatebody) || (itemstack.getItem() == ModArmor.runeBoots))
		{
			return Reference.MOD_ID + path + "runeArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.runePlatelegs)
		{
			return Reference.MOD_ID + path + "runeArmor_2.png";
		}
		
		if ((itemstack.getItem() == ModArmor.dragonHelm) || (itemstack.getItem() == ModArmor.dragonPlatebody) || (itemstack.getItem() == ModArmor.dragonBoots))
		{
			return Reference.MOD_ID + path + "dragonArmor_1.png";
		}
		if (itemstack.getItem() == ModArmor.dragonPlatelegs)
		{
			return Reference.MOD_ID + path + "dragonArmor_2.png";
		}
		
		return null;
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegistry) 
	{
		itemIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}