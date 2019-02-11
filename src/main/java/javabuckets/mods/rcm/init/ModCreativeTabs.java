package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.creativetabs.CreativeTabRCM;
import net.minecraft.creativetab.CreativeTabs;

public class ModCreativeTabs 
{
	public static CreativeTabs rcmMelee, rcmRange, rcmMagic, rcmMining, rcmSmithing, rcmHerblore, rcmFishing, rcmCooking, rcmCrafting, rcmFletching, rcmWoodcutting, rcmRunecrafting, rcmSlayer, rcmFarming, rcmConstruction, rcmHunter, rcmSummoning, rcmDungeoneering, rcmDivination, rcmLoot, rcmItems, rcmQuest;
	public static String[] creativeTabNames = { "Melee Gear", "Range Gear", "Magic Gear", "Mining", "Smithing", "Herblore", "Fishing", "Cooking", "Crafting", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Construction", "Hunter", "Summoning", "Dungeoneering", "Divination", "Drops/Loot", "RCM Items", "Quest Items" };
	
	public static void init()
	{
		rcmMelee = new CreativeTabRCM(creativeTabNames[0]);
		rcmRange = new CreativeTabRCM(creativeTabNames[1]);
		rcmMagic = new CreativeTabRCM(creativeTabNames[2]);
		rcmMining = new CreativeTabRCM(creativeTabNames[3]);
		rcmSmithing = new CreativeTabRCM(creativeTabNames[4]);
		rcmHerblore = new CreativeTabRCM(creativeTabNames[5]);
		rcmFishing = new CreativeTabRCM(creativeTabNames[6]);
		rcmCooking = new CreativeTabRCM(creativeTabNames[7]);
		rcmCrafting = new CreativeTabRCM(creativeTabNames[8]);
		rcmFletching = new CreativeTabRCM(creativeTabNames[9]);
		rcmWoodcutting = new CreativeTabRCM(creativeTabNames[10]);
		rcmRunecrafting = new CreativeTabRCM(creativeTabNames[11]);
		rcmSlayer = new CreativeTabRCM(creativeTabNames[12]);
		rcmFarming = new CreativeTabRCM(creativeTabNames[13]);
		rcmConstruction = new CreativeTabRCM(creativeTabNames[14]);
		rcmHunter = new CreativeTabRCM(creativeTabNames[15]);
		rcmSummoning = new CreativeTabRCM(creativeTabNames[16]);
		rcmDungeoneering = new CreativeTabRCM(creativeTabNames[17]);
		rcmDivination = new CreativeTabRCM(creativeTabNames[18]);
		rcmLoot = new CreativeTabRCM(creativeTabNames[19]);
		rcmItems = new CreativeTabRCM(creativeTabNames[20]);
		rcmQuest = new CreativeTabRCM(creativeTabNames[21]);
	}
}