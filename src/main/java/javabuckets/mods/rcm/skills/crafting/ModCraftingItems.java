package javabuckets.mods.rcm.skills.crafting;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModCraftingItems 
{
	public static Item chisel;
	
	public static void init()
	{
		chisel = new ItemBase("chisel").setCreativeTab(ModCreativeTabs.rcmCrafting);
		ItemRegistry.registerItem(chisel, true);
	}
}