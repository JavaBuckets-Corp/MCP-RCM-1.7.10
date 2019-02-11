package javabuckets.mods.rcm.items.herblore;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.herblore.ModHerbloreItems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class ItemEmptyVial extends ItemHerbloreItem
{
	public ItemEmptyVial(String unlocalizedName) 
	{
		super(unlocalizedName);
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, true);
		
		if (movingobjectposition == null)
		{
			return itemstack;
		}
		else
		{
			if (movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
			{
				int x = movingobjectposition.blockX;
				int y = movingobjectposition.blockY;
				int z = movingobjectposition.blockZ;
				
				if (!world.canMineBlock(player, x, y, z))
				{
					return itemstack;
				}
				
				if (world.getBlock(x, y, z).getMaterial() == Material.water)
				{
					player.inventory.consumeInventoryItem(this);
					player.inventory.addItemStackToInventory(new ItemStack(ModHerbloreItems.vial_water));
				}
			}
			
			return itemstack;
		}
	}
}