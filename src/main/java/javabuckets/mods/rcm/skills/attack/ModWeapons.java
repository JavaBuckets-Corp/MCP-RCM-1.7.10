package javabuckets.mods.rcm.skills.attack;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.init.ModEnums;
import javabuckets.mods.rcm.items.weaponry.ItemSword;
import javabuckets.mods.rcm.skills.magic.ModMagicWeapons;
import javabuckets.mods.rcm.items.weaponry.ItemSword;
import net.minecraft.item.Item;

public class ModWeapons 
{
	public static Item bronzeDagger;
	public static Item bronzeOffDagger;
	public static Item bronzeMace;
	public static Item bronzeOffMace;
	public static Item bronzeSword;
	public static Item bronzeOffSword;
	public static Item bronzeScimitar;
	public static Item bronzeOffScimitar;
	public static Item bronzeLongsword;
	public static Item bronzeOffLongsword;
	public static Item bronzeThrowingKnives;
	public static Item bronzeOffThrowingKnives;
	public static Item bronzeThrowingAxe;
	public static Item bronzeOffThrowingAxe;
	public static Item bronzeWarhammer;
	public static Item bronzeOffWarhammer;
	public static Item bronzeBattleaxe;
	public static Item bronzeOffBattleaxe;
	public static Item bronzeClaw;
	public static Item bronzeOffClaw;
	public static Item bronze2hSword;
	
	public static Item ironDagger;
	public static Item ironOffDagger;
	public static Item ironMace;
	public static Item ironOffMace;
	public static Item ironOffSword;
	public static Item ironScimitar;
	public static Item ironOffScimitar;
	public static Item ironLongsword;
	public static Item ironOffLongsword;
	public static Item ironThrowingKnives;
	public static Item ironOffThrowingKnives;
	public static Item ironThrowingAxe;
	public static Item ironOffThrowingAxe;
	public static Item ironWarhammer;
	public static Item ironOffWarhammer;
	public static Item ironBattleaxe;
	public static Item ironOffBattleaxe;
	public static Item ironClaw;
	public static Item ironOffClaw;
	public static Item iron2hSword;
	
	public static Item steelDagger;
	public static Item steelOffDagger;
	public static Item steelMace;
	public static Item steelOffMace;
	public static Item steelSword;
	public static Item steelOffSword;
	public static Item steelScimitar;
	public static Item steelOffScimitar;
	public static Item steelLongsword;
	public static Item steelOffLongsword;
	public static Item steelThrowingKnives;
	public static Item steelOffThrowingKnives;
	public static Item steelThrowingAxe;
	public static Item steelOffThrowingAxe;
	public static Item steelWarhammer;
	public static Item steelOffWarhammer;
	public static Item steelBattleaxe;
	public static Item steelOffBattleaxe;
	public static Item steelClaw;
	public static Item steelOffClaw;
	public static Item steel2hSword;
	
	public static Item mithrilDagger;
	public static Item mithrilOffDagger;
	public static Item mithrilMace;
	public static Item mithrilOffMace;
	public static Item mithrilSword;
	public static Item mithrilOffSword;
	public static Item mithrilScimitar;
	public static Item mithrilOffScimitar;
	public static Item mithrilLongsword;
	public static Item mithrilOffLongsword;
	public static Item mithrilThrowingKnives;
	public static Item mithrilOffThrowingKnives;
	public static Item mithrilThrowingAxe;
	public static Item mithrilOffThrowingAxe;
	public static Item mithrilWarhammer;
	public static Item mithrilOffWarhammer;
	public static Item mithrilBattleaxe;
	public static Item mithrilOffBattleaxe;
	public static Item mithrilClaw;
	public static Item mithrilOffClaw;
	public static Item mithril2hSword;
	
	public static Item adamantiteDagger;
	public static Item adamantiteOffDagger;
	public static Item adamantiteMace;
	public static Item adamantiteOffMace;
	public static Item adamantiteSword;
	public static Item adamantiteOffSword;
	public static Item adamantiteScimitar;
	public static Item adamantiteOffScimitar;
	public static Item adamantiteLongsword;
	public static Item adamantiteOffLongsword;
	public static Item adamantiteThrowingKnives;
	public static Item adamantiteOffThrowingKnives;
	public static Item adamantiteThrowingAxe;
	public static Item adamantiteOffThrowingAxe;
	public static Item adamantiteWarhammer;
	public static Item adamantiteOffWarhammer;
	public static Item adamantiteBattleaxe;
	public static Item adamantiteOffBattleaxe;
	public static Item adamantiteClaw;
	public static Item adamantiteOffClaw;
	public static Item adamantite2hSword;
	
	public static Item runiteDagger;
	public static Item runiteOffDagger;
	public static Item runiteMace;
	public static Item runiteOffMace;
	public static Item runiteSword;
	public static Item runiteOffSword;
	public static Item runiteScimitar;
	public static Item runiteOffScimitar;
	public static Item runiteLongsword;
	public static Item runiteOffLongsword;
	public static Item runiteThrowingKnives;
	public static Item runiteOffThrowingKnives;
	public static Item runiteThrowingAxe;
	public static Item runiteOffThrowingAxe;
	public static Item runiteWarhammer;
	public static Item runiteOffWarhammer;
	public static Item runiteBattleaxe;
	public static Item runiteOffBattleaxe;
	public static Item runiteClaw;
	public static Item runiteOffClaw;
	public static Item runite2hSword;
	
	public static Item dragonDagger;
	public static Item dragonOffDagger;
	public static Item dragonMace;
	public static Item dragonOffMace;
	public static Item dragonScimitar;
	public static Item dragonOffScimitar;
	public static Item dragonLongsword;
	public static Item dragonOffLongsword;
	public static Item dragonWarhammer;
	public static Item dragonOffWarhammer;
	public static Item dragonBattleaxe;
	public static Item dragonOffBattleaxe;
	public static Item dragonClaw;
	public static Item dragonOffClaw;
	public static Item dragon2hSword;
	
	public static void init()
	{
		ModMagicWeapons.init();
		
		bronzeDagger = new ItemSword("bronze_dagger", ModEnums.bronze);
		GameRegistry.registerItem(bronzeDagger, "bronze_dagger");
		
		bronzeOffDagger = new ItemSword("bronze_off_dagger", ModEnums.bronze);
		GameRegistry.registerItem(bronzeOffDagger, "bronze_off_dagger");
		
		bronzeMace = new ItemSword("bronze_mace", ModEnums.bronze);
		GameRegistry.registerItem(bronzeMace, "bronze_mace");
		
		bronzeOffMace = new ItemSword("bronze_off_mace", ModEnums.bronze);
		GameRegistry.registerItem(bronzeOffMace, "bronze_off_mace");
		
		bronzeSword = new ItemSword("bronze_sword", ModEnums.bronze);
		GameRegistry.registerItem(bronzeSword, "bronze_sword");
		
		bronzeOffSword = new ItemSword("bronze_off_sword", ModEnums.bronze);
		GameRegistry.registerItem(bronzeOffSword, "bronze_off_sword");
		
		bronzeScimitar = new ItemSword("bronze_scimitar", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeScimitar, "bronze_scimitar");
		
		bronzeOffScimitar = new ItemSword("bronze_off_scimitar", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeOffScimitar, "bronze_off_scimitar");
		
		bronzeLongsword = new ItemSword("bronze_longsword", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeLongsword, "bronze_longsword");
		
		bronzeOffLongsword = new ItemSword("bronze_off_longsword", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeOffLongsword, "bronze_off_longsword");
		
//		bronzeThrowingKnives = new ItemWeaponThrowableBase("bronze_throwingknives", ModEnums.bronze);
//		GameRegistry.registerItem(bronzeThrowingKnives, "bronze_throwingknives");
//		
//		bronzeOffThrowingKnives = new ItemWeaponThrowableBase("bronze_off_throwingknives", ModEnums.bronze);
//		GameRegistry.registerItem(bronzeOffThrowingKnives, "bronze_off_throwingknives");
//		
//		bronzeThrowingAxe = new ItemWeaponThrowableBase("bronze_throwingaxes", ModEnums.bronze);
//		GameRegistry.registerItem(bronzeThrowingAxe, "bronze_throwingaxes");
//		
//		bronzeOffThrowingAxe = new ItemWeaponThrowableBase("bronze_off_throwingaxes", ModEnums.bronze);
//		GameRegistry.registerItem(bronzeOffThrowingAxe, "bronze_off_throwingaxes");
		
		bronzeWarhammer = new ItemSword("bronze_warhammer", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeWarhammer, "bronze_warhammer");
		
		bronzeOffWarhammer = new ItemSword("bronze_off_warhammer", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeOffWarhammer, "bronze_off_warhammer");
		
		bronzeBattleaxe = new ItemSword("bronze_battleaxe", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeBattleaxe, "bronze_battleaxe");
		
		bronzeOffBattleaxe = new ItemSword("bronze_off_battleaxe", ModEnums.bronzeLong);
		GameRegistry.registerItem(bronzeOffBattleaxe, "bronze_off_battleaxe");
		
		bronzeClaw = new ItemSword("bronze_claw", ModEnums.bronze);
		GameRegistry.registerItem(bronzeClaw, "bronze_claw");
		
		bronzeOffClaw = new ItemSword("bronze_off_claw", ModEnums.bronze);
		GameRegistry.registerItem(bronzeOffClaw, "bronze_off_claw");
		
		bronze2hSword = new ItemSword("bronze_2h_sword", ModEnums.bronze2h);
		GameRegistry.registerItem(bronze2hSword, "bronze_2h_sword");
		
		ironDagger = new ItemSword("iron_dagger", ModEnums.iron);
		GameRegistry.registerItem(ironDagger, "iron_dagger");
		
		ironOffDagger = new ItemSword("iron_off_dagger", ModEnums.iron);
		GameRegistry.registerItem(ironOffDagger, "iron_off_dagger");
		
		ironMace = new ItemSword("iron_mace", ModEnums.iron);
		GameRegistry.registerItem(ironMace, "iron_mace");
		
		ironOffMace = new ItemSword("iron_off_mace", ModEnums.iron);
		GameRegistry.registerItem(ironOffMace, "iron_off_mace");
		
		ironOffSword = new ItemSword("iron_off_sword", ModEnums.iron);
		GameRegistry.registerItem(ironOffSword, "iron_off_sword");
		
		ironScimitar = new ItemSword("iron_scimitar", ModEnums.ironLong);
		GameRegistry.registerItem(ironScimitar, "iron_scimitar");
		
		ironOffScimitar = new ItemSword("iron_off_scimitar", ModEnums.ironLong);
		GameRegistry.registerItem(ironOffScimitar, "iron_off_scimitar");
		
		ironLongsword = new ItemSword("iron_longsword", ModEnums.ironLong);
		GameRegistry.registerItem(ironLongsword, "iron_longsword");
		
		ironOffLongsword = new ItemSword("iron_off_longsword", ModEnums.ironLong);
		GameRegistry.registerItem(ironOffLongsword, "iron_off_longsword");
		
//		ironThrowingKnives = new ItemWeaponThrowableBase("iron_throwingknives", ModEnums.iron);
//		GameRegistry.registerItem(ironThrowingKnives, "iron_throwingknives");
//		
//		ironOffThrowingKnives = new ItemWeaponThrowableBase("iron_off_throwingknives", ModEnums.iron);
//		GameRegistry.registerItem(ironOffThrowingKnives, "iron_off_throwingknives");
//		
//		ironThrowingAxe = new ItemWeaponThrowableBase("iron_throwingAxe", ModEnums.iron);
//		GameRegistry.registerItem(ironThrowingAxe, "iron_throwingAxe");
//		
//		ironOffThrowingAxe = new ItemWeaponThrowableBase("iron_off_throwingAxe", ModEnums.iron);
//		GameRegistry.registerItem(ironOffThrowingAxe, "iron_off_throwingAxe");
		
		ironWarhammer = new ItemSword("iron_warhammer", ModEnums.ironLong);
		GameRegistry.registerItem(ironWarhammer, "iron_warhammer");
		
		ironOffWarhammer = new ItemSword("iron_off_warhammer", ModEnums.ironLong);
		GameRegistry.registerItem(ironOffWarhammer, "iron_off_warhammer");
		
		ironBattleaxe = new ItemSword("iron_battleaxe", ModEnums.ironLong);
		GameRegistry.registerItem(ironBattleaxe, "iron_battleaxe");
		
		ironOffBattleaxe = new ItemSword("iron_off_battleaxe", ModEnums.ironLong);
		GameRegistry.registerItem(ironOffBattleaxe, "iron_off_battleaxe");
		
		ironClaw = new ItemSword("iron_claw", ModEnums.iron);
		GameRegistry.registerItem(ironClaw, "iron_claw");
		
		ironOffClaw = new ItemSword("iron_off_claw", ModEnums.iron);
		GameRegistry.registerItem(ironOffClaw, "iron_off_claw");
		
		iron2hSword = new ItemSword("iron_2h_sword", ModEnums.iron2h);
		GameRegistry.registerItem(iron2hSword, "iron_2h_sword");
		
		steelDagger = new ItemSword("steel_dagger", ModEnums.steel);
		GameRegistry.registerItem(steelDagger, "steel_dagger");
		
		steelOffDagger = new ItemSword("steel_off_dagger", ModEnums.steel);
		GameRegistry.registerItem(steelOffDagger, "steel_off_dagger");
		
		steelMace = new ItemSword("steel_mace", ModEnums.steel);
		GameRegistry.registerItem(steelMace, "steel_mace");
		
		steelOffMace = new ItemSword("steel_off_mace", ModEnums.steel);
		GameRegistry.registerItem(steelOffMace, "steel_off_mace");
		
		steelSword = new ItemSword("steel_sword", ModEnums.steel);
		GameRegistry.registerItem(steelSword, "steel_sword");
		
		steelOffSword = new ItemSword("steel_off_sword", ModEnums.steel);
		GameRegistry.registerItem(steelOffSword, "steel_off_sword");
		
		steelScimitar = new ItemSword("steel_scimitar", ModEnums.steelLong);
		GameRegistry.registerItem(steelScimitar, "steel_scimitar");
		
		steelOffScimitar = new ItemSword("steel_off_scimitar", ModEnums.steelLong);
		GameRegistry.registerItem(steelOffScimitar, "steel_off_scimitar");
		
		steelLongsword = new ItemSword("steel_longsword", ModEnums.steelLong);
		GameRegistry.registerItem(steelLongsword, "steel_longsword");
		
		steelOffLongsword = new ItemSword("steel_off_longsword", ModEnums.steelLong);
		GameRegistry.registerItem(steelOffLongsword, "steel_off_longsword");
		
//		steelThrowingKnives = new ItemWeaponThrowableBase("steel_throwingknives", ModEnums.steel);
//		GameRegistry.registerItem(steelThrowingKnives, "steel_throwingknives");
//		
//		steelOffThrowingKnives = new ItemWeaponThrowableBase("steel_off_throwingknives", ModEnums.steel);
//		GameRegistry.registerItem(steelOffThrowingKnives, "steel_off_throwingknives");
//		
//		steelThrowingAxe = new ItemWeaponThrowableBase("steel_throwingAxe", ModEnums.steel);
//		GameRegistry.registerItem(steelThrowingAxe, "steel_throwingAxe");
//		
//		steelOffThrowingAxe = new ItemWeaponThrowableBase("steel_off_throwingAxe", ModEnums.steel);
//		GameRegistry.registerItem(steelOffThrowingAxe, "steel_off_throwingAxe");
		
		steelWarhammer = new ItemSword("steel_warhammer", ModEnums.steelLong);
		GameRegistry.registerItem(steelWarhammer, "steel_warhammer");
		
		steelOffWarhammer = new ItemSword("steel_off_warhammer", ModEnums.steelLong);
		GameRegistry.registerItem(steelOffWarhammer, "steel_off_warhammer");
		
		steelBattleaxe = new ItemSword("steel_battleaxe", ModEnums.steelLong);
		GameRegistry.registerItem(steelBattleaxe, "steel_battleaxe");
		
		steelOffBattleaxe = new ItemSword("steel_off_battleaxe", ModEnums.steelLong);
		GameRegistry.registerItem(steelOffBattleaxe, "steel_off_battleaxe");
		
		steelClaw = new ItemSword("steel_claw", ModEnums.steel);
		GameRegistry.registerItem(steelClaw, "steel_claw");
		
		steelOffClaw = new ItemSword("steel_off_claw", ModEnums.steel);
		GameRegistry.registerItem(steelOffClaw, "steel_off_claw");
		
		steel2hSword = new ItemSword("steel_2h_sword", ModEnums.steel2h);
		GameRegistry.registerItem(steel2hSword, "steel_2h_sword");
	
		mithrilDagger = new ItemSword("mithril_dagger", ModEnums.mithril);
		GameRegistry.registerItem(mithrilDagger, "mithril_dagger");
		
		mithrilOffDagger = new ItemSword("mithril_off_dagger", ModEnums.mithril);
		GameRegistry.registerItem(mithrilOffDagger, "mithril_off_dagger");
		
		mithrilMace = new ItemSword("mithril_mace", ModEnums.mithril);
		GameRegistry.registerItem(mithrilMace, "mithril_mace");
		
		mithrilOffMace = new ItemSword("mithril_off_mace", ModEnums.mithril);
		GameRegistry.registerItem(mithrilOffMace, "mithril_off_mace");
		
		mithrilSword = new ItemSword("mithril_sword", ModEnums.mithril);
		GameRegistry.registerItem(mithrilSword, "mithril_sword");
		
		mithrilOffSword = new ItemSword("mithril_off_sword", ModEnums.mithril);
		GameRegistry.registerItem(mithrilOffSword, "mithril_off_sword");
		
		mithrilScimitar = new ItemSword("mithril_scimitar", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilScimitar, "mithril_scimitar");
		
		mithrilOffScimitar = new ItemSword("mithril_off_scimitar", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilOffScimitar, "mithril_off_scimitar");
		
		mithrilLongsword = new ItemSword("mithril_longsword", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilLongsword, "mithril_longsword");
		
		mithrilOffLongsword = new ItemSword("mithril_off_longsword", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilOffLongsword, "mithril_off_longsword");
		
//		mithrilThrowingKnives = new ItemWeaponThrowableBase("mithril_throwingknives", ModEnums.mithril);
//		GameRegistry.registerItem(mithrilThrowingKnives, "mithril_throwingknives");
//		
//		mithrilOffThrowingKnives = new ItemWeaponThrowableBase("mithril_off_throwingknives", ModEnums.mithril);
//		GameRegistry.registerItem(mithrilOffThrowingKnives, "mithril_off_throwingknives");
//		
//		mithrilThrowingAxe = new ItemWeaponThrowableBase("mithril_throwingAxe", ModEnums.mithril);
//		GameRegistry.registerItem(mithrilThrowingAxe, "mithril_throwingAxe");
//		
//		mithrilOffThrowingAxe = new ItemWeaponThrowableBase("mithril_off_throwingAxe", ModEnums.mithril);
//		GameRegistry.registerItem(mithrilOffThrowingAxe, "mithril_off_throwingAxe");
		
		mithrilWarhammer = new ItemSword("mithril_warhammer", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilWarhammer, "mithril_warhammer");
		
		mithrilOffWarhammer = new ItemSword("mithril_off_warhammer", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilOffWarhammer, "mithril_off_warhammer");
		
		mithrilBattleaxe = new ItemSword("mithril_battleaxe", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilBattleaxe, "mithril_battleaxe");
		
		mithrilOffBattleaxe = new ItemSword("mithril_off_battleaxe", ModEnums.mithrilLong);
		GameRegistry.registerItem(mithrilOffBattleaxe, "mithril_off_battleaxe");
		
		mithrilClaw = new ItemSword("mithril_claw", ModEnums.mithril);
		GameRegistry.registerItem(mithrilClaw, "mithril_claw");
		
		mithrilOffClaw = new ItemSword("mithril_off_claw", ModEnums.mithril);
		GameRegistry.registerItem(mithrilOffClaw, "mithril_off_claw");
		
		mithril2hSword = new ItemSword("mithril_2h_sword", ModEnums.mithril2h);
		GameRegistry.registerItem(mithril2hSword, "mithril_2h_sword");
		
		adamantiteDagger = new ItemSword("adamant_dagger", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteDagger, "adamant_dagger");
		
		adamantiteOffDagger = new ItemSword("adamant_off_dagger", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteOffDagger, "adamant_off_dagger");
		
		adamantiteMace = new ItemSword("adamant_mace", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteMace, "adamant_mace");
		
		adamantiteOffMace = new ItemSword("adamant_off_mace", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteOffMace, "adamant_off_mace");
		
		adamantiteSword = new ItemSword("adamant_sword", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteSword, "adamant_sword");
		
		adamantiteOffSword = new ItemSword("adamant_off_sword", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteOffSword, "adamant_off_sword");
		
		adamantiteScimitar = new ItemSword("adamant_scimitar", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteScimitar, "adamant_scimitar");
		
		adamantiteOffScimitar = new ItemSword("adamant_off_scimitar", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteOffScimitar, "adamant_off_scimitar");
		
		adamantiteLongsword = new ItemSword("adamant_longsword", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteLongsword, "adamant_longsword");
		
		adamantiteOffLongsword = new ItemSword("adamant_off_longsword", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteOffLongsword, "adamant_off_longsword");
		
//		adamantiteThrowingKnives = new ItemWeaponThrowableBase("adamant_throwingknives", ModEnums.adamantite);
//		GameRegistry.registerItem(adamantiteThrowingKnives, "adamant_throwingknives");
//		
//		adamantiteOffThrowingKnives = new ItemWeaponThrowableBase("adamant_off_throwingknives", ModEnums.adamantite);
//		GameRegistry.registerItem(adamantiteOffThrowingKnives, "adamant_off_throwingknives");
//		
//		adamantiteThrowingAxe = new ItemWeaponThrowableBase("adamant_throwingAxe", ModEnums.adamantite);
//		GameRegistry.registerItem(adamantiteThrowingAxe, "adamant_throwingAxe");
//		
//		adamantiteOffThrowingAxe = new ItemWeaponThrowableBase("adamant_off_throwingAxe", ModEnums.adamantite);
//		GameRegistry.registerItem(adamantiteOffThrowingAxe, "adamant_off_throwingAxe");
		
		adamantiteWarhammer = new ItemSword("adamant_warhammer", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteWarhammer, "adamant_warhammer");
		
		adamantiteOffWarhammer = new ItemSword("adamant_off_warhammer", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteOffWarhammer, "adamant_off_warhammer");
		
		adamantiteBattleaxe = new ItemSword("adamant_battleaxe", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteBattleaxe, "adamant_battleaxe");
		
		adamantiteOffBattleaxe = new ItemSword("adamant_off_battleaxe", ModEnums.adamantiteLong);
		GameRegistry.registerItem(adamantiteOffBattleaxe, "adamant_off_battleaxe");
		
		adamantiteClaw = new ItemSword("adamant_claw", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteClaw, "adamant_claw");
		
		adamantiteOffClaw = new ItemSword("adamant_off_claw", ModEnums.adamantite);
		GameRegistry.registerItem(adamantiteOffClaw, "adamant_off_claw");
		
		adamantite2hSword = new ItemSword("adamant_2h_sword", ModEnums.adamantite2h);
		GameRegistry.registerItem(adamantite2hSword, "adamant_2h_sword");
		
		runiteDagger = new ItemSword("rune_dagger", ModEnums.runite);
		GameRegistry.registerItem(runiteDagger, "rune_dagger");
		
		runiteOffDagger = new ItemSword("rune_off_dagger", ModEnums.runite);
		GameRegistry.registerItem(runiteOffDagger, "rune_off_dagger");
		
		runiteMace = new ItemSword("rune_mace", ModEnums.runite);
		GameRegistry.registerItem(runiteMace, "rune_mace");
		
		runiteOffMace = new ItemSword("rune_off_mace", ModEnums.runite);
		GameRegistry.registerItem(runiteOffMace, "rune_off_mace");
		
		runiteSword = new ItemSword("rune_sword", ModEnums.runite);
		GameRegistry.registerItem(runiteSword, "rune_sword");
		
		runiteOffSword = new ItemSword("rune_off_sword", ModEnums.runite);
		GameRegistry.registerItem(runiteOffSword, "rune_off_sword");
		
		runiteScimitar = new ItemSword("rune_scimitar", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteScimitar, "rune_scimitar");
		
		runiteOffScimitar = new ItemSword("rune_off_scimitar", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteOffScimitar, "rune_off_scimitar");
		
		runiteLongsword = new ItemSword("rune_longsword", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteLongsword, "rune_longsword");
		
		runiteOffLongsword = new ItemSword("rune_off_longsword", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteOffLongsword, "rune_off_longsword");
		
//		runiteThrowingKnives = new ItemWeaponThrowableBase("rune_throwingknives", ModEnums.runite);
//		GameRegistry.registerItem(runiteThrowingKnives, "rune_throwingknives");
//		
//		runiteOffThrowingKnives = new ItemWeaponThrowableBase("rune_off_throwingknives", ModEnums.runite);
//		GameRegistry.registerItem(runiteOffThrowingKnives, "rune_off_throwingknives");
//		
//		runiteThrowingAxe = new ItemWeaponThrowableBase("rune_throwingAxe", ModEnums.runite);
//		GameRegistry.registerItem(runiteThrowingAxe, "rune_throwingAxe");
//		
//		runiteOffThrowingAxe = new ItemWeaponThrowableBase("rune_off_throwingAxe", ModEnums.runite);
//		GameRegistry.registerItem(runiteOffThrowingAxe, "rune_off_throwingAxe");
		
		runiteWarhammer = new ItemSword("rune_warhammer", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteWarhammer, "rune_warhammer");
		
		runiteOffWarhammer = new ItemSword("rune_off_warhammer", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteOffWarhammer, "rune_off_warhammer");
		
		runiteBattleaxe = new ItemSword("rune_battleaxe", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteBattleaxe, "rune_battleaxe");
		
		runiteOffBattleaxe = new ItemSword("rune_off_battleaxe", ModEnums.runiteLong);
		GameRegistry.registerItem(runiteOffBattleaxe, "rune_off_battleaxe");
		
		runiteClaw = new ItemSword("rune_claw", ModEnums.runite);
		GameRegistry.registerItem(runiteClaw, "rune_claw");
		
		runiteOffClaw = new ItemSword("rune_off_claw", ModEnums.runite);
		GameRegistry.registerItem(runiteOffClaw, "rune_off_claw");
		
		runite2hSword = new ItemSword("rune_2h_sword", ModEnums.runite2h);
		GameRegistry.registerItem(runite2hSword, "rune_2h_sword");
		
		dragonDagger = new ItemSword("dragon_dagger", ModEnums.dragon);
		GameRegistry.registerItem(dragonDagger, "dragon_dagger");
		
		dragonOffDagger = new ItemSword("dragon_off_dagger", ModEnums.dragon);
		GameRegistry.registerItem(dragonOffDagger, "dragon_off_dagger");
		
		dragonMace = new ItemSword("dragon_mace", ModEnums.dragon);
		GameRegistry.registerItem(dragonMace, "dragon_mace");
		
		dragonOffMace = new ItemSword("dragon_off_mace", ModEnums.dragon);
		GameRegistry.registerItem(dragonOffMace, "dragon_off_mace");
		
		dragonScimitar = new ItemSword("dragon_scimitar", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonScimitar, "dragon_scimitar");
		
		dragonOffScimitar = new ItemSword("dragon_off_scimitar", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonOffScimitar, "dragon_off_scimitar");
		
		dragonLongsword = new ItemSword("dragon_longsword", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonLongsword, "dragon_longsword");
		
		dragonOffLongsword = new ItemSword("dragon_off_longsword", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonOffLongsword, "dragon_off_longsword");
		
//		dragonThrowingKnives = new ItemWeaponThrowableBase("dragon_throwingknives", ModEnums.dragon);
//		GameRegistry.registerItem(dragonThrowingKnives, "dragon_throwingknives");
//		
//		dragonOffThrowingKnives = new ItemWeaponThrowableBase("dragon_off_throwingknives", ModEnums.dragon);
//		GameRegistry.registerItem(dragonOffThrowingKnives, "dragon_off_throwingknives");
//		
//		dragonThrowingAxe = new ItemWeaponThrowableBase("dragon_throwingAxe", ModEnums.dragon);
//		GameRegistry.registerItem(dragonThrowingAxe, "dragon_throwingAxe");
//		
//		dragonOffThrowingAxe = new ItemWeaponThrowableBase("dragon_off_throwingAxe", ModEnums.dragon);
//		GameRegistry.registerItem(dragonOffThrowingAxe, "dragon_off_throwingAxe");
		
		dragonWarhammer = new ItemSword("dragon_warhammer", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonWarhammer, "dragon_warhammer");
		
		dragonOffWarhammer = new ItemSword("dragon_off_warhammer", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonOffWarhammer, "dragon_off_warhammer");
		
		dragonBattleaxe = new ItemSword("dragon_battleaxe", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonBattleaxe, "dragon_battleaxe");
		
		dragonOffBattleaxe = new ItemSword("dragon_off_battleaxe", ModEnums.dragonLong);
		GameRegistry.registerItem(dragonOffBattleaxe, "dragon_off_battleaxe");
		
		dragonClaw = new ItemSword("dragon_claw", ModEnums.dragon);
		GameRegistry.registerItem(dragonClaw, "dragon_claw");
		
		dragonOffClaw = new ItemSword("dragon_off_claw", ModEnums.dragon);
		GameRegistry.registerItem(dragonOffClaw, "dragon_off_claw");
		
		dragon2hSword = new ItemSword("dragon_2h_sword", ModEnums.dragon2h);
		GameRegistry.registerItem(dragon2hSword, "dragon_2h_sword");
	}
}