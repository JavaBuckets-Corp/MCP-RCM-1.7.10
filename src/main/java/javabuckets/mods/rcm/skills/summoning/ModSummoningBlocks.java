package javabuckets.mods.rcm.skills.summoning;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModSummoningBlocks 
{
	public static Block summoningObelisk;
	
	public static void init()
	{
		summoningObelisk = new BlockSummoningObelisk().setBlockTextureName("summoning_obelisk").setBlockName("summoning_obelisk");
		GameRegistry.registerBlock(summoningObelisk, "summoning_obelisk");
	}
}