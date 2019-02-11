package javabuckets.mods.rcm.blocks.containers;

import javabuckets.mods.rcm.blocks.slots.SlotRSFurnace;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerRSFurnace extends Container
{
	private TileEntityRSFurnace furnace;
	
	public ContainerRSFurnace(InventoryPlayer playerInventory, TileEntityRSFurnace tileentityfurnace) 
	{
		this.furnace = tileentityfurnace;
		
		// Player Inventory
		for (int x = 0; x < 9; x++)
		{
			this.addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, 142));
		}

		for(int y = 0; y < 3; y++) 
		{
			for(int x = 0; x < 9; x++) 
			{
				this.addSlotToContainer(new Slot(playerInventory, 9 + x + y * 9, 8 + x * 18, 84 + y * 18));
			}
		}
		
		// Furnace Inventory
		this.addSlotToContainer(new Slot(tileentityfurnace, 0, 58, 57));
		this.addSlotToContainer(new Slot(tileentityfurnace, 1, 43, 20));
		this.addSlotToContainer(new Slot(tileentityfurnace, 2, 73, 20));
		this.addSlotToContainer(new SlotRSFurnace(playerInventory.player, tileentityfurnace, 3, 124, 38));
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return furnace.isUseableByPlayer(player);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) 
	{
		return null;
	}
}