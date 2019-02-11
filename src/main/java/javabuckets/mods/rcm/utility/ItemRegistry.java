package javabuckets.mods.rcm.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.items.ItemBase;
import net.minecraft.item.Item;

public class ItemRegistry 
{
	public static void registerItem(Item item, boolean isBuyable)
	{
		String unlocalizedName = item.getUnlocalizedName().substring(5);

		GameRegistry.registerItem(item, unlocalizedName, Reference.MOD_ID);
		ItemBase.itemList.add("rcm:"+unlocalizedName);

		if (isBuyable) 
		{
			BuyCommandUtil.addToBuyableList(item);
		}
	}
}