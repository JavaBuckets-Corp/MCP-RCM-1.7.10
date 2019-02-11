package javabuckets.mods.rcm.skills.prayer;

import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.items.prayer.ItemBones;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModPrayerItems
{
	public static Item bones;
	public static Item wolfBones;
	public static Item bigBones;
	public static Item dragonBones;
	
	public static void init()
	{
		bones = new ItemBones("bones");
		GameRegistry.registerItem(bones, "bones", Reference.MOD_ID);
		
		wolfBones = new ItemBones("wolf_bones");
		GameRegistry.registerItem(wolfBones, "wolf_bones", Reference.MOD_ID);
		
		bigBones = new ItemBones("big_bones");
		GameRegistry.registerItem(bigBones, "big_bones", Reference.MOD_ID);
		
		dragonBones = new ItemBones("dragon_bones");
		GameRegistry.registerItem(dragonBones, "dragon_bones", Reference.MOD_ID);
	}
}