package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class DropTable 
{
	public static Item bead_black, bead_red, bead_yellow, bead_white;
	public static Item bear_fur;
	public static Item unicorn_horn;
	public static Item red_spiders_eggs;
	public static Item cockatrice_egg;
	
	public static void init()
	{
		bead_black = new ItemBase("black_bead").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(bead_black, false);
		bead_red = new ItemBase("red_bead").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(bead_red, false);
		bead_yellow = new ItemBase("yellow_bead").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(bead_yellow, false);
		bead_white = new ItemBase("white_bead").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(bead_white, false);
		
		bear_fur = new ItemBase("bear_fur").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(bear_fur, false);
		
		unicorn_horn = new ItemBase("unicorn_horn").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(unicorn_horn, false);
		
		red_spiders_eggs = new ItemBase("red_spiders_eggs").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(red_spiders_eggs, false);
		
		cockatrice_egg = new ItemBase("cockatrice_egg").setCreativeTab(ModCreativeTabs.rcmLoot);
		ItemRegistry.registerItem(cockatrice_egg, false);
	}
}