package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.skills.farming.ModFarmingBlocks;
import javabuckets.mods.rcm.skills.firemaking.ModFiremakingBlocks;
import javabuckets.mods.rcm.skills.mining.ModMiningBlocks;
import javabuckets.mods.rcm.skills.prayer.ModPrayerBlocks;
import javabuckets.mods.rcm.skills.runecrafting.ModRunecraftingBlocks;
import javabuckets.mods.rcm.skills.smithing.ModSmithingBlocks;
import javabuckets.mods.rcm.skills.summoning.ModSummoningBlocks;
import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingBlocks;

public class ModBlocks 
{
	public static void init()
	{
		ModMiningBlocks.init();
		ModSmithingBlocks.init();
		ModPrayerBlocks.init();
		ModFiremakingBlocks.init();
		ModWoodcuttingBlocks.init();
		ModRunecraftingBlocks.init();
		ModFarmingBlocks.init();
		ModSummoningBlocks.init();
		ModFixBlocks.init();
	}
}
