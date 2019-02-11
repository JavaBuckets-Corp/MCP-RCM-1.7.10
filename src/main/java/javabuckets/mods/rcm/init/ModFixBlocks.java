package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.blocks.BlockBase;
import javabuckets.mods.rcm.blocks.BlockFixLog;
import javabuckets.mods.rcm.blocks.BlockFixPumpkin;
import javabuckets.mods.rcm.blocks.BlockUnbreakable;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModFixBlocks 
{
	public static Block unbreakable;
	
	public static Block oakLog;
	public static Block spruceLog;
	public static Block jungleLog;
	public static Block birchLog;
	public static Block acaciaLog;
	public static Block darkOakLog;
	
	public static Block pumpkin;
	
	public static void init()
	{
		unbreakable = new BlockUnbreakable().setBlockTextureName("null").setBlockName("null").setBlockUnbreakable().setStepSound(Block.soundTypeWood);
		GameRegistry.registerBlock(unbreakable, "null");
		
		oakLog = new BlockFixLog().setBlockTextureName("oak_log").setBlockName("oak_log");
		GameRegistry.registerBlock(oakLog, "oak_log");
		
		spruceLog = new BlockFixLog().setBlockTextureName("spruce_log").setBlockName("spruce_log");
		GameRegistry.registerBlock(spruceLog, "spruce_log");
		
		birchLog = new BlockFixLog().setBlockTextureName("birch_log").setBlockName("birch_log");
		GameRegistry.registerBlock(birchLog, "birch_log");
		
		jungleLog = new BlockFixLog().setBlockTextureName("jungle_log").setBlockName("jungle_log");
		GameRegistry.registerBlock(jungleLog, "jungle_log");
		
		acaciaLog = new BlockFixLog().setBlockTextureName("acacia_log").setBlockName("acacia_log");
		GameRegistry.registerBlock(acaciaLog, "acacia_log");
		
		darkOakLog = new BlockFixLog().setBlockTextureName("dark_oak_log").setBlockName("dark_oak_log");
		GameRegistry.registerBlock(darkOakLog, "dark_oak_log");
		
		
		
		pumpkin = new BlockFixPumpkin().setBlockTextureName("pumpkin").setBlockName("pumpkin");
		GameRegistry.registerBlock(pumpkin, "pumpkin");
	}
}