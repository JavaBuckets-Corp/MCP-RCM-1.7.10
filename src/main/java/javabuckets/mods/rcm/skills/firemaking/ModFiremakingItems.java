package javabuckets.mods.rcm.skills.firemaking;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.items.firemaking.ItemTinderbox;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModFiremakingItems 
{
	public static Item tinderbox;
	
	public static Item ashes;
	
	public static void init()
	{
		tinderbox = new ItemTinderbox("tinderbox");
		ItemRegistry.registerItem(tinderbox, true);
		
		ashes = new ItemBase("ashes").setCreativeTab(ModCreativeTabs.rcmItems);
		ItemRegistry.registerItem(ashes, false);
	}
}