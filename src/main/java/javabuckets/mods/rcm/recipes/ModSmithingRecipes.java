package javabuckets.mods.rcm.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import javabuckets.mods.rcm.init.ModArmor;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.attack.ModWeapons;
import javabuckets.mods.rcm.skills.mining.ModMiningItems;
import javabuckets.mods.rcm.skills.smithing.ModSmithingBlocks;
import javabuckets.mods.rcm.skills.smithing.ModSmithingItems;
import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModSmithingRecipes 
{
	public static void init()
	{
		initializeArmors();
		initializeOreAndBars();
		initializeToolsAndWeps();
		initializeBlocks();
	}

	public static void removeRecipes() 
	{
		//RCM.instance.recipeRemover.removeRecipe(new ItemStack(Blocks.gold_block, 1));
	}

	private static void initializeArmors()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.bronzeHelm, 1), new Object[] {
				"MMM", "M M", 'M', ModSmithingItems.bronzeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.bronzePlatebody, 1), new Object[] {
				"M M", "MMM", "MMM", 'M', ModSmithingItems.bronzeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.bronzePlatelegs, 1), new Object[] {
				"MMM", "M M", "M M", 'M', ModSmithingItems.bronzeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.bronzeBoots, 1), new Object[] {
				"M M", "M M", 'M', ModSmithingItems.bronzeBar });

		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.steelHelm, 1), new Object[] {
				"MMM", "M M", 'M', ModSmithingItems.steelBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.steelPlatebody, 1), new Object[] {
				"M M", "MMM", "MMM", 'M', ModSmithingItems.steelBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.steelPlatelegs, 1), new Object[] {
				"MMM", "M M", "M M", 'M', ModSmithingItems.steelBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.steelBoots, 1), new Object[] {
				"M M", "M M", 'M', ModSmithingItems.steelBar });

		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mithrilHelm, 1), new Object[] {
				"MMM", "M M", 'M', ModSmithingItems.mithrilBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mithrilPlatebody, 1), new Object[] {
				"M M", "MMM", "MMM", 'M', ModSmithingItems.mithrilBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mithrilPlatelegs, 1), new Object[] {
				"MMM", "M M", "M M", 'M', ModSmithingItems.mithrilBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mithrilBoots, 1), new Object[] {
				"M M", "M M", 'M', ModSmithingItems.mithrilBar });

		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.adamantHelm, 1), new Object[] {
				"MMM", "M M", 'M', ModSmithingItems.adamantBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.adamantPlatebody, 1), new Object[] {
				"M M", "MMM", "MMM", 'M', ModSmithingItems.adamantBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.adamantPlatelegs, 1), new Object[] {
				"MMM", "M M", "M M", 'M', ModSmithingItems.adamantBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.adamantBoots, 1), new Object[] {
				"M M", "M M", 'M', ModSmithingItems.adamantBar });

		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.runeHelm, 1), new Object[] {
				"MMM", "M M", 'M', ModSmithingItems.runeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.runePlatebody, 1), new Object[] {
				"M M", "MMM", "MMM", 'M', ModSmithingItems.runeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.runePlatelegs, 1), new Object[] {
				"MMM", "M M", "M M", 'M', ModSmithingItems.runeBar });
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.runeBoots, 1), new Object[] {
				"M M", "M M", 'M', ModSmithingItems.runeBar });
	}

	private static void initializeToolsAndWeps() 
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModMiningItems.bronzePickaxe, 1), new Object[] {
				"BBB", " S ", " S ", 'B', ModSmithingItems.bronzeBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModMiningItems.steelPickaxe, 1), new Object[] {
				"BBB", " S ", " S ", 'B', ModSmithingItems.steelBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModMiningItems.mithrilPickaxe, 1), new Object[] {
				"BBB", " S ", " S ", 'B', ModSmithingItems.mithrilBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModMiningItems.adamantPickaxe, 1), new Object[] {
				"BBB", " S ", " S ", 'B', ModSmithingItems.adamantBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModMiningItems.runePickaxe, 1), new Object[] {
				"BBB", " S ", " S ", 'B', ModSmithingItems.runeBar, 'S', Items.stick });

		GameRegistry.addShapedRecipe(new ItemStack(ModWoodcuttingItems.bronzeHatchet, 1), new Object[] {
				"BB ", "BS ", " S ", 'B', ModSmithingItems.bronzeBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWoodcuttingItems.steelHatchet, 1), new Object[] {
				"BB ", "BS ", " S ", 'B', ModSmithingItems.steelBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWoodcuttingItems.mithrilHatchet, 1), new Object[] {
				"BB ", "BS ", " S ", 'B', ModSmithingItems.mithrilBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWoodcuttingItems.adamantHatchet, 1), new Object[] {
				"BB ", "BS ", " S ", 'B', ModSmithingItems.adamantBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWoodcuttingItems.runeHatchet, 1), new Object[] {
				"BB ", "BS ", " S ", 'B', ModSmithingItems.runeBar, 'S', Items.stick });

		GameRegistry.addShapedRecipe(new ItemStack(ModWeapons.bronzeLongsword, 1), new Object[] {
				" B ", " B ", " S ", 'B', ModSmithingItems.bronzeBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWeapons.steelLongsword, 1), new Object[] {
				" B ", " B ", " S ", 'B', ModSmithingItems.steelBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWeapons.mithrilLongsword, 1), new Object[] {
				" B ", " B ", " S ", 'B', ModSmithingItems.mithrilBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWeapons.adamantiteLongsword, 1), new Object[] {
				" B ", " B ", " S ", 'B', ModSmithingItems.adamantBar, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(ModWeapons.runiteLongsword, 1), new Object[] {
				" B ", " B ", " S ", 'B', ModSmithingItems.runeBar, 'S', Items.stick });
	}

	private static void initializeOreAndBars() 
	{
		/*GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.copper_tin), new Object[] {
				ModMiningItems.copperOre, ModMiningItems.tinOre	});

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.iron_coal), new Object[] {
				ModMiningItems.ironOre, Items.coal, Items.coal });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.mithril_coal), new Object[] {
				ModMiningItems.mithrilOre, Items.coal, Items.coal, Items.coal, Items.coal });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.adamant_coal), new Object[] {
				ModMiningItems.adamantiteOre, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.rune_coal), new Object[] {
				ModMiningItems.runiteOre, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal });
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.iron_coal), new Object[] {
				ModMiningItems.ironOre, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.mithril_coal), new Object[] {
				ModMiningItems.mithrilOre, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.adamant_coal), new Object[] {
				ModMiningItems.adamantiteOre, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModMiningItems.rune_coal), new Object[] {
				ModMiningItems.runiteOre, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1) });
		*/

		//GameRegistry.addSmelting(ModMiningItems.copper_tin, new ItemStack(ModSmithingItems.bronzeBar), 1F);
		GameRegistry.addSmelting(ModMiningItems.ironOre, new ItemStack(Items.iron_ingot), 1.5F);
		//GameRegistry.addSmelting(ModMiningItems.iron_coal, new ItemStack(ModSmithingItems.steelBar), 2F);
		GameRegistry.addSmelting(ModMiningItems.silverOre, new ItemStack(ModSmithingItems.silverBar), 3.5F);
		GameRegistry.addSmelting(ModMiningItems.goldOre, new ItemStack(Items.gold_ingot), 5F);
		//GameRegistry.addSmelting(ModMiningItems.mithril_coal, new ItemStack(ModSmithingItems.mithrilBar), 7.5F);
		//GameRegistry.addSmelting(ModMiningItems.adamant_coal, new ItemStack(ModSmithingItems.adamantBar), 8F);
		//GameRegistry.addSmelting(ModMiningItems.rune_coal, new ItemStack(ModSmithingItems.runeBar), 10F);
	}
	
	public static void initializeBlocks()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModSmithingBlocks.rsFurnace), new Object[]
				{
					"XXX", "X X", "XXX", 'X', Blocks.cobblestone	
				});
	}
}