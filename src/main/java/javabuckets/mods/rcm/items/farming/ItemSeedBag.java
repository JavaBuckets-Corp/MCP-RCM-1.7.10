package javabuckets.mods.rcm.items.farming;

import javabuckets.mods.rcm.items.inventories.InventorySeedBag;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.GuiHandlerReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSeedBag extends ItemFarmingItem
{
	public ItemSeedBag(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setMaxStackSize(1);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) 
	{
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			if (!player.isSneaking()) 
			{
				player.openGui(RCM.instance, GuiHandlerReference.seedBagGuiID, world, 0, 0, 0);
			}
		}

		return itemstack;
	}
}