package javabuckets.mods.rcm.skills.smithing;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModSmithingItems 
{
	public static Item hammer;
	
	public static Item bronzeBar;
	public static Item steelBar;
	public static Item silverBar;
	public static Item mithrilBar;
	public static Item adamantBar;
	public static Item runeBar;
	
	public static void init()
	{
		hammer = new ItemBase("hammer").setCreativeTab(ModCreativeTabs.rcmSmithing);
		ItemRegistry.registerItem(hammer, true);
		
		bronzeBar = new ItemRSBar("bronze_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(bronzeBar, "bronze_bar");
		
		steelBar = new ItemRSBar("steel_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(steelBar, "steel_bar");
		
		silverBar = new ItemRSBar("silver_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(silverBar, "silver_bar");
		
		mithrilBar = new ItemRSBar("mithril_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(mithrilBar, "mithril_bar");
		
		adamantBar = new ItemRSBar("adamant_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(adamantBar, "adamant_bar");

		runeBar = new ItemRSBar("rune_bar").setCreativeTab(ModCreativeTabs.rcmSmithing);
		GameRegistry.registerItem(runeBar, "rune_bar");
	}
}