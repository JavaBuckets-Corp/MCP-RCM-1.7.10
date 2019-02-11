package javabuckets.mods.rcm.skills.farming;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.blocks.BlockAllotment;
import javabuckets.mods.rcm.blocks.BlockHerb;
import javabuckets.mods.rcm.skills.herblore.ModHerbloreItems;
import javabuckets.mods.rcm.utility.BlockRegistry;
import net.minecraft.block.Block;

public class ModFarmingBlocks 
{
	// Allotments
	public static Block onions;
	public static Block cabbage;
	public static Block tomatoes;
	public static Block sweetcorn;
	public static Block strawberries;
	public static Block snapegrass;
	
	// Flowers
	public static Block marigold;
	public static Block rosemary;
	public static Block nasturtium;
	public static Block woad;
	public static Block limpwurt;
	public static Block whiteLily;
	public static Block butterflyFlower;
	
	// Herbs
	public static Block guam;
	public static Block marrentill;
	public static Block tarromin;
	public static Block harralander;
	public static Block ranarr;
	public static Block spiritWeed;
	public static Block toadflax;
	public static Block irit;
	public static Block wergali;
	public static Block avantoe;
	public static Block kwuarm;
	public static Block snapdragon;
	public static Block cadantine;
	public static Block lantadyme;
	public static Block dwarfWeed;
	public static Block torstol;
	public static Block fellstalk;
	
	// Bushes
	
	// Trees
	
	// Fruit Trees
	
	// Cacti
	
	public static void init()
	{
		// Allotments
		onions = new BlockAllotment(ModFarmingItems.allotmentseed_onion);
		BlockRegistry.registerBlock(onions, "onions");
		
		cabbage = new BlockAllotment(ModFarmingItems.allotmentseed_cabbage);
		BlockRegistry.registerBlock(cabbage, "cabbages");
		
		tomatoes = new BlockAllotment(ModFarmingItems.allotmentseed_tomato);
		BlockRegistry.registerBlock(tomatoes, "tomatoes");
		
		sweetcorn = new BlockAllotment(ModFarmingItems.allotmentseed_sweetcorn);
		BlockRegistry.registerBlock(sweetcorn, "sweetcorns");
		
		strawberries = new BlockAllotment(ModFarmingItems.allotmentseed_strawberry);
		BlockRegistry.registerBlock(strawberries, "strawberries");
		
		snapegrass = new BlockAllotment(ModHerbloreItems.snape_grass);
		BlockRegistry.registerBlock(snapegrass, "snapegrass");
		
		
		
		// Herbs
		guam = new BlockHerb(ModFarmingItems.herbseed_guam);
		BlockRegistry.registerBlock(guam, "guam");
		
		marrentill = new BlockHerb(ModFarmingItems.herbseed_marrentill);
		BlockRegistry.registerBlock(marrentill, "marrentill");
		
		tarromin = new BlockHerb(ModFarmingItems.herbseed_tarromin);
		BlockRegistry.registerBlock(tarromin, "tarromin");
		
		harralander = new BlockHerb(ModFarmingItems.herbseed_harralander);
		BlockRegistry.registerBlock(harralander, "harralander");
		
		ranarr = new BlockHerb(ModFarmingItems.herbseed_ranarr);
		BlockRegistry.registerBlock(ranarr, "ranarr");
		
		spiritWeed = new BlockHerb(ModFarmingItems.herbseed_spiritWeed);
		BlockRegistry.registerBlock(spiritWeed, "spirit_weed");
		
		toadflax = new BlockHerb(ModFarmingItems.herbseed_toadflax);
		BlockRegistry.registerBlock(toadflax, "toadflax");
		
		irit = new BlockHerb(ModFarmingItems.herbseed_irit);
		BlockRegistry.registerBlock(irit, "irit");
		
		wergali = new BlockHerb(ModFarmingItems.herbseed_wergali);
		BlockRegistry.registerBlock(wergali, "wergali");
		
		avantoe = new BlockHerb(ModFarmingItems.herbseed_avantoe);
		BlockRegistry.registerBlock(avantoe, "avantoe");
		
		kwuarm = new BlockHerb(ModFarmingItems.herbseed_kwuarm);
		BlockRegistry.registerBlock(kwuarm, "kwuarm");
		
		snapdragon = new BlockHerb(ModFarmingItems.herbseed_snapdragon);
		BlockRegistry.registerBlock(snapdragon, "snapdragon");
		
		cadantine = new BlockHerb(ModFarmingItems.herbseed_cadantine);
		BlockRegistry.registerBlock(cadantine, "cadantine");
		
		lantadyme = new BlockHerb(ModFarmingItems.herbseed_lantadyme);
		BlockRegistry.registerBlock(lantadyme, "lantadyme");
		
		dwarfWeed = new BlockHerb(ModFarmingItems.herbseed_dwarfWeed);
		BlockRegistry.registerBlock(dwarfWeed, "dwarf_weed");
		
		torstol = new BlockHerb(ModFarmingItems.herbseed_torstol);
		BlockRegistry.registerBlock(torstol, "torstol");
		
		fellstalk = new BlockHerb(ModFarmingItems.herbseed_fellstalk);
		BlockRegistry.registerBlock(fellstalk, "fellstalk");
	}
}