package javabuckets.mods.rcm.skills.prayer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModPrayerBlocks 
{
	public static Block prayerAltar;
	
	public static void init()
	{
		prayerAltar = new BlockPrayerAltar().setBlockTextureName("prayer_altar").setBlockName("prayer_altar");
		GameRegistry.registerBlock(prayerAltar, "prayer_altar");
	}
}