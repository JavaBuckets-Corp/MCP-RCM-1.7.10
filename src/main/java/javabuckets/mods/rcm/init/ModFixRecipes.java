package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.skills.fishing.ModFishingItems;
import javabuckets.mods.rcm.skills.prayer.ModPrayerItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModFixRecipes 
{
	public static void init() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4), new Object[] {
			ModFixBlocks.oakLog
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 1), new Object[] {
			ModFixBlocks.spruceLog
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 2), new Object[] {
			ModFixBlocks.birchLog
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 3), new Object[] {
			ModFixBlocks.jungleLog
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 4), new Object[] {
			ModFixBlocks.acaciaLog
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 5), new Object[] {
			ModFixBlocks.darkOakLog
		});
		
		GameRegistry.addSmelting(ModFixBlocks.oakLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		GameRegistry.addSmelting(ModFixBlocks.birchLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		GameRegistry.addSmelting(ModFixBlocks.spruceLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		GameRegistry.addSmelting(ModFixBlocks.jungleLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		GameRegistry.addSmelting(ModFixBlocks.acaciaLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		GameRegistry.addSmelting(ModFixBlocks.darkOakLog, new ItemStack(Items.coal, 1, 1), 0.25F);
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModPrayerItems.bones), new Object[] {
			Items.bone, Items.bone
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModFishingItems.fishingNet), new Object[] {
			"S S", " S ", "S S", 'S', Items.string
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pumpkin_seeds, 4), new Object[] {
				ModFixBlocks.pumpkin
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[] {
				ModFixBlocks.pumpkin, Items.sugar, Items.egg
		});
	}
}