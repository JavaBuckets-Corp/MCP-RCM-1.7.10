package javabuckets.mods.rcm.skills.summoning;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.items.summoning.PouchSpirirwolf;
import javabuckets.mods.rcm.utility.ItemRegistry;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.item.Item;

public class ModSummoningItems 
{
	public static Item emptyPouch;
	public static Item spiritShards;
	
	public static Item goldCharm;
	public static Item greenCharm;
	public static Item redCharm;
	public static Item blueCharm;
	//public static Item elderCharm;
	
	public static Item spirit_sapphire;
	public static Item spirit_emerald;
	public static Item spirit_ruby;
	public static Item spirit_diamond;
	public static Item spirit_dragonstone;
	public static Item spirit_onyx;
	
	/**
	 * Familiar Pouches
	 */
	public static Item pouch_spiritWolf;
	
	
	public static void init()
	{
		emptyPouch = new ItemBase("empty_pouch").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(emptyPouch, true);
		
		spiritShards = new ItemBase("spirit_shards").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spiritShards, true);
		
		goldCharm = new ItemBase("gold_charm").setCreativeTab(ModCreativeTabs.rcmSummoning);
		GameRegistry.registerItem(goldCharm, "gold_charm", Reference.MOD_ID);
		
		greenCharm = new ItemBase("green_charm").setCreativeTab(ModCreativeTabs.rcmSummoning);
		GameRegistry.registerItem(greenCharm, "green_charm", Reference.MOD_ID);
		
		redCharm = new ItemBase("red_charm").setCreativeTab(ModCreativeTabs.rcmSummoning);
		GameRegistry.registerItem(redCharm, "red_charm", Reference.MOD_ID);
		
		blueCharm = new ItemBase("blue_charm").setCreativeTab(ModCreativeTabs.rcmSummoning);
		GameRegistry.registerItem(blueCharm, "blue_charm", Reference.MOD_ID);
		
		/*elderCharm = new ItemBase("elder_charm").setCreativeTab(ModCreativeTabs.rcmSummoning);
		GameRegistry.registerItem(elderCharm, "elder_charm", Reference.MOD_ID);*/
		
		spirit_sapphire = new ItemBase("spirit_sapphire").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_sapphire, false);
		
		spirit_emerald = new ItemBase("spirit_emerald").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_emerald, false);
		
		spirit_ruby = new ItemBase("spirit_ruby").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_ruby, false);
		
		spirit_diamond = new ItemBase("spirit_diamond").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_diamond, false);
		
		spirit_dragonstone = new ItemBase("spirit_dragonstone").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_dragonstone, false);
		
		spirit_onyx = new ItemBase("spirit_onyx").setCreativeTab(ModCreativeTabs.rcmSummoning);
		ItemRegistry.registerItem(spirit_onyx, false);
		
		/**
		 * Familiar Pouches
		 */
		pouch_spiritWolf = new PouchSpirirwolf("pouch_spiritwolf");
		GameRegistry.registerItem(pouch_spiritWolf, "pouch_spiritwolf", Reference.MOD_ID);
	}
}