package javabuckets.mods.rcm.skills.mining;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.init.ModEnums;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.items.mining.ItemPickaxe;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModMiningItems 
{
	public static Item copperOre;
	public static Item tinOre;
	public static Item ironOre;
	public static Item silverOre;
	public static Item goldOre;
	public static Item mithrilOre;
	public static Item adamantiteOre;
	public static Item runiteOre;

	public static Item bronzePickaxe;
	public static Item steelPickaxe;
	public static Item mithrilPickaxe;
	public static Item adamantPickaxe;
	public static Item runePickaxe;
	public static Item dragonPickaxe;
	
	public static void init()
	{
		copperOre = new ItemRSOre("copper_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(copperOre, "ITEM_copper_ore");
		
		tinOre = new ItemRSOre("tin_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(tinOre, "ITEM_tin_ore");
		
		ironOre = new ItemRSOre("iron_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(ironOre, "ITEM_iron_ore");
		
		silverOre = new ItemRSOre("silver_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(silverOre, "ITEM_silver_ore");
		
		goldOre = new ItemRSOre("gold_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(goldOre, "ITEM_gold_ore");
		
		mithrilOre = new ItemRSOre("mithril_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(mithrilOre, "ITEM_mithril_ore");
		
		adamantiteOre = new ItemRSOre("adamantite_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(adamantiteOre, "ITEM_adamantite_ore");
		
		runiteOre = new ItemRSOre("runite_ore").setCreativeTab(ModCreativeTabs.rcmMining);
		GameRegistry.registerItem(runiteOre, "ITEM_runite_ore");

		
		
		bronzePickaxe = new ItemPickaxe(ModEnums.bronze).setUnlocalizedName("bronze_pickaxe");
		GameRegistry.registerItem(bronzePickaxe, "bronze_pickaxe");
		
		steelPickaxe = new ItemPickaxe(ModEnums.steel).setUnlocalizedName("steel_pickaxe");
		GameRegistry.registerItem(steelPickaxe, "steel_pickaxe");
		
		mithrilPickaxe = new ItemPickaxe(ModEnums.mithril).setUnlocalizedName("mithril_pickaxe");
		GameRegistry.registerItem(mithrilPickaxe, "mithril_pickaxe");
		
		adamantPickaxe = new ItemPickaxe(ModEnums.adamantite).setUnlocalizedName("adamant_pickaxe");
		GameRegistry.registerItem(adamantPickaxe, "adamant_pickaxe");
		
		runePickaxe = new ItemPickaxe(ModEnums.runite).setUnlocalizedName("rune_pickaxe");
		GameRegistry.registerItem(runePickaxe, "rune_pickaxe");
		
		dragonPickaxe = new ItemPickaxe(ModEnums.dragonTool).setUnlocalizedName("dragon_pickaxe");
		GameRegistry.registerItem(dragonPickaxe, "dragon_pickaxe");
	}
}