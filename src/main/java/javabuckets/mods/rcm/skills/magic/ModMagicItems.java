package javabuckets.mods.rcm.skills.magic;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModMagicItems 
{
	public static Item airRune;
	public static Item mindRune;
	public static Item waterRune;
	public static Item earthRune;
	public static Item fireRune;
	public static Item bodyRune;
	public static Item cosmicRune;
	public static Item chaosRune;
	public static Item astralRune;
	public static Item natureRune;
	public static Item lawRune;
	public static Item deathRune;
	public static Item bloodRune;
	public static Item soulRune;
	public static Item armadylRune;
	
	public static void init()
	{
		airRune = new ItemRune("air_rune");
		ItemRegistry.registerItem(airRune, true);
		
		mindRune = new ItemRune("mind_rune");
		ItemRegistry.registerItem(mindRune, true);
		
		waterRune = new ItemRune("water_rune");
		ItemRegistry.registerItem(waterRune, true);
		
		earthRune = new ItemRune("earth_rune");
		ItemRegistry.registerItem(earthRune, true);
		
		fireRune = new ItemRune("fire_rune");
		ItemRegistry.registerItem(fireRune, true);
		
		bodyRune = new ItemRune("body_rune");
		ItemRegistry.registerItem(bodyRune, true);
		
		cosmicRune = new ItemRune("cosmic_rune");
		ItemRegistry.registerItem(cosmicRune, true);
		
		chaosRune = new ItemRune("chaos_rune");
		ItemRegistry.registerItem(chaosRune, true);
		
		astralRune = new ItemRune("astral_rune");
		ItemRegistry.registerItem(astralRune, true);
		
		natureRune = new ItemRune("nature_rune");
		ItemRegistry.registerItem(natureRune, true);
		
		lawRune = new ItemRune("law_rune");
		ItemRegistry.registerItem(lawRune, true);
		
		deathRune = new ItemRune("death_rune");
		ItemRegistry.registerItem(deathRune, true);
		
		bloodRune = new ItemRune("blood_rune");
		ItemRegistry.registerItem(bloodRune, true);
		
		soulRune = new ItemRune("soul_rune");
		ItemRegistry.registerItem(soulRune, true);
		
		armadylRune = new ItemRune("armadyl_rune");
		ItemRegistry.registerItem(armadylRune, true);
	}
}