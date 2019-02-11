package javabuckets.mods.rcm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.items.armory.ItemRSArmor;
import net.minecraft.item.Item;

public class ModArmor 
{
	public static Item bronzeHelm;
	public static Item bronzeFullHelm;
	public static Item bronzeSqShield;
	public static Item bronzeChainbody;
	public static Item bronzeKiteshield;
	public static Item bronzePlatelegs;
	public static Item bronzePlateskirt;
	public static Item bronzePlatebody;
	public static Item bronzeBoots;
	
	//public static Item ironHelm;
	public static Item ironFullHelm;
	public static Item ironSqShield;
	public static Item ironChainbody;
	public static Item ironKiteshield;
	//public static Item ironPlatelegs;
	public static Item ironPlateskirt;
	//public static Item ironPlatebody;
	//public static Item ironBoots;
	
	public static Item steelHelm;
	public static Item steelFullHelm;
	public static Item steelSqShield;
	public static Item steelChainbody;
	public static Item steelKiteshield;
	public static Item steelPlatelegs;
	public static Item steelPlateskirt;
	public static Item steelPlatebody;
	public static Item steelBoots;
	
	public static Item mithrilHelm;
	public static Item mithrilFullHelm;
	public static Item mithrilSqShield;
	public static Item mithrilChainbody;
	public static Item mithrilKiteshield;
	public static Item mithrilPlatelegs;
	public static Item mithrilPlateskirt;
	public static Item mithrilPlatebody;
	public static Item mithrilBoots;
	
	public static Item adamantHelm;
	public static Item adamantFullHelm;
	public static Item adamantSqShield;
	public static Item adamantChainbody;
	public static Item adamantKiteshield;
	public static Item adamantPlatelegs;
	public static Item adamantPlateskirt;
	public static Item adamantPlatebody;
	public static Item adamantBoots;
	
	public static Item runeHelm;
	public static Item runeFullHelm;
	public static Item runeSqShield;
	public static Item runeChainbody;
	public static Item runeKiteshield;
	public static Item runePlatelegs;
	public static Item runePlateskirt;
	public static Item runePlatebody;
	public static Item runeBoots;
	
	public static Item dragonHelm;
	public static Item dragonFullHelm;
	public static Item dragonSqShield;
	public static Item dragonChainbody;
	public static Item dragonKiteshield;
	public static Item dragonPlatelegs;
	public static Item dragonPlateskirt;
	public static Item dragonPlatebody;
	public static Item dragonBoots;
	
	public static void init()
	{
		bronzeHelm = new ItemRSArmor(ModEnums.bronzeArmory, 5, 0).setUnlocalizedName("bronze_helm");
		GameRegistry.registerItem(bronzeHelm, "bronze_helm");
		
		/*bronzeFullHelm = new ItemRSArmor(ModEnums.bronzeArmory, 5, 0).setUnlocalizedName("bronze_full_helm");
		GameRegistry.registerItem(bronzeFullHelm, "bronze_full_helm");*/
		
		/*bronzeSqShield = new ItemRSShield().setUnlocalizedName("bronze_sq_shield");
		GameRegistry.registerItem(bronzeSqShield, "bronze_sq_shield");*/
		
		/*bronzeChainbody = new ItemRSArmor(ModEnums.bronzeArmory, 5, 1).setUnlocalizedName("bronze_chainbody");
		GameRegistry.registerItem(bronzeChainbody, "bronze_chainbody");*/
		
		/*bronzeKiteshield = new ItemRSShield().setUnlocalizedName("bronze_kiteshield");
		GameRegistry.registerItem(bronzeKiteshield, "bronze_kiteshield");*/
	
		bronzePlatelegs = new ItemRSArmor(ModEnums.bronzeArmory, 5, 2).setUnlocalizedName("bronze_platelegs");
		GameRegistry.registerItem(bronzePlatelegs, "bronze_platelegs");
		
		/*bronzePlateskirt = new ItemRSArmor(ModEnums.bronzeArmory, 5, 2).setUnlocalizedName("bronze_plateskirt");
		GameRegistry.registerItem(bronzePlateskirt, "bronze_plateskirt");*/
		
		bronzePlatebody = new ItemRSArmor(ModEnums.bronzeArmory, 5, 1).setUnlocalizedName("bronze_platebody");
		GameRegistry.registerItem(bronzePlatebody, "bronze_platebody");
		
		bronzeBoots = new ItemRSArmor(ModEnums.bronzeArmory, 5, 3).setUnlocalizedName("bronze_boots");
		GameRegistry.registerItem(bronzeBoots, "bronze_boots");
		
		
		
		/*ironFullHelm = new ItemRSArmor(ModEnums.ironArmory, 5, 0).setUnlocalizedName("iron_full_helm");
		GameRegistry.registerItem(ironFullHelm, "iron_full_helm");*/
		
		/*ironSqShield = new ItemRSShield().setUnlocalizedName("iron_sq_shield");
		GameRegistry.registerItem(ironSqShield, "iron_sq_shield");*/
		
		/*ironChainbody = new ItemRSArmor(ModEnums.ironArmory, 5, 1).setUnlocalizedName("iron_chainbody");
		GameRegistry.registerItem(ironChainbody, "iron_chainbody");*/
		
		/*ironKiteshield = new ItemRSShield().setUnlocalizedName("iron_kiteshield");
		GameRegistry.registerItem(ironKiteshield, "iron_kiteshield");*/
		
		/*ironPlateskirt = new ItemRSArmor(ModEnums.ironArmory, 5, 2).setUnlocalizedName("iron_plateskirt");
		GameRegistry.registerItem(ironPlateskirt, "iron_plateskirt");*/
		
		
		
		steelHelm = new ItemRSArmor(ModEnums.steelArmory, 5, 0).setUnlocalizedName("steel_helm");
		GameRegistry.registerItem(steelHelm, "steel_helm");
		
		/*steelFullHelm = new ItemRSArmor(ModEnums.steelArmory, 5, 0).setUnlocalizedName("steel_full_helm");
		GameRegistry.registerItem(steelFullHelm, "steel_full_helm");*/
		
		/*steelSqShield = new ItemRSShield().setUnlocalizedName("steel_sq_shield");
		GameRegistry.registerItem(steelSqShield, "steel_sq_shield");*/
		
		/*steelChainbody = new ItemRSArmor(ModEnums.steelArmory, 5, 1).setUnlocalizedName("steel_chainbody");
		GameRegistry.registerItem(steelChainbody, "steel_chainbody");*/
		
		/*steelKiteshield = new ItemRSShield().setUnlocalizedName("steel_kiteshield");
		GameRegistry.registerItem(steelKiteshield, "steel_kiteshield");*/
	
		steelPlatelegs = new ItemRSArmor(ModEnums.steelArmory, 5, 2).setUnlocalizedName("steel_platelegs");
		GameRegistry.registerItem(steelPlatelegs, "steel_platelegs");
		
		/*steelPlateskirt = new ItemRSArmor(ModEnums.steelArmory, 5, 2).setUnlocalizedName("steel_plateskirt");
		GameRegistry.registerItem(steelPlateskirt, "steel_plateskirt");*/
		
		steelPlatebody = new ItemRSArmor(ModEnums.steelArmory, 5, 1).setUnlocalizedName("steel_platebody");
		GameRegistry.registerItem(steelPlatebody, "steel_platebody");
		
		steelBoots = new ItemRSArmor(ModEnums.steelArmory, 5, 3).setUnlocalizedName("steel_boots");
		GameRegistry.registerItem(steelBoots, "steel_boots");
		
		
		
		mithrilHelm = new ItemRSArmor(ModEnums.mithrilArmory, 5, 0).setUnlocalizedName("mithril_helm");
		GameRegistry.registerItem(mithrilHelm, "mithril_helm");
		
		/*mithrilFullHelm = new ItemRSArmor(ModEnums.mithrilArmory, 5, 0).setUnlocalizedName("mithril_full_helm");
		GameRegistry.registerItem(mithrilFullHelm, "mithril_full_helm");*/
		
		/*mithrilSqShield = new ItemRSShield().setUnlocalizedName("mithril_sq_shield");
		GameRegistry.registerItem(mithrilSqShield, "mithril_sq_shield");*/
		
		/*mithrilChainbody = new ItemRSArmor(ModEnums.mithrilArmory, 5, 1).setUnlocalizedName("mithril_chainbody");
		GameRegistry.registerItem(mithrilChainbody, "mithril_chainbody");*/
		
		/*mithrilKiteshield = new ItemRSShield().setUnlocalizedName("mithril_kiteshield");
		GameRegistry.registerItem(mithrilKiteshield, "mithril_kiteshield");*/
	
		mithrilPlatelegs = new ItemRSArmor(ModEnums.mithrilArmory, 5, 2).setUnlocalizedName("mithril_platelegs");
		GameRegistry.registerItem(mithrilPlatelegs, "mithril_platelegs");
		
		/*mithrilPlateskirt = new ItemRSArmor(ModEnums.mithrilArmory, 5, 2).setUnlocalizedName("mithril_plateskirt");
		GameRegistry.registerItem(mithrilPlateskirt, "mithril_plateskirt");*/
		
		mithrilPlatebody = new ItemRSArmor(ModEnums.mithrilArmory, 5, 1).setUnlocalizedName("mithril_platebody");
		GameRegistry.registerItem(mithrilPlatebody, "mithril_platebody");
		
		mithrilBoots = new ItemRSArmor(ModEnums.mithrilArmory, 5, 3).setUnlocalizedName("mithril_boots");
		GameRegistry.registerItem(mithrilBoots, "mithril_boots");
		
		
		
		adamantHelm = new ItemRSArmor(ModEnums.adamantArmory, 5, 0).setUnlocalizedName("adamant_helm");
		GameRegistry.registerItem(adamantHelm, "adamant_helm");
		
		/*adamantFullHelm = new ItemRSArmor(ModEnums.adamantArmory, 5, 0).setUnlocalizedName("adamant_full_helm");
		GameRegistry.registerItem(adamantFullHelm, "adamant_full_helm");*/
		
		/*adamantSqShield = new ItemRSShield().setUnlocalizedName("adamant_sq_shield");
		GameRegistry.registerItem(adamantSqShield, "adamant_sq_shield");*/
		
		/*adamantChainbody = new ItemRSArmor(ModEnums.adamantArmory, 5, 1).setUnlocalizedName("adamant_chainbody");
		GameRegistry.registerItem(adamantChainbody, "adamant_chainbody");*/
		
		/*adamantKiteshield = new ItemRSShield().setUnlocalizedName("adamant_kiteshield");
		GameRegistry.registerItem(adamantKiteshield, "adamant_kiteshield");*/
	
		adamantPlatelegs = new ItemRSArmor(ModEnums.adamantArmory, 5, 2).setUnlocalizedName("adamant_platelegs");
		GameRegistry.registerItem(adamantPlatelegs, "adamant_platelegs");
		
		/*adamantPlateskirt = new ItemRSArmor(ModEnums.adamantArmory, 5, 2).setUnlocalizedName("adamant_plateskirt");
		GameRegistry.registerItem(adamantPlateskirt, "adamant_plateskirt");*/
		
		adamantPlatebody = new ItemRSArmor(ModEnums.adamantArmory, 5, 1).setUnlocalizedName("adamant_platebody");
		GameRegistry.registerItem(adamantPlatebody, "adamant_platebody");
		
		adamantBoots = new ItemRSArmor(ModEnums.adamantArmory, 5, 3).setUnlocalizedName("adamant_boots");
		GameRegistry.registerItem(adamantBoots, "adamant_boots");
		
		
		
		runeHelm = new ItemRSArmor(ModEnums.runeArmory, 5, 0).setUnlocalizedName("rune_helm");
		GameRegistry.registerItem(runeHelm, "rune_helm");
		
		/*runeFullHelm = new ItemRSArmor(ModEnums.runeArmory, 5, 0).setUnlocalizedName("rune_full_helm");
		GameRegistry.registerItem(runeFullHelm, "rune_full_helm");*/
		
		/*runeSqShield = new ItemRSShield().setUnlocalizedName("rune_sq_shield");
		GameRegistry.registerItem(runeSqShield, "rune_sq_shield");*/
		
		/*runeChainbody = new ItemRSArmor(ModEnums.runeArmory, 5, 1).setUnlocalizedName("rune_chainbody");
		GameRegistry.registerItem(runeChainbody, "rune_chainbody");*/
		
		/*runeKiteshield = new ItemRSShield().setUnlocalizedName("rune_kiteshield");
		GameRegistry.registerItem(runeKiteshield, "rune_kiteshield");*/
	
		runePlatelegs = new ItemRSArmor(ModEnums.runeArmory, 5, 2).setUnlocalizedName("rune_platelegs");
		GameRegistry.registerItem(runePlatelegs, "rune_platelegs");
		
		/*runePlateskirt = new ItemRSArmor(ModEnums.runeArmory, 5, 2).setUnlocalizedName("rune_plateskirt");
		GameRegistry.registerItem(runePlateskirt, "rune_plateskirt");*/
		
		runePlatebody = new ItemRSArmor(ModEnums.runeArmory, 5, 1).setUnlocalizedName("rune_platebody");
		GameRegistry.registerItem(runePlatebody, "rune_platebody");
		
		runeBoots = new ItemRSArmor(ModEnums.runeArmory, 5, 3).setUnlocalizedName("rune_boots");
		GameRegistry.registerItem(runeBoots, "rune_boots");
		
		
		
		dragonHelm = new ItemRSArmor(ModEnums.dragonArmory, 5, 0).setUnlocalizedName("dragon_helm");
		GameRegistry.registerItem(dragonHelm, "dragon_helm");
		
		/*dragonFullHelm = new ItemRSArmor(ModEnums.dragonArmory, 5, 0).setUnlocalizedName("dragon_full_helm");
		GameRegistry.registerItem(dragonFullHelm, "dragon_full_helm");*/
		
		/*dragonSqShield = new ItemRSShield().setUnlocalizedName("dragon_sq_shield");
		GameRegistry.registerItem(dragonSqShield, "dragon_sq_shield");*/
		
		/*dragonChainbody = new ItemRSArmor(ModEnums.dragonArmory, 5, 1).setUnlocalizedName("dragon_chainbody");
		GameRegistry.registerItem(dragonChainbody, "dragon_chainbody");*/
	
		/*dragonKiteshield = new ItemRSShield().setUnlocalizedName("dragon_kiteshield");
		GameRegistry.registerItem(dragonKiteshield, "dragon_kiteshield");*/
		
		dragonPlatelegs = new ItemRSArmor(ModEnums.dragonArmory, 5, 2).setUnlocalizedName("dragon_platelegs");
		GameRegistry.registerItem(dragonPlatelegs, "dragon_platelegs");
		
		/*dragonPlateskirt = new ItemRSArmor(ModEnums.dragonArmory, 5, 2).setUnlocalizedName("dragon_plateskirt");
		GameRegistry.registerItem(dragonPlateskirt, "dragon_plateskirt");*/
		
		dragonPlatebody = new ItemRSArmor(ModEnums.dragonArmory, 5, 1).setUnlocalizedName("dragon_platebody");
		GameRegistry.registerItem(dragonPlatebody, "dragon_platebody");
		
		dragonBoots = new ItemRSArmor(ModEnums.dragonArmory, 5, 3).setUnlocalizedName("dragon_boots");
		GameRegistry.registerItem(dragonBoots, "dragon_boots");
	}
}