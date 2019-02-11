package javabuckets.mods.rcm.items.woodcutting;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemHatchet extends ItemAxe
{
	public ItemHatchet(Item.ToolMaterial toolMaterial) 
	{
		super(toolMaterial);
		this.setCreativeTab(ModCreativeTabs.rcmWoodcutting);
	}

	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}