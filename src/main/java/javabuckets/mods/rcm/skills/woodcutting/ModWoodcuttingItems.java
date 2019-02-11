package javabuckets.mods.rcm.skills.woodcutting;

import javabuckets.mods.rcm.init.ModEnums;
import javabuckets.mods.rcm.items.woodcutting.ItemHatchet;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModWoodcuttingItems 
{
	public static Item bronzeHatchet;
	public static Item steelHatchet;
	public static Item mithrilHatchet;
	public static Item adamantHatchet;
	public static Item runeHatchet;
	public static Item dragonHatchet;
	
	public static void init()
	{
		bronzeHatchet = new ItemHatchet(ModEnums.bronze).setUnlocalizedName("bronze_hatchet");
		GameRegistry.registerItem(bronzeHatchet, "bronze_hatchet");
		
		steelHatchet = new ItemHatchet(ModEnums.steel).setUnlocalizedName("steel_hatchet");
		GameRegistry.registerItem(steelHatchet, "steel_hatchet");
		
		mithrilHatchet = new ItemHatchet(ModEnums.mithril).setUnlocalizedName("mithril_hatchet");
		GameRegistry.registerItem(mithrilHatchet, "mithril_hatchet");
		
		adamantHatchet = new ItemHatchet(ModEnums.adamantite).setUnlocalizedName("adamant_hatchet");
		GameRegistry.registerItem(adamantHatchet, "adamant_hatchet");
		
		runeHatchet = new ItemHatchet(ModEnums.runite).setUnlocalizedName("rune_hatchet");
		GameRegistry.registerItem(runeHatchet, "rune_hatchet");
		
		dragonHatchet = new ItemHatchet(ModEnums.dragonTool).setUnlocalizedName("dragon_hatchet");
		GameRegistry.registerItem(dragonHatchet, "dragon_hatchet");
	}
}