package javabuckets.mods.rcm.skills.dungeoneering;

import javabuckets.mods.rcm.items.dungeoneering.ItemBoneCrusher;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModDungeoneeringItems 
{
	public static Item boneCrusher;
	
	public static void init()
	{
		boneCrusher = new ItemBoneCrusher("bone_crusher");
		ItemRegistry.registerItem(boneCrusher, false);
	}
}