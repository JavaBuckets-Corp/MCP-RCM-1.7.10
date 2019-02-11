package javabuckets.mods.rcm.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.recipes.ModSmithingRecipes;

public class ModRecipes 
{
	public static void init()
	{
		ModFixRecipes.init();
		ModSmithingRecipes.init();
		
	}
}