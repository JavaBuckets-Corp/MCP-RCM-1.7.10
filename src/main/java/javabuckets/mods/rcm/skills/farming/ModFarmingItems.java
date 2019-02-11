package javabuckets.mods.rcm.skills.farming;

import javabuckets.mods.rcm.items.farming.ItemAllotmentSeed;
import javabuckets.mods.rcm.items.farming.ItemFarmingItem;
import javabuckets.mods.rcm.items.farming.ItemHerbSeed;
import javabuckets.mods.rcm.items.farming.ItemSeedBag;
import javabuckets.mods.rcm.utility.DroptableReference;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModFarmingItems 
{
	public static Item seed_bag;
	
	/**
	 * Seeds
	 */
	// Allotments
	public static Item allotmentseed_onion;
	public static Item allotmentseed_cabbage;
	public static Item allotmentseed_tomato;
	public static Item allotmentseed_sweetcorn;
	public static Item allotmentseed_strawberry;
//	public static Item allotmentseed_watermelon; ALREADY EXIST IN THE GAME
	public static Item allotmentseed_snapeGrass;
//	public static Item allotmentseed_sunchoke;
//	public static Item allotmentseed_flyTrap;
	
	// Flowers
	public static Item flowerseed_marigold;
	public static Item flowerseed_rosemary;
	public static Item flowerseed_nasturtium;
	public static Item flowerseed_woad;
	public static Item flowerseed_limpwurt;
	public static Item flowerseed_whiteLily;
	public static Item flowerseed_butterflyFlower;
	
	// Herbs
	public static Item herbseed_guam;
	public static Item herbseed_marrentill;
	public static Item herbseed_tarromin;
	public static Item herbseed_harralander;
	public static Item herbseed_ranarr;
	public static Item herbseed_spiritWeed;
	public static Item herbseed_toadflax;
	public static Item herbseed_irit;
	public static Item herbseed_wergali;
	public static Item herbseed_avantoe;
	public static Item herbseed_kwuarm;
	public static Item herbseed_snapdragon;
	public static Item herbseed_cadantine;
	public static Item herbseed_lantadyme;
	public static Item herbseed_dwarfWeed;
	public static Item herbseed_torstol;
	public static Item herbseed_fellstalk;
	
	// Bushes
	public static Item bushseed_redberry;
	public static Item bushseed_cadavaberry;
	public static Item bushseed_dwellberry;
	public static Item bushseed_jangerberry;
	public static Item bushseed_whiteberry;
	public static Item bushseed_poisonIvy;
	public static Item bushseed_barberry;
	//public static Item bushseed_wishingWell;
	
	// Trees
	public static Item treeseed_acorn;
	public static Item treeseed_willow;
	public static Item treeseed_maple;
	public static Item treeseed_yew;
	public static Item treeseed_magic;
	
	// Fruit Trees
	public static Item fruittreeseed_apple;
	public static Item fruittreeseed_banana;
	public static Item fruittreeseed_orange;
	public static Item fruittreeseed_curry;
	public static Item fruittreeseed_pineapple;
	public static Item fruittreeseed_papaya;
	public static Item fruittreeseed_palm;
	
	// Cacti
	public static Item cacti_cactus;
	public static Item cacti_potatoCactus;
	
	/**
	 * Yields
	 */
	// Allotments
	public static Item onion;
	public static Item cabbage;
	public static Item tomato;
	public static Item sweetcorn;
	public static Item strawberry;
	public static Item watermelon;
//	public static Item snapeGrass; MOVED TO HERBLORE ITEMS FOR POTION INGRIDIENT!!!
//	public static Item sunchoke;
	
	// Flowers
	public static Item marigold;
	public static Item rosemary;
	public static Item nasturtium;
	public static Item woad;
//	public static Item limpwurt; MOVED TO HERBLORE ITEMS FOR POTION INGRIDIENT!!!
	public static Item butterflyFlower;
	
	// Herbs
	public static Item grimy_guam;
	public static Item grimy_marrentill;
	public static Item grimy_tarromin;
	public static Item grimy_harralander;
	public static Item grimy_ranarr;
	public static Item grimy_spiritWeed;
	public static Item grimy_toadflax;
	public static Item grimy_irit;
	public static Item grimy_wergali;
	public static Item grimy_avantoe;
	public static Item grimy_kwuarm;
	public static Item grimy_snapdragon;
	public static Item grimy_cadantine;
	public static Item grimy_lantadyme;
	public static Item grimy_dwarfWeed;
	public static Item grimy_torstol;
	public static Item grimy_fellstalk;
	
	// Bushes
	public static Item redberry;
	public static Item cadavaberry;
	public static Item dwellberry;
	public static Item jangerberry;
	public static Item whiteberry;
	public static Item poisonIvy;
	public static Item barberry;
	
	// Trees
	public static Item oak_roots;
	public static Item willow_roots;
	public static Item maple_roots;
	public static Item yew_roots;
	public static Item magic_roots;
	
	// Fruit Trees
	public static Item apple;
	public static Item banana;
	public static Item orange;
	public static Item curry_leaf;
	public static Item pineapple;
	public static Item papaya;
	public static Item coconut;
	
	// Cacti
	public static Item cactus_spine;
	//public static Item cacti_pricklyPear;
	public static Item potato_cactus;
	
	public static void init()
	{
		seed_bag = new ItemSeedBag("seed_bag");
		ItemRegistry.registerItem(seed_bag, false);
		
		// Allotments
		allotmentseed_onion = new ItemAllotmentSeed("seed_onion", ModFarmingBlocks.onions);
		ItemRegistry.registerItem(allotmentseed_onion, false);
		allotmentseed_cabbage = new ItemAllotmentSeed("seed_cabbage", ModFarmingBlocks.cabbage);
		ItemRegistry.registerItem(allotmentseed_cabbage, false);
		allotmentseed_tomato = new ItemAllotmentSeed("seed_tomato", ModFarmingBlocks.tomatoes);
		ItemRegistry.registerItem(allotmentseed_tomato, false);
		allotmentseed_sweetcorn = new ItemAllotmentSeed("seed_sweetcorn", ModFarmingBlocks.sweetcorn);
		ItemRegistry.registerItem(allotmentseed_sweetcorn, false);
		allotmentseed_strawberry = new ItemAllotmentSeed("seed_strawberry", ModFarmingBlocks.strawberries);
		ItemRegistry.registerItem(allotmentseed_strawberry, false);
		allotmentseed_snapeGrass = new ItemAllotmentSeed("seed_snapegrass", ModFarmingBlocks.snapegrass);
		ItemRegistry.registerItem(allotmentseed_snapeGrass, false);
		
		onion = new ItemFarmingItem("onion");
		ItemRegistry.registerItem(onion, false);
		cabbage = new ItemFarmingItem("cabbage");
		ItemRegistry.registerItem(cabbage, false);
		tomato = new ItemFarmingItem("tomato");
		ItemRegistry.registerItem(tomato, false);
		sweetcorn = new ItemFarmingItem("sweetcorn");
		ItemRegistry.registerItem(sweetcorn, false);
		strawberry = new ItemFarmingItem("strawberry");
		ItemRegistry.registerItem(strawberry, false);
		watermelon = new ItemFarmingItem("watermelon");
		ItemRegistry.registerItem(watermelon, false);
		
		// Flowers
		flowerseed_marigold = new ItemFarmingItem("seed_marigold");
		ItemRegistry.registerItem(flowerseed_marigold, false);
		flowerseed_rosemary = new ItemFarmingItem("seed_rosemary");
		ItemRegistry.registerItem(flowerseed_rosemary, false);
		flowerseed_nasturtium = new ItemFarmingItem("seed_nasturtium");
		ItemRegistry.registerItem(flowerseed_nasturtium, false);
		flowerseed_woad = new ItemFarmingItem("seed_woad");
		ItemRegistry.registerItem(flowerseed_woad, false);
		flowerseed_limpwurt = new ItemFarmingItem("seed_limpwurt");
		ItemRegistry.registerItem(flowerseed_limpwurt, false);
		flowerseed_whiteLily = new ItemFarmingItem("seed_whitelily");
		ItemRegistry.registerItem(flowerseed_whiteLily, false);
		flowerseed_butterflyFlower = new ItemFarmingItem("seed_butterfly_flower");
		ItemRegistry.registerItem(flowerseed_butterflyFlower, false);
		
		marigold = new ItemFarmingItem("marigold");
		ItemRegistry.registerItem(marigold, false);
		rosemary = new ItemFarmingItem("rosemary");
		ItemRegistry.registerItem(rosemary, false);
		nasturtium = new ItemFarmingItem("nasturtium");
		ItemRegistry.registerItem(nasturtium, false);
		woad = new ItemFarmingItem("woad_leaf");
		ItemRegistry.registerItem(woad, false);
		
		// Herbs
		herbseed_guam = new ItemHerbSeed("seed_guam", ModFarmingBlocks.guam);
		ItemRegistry.registerItem(herbseed_guam, false);
		herbseed_marrentill = new ItemHerbSeed("seed_marrentill", ModFarmingBlocks.marrentill);
		ItemRegistry.registerItem(herbseed_marrentill, false);
		herbseed_tarromin = new ItemHerbSeed("seed_tarromin", ModFarmingBlocks.tarromin);
		ItemRegistry.registerItem(herbseed_tarromin, false);
		herbseed_harralander = new ItemHerbSeed("seed_harralander", ModFarmingBlocks.harralander);
		ItemRegistry.registerItem(herbseed_harralander, false);
		herbseed_ranarr = new ItemHerbSeed("seed_ranarr", ModFarmingBlocks.ranarr);
		ItemRegistry.registerItem(herbseed_ranarr, false);
		herbseed_spiritWeed = new ItemHerbSeed("seed_spiritweed", ModFarmingBlocks.spiritWeed);
		ItemRegistry.registerItem(herbseed_spiritWeed, false);
		herbseed_toadflax = new ItemHerbSeed("seed_toadflax", ModFarmingBlocks.toadflax);
		ItemRegistry.registerItem(herbseed_toadflax, false);
		herbseed_irit = new ItemHerbSeed("seed_irit", ModFarmingBlocks.irit);
		ItemRegistry.registerItem(herbseed_irit, false);
		herbseed_wergali = new ItemHerbSeed("seed_wergali", ModFarmingBlocks.wergali);
		ItemRegistry.registerItem(herbseed_wergali, false);
		herbseed_avantoe = new ItemHerbSeed("seed_avantoe", ModFarmingBlocks.avantoe);
		ItemRegistry.registerItem(herbseed_avantoe, false);
		herbseed_kwuarm = new ItemHerbSeed("seed_kwuarm", ModFarmingBlocks.kwuarm);
		ItemRegistry.registerItem(herbseed_kwuarm, false);
		herbseed_snapdragon = new ItemHerbSeed("seed_snapdragon", ModFarmingBlocks.snapdragon);
		ItemRegistry.registerItem(herbseed_snapdragon, false);
		herbseed_cadantine = new ItemHerbSeed("seed_cadantine", ModFarmingBlocks.cadantine);
		ItemRegistry.registerItem(herbseed_cadantine, false);
		herbseed_lantadyme = new ItemHerbSeed("seed_lantadyme", ModFarmingBlocks.lantadyme);
		ItemRegistry.registerItem(herbseed_lantadyme, false);
		herbseed_dwarfWeed = new ItemHerbSeed("seed_dwarf_weed", ModFarmingBlocks.dwarfWeed);
		ItemRegistry.registerItem(herbseed_dwarfWeed, false);
		herbseed_torstol = new ItemHerbSeed("seed_torstol", ModFarmingBlocks.torstol);
		ItemRegistry.registerItem(herbseed_torstol, false);
		herbseed_fellstalk = new ItemHerbSeed("seed_fellstalk", ModFarmingBlocks.fellstalk);
		ItemRegistry.registerItem(herbseed_fellstalk, false);
		
		grimy_guam = new ItemFarmingItem("grimy_guam");
		ItemRegistry.registerItem(grimy_guam, false);
		grimy_marrentill = new ItemFarmingItem("grimy_marrentill");
		ItemRegistry.registerItem(grimy_marrentill, false);
		grimy_tarromin = new ItemFarmingItem("grimy_tarromin");
		ItemRegistry.registerItem(grimy_tarromin, false);
		grimy_harralander = new ItemFarmingItem("grimy_harralander");
		ItemRegistry.registerItem(grimy_harralander, false);
		grimy_ranarr = new ItemFarmingItem("grimy_ranarr");
		ItemRegistry.registerItem(grimy_ranarr, false);
		grimy_spiritWeed = new ItemFarmingItem("grimy_spirit_weed");
		ItemRegistry.registerItem(grimy_spiritWeed, false);
		grimy_toadflax = new ItemFarmingItem("grimy_toadflax");
		ItemRegistry.registerItem(grimy_toadflax, false);
		grimy_irit = new ItemFarmingItem("grimy_irit");
		ItemRegistry.registerItem(grimy_irit, false);
		grimy_wergali = new ItemFarmingItem("grimy_wergali");
		ItemRegistry.registerItem(grimy_wergali, false);
		grimy_avantoe = new ItemFarmingItem("grimy_avantoe");
		ItemRegistry.registerItem(grimy_avantoe, false);
		grimy_kwuarm = new ItemFarmingItem("grimy_kwuarm");
		ItemRegistry.registerItem(grimy_kwuarm, false);
		grimy_snapdragon = new ItemFarmingItem("grimy_snapdragon");
		ItemRegistry.registerItem(grimy_snapdragon, false);
		grimy_cadantine = new ItemFarmingItem("grimy_cadantine");
		ItemRegistry.registerItem(grimy_cadantine, false);
		grimy_lantadyme = new ItemFarmingItem("grimy_lantadyme");
		ItemRegistry.registerItem(grimy_lantadyme, false);
		grimy_dwarfWeed = new ItemFarmingItem("grimy_dwarf_weed");
		ItemRegistry.registerItem(grimy_dwarfWeed, false);
		grimy_torstol = new ItemFarmingItem("grimy_torstol");
		ItemRegistry.registerItem(grimy_torstol, false);
		grimy_fellstalk = new ItemFarmingItem("grimy_fellstalk");
		ItemRegistry.registerItem(grimy_fellstalk, false);
		
		// Bushes
		bushseed_redberry = new ItemFarmingItem("seed_redberry");
		ItemRegistry.registerItem(bushseed_redberry, false);
		bushseed_cadavaberry = new ItemFarmingItem("seed_cadavaberry");
		ItemRegistry.registerItem(bushseed_cadavaberry, false);
		bushseed_dwellberry = new ItemFarmingItem("seed_dwellberry");
		ItemRegistry.registerItem(bushseed_dwellberry, false);
		bushseed_jangerberry = new ItemFarmingItem("seed_jangerberry");
		ItemRegistry.registerItem(bushseed_jangerberry, false);
		bushseed_whiteberry = new ItemFarmingItem("seed_whiteberry");
		ItemRegistry.registerItem(bushseed_whiteberry, false);
		bushseed_poisonIvy = new ItemFarmingItem("seed_poison_ivy");
		ItemRegistry.registerItem(bushseed_poisonIvy, false);
		bushseed_barberry = new ItemFarmingItem("seed_barberry");
		ItemRegistry.registerItem(bushseed_barberry, false);
		
		redberry = new ItemFarmingItem("redberry");
		ItemRegistry.registerItem(redberry, false);
		cadavaberry = new ItemFarmingItem("cadavaberry");
		ItemRegistry.registerItem(cadavaberry, false);
		dwellberry = new ItemFarmingItem("dwellberry");
		ItemRegistry.registerItem(dwellberry, false);
		jangerberry = new ItemFarmingItem("jangerberry");
		ItemRegistry.registerItem(jangerberry, false);
		whiteberry = new ItemFarmingItem("whiteberry");
		ItemRegistry.registerItem(whiteberry, false);
		poisonIvy = new ItemFarmingItem("poison_ivy_berry");
		ItemRegistry.registerItem(poisonIvy, false);
		
		// Trees
		treeseed_acorn = new ItemFarmingItem("seed_acorn");
		ItemRegistry.registerItem(treeseed_acorn, false);
		treeseed_willow = new ItemFarmingItem("seed_willow");
		ItemRegistry.registerItem(treeseed_willow, false);
		treeseed_maple = new ItemFarmingItem("seed_maple");
		ItemRegistry.registerItem(treeseed_maple, false);
		treeseed_yew = new ItemFarmingItem("seed_yew");
		ItemRegistry.registerItem(treeseed_yew, false);
		treeseed_magic = new ItemFarmingItem("seed_magic");
		ItemRegistry.registerItem(treeseed_magic, false);
		
		oak_roots = new ItemFarmingItem("oak_roots");
		ItemRegistry.registerItem(oak_roots, false);
		willow_roots = new ItemFarmingItem("willow_roots");
		ItemRegistry.registerItem(willow_roots, false);
		maple_roots = new ItemFarmingItem("maple_roots");
		ItemRegistry.registerItem(maple_roots, false);
		yew_roots = new ItemFarmingItem("yew_roots");
		ItemRegistry.registerItem(yew_roots, false);
		magic_roots = new ItemFarmingItem("magic_roots");
		ItemRegistry.registerItem(magic_roots, false);
		
		// Fruit Trees
		fruittreeseed_apple = new ItemFarmingItem("seed_apple");
		ItemRegistry.registerItem(fruittreeseed_apple, false);
		fruittreeseed_banana = new ItemFarmingItem("seed_banana");
		ItemRegistry.registerItem(fruittreeseed_banana, false);
		fruittreeseed_orange = new ItemFarmingItem("seed_orange");
		ItemRegistry.registerItem(fruittreeseed_orange, false);
		fruittreeseed_curry = new ItemFarmingItem("seed_curry");
		ItemRegistry.registerItem(fruittreeseed_curry, false);
		fruittreeseed_pineapple = new ItemFarmingItem("seed_pineapple");
		ItemRegistry.registerItem(fruittreeseed_pineapple, false);
		fruittreeseed_papaya = new ItemFarmingItem("seed_papaya");
		ItemRegistry.registerItem(fruittreeseed_papaya, false);
		fruittreeseed_palm = new ItemFarmingItem("seed_palm");
		ItemRegistry.registerItem(fruittreeseed_palm, false);
		
		apple = new ItemFarmingItem("apple");
		ItemRegistry.registerItem(apple, false);
		banana = new ItemFarmingItem("banana");
		ItemRegistry.registerItem(banana, false);
		orange = new ItemFarmingItem("orange");
		ItemRegistry.registerItem(orange, false);
		curry_leaf = new ItemFarmingItem("curry_leaf");
		ItemRegistry.registerItem(curry_leaf, false);
		pineapple = new ItemFarmingItem("pineapple");
		ItemRegistry.registerItem(pineapple, false);
		papaya = new ItemFarmingItem("papaya");
		ItemRegistry.registerItem(papaya, false);
		coconut = new ItemFarmingItem("coconut");
		ItemRegistry.registerItem(coconut, false);
		
		// Cacti
		cacti_cactus = new ItemFarmingItem("seed_cactus");
		ItemRegistry.registerItem(cacti_cactus, false);
		cacti_potatoCactus = new ItemFarmingItem("seed_potato_cactus");
		ItemRegistry.registerItem(cacti_potatoCactus, false);
		
		cactus_spine = new ItemFarmingItem("cactus_spine");
		ItemRegistry.registerItem(cactus_spine, false);
		potato_cactus = new ItemFarmingItem("potato_cactus");
		ItemRegistry.registerItem(potato_cactus, false);
	}
}