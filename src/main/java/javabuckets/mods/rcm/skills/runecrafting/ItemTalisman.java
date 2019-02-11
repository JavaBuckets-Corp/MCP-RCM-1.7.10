package javabuckets.mods.rcm.skills.runecrafting;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;

public class ItemTalisman extends ItemBase
{
	public ItemTalisman(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setCreativeTab(ModCreativeTabs.rcmRunecrafting);
		this.setMaxStackSize(1);
	}
}