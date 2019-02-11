package javabuckets.mods.rcm.skills.runecrafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModRunecraftingBlocks 
{
	public static Block airAltar;
	public static Block astralAltar;
	public static Block bloodAltar;
	public static Block bodyAltar;
	public static Block chaosAltar;
	public static Block cosmicAltar;
	public static Block deathAltar;
	public static Block earthAltar;
	public static Block fireAltar;
	public static Block lawAltar;
	public static Block mindAltar;
	public static Block natureAltar;
	public static Block soulAltar;
	public static Block waterAltar;
	
	public static void init()
	{
		airAltar = new BlockAltar().setBlockTextureName("air_altar").setBlockName("air_altar");
		GameRegistry.registerBlock(airAltar, "air_altar");
		
		astralAltar = new BlockAltar().setBlockTextureName("astral_altar").setBlockName("astral_altar");
		GameRegistry.registerBlock(astralAltar, "astral_altar");
		
		bloodAltar = new BlockAltar().setBlockTextureName("blood_altar").setBlockName("blood_altar");
		GameRegistry.registerBlock(bloodAltar, "blood_altar");
		
		bodyAltar = new BlockAltar().setBlockTextureName("body_altar").setBlockName("body_altar");
		GameRegistry.registerBlock(bodyAltar, "body_altar");
		
		chaosAltar = new BlockAltar().setBlockTextureName("chaos_altar").setBlockName("chaos_altar");
		GameRegistry.registerBlock(chaosAltar, "chaos_altar");
		
		cosmicAltar = new BlockAltar().setBlockTextureName("cosmic_altar").setBlockName("cosmic_altar");
		GameRegistry.registerBlock(cosmicAltar, "cosmic_altar");
		
		deathAltar = new BlockAltar().setBlockTextureName("death_altar").setBlockName("death_altar");
		GameRegistry.registerBlock(deathAltar, "death_altar");
		
		earthAltar = new BlockAltar().setBlockTextureName("earth_altar").setBlockName("earth_altar");
		GameRegistry.registerBlock(earthAltar, "earth_altar");
		
		fireAltar = new BlockAltar().setBlockTextureName("fire_altar").setBlockName("fire_altar");
		GameRegistry.registerBlock(fireAltar, "fire_altar");
		
		lawAltar = new BlockAltar().setBlockTextureName("law_altar").setBlockName("law_altar");
		GameRegistry.registerBlock(lawAltar, "law_altar");
		
		mindAltar = new BlockAltar().setBlockTextureName("mind_altar").setBlockName("mind_altar");
		GameRegistry.registerBlock(mindAltar, "mind_altar");
		
		natureAltar = new BlockAltar().setBlockTextureName("nature_altar").setBlockName("nature_altar");
		GameRegistry.registerBlock(natureAltar, "nature_altar");
		
		soulAltar = new BlockAltar().setBlockTextureName("soul_altar").setBlockName("soul_altar");
		GameRegistry.registerBlock(soulAltar, "soul_altar");
		
		waterAltar = new BlockAltar().setBlockTextureName("water_altar").setBlockName("water_altar");
		GameRegistry.registerBlock(waterAltar, "water_altar");		
	}
}