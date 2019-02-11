package javabuckets.mods.rcm.skills.runecrafting;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModRunecraftingItems 
{
	public static Item runeEssence;
	public static Item pureEssence;
	
	public static Item airTalisman;
	public static Item bloodTalisman;
	public static Item bodyTalisman;
	public static Item chaosTalisman;
	public static Item cosmicTalisman;
	public static Item deathTalisman;
	public static Item earthTalisman;
	public static Item fireTalisman;
	public static Item lawTalisman;
	public static Item mindTalisman;
	public static Item natureTalisman;
	public static Item waterTalisman;
	public static Item omniTalisman;
	
	public static void init()
	{
		runeEssence = new ItemBase("rune_essence").setCreativeTab(ModCreativeTabs.rcmRunecrafting);
		GameRegistry.registerItem(runeEssence, "rune_essence");
		
		pureEssence = new ItemBase("pure_essence").setCreativeTab(ModCreativeTabs.rcmRunecrafting);
		GameRegistry.registerItem(pureEssence, "pure_essence");
		
		
		
		airTalisman = new ItemTalisman("air_talisman");
		GameRegistry.registerItem(airTalisman, "air_talisman");
		
		bloodTalisman = new ItemTalisman("blood_talisman");
		GameRegistry.registerItem(bloodTalisman, "blood_talisman");
		
		bodyTalisman = new ItemTalisman("body_talisman");
		GameRegistry.registerItem(bodyTalisman, "body_talisman");
		
		chaosTalisman = new ItemTalisman("chaos_talisman");
		GameRegistry.registerItem(chaosTalisman, "chaos_talisman");
		
		cosmicTalisman = new ItemTalisman("cosmic_talisman");
		GameRegistry.registerItem(cosmicTalisman, "cosmic_talisman");
		
		deathTalisman = new ItemTalisman("death_talisman");
		GameRegistry.registerItem(deathTalisman, "death_talisman");
		
		earthTalisman = new ItemTalisman("earth_talisman");
		GameRegistry.registerItem(earthTalisman, "earth_talisman");
		
		fireTalisman = new ItemTalisman("fire_talisman");
		GameRegistry.registerItem(fireTalisman, "fire_talisman");
		
		lawTalisman = new ItemTalisman("law_talisman");
		GameRegistry.registerItem(lawTalisman, "law_talisman");
		
		mindTalisman = new ItemTalisman("mind_talisman");
		GameRegistry.registerItem(mindTalisman, "mind_talisman");
		
		natureTalisman = new ItemTalisman("nature_talisman");
		GameRegistry.registerItem(natureTalisman, "nature_talisman");
		
		waterTalisman = new ItemTalisman("water_talisman");
		GameRegistry.registerItem(waterTalisman, "water_talisman");
		
		omniTalisman = new ItemTalisman("omni_talisman");
		GameRegistry.registerItem(omniTalisman, "omni_talisman");
	}
}