package javabuckets.mods.rcm.skills.firemaking;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModFiremakingBlocks
{
	public static Block fire;
	
	public static void init()
	{
		fire = new BlockFire(true).setBlockName("fire").setBlockTextureName("fire");
		GameRegistry.registerBlock(fire, "fire");
	}
}