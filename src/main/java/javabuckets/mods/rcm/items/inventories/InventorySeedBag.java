package javabuckets.mods.rcm.items.inventories;

import javabuckets.mods.rcm.items.farming.ItemFarmingItem;
import javabuckets.mods.rcm.items.farming.ItemSeedBag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class InventorySeedBag implements IInventory
{
	private final String inventoryName = "Seed Bag";

	/** Provides NBT Tag Compound to reference */
	private final ItemStack invItem;

	public static final int INV_SIZE = 20;
	private ItemStack[] inventory = new ItemStack[INV_SIZE];

	public InventorySeedBag(ItemStack itemstack) 
	{
		this.invItem = itemstack;

		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}

		readFromNBT(itemstack.getTagCompound());
	}

	@Override
	public int getSizeInventory() 
	{
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) 
	{
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount)
	{
		ItemStack itemstack = getStackInSlot(slot);
		if(itemstack != null)
		{
			if(itemstack.stackSize > amount)
			{
				itemstack = itemstack.splitStack(amount);
				markDirty();
			}
			else
			{
				setInventorySlotContents(slot, null);
			}
		}
		return itemstack;
	}


	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		ItemStack itemstack = getStackInSlot(slot);
		setInventorySlotContents(slot, null);
		return itemstack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack)
	{
		inventory[slot] = itemstack;

		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}

		markDirty();
	}

	@Override
	public String getInventoryName() 
	{
		return inventoryName;
	}

	@Override
	public boolean hasCustomInventoryName() 
	{
		return true;
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public void markDirty() 
	{
		for (int i = 0; i < getSizeInventory(); i++)
		{
			if (getStackInSlot(i) != null && getStackInSlot(i).stackSize == 0)
			{
				inventory[i] = null;
			}
		}
		
		writeToNBT(invItem.getTagCompound());
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) 
	{
		return true;
	}

	@Override
	public void openInventory() 
	{

	}
	
	@Override
	public void closeInventory() 
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack)
	{
		return !(itemstack.getItem() instanceof ItemSeedBag) && (itemstack.getItem() instanceof ItemFarmingItem);
	}
	
	public void readFromNBT(NBTTagCompound nbtTagCompound)
	{
		NBTTagList itemsStored = nbtTagCompound.getTagList("SeedBagInventory", Constants.NBT.TAG_COMPOUND);
		
		for (int i = 0; i < itemsStored.tagCount(); i++)
		{
			NBTTagCompound item = (NBTTagCompound) itemsStored.getCompoundTagAt(i);
			int slot = item.getInteger("Slot");
			
			if (slot >= 0 && slot < getSizeInventory())
			{
				inventory[slot] = ItemStack.loadItemStackFromNBT(item);
			}
		}
	}
	
	public void writeToNBT(NBTTagCompound nbtTagCompound)
	{
		NBTTagList itemsStored = new NBTTagList();
		
		for (int i = 0; i < getSizeInventory(); i++)
		{
			if (getStackInSlot(i) != null)
			{
				NBTTagCompound item = new NBTTagCompound();
				item.setInteger("Slot", i);
				
				getStackInSlot(i).writeToNBT(item);
				
				itemsStored.appendTag(itemsStored);
			}
		}
		
		nbtTagCompound.setTag("SeedBagInventory", itemsStored);
	}
}