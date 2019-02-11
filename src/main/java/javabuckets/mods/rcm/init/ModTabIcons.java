package javabuckets.mods.rcm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.utility.ItemRegistry;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.item.Item;

public class ModTabIcons 
{
	public static Item att, cons, mine, str, agi, smith, def, herb, fish, range, thiev, cook, pray, craft, fm, mage, fletch, wc, rc, slay, farm, con, hunt, summ, dung, div;
	
	public static Item loot, quest;
	
	public static void init()
	{	
		att = new ItemBase("Attack");
		ItemRegistry.registerItem(att, false);
		cons = new ItemBase("Constitution");
		ItemRegistry.registerItem(cons, false);
		mine = new ItemBase("Mining");
		ItemRegistry.registerItem(mine, false);
		str = new ItemBase("Strength");
		ItemRegistry.registerItem(str, false);
		agi = new ItemBase("Agility");
		ItemRegistry.registerItem(agi, false);
		smith = new ItemBase("Smithing");
		ItemRegistry.registerItem(smith, false);
		def = new ItemBase("Defence");
		ItemRegistry.registerItem(def, false);
		herb = new ItemBase("Herblore");
		ItemRegistry.registerItem(herb, false);
		fish = new ItemBase("Fishing");
		ItemRegistry.registerItem(fish, false);
		range = new ItemBase("Ranged");
		ItemRegistry.registerItem(range, false);
		thiev = new ItemBase("Thieving");
		ItemRegistry.registerItem(thiev, false);
		cook = new ItemBase("Cooking");
		ItemRegistry.registerItem(cook, false);
		pray = new ItemBase("Prayer");
		ItemRegistry.registerItem(pray, false);
		craft = new ItemBase("Crafting");
		ItemRegistry.registerItem(craft, false);
		fm = new ItemBase("Firemaking");
		ItemRegistry.registerItem(fm, false);
		mage = new ItemBase("Magic");
		ItemRegistry.registerItem(mage, false);
		fletch = new ItemBase("Fletching");
		ItemRegistry.registerItem(fletch, false);
		wc = new ItemBase("Woodcutting");
		ItemRegistry.registerItem(wc, false);
		rc = new ItemBase("Runecrafting");
		ItemRegistry.registerItem(rc, false);
		slay = new ItemBase("Slayer");
		ItemRegistry.registerItem(slay, false);
		farm = new ItemBase("Farming");
		ItemRegistry.registerItem(farm, false);
		con = new ItemBase("Construction");
		ItemRegistry.registerItem(con, false);
		hunt = new ItemBase("Hunter");
		ItemRegistry.registerItem(hunt, false);
		summ = new ItemBase("Summoning");
		ItemRegistry.registerItem(summ, false);
		dung = new ItemBase("Dungeoneering");
		ItemRegistry.registerItem(dung, false);
		div = new ItemBase("Divination");
		ItemRegistry.registerItem(div, false);
		
		loot = new ItemBase("Loot");
		ItemRegistry.registerItem(loot, false);
		quest = new ItemBase("Quest");
		ItemRegistry.registerItem(quest, false);
	}
}