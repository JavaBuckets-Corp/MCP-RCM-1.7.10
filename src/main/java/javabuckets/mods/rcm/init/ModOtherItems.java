package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModOtherItems 
{
	public static Item shears;
	
	public static void init()
	{
		shears = new ItemBase("shears");
		ItemRegistry.registerItem(shears, false);
	}
}