package javabuckets.mods.rcm.items.herblore;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;

public class ItemHerbloreItem extends ItemBase
{
	public ItemHerbloreItem(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setCreativeTab(ModCreativeTabs.rcmHerblore);
	}
}