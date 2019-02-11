package javabuckets.mods.rcm.skills.mining;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import javabuckets.mods.rcm.blocks.BlockRSOre;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.Block;

public class ModMiningBlocks 
{
	// Mining
	public static Block copperOre;
	public static Block tinOre;
	public static Block silverOre;
	public static Block mithrilOre;
	public static Block adamantiteOre;
	public static Block runiteOre;

	public static void init()
	{
		// Mining
		copperOre = new BlockRSOre(1.65F).setBlockTextureName("copper_ore").setBlockName("copper_ore");
		GameRegistry.registerBlock(copperOre, "copper_ore");
		
		tinOre = new BlockRSOre(1.65F).setBlockTextureName("tin_ore").setBlockName("tin_ore");
		GameRegistry.registerBlock(tinOre, "tin_ore"); 
		
		silverOre = new BlockRSOre(2.5F).setBlockTextureName("silver_ore").setBlockName("silver_ore");
		GameRegistry.registerBlock(silverOre, "silver_ore");
		
		mithrilOre = new BlockRSOre(3.5F).setBlockTextureName("mithril_ore").setBlockName("mithril_ore");
		GameRegistry.registerBlock(mithrilOre, "mithril_ore"); 
		
		adamantiteOre = new BlockRSOre(4.5F).setBlockTextureName("adamantite_ore").setBlockName("adamantite_ore");
		GameRegistry.registerBlock(adamantiteOre, "adamantite_ore");
		
		runiteOre = new BlockRSOre(6.25F).setBlockTextureName("runite_ore").setBlockName("runite_ore");
		GameRegistry.registerBlock(runiteOre, "runite_ore"); 
	}
}