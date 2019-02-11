package javabuckets.mods.rcm.skills.fletching;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModFletchingItems 
{
	public static Item knife;
	
	public static void init()
	{
		knife = new ItemBase("knife").setCreativeTab(ModCreativeTabs.rcmFletching);
		ItemRegistry.registerItem(knife, true);
	}
}