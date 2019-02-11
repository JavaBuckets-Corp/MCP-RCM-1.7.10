package javabuckets.mods.rcm.skills.magic;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModMagicWeapons 
{
	// Lvl 1
	public static Item staff;
	public static Item magicStaff;
	public static Item airStaff;
	public static Item waterStaff;
	public static Item earthStaff;
	public static Item fireStaff;
	
	// Lvl 10
	public static Item impHornWand;
	public static Item imphideBook;
	
	// Lvl 20
	public static Item spiderWand;
	public static Item spiderOrb;
	
	// Lvl 30,
	public static Item battlestaff;
	public static Item airBattlestaff;
	public static Item waterBattlestaff;
	public static Item earthBattlestaff;
	public static Item fireBattlestaff;
	public static Item mysticWand;
	public static Item mysticOrb;
	
	// Lvl 40
	public static Item airMysticstaff;
	public static Item waterMysticstaff;
	public static Item earthMysticstaff;
	public static Item fireMysticstaff;
	public static Item splitbarkWand;
	public static Item splitbarkOrb;
	
	// Lvl 50
	public static Item ancientStaff;
	public static Item batWand;
	public static Item batBook;
	
	// Lvl 55
	public static Item graviteStaff;

	// Lvl 60
	public static Item dragonBattlestaff;
	public static Item SaradominStaff;
	public static Item ZamorakStaff;
	public static Item GuthixStaff;
	public static Item grifolicWand;
	public static Item grifolicOrb;
	
	// Lvl 65
	public static Item lunarStaff;
	
	// Lvl 70
	public static Item ahrimStaff, ahrimWand, bookOfMagic;
	
	// Lvl 75
	public static Item staffOfLight, polyporeStaff, abyssalWand, abyssalOrb;
	
	// Lvl 77
	public static Item armadylStaff;
	
	// Lvl 80
	public static Item virtusWand, virtusBook, chaoticStaff;
	
	// Lvl 90
	public static Item seismicWand, singularity, noxiousStaff;
	
	public static void init()
	{
		staff = new ItemStaff("staff");
		ItemRegistry.registerItem(staff, true);
		
		magicStaff = new ItemStaff("magic_staff");
		ItemRegistry.registerItem(magicStaff, true);
		
		airStaff = new ItemStaff("air_staff", "air");
		ItemRegistry.registerItem(airStaff, false);
		
		waterStaff = new ItemStaff("water_staff", "water");
		ItemRegistry.registerItem(waterStaff, false);
		
		earthStaff = new ItemStaff("earth_staff", "earth");
		ItemRegistry.registerItem(earthStaff, false);
		
		fireStaff = new ItemStaff("fire_staff", "fire");
		ItemRegistry.registerItem(fireStaff	, false);
	}
}
