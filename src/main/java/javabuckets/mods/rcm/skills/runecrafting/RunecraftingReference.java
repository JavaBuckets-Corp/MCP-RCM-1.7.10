package javabuckets.mods.rcm.skills.runecrafting;

import javabuckets.mods.rcm.skills.magic.ModMagicItems;
import javabuckets.mods.rcm.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RunecraftingReference 
{
	public static double getXPFromCreatingRunes(Item rune)
	{
		if (rune.equals(ModMagicItems.airRune)) { return 2.5; }
		else if (rune.equals(ModMagicItems.mindRune)) { return 5.5; }
		else if (rune.equals(ModMagicItems.waterRune)) { return 7; }
		else if (rune.equals(ModMagicItems.earthRune)) { return 9; }
		else if (rune.equals(ModMagicItems.fireRune)) { return 11.5; }
		else if (rune.equals(ModMagicItems.bodyRune)) { return 14; }
		else if (rune.equals(ModMagicItems.cosmicRune)) { return 20; }
		else if (rune.equals(ModMagicItems.chaosRune)) { return 25; }
		else if (rune.equals(ModMagicItems.astralRune)) { return 30; }
		else if (rune.equals(ModMagicItems.natureRune)) { return 43.5; }
		else if (rune.equals(ModMagicItems.lawRune)) { return 50; }
		else if (rune.equals(ModMagicItems.deathRune)) { return 65; }
		else if (rune.equals(ModMagicItems.bloodRune)) { return 80; }
		else if (rune.equals(ModMagicItems.soulRune)) { return 100; }
		else { LogHelper.info("Invalid Rune!"); return 0.0; }
	}
	
	public static Item getCorrespondingRuneFromAltar(Block altar)
	{
		if (altar.equals(ModRunecraftingBlocks.airAltar)) { return ModMagicItems.airRune; }
		else if (altar.equals(ModRunecraftingBlocks.mindAltar)) { return ModMagicItems.mindRune; }
		else if (altar.equals(ModRunecraftingBlocks.waterAltar)) { return ModMagicItems.waterRune; }
		else if (altar.equals(ModRunecraftingBlocks.earthAltar)) { return ModMagicItems.earthRune; }
		else if (altar.equals(ModRunecraftingBlocks.fireAltar)) { return ModMagicItems.fireRune; }
		else if (altar.equals(ModRunecraftingBlocks.bodyAltar)) { return ModMagicItems.bodyRune; }
		else if (altar.equals(ModRunecraftingBlocks.cosmicAltar)) { return ModMagicItems.cosmicRune; }
		else if (altar.equals(ModRunecraftingBlocks.chaosAltar)) { return ModMagicItems.chaosRune; }
		else if (altar.equals(ModRunecraftingBlocks.astralAltar)) { return ModMagicItems.astralRune; }
		else if (altar.equals(ModRunecraftingBlocks.natureAltar)) { return ModMagicItems.natureRune; }
		else if (altar.equals(ModRunecraftingBlocks.lawAltar)) { return ModMagicItems.lawRune; }
		else if (altar.equals(ModRunecraftingBlocks.deathAltar)) { return ModMagicItems.deathRune; }
		else if (altar.equals(ModRunecraftingBlocks.bloodAltar)) { return ModMagicItems.bloodRune; }
		else if (altar.equals(ModRunecraftingBlocks.soulAltar)) { return ModMagicItems.soulRune; }
		else { LogHelper.info("Invalid Altar!"); return null; }
	}
	
	public static Item getCorrespondingTalismanFromAltar(Block altar)
	{
		if (altar.equals(ModRunecraftingBlocks.airAltar)) { return ModRunecraftingItems.airTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.mindAltar)) { return ModRunecraftingItems.mindTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.waterAltar)) { return ModRunecraftingItems.waterTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.earthAltar)) { return ModRunecraftingItems.earthTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.fireAltar)) { return ModRunecraftingItems.fireTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.bodyAltar)) { return ModRunecraftingItems.bodyTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.cosmicAltar)) { return ModRunecraftingItems.cosmicTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.chaosAltar)) { return ModRunecraftingItems.chaosTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.astralAltar)) { return ModRunecraftingItems.omniTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.natureAltar)) { return ModRunecraftingItems.natureTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.lawAltar)) { return ModRunecraftingItems.lawTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.deathAltar)) { return ModRunecraftingItems.deathTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.bloodAltar)) { return ModRunecraftingItems.bloodTalisman; }
		else if (altar.equals(ModRunecraftingBlocks.soulAltar)) { return ModRunecraftingItems.omniTalisman; }
		else { LogHelper.info("Invalid Altar!"); return null; }
	}
}