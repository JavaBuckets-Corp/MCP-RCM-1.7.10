package javabuckets.mods.rcm.utility;

import java.util.ArrayList;

import javabuckets.mods.rcm.skills.crafting.ModCraftingItems;
import javabuckets.mods.rcm.skills.firemaking.ModFiremakingItems;
import javabuckets.mods.rcm.skills.fishing.ModFishingItems;
import javabuckets.mods.rcm.skills.fletching.ModFletchingItems;
import javabuckets.mods.rcm.skills.herblore.ModHerbloreItems;
import javabuckets.mods.rcm.skills.magic.ModMagicItems;
import javabuckets.mods.rcm.skills.magic.ModMagicWeapons;
import javabuckets.mods.rcm.skills.runecrafting.ModRunecraftingItems;
import javabuckets.mods.rcm.skills.smithing.ModSmithingItems;
import javabuckets.mods.rcm.skills.summoning.ModSummoningItems;
import net.minecraft.item.Item;

public class BuyCommandUtil 
{
	public static ArrayList<String> itemBuyableList = new ArrayList<String>();
	
	public static void addToBuyableList(Item item)
	{
		String unlocalizedName = item.getUnlocalizedName().substring(5);
		
		itemBuyableList.add("rcm:" + unlocalizedName);
	}
	
	public static long getPriceOfItem(Item item)
	{
		// Runes
		if (item == ModMagicItems.airRune) return 3;
		else if (item == ModMagicItems.waterRune) return 3;
		else if (item == ModMagicItems.earthRune) return 3;
		else if (item == ModMagicItems.fireRune) return 3;
		else if (item == ModMagicItems.bodyRune) return 3;
		else if (item == ModMagicItems.mindRune) return 3;
		else if (item == ModMagicItems.cosmicRune) return 7;
		else if (item == ModMagicItems.chaosRune) return 15;
		else if (item == ModMagicItems.deathRune) return 30;
		else if (item == ModMagicItems.natureRune) return 40;
		else if (item == ModMagicItems.lawRune) return 45;
		else if (item == ModMagicItems.armadylRune) return 50;
		else if (item == ModMagicItems.soulRune) return 50;
		else if (item == ModMagicItems.astralRune) return 50;
		else if (item == ModMagicItems.bloodRune) return 60;
		
		// Tools
		else if (item == ModFishingItems.fishingNet) return 20;
		else if (item == ModFiremakingItems.tinderbox) return 5;
		else if (item == ModHerbloreItems.pestle_mortar) return 15;
		else if (item == ModSmithingItems.hammer) return 7;
		else if (item == ModFletchingItems.knife) return 7;
		else if (item == ModCraftingItems.chisel) return 7;
		
		// Summoning
		else if (item == ModSummoningItems.emptyPouch) return 1;
		else if (item == ModSummoningItems.spiritShards) return 25;
		
		// Weapons
		else if (item == ModMagicWeapons.staff) return 100;
		else if (item == ModMagicWeapons.magicStaff) return 250;
		
		else return 0;
	}
}