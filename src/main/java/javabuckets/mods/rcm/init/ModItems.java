package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.skills.attack.ModWeapons;
import javabuckets.mods.rcm.skills.crafting.ModCraftingItems;
import javabuckets.mods.rcm.skills.dungeoneering.ModDungeoneeringItems;
import javabuckets.mods.rcm.skills.farming.ModFarmingItems;
import javabuckets.mods.rcm.skills.firemaking.ModFiremakingItems;
import javabuckets.mods.rcm.skills.fishing.ModFishingItems;
import javabuckets.mods.rcm.skills.fletching.ModFletchingItems;
import javabuckets.mods.rcm.skills.herblore.ModHerbloreItems;
import javabuckets.mods.rcm.skills.magic.ModMagicItems;
import javabuckets.mods.rcm.skills.mining.ModMiningItems;
import javabuckets.mods.rcm.skills.prayer.ModPrayerItems;
import javabuckets.mods.rcm.skills.runecrafting.ModRunecraftingItems;
import javabuckets.mods.rcm.skills.smithing.ModSmithingItems;
import javabuckets.mods.rcm.skills.summoning.ModSummoningItems;
import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingItems;

public class ModItems
{
	public static void init()
	{
		ModMiningItems.init();
		ModSmithingItems.init();
		ModFishingItems.init();
		ModHerbloreItems.init();
		ModPrayerItems.init();
		ModCraftingItems.init();
		ModFiremakingItems.init();
		ModMagicItems.init();
		ModFletchingItems.init();
		ModWoodcuttingItems.init();
		ModRunecraftingItems.init();
		ModFarmingItems.init();
		ModSummoningItems.init();
		ModDungeoneeringItems.init();
		
		ModOtherItems.init();
		
		//ModQuestItems.init();
		DropTable.init();
		
		ModArmor.init();
		ModWeapons.init();
		
		ModTabIcons.init();
	}
}