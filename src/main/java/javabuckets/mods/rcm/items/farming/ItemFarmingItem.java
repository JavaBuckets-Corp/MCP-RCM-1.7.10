package javabuckets.mods.rcm.items.farming;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;

public class ItemFarmingItem extends ItemBase
{
	public ItemFarmingItem(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setCreativeTab(ModCreativeTabs.rcmFarming);
	}
}